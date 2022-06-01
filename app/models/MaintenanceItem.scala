package models

import anorm.{Macro, RowParser, SQL, SqlParser}
import java.util.Date
import play.api.libs.json.{Json, Writes}
import java.sql.Connection

case class MaintenanceItem(
                 id : Option[Long],
                 item_code: String,
                 item_name: String
               )

object MaintenanceItem {
  implicit val writes: Writes[MaintenanceItem] = Json.writes[MaintenanceItem]
}

