package models

import play.api.libs.json.{Json, Writes}

import java.util.Date

case class WorkOrderView(
                          id: Option[Long],
                          maintenance_date: Date,
                          maintenance_time: String,
                          status: String,
                          technician_name: String,
                          technician_contact: String,
                          item_code: String,
                          item_name: String,
                          user_name: String,
                          user_contact: String
                        )

object WorkOrderView {
  implicit val writes: Writes[WorkOrderView] = Json.writes[WorkOrderView]
}

