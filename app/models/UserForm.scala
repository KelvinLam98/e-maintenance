package models
import java.util.Date
case class UserForm
(
  id : Option[Long],
  username : String,
  password: String,
  name: String,
  ic_number: String,
  contact_number: String,
  address: String,
  email: String,
  role: String
)