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

  def findAll(implicit conn: Connection): Seq[User] = {
    SQL("select * from users").on().as(parser.*)
  }

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

  def findInfoById(id: Long)(implicit conn: Connection): Option[User] = {
    SQL("select * from users where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
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
}
