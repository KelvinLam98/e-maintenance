package models

import play.api.libs.json.{Json, Writes}

import java.util.Date

case class WorkOrderSampleView(
                          id: Option[Long],
                          status: String,
                          technician_name: String,
                          technician_contact: String,
                          item_code: String,
                          item_name: String,
                        )

object WorkOrderSampleView {
  implicit val writes: Writes[WorkOrderSampleView] = Json.writes[WorkOrderSampleView]
}

