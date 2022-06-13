package services

import javax.inject.{Inject, Singleton}
import play.api.Configuration

@Singleton
class ConfigurationService @Inject()(config: Configuration) {
  val firebaseBundleId = config.get[String]("firebase.bundle.id")
  val firebaseSandbox = config.get[Boolean]("firebase.sandbox")
  val firebaseServerKey = config.get[String]("firebase.server.key")
  val firebaseAppName = config.get[String]("firebase.app.name")
}