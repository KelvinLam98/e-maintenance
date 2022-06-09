package stores

import java.sql.Connection
import javax.inject.Inject
import models._
import anorm._

import java.io._
import java.util.Date
import anorm.SqlParser.{list, scalar}

class TechnicianStore @Inject()() {

  val parser: RowParser[Technician] = Macro.namedParser[Technician]

  def countAll(implicit conn: Connection): Long = {
    SQL("select count(*) as count from technician").as(SqlParser.long("count").single)
  }

  def countFiltered(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (name like {searchText})"
    SQL("select count(*) as count from technician " + searchCriteria).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[Technician] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (name like {searchText})"
    SQL("select * from technician " + searchCriteria + " order by name Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(parser.*)
  }

  def findInfoById(id: Long)(implicit conn: Connection): Option[Technician] = {
    SQL("select * from technician where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def findById(id: Long)(implicit conn: Connection): Option[Technician] = {
    SQL("select * from technician where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def delete(id: Long)(implicit conn: Connection): Int = {
    SQL("delete from technician where id = {id}").on(
      "id" -> id
    ).executeUpdate()
  }

  def insert(technician: Technician)(implicit conn: Connection): Long = {
    SQL("insert into technician (name, contact_number) " +
      "values ({name}, {contact_number})").on(
      "name" -> technician.name,
      "contact_number" -> technician.contact_number,
    ).executeInsert().get
  }

  def update(technician: Technician)(implicit conn: Connection) = {
    SQL("update technician set name={name}, contact_number={contact_number}" +
      "where id={id}").on(
      "id" -> technician.id,
      "name" -> technician.name,
      "contact_number" -> technician.contact_number,
    ).executeUpdate()
  }

  def findAll()(implicit conn: Connection): Seq[Technician] = {
    SQL("select * from technician").as(parser.*)
  }

  def options(implicit conn: Connection): Seq[(Long, String)] = {
    findAll().map(item => (item.id.get, item.name))
  }
}
