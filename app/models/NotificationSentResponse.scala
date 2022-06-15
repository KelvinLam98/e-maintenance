package models

import play.api.libs.json.Json

case class NotificationSentResponse(
                                     success: Boolean,
                                     msg: String
                                   )

object NotificationSentResponse{
  implicit val reads = Json.reads[NotificationSentResponse]
  implicit val writes = Json.writes[NotificationSentResponse]
}