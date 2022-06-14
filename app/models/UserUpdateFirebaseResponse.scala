package models

import play.api.libs.json.Json

case class UserUpdateFirebaseResponse(
                                       success: Boolean,
                                       msg: String
                                     )
object UserUpdateFirebaseResponse{
  implicit val reads = Json.reads[UserUpdateFirebaseResponse]
  implicit val writes = Json.writes[UserUpdateFirebaseResponse]
}
