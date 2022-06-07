package models
import play.api.libs.json.Json

case class ErrorResponse(errorMessage: String, HTTPCODE: Int)

object ErrorResponse {

  implicit val reads = Json.reads[ErrorResponse]
  implicit val writes = Json.writes[ErrorResponse]

}