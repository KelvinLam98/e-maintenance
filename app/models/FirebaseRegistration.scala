package models

import play.api.libs.json.{Json, Reads, Writes}

case class FirebaseRegistration(
                                 token: String,
                                 os: String
                               )


object FirebaseRegistration {

  implicit val writes: Writes[FirebaseRegistration] = Json.writes[FirebaseRegistration]
  implicit val reads: Reads[FirebaseRegistration] = Json.reads[FirebaseRegistration]

}
