package models

import play.api.libs.json.Json

case class UpdatePasswordResponse(isChange: Boolean, responseMessage: String)

object UpdatePasswordResponse {

  implicit val reads = Json.reads[UpdatePasswordResponse]
  implicit val writes = Json.writes[UpdatePasswordResponse]

}