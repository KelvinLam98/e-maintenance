package models

import anorm.{Macro, RowParser, SQL, SqlParser}

import java.util.Date
import play.api.libs.json.{Json, Reads, Writes}

import java.sql.Connection

case class WorkOrder(
                            id : Option[Long],
                            maintenance_name: String,
                            person_in_charge: String,
                            maintenance_date: Date,
                            status: String
                          )

object WorkOrder {
  implicit val writes: Writes[WorkOrder] = Json.writes[WorkOrder]
  implicit val reads: Reads[WorkOrder] = Json.reads[WorkOrder]
}

