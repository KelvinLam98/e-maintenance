package actors

import com.google.firebase.messaging.{FirebaseMessaging, Message, Notification}
import play.api.Logger
import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import akka.actor.{Actor, Props}
import javax.inject.{Inject, Singleton}
import services.ConfigurationService

object FirebaseActor {

  def props: Props = Props[FirebaseActor]()
  case class FirebaseMessage(deviceToken: String, title: String, body: String, module: String, src: String, srcId: String)

}

@Singleton
class FirebaseActor @Inject()(
                               configurationService: ConfigurationService,
                             ) extends Actor {

  import FirebaseActor._

  val logger: Logger = Logger(this.getClass)

  // Required to setup firebase account first: https://firebase.google.com/docs/admin/setup
  lazy val app: FirebaseApp = {
    val firebaseAppName = configurationService.firebaseAppName
    val options = new FirebaseOptions.Builder().setCredentials(GoogleCredentials.getApplicationDefault).setDatabaseUrl(s"https://$firebaseAppName.firebaseio.com").build
    FirebaseApp.initializeApp(options, firebaseAppName)
  }

  def receive: Receive = {
    case FirebaseMessage(deviceToken, title, body, module, src, article_id) =>
      val message = Message.builder()
        .setNotification(
          Notification.builder().setTitle(title).setBody(body).build()
        )
        .putData("module", module)
        .putData("src", src)
        .putData("article_id", article_id)
        .setToken(deviceToken)
        .build()
      val response = FirebaseMessaging.getInstance(app).send(message)
      // Response is a message ID string.
      logger.info("Sent push notification, message ID: " + response)
      sender() ! response
  }

}