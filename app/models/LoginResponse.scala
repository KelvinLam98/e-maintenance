package models

import play.api.libs.json.Json

case class LoginResponse(
                          loginIsAuthenticated: Boolean,
                          jwtToken: Option[String],
                          readOnlyJwtToken: Option[String],
                          user: Option[User],
                          errorMessage: Option[String],
                          accessRights: Array[Byte],
                        )

object LoginResponse {

  implicit val reads = Json.reads[LoginResponse]
  implicit val writes = Json.writes[LoginResponse]

}