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
}