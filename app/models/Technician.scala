package models

import anorm.{Macro, RowParser, SQL, SqlParser}
import java.util.Date
import play.api.libs.json.{Json, Writes}
import java.sql.Connection

case class Technician(
                            id : Option[Long],
                            name: String,
                            contact_number: String
                          )

object Technician {
  implicit val writes: Writes[Technician] = Json.writes[Technician]
}

