package tasks

import akka.actor.ActorSystem
import play.api.Logging
import play.api.Configuration
import javax.inject.Inject
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.DurationInt
import java.util.Date
import helpers.FirebaseHelper
import play.api.db.Database
import stores._

class BackgroundTask @Inject()(
                                actorSystem: ActorSystem,
                                config: Configuration,
                                db: Database,
                                userPushNotifTokenStore: UserPushNotifTokenStore,
                                workOrderStore: WorkOrderStore,
                                firebaseHelper: FirebaseHelper
                              )(implicit executionContext: ExecutionContext) extends Logging {

  import scala.language.postfixOps

  if (config.get[Boolean]("background.task.enabled")) {

    val currentDate = new Date()
    db.withTransaction { implicit conn =>
      workOrderStore.findAll.map { work =>
        val day = work.maintenance_date.getTime - currentDate.getTime
        var countDown = (day / (1000 * 60 * 60 * 24))
        val hour = (day / (1000 * 60 * 60)) % 24
        if (hour > 0) {
          countDown = countDown + 1
        } else {}

        //count down date within 100 day, delay time could not set too long
        if(countDown >= 0 && countDown <= 100){
          //send on maintenance date
          actorSystem.scheduler.scheduleOnce(delay = countDown.toInt day){
            db.withConnection { implicit conn =>
            userPushNotifTokenStore.findByPushTokenById(work.user_id).map { user =>
              workOrderStore.findViewById(work.id.get).map { view =>
                firebaseHelper.sendNotificationMessage(user.push_token.get, "Today Appointment", "Work Order Today: "+ view.item_name, "module", "src", work.id.toString).map { messageId =>
                  println("Sent, message ID: " + messageId + user.id)
                }
              }.getOrElse("")
          }}}
          //send notification 7 day before maintenance date
          countDown = countDown - 7
          actorSystem.scheduler.scheduleOnce(delay = countDown.toInt day){
            db.withConnection { implicit conn =>
            userPushNotifTokenStore.findByPushTokenById(work.user_id).map { user =>
              workOrderStore.findViewById(work.id.get).map { view =>
                firebaseHelper.sendNotificationMessage(user.push_token.get, "Reminder (One week to go)" + countDown, "Booked Appointment For "+ view.item_name, "module", "src", work.id.toString).map { messageId =>
                  println("Sent, message ID: " + messageId + user.id)
                }
              }.getOrElse("")
            }}}

        }
      }

    }

  } else logger.info("Task Scheduler: Scheduler disabled...")

}