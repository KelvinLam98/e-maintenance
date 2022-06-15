package models

import java.text.SimpleDateFormat
import java.util.Date

import play.api.libs.json.{Json, Reads, Writes}

case class UserPushNotifToken(

                               id: Option[Long],
                               user_id: Long,
                               push_token: Option[String],
                               token_os: Option[String],
                               raw_token: Option[String]
                             )

object UserPushNotifToken {

  implicit val writes: Writes[UserPushNotifToken] = Json.writes[UserPushNotifToken]
  implicit lazy val reads: Reads[UserPushNotifToken] = Json.reads[UserPushNotifToken]

}