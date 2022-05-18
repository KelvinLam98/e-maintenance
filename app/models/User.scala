package models

import anorm.{Macro, RowParser, SQL, SqlParser}
import java.util.Date
import play.api.libs.json.{Json, Writes}
import java.sql.Connection

case class User(
                 id : Option[Long],
                 username : String,
                 password: String,
                 name: String,
                 ic_number: String,
                 contact_number: String,
                 address: String,
                 email: String,
                 role: String,
                 created: Date,
                 modified: Date,
               )

object User {
  implicit val writes: Writes[User] = Json.writes[User]
}

