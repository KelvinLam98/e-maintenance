package models

import play.api.libs.json.Json

import java.util.Date

case class CreateWorkOrderRequest(
                                   maintenance_date: Date,
                                   maintenance_time: String,
                                 )

object CreateWorkOrderRequest {

  implicit val reads = Json.reads[CreateWorkOrderRequest]
  implicit val writes = Json.writes[CreateWorkOrderRequest]

}