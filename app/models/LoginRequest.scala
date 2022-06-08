package models

import play.api.libs.json.Json

case class LoginRequest(loginEmail: String, loginPassword: String)

object LoginRequest {

  implicit val reads = Json.reads[LoginRequest]
  implicit val writes = Json.writes[LoginRequest]

}
