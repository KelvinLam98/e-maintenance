package models

import akka.http.scaladsl.model.DateTime
import anorm.{Macro, RowParser, SQL, SqlParser}

import java.util.Date
import play.api.libs.json.{Json, Reads, Writes}

import java.sql.{Connection, Time}
import java.time.LocalTime

case class WorkOrder(
                      id : Option[Long],
                      maintenance_name: String,
                      person_in_charge: String,
                      technician_id: Long,
                      maintenance_date: Date,
                      maintenance_time: String,
                      status: String
                    )

object WorkOrder {
  implicit val writes: Writes[WorkOrder] = Json.writes[WorkOrder]
  implicit val reads: Reads[WorkOrder] = Json.reads[WorkOrder]

  val sortableCols: Seq[String] =
    Vector(
      "maintenance_date"
    )
}

