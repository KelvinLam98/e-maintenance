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
        "where (maintenance_date like {searchText} or person_in_charge like {searchText} or maintenance_name like {searchText})"
    SQL("select count(*) as count from work_order " + searchCriteria).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrder] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "where (maintenance_date like {searchText} or person_in_charge like {searchText} or maintenance_name like {searchText})"
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
    SQL("insert into work_order (maintenance_name, person_in_charge, technician_id, maintenance_date, maintenance_time, status) " +
      "values ({maintenance_name}, {person_in_charge}, {technician_id}, {maintenance_date}, {maintenance_time}, {status})").on(
      "maintenance_name" -> workOrder.maintenance_name,
      "person_in_charge" -> workOrder.person_in_charge,
      "technician_id" -> workOrder.technician_id,
      "maintenance_date" -> workOrder.maintenance_date,
      "maintenance_time" -> workOrder.maintenance_time,
      "status" -> workOrder.status,
    ).executeInsert().get
  }

  def update(workOrder: WorkOrder)(implicit conn: Connection) = {
    SQL("update work_order set maintenance_name={maintenance_name}, person_in_charge={person_in_charge}, technician_id={technician_id}, maintenance_date={maintenance_date}, maintenance_time={maintenance_time}, status = {status}" +
      "where id={id}").on(
      "id" -> workOrder.id,
      "maintenance_name" -> workOrder.maintenance_name,
      "person_in_charge" -> workOrder.person_in_charge,
      "technician_id" -> workOrder.technician_id,
      "maintenance_date" -> workOrder.maintenance_date,
      "maintenance_time" -> workOrder.maintenance_time,
      "status" -> workOrder.status,
    ).executeUpdate()
  }

  def searchById(searchText: String, limit: Option[LimitClause], orderBy: Option[OrderByClause])(implicit conn: Connection): Seq[WorkOrder] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    val searchCriteria =
      if(searchText.isEmpty)
        orderCriteria
      else
        "where (maintenance_date like {searchText}) " + orderCriteria
    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](
        "searchText" -> ("%" + searchText + "%")
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from work_order " + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(parser.*)
  }
}
