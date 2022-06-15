package helpers

import actors.FirebaseActor.FirebaseMessage
import akka.actor.ActorRef
import akka.pattern.ask
import akka.util.Timeout
import javax.inject.{Inject, Named, Singleton}
import play.api.Logger
import tasks.TasksModule

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class FirebaseHelper @Inject()(
                                @Named("firebase-actor") firebaseActor: ActorRef,
                              )(implicit execCtx: ExecutionContext) {

  implicit val timeout: Timeout = 300.seconds
  val logger: Logger = Logger(this.getClass)

  def sendNotificationMessage(deviceToken: String, title: String, body: String, module: String, src: String, article_id: String): Future[Any] = {
    firebaseActor ? FirebaseMessage(deviceToken, title, body, module, src, article_id)
  }

}