package models

import play.api.libs.json.Json

case class UpdatePasswordRequest(
                                oldPassword: String,
                                password: String,
                                confirmPassword: String,
                               )

object UpdatePasswordRequest {

  implicit val reads = Json.reads[UpdatePasswordRequest]
  implicit val writes = Json.writes[UpdatePasswordRequest]

}
