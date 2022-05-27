package stores

import java.sql.Connection

import javax.inject.Inject
import models._
import anorm._
import java.io._
import java.util.Date
import anorm.SqlParser.scalar

class MaintenanceItemStore @Inject()() {

  val parser: RowParser[MaintenanceItem] = Macro.namedParser[MaintenanceItem]

  def findAll(implicit conn: Connection): Seq[MaintenanceItem] = {
    SQL("select * from maintenance_item").on().as(parser.*)
  }

  def countAll(implicit conn: Connection): Long = {
    SQL("select count(*) as count from maintenance_item").as(SqlParser.long("count").single)
  }

  def countFiltered(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (item_name like {searchText})"
    SQL("select count(*) as count from maintenance_item " + searchCriteria).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[MaintenanceItem] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (item_name like {searchText})"
    SQL("select * from maintenance_item " + searchCriteria + " order by item_code Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(parser.*)
  }

  def findInfoById(id: Long)(implicit conn: Connection): Option[MaintenanceItem] = {
    SQL("select * from maintenance_item where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def findById(id: Long)(implicit conn: Connection): Option[MaintenanceItem] = {
    SQL("select * from maintenance_item where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def delete(id: Long)(implicit conn: Connection): Int = {
    SQL("delete from maintenance_item where id = {id}").on(
      "id" -> id
    ).executeUpdate()
  }

  def insert(maintenanceItem: MaintenanceItem)(implicit conn: Connection): Long = {
    SQL("insert into maintenance_item (item_code, item_name) " +
      "values ({item_code}, {item_name})").on(
      "item_code" -> maintenanceItem.item_code,
      "item_name" -> maintenanceItem.item_name,
    ).executeInsert().get
  }

  def update(maintenanceItem: MaintenanceItem)(implicit conn: Connection) = {
    SQL("update maintenance_item set item_code={item_code}, item_name={item_name}" +
      "where id={id}").on(
      "id" -> maintenanceItem.id,
      "item_code" -> maintenanceItem.item_code,
      "item_name" -> maintenanceItem.item_name,
    ).executeUpdate()
  }
}
