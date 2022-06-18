package models

import akka.http.scaladsl.model.DateTime
import anorm.{Macro, RowParser, SQL, SqlParser}

import java.util.Date
import play.api.libs.json.{Json, Reads, Writes}

import java.sql.{Connection, Time}
import java.time.LocalTime

case class WorkOrderSample(
                      id : Option[Long],
                      maintenance_id: Long,
                      technician_id: Long,
                      status: String
                    )

object WorkOrderSample {
  implicit val writes: Writes[WorkOrderSample] = Json.writes[WorkOrderSample]
  implicit val reads: Reads[WorkOrderSample] = Json.reads[WorkOrderSample]

  val sortableCols: Seq[String] =
    Vector(
      "status"
    )
}

