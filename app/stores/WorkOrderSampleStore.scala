package stores

import java.sql.Connection

import javax.inject.Inject
import models._
import anorm._

class WorkOrderSampleStore @Inject()() {

  val parser: RowParser[WorkOrderSample] = Macro.namedParser[WorkOrderSample]
  val viewParser: RowParser[WorkOrderSampleView] = Macro.namedParser[WorkOrderSampleView]

  def findAll(implicit conn: Connection): Seq[WorkOrderSample] = {
    SQL("select * from work_order_sample").on().as(parser.*)
  }

  def findViewById(id: Long)(implicit conn: Connection): Option[WorkOrderSampleView] = {
    SQL("select * from work_order_sample_view where id = {id}").on(
      "id" -> id
    ).as(viewParser.singleOpt)
  }

  def findById(id: Long)(implicit conn: Connection): Option[WorkOrderSample] = {
    SQL("select * from work_order_sample where id = {id}").on(
      "id" -> id
    ).as(parser.singleOpt)
  }

  def delete(id: Long)(implicit conn: Connection): Int = {
    SQL("delete from work_order_sample where id = {id}").on(
      "id" -> id
    ).executeUpdate()
  }

  def insert(workOrderSample: WorkOrderSample)(implicit conn: Connection): Long = {
    SQL("insert into work_order_sample (maintenance_id, technician_id, status) " +
      "values ({maintenance_id}, {technician_id}, {status})").on(
      "maintenance_id" -> workOrderSample.maintenance_id,
      "technician_id" -> workOrderSample.technician_id,
      "status" -> workOrderSample.status,
    ).executeInsert().get
  }

  def update(workOrderSample: WorkOrderSample)(implicit conn: Connection) = {
    SQL("update work_order_sample set maintenance_id={maintenance_id}, technician_id={technician_id}, status = {status}" +
      "where id={id}").on(
      "id" -> workOrderSample.id,
      "maintenance_id" -> workOrderSample.maintenance_id,
      "technician_id" -> workOrderSample.technician_id,
      "status" -> workOrderSample.status,
    ).executeUpdate()
  }

  def countAll(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order_sample_view").as(SqlParser.long("count").single)
  }

  def countFiltered(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (item_name like {searchText})"
    SQL("select count(*) as count from work_order_sample_view " + searchCriteria).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrderSampleView] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (item_name like {searchText})"
    SQL("select * from work_order_sample_view" + searchCriteria + " order by item_name Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(viewParser.*)
  }
}
