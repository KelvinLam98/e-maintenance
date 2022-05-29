package models

import anorm.{Macro, RowParser, SQL, SqlParser}
import java.util.Date
import play.api.libs.json.{Json, Writes}
import java.sql.Connection

case class WorkOrder(
                            id : Option[Long],
                            maintenance_id: Long,
                            maintenance_date: Date
                          )

object WorkOrder {
  implicit val writes: Writes[WorkOrder] = Json.writes[WorkOrder]
}

