package models

import play.api.libs.json.Json

import java.util.Date

case class UpdateWorkOrderRequest(
                                 maintenance_date: Date,
                                 maintenance_time: String,
                                 status: String,
                               )

object UpdateWorkOrderRequest {

  implicit val reads = Json.reads[UpdateWorkOrderRequest]
  implicit val writes = Json.writes[UpdateWorkOrderRequest]

}
