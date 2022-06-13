package models

import play.api.libs.json.Json

case class UpdateProfileRequest(
                                 name: String,
                                 ic_number: String,
                                 contact_number: String,
                                 address: String,
                                 email: String
                               )

object UpdateProfileRequest {

  implicit val reads = Json.reads[UpdateProfileRequest]
  implicit val writes = Json.writes[UpdateProfileRequest]

}
