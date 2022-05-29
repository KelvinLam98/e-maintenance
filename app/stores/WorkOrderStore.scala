package stores

import java.sql.Connection

import javax.inject.Inject
import models._
import anorm._

class WorkOrderStore @Inject()() {

  val parser: RowParser[WorkOrder] = Macro.namedParser[WorkOrder]

  def findAll(implicit conn: Connection): Seq[WorkOrder] = {
    SQL("select * from work_order").on().as(parser.*)
  }

  def countAll(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order").as(SqlParser.long("count").single)
  }

  def countFiltered(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (maintenance_date like {searchText})"
    SQL("select count(*) as count from work_order " + searchCriteria).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrder] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (maintenance_date like {searchText})"
    SQL("select * from work_order " + searchCriteria + " order by maintenance_date Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(parser.*)
  }

  def findInfoById(id: Long)(implicit conn: Connection): Option[WorkOrder] = {
    SQL("select * from work_order where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def findById(id: Long)(implicit conn: Connection): Option[WorkOrder] = {
    SQL("select * from work_order where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def delete(id: Long)(implicit conn: Connection): Int = {
    SQL("delete from work_order where id = {id}").on(
      "id" -> id
    ).executeUpdate()
  }

  def insert(workOrder: WorkOrder)(implicit conn: Connection): Long = {
    SQL("insert into work_order (maintenance_id, maintenance_date) " +
      "values ({maintenance_id}, {maintenance_date})").on(
      "maintenance_id" -> workOrder.maintenance_id,
      "maintenance_date" -> workOrder.maintenance_date,
    ).executeInsert().get
  }

  def update(workOrder: WorkOrder)(implicit conn: Connection) = {
    SQL("update work_order set maintenance_id={maintenance_id}, maintenance_date={maintenance_date}" +
      "where id={id}").on(
      "id" -> workOrder.id,
      "maintenance_id" -> workOrder.maintenance_id,
      "maintenance_date" -> workOrder.maintenance_date,
    ).executeUpdate()
  }


}
