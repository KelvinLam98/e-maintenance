package stores

import java.sql.Connection

import javax.inject.Inject
import models._
import anorm._
import java.io._
import java.util.Date
import anorm.SqlParser.scalar

class UserStore @Inject()() {

  val parser: RowParser[User] = Macro.namedParser[User]

  def countAll(implicit conn: Connection): Long = {
    SQL("select count(*) as count from users").as(SqlParser.long("count").single)
  }

  def countFiltered(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (username like {searchText})"
    SQL("select count(*) as count from users " + searchCriteria).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[User] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (username like {searchText})"
    SQL("select * from users " + searchCriteria + " order by name Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(parser.*)
  }

  def findById(id: Long)(implicit conn: Connection): Option[User] = {
    SQL("select * from users where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def findByUserName(username: String)(implicit conn: Connection): Option[User] = {
    SQL("select * from users where username = {username}").on(
      "username" -> username
    ).as(parser.singleOpt)
  }

  def findByEmail(email: String)(implicit conn: Connection): Option[User] = {
    SQL("select * from users where email = {email}").on(
      "email" -> email
    ).as(parser.singleOpt)
  }

  def delete(id: Long)(implicit conn: Connection): Int = {
    SQL("delete from users where id = {id}").on(
      "id" -> id
    ).executeUpdate()
  }

  def insert(user: User)(implicit conn: Connection): Long = {
    SQL("insert into users (username, password, name, ic_number, contact_number, address, email, role, created, modified) " +
      "values ({username}, {password}, {name}, {ic_number}, {contact_number}, {address}, {email}, {role}, {created}, {modified})").on(
      "username" -> user.username,
      "password" -> user.password,
      "name" -> user.name,
      "ic_number" -> user.ic_number,
      "contact_number" -> user.contact_number,
      "address" -> user.address,
      "email" -> user.email,
      "role" -> user.role,
      "created" -> user.created,
      "modified" -> user.modified
    ).executeInsert().get
  }

  def update(user: User)(implicit conn: Connection) = {
    SQL("update users set username={username}, password={password}, name={name}, ic_number={ic_number}, contact_number={contact_number}, address={address}, email={email}, role={role}, created={created}, modified={modified}" +
      "where id={id}").on(
      "id" -> user.id,
      "username" -> user.username,
      "password" -> user.password,
      "name" -> user.name,
      "ic_number" -> user.ic_number,
      "contact_number" -> user.contact_number,
      "address" -> user.address,
      "email" -> user.email,
      "role" -> user.role,
      "created" -> user.created,
      "modified" -> user.modified
    ).executeUpdate()
  }

  def findAll()(implicit conn: Connection): Seq[User] = {
    SQL("select * from users where role = {role} order by name").on(
      "role" -> "user"
    ).as(parser.*)
  }

  def options(implicit conn: Connection): Seq[(Long,String)] = {
    findAll().map(user => (user.id.get, user.name))
  }

  def updatePasswordByEmail(email: String, newPassword: String, modified: Date)(implicit conn: Connection) = {
    SQL("update users set password = {newPassword}, modified = {modified} where email = {email}").on(
      "email" -> email,
      "newPassword" -> newPassword,
      "modified" -> modified,
    ).executeUpdate()
  }

  def searchProfileById(id: Long, searchText: String, limit: Option[LimitClause], orderBy: Option[OrderByClause])(implicit conn: Connection): Seq[User] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    val searchCriteria =
      if(searchText.isEmpty)
        orderCriteria
      else
        "and (username like {searchText})" + orderCriteria
    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](
        "searchText" -> ("%" + searchText + "%"),
        "id" -> id
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from users where id={id}" + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(parser.*)
  }

}
