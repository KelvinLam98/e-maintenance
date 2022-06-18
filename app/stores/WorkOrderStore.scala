package stores

import java.sql.Connection

import javax.inject.Inject
import models._
import anorm._

class WorkOrderStore @Inject()() {

  val parser: RowParser[WorkOrder] = Macro.namedParser[WorkOrder]
  val viewParser: RowParser[WorkOrderView] = Macro.namedParser[WorkOrderView]
  val viewSampleParser: RowParser[WorkOrderSampleView] = Macro.namedParser[WorkOrderSampleView]

  def findAll(implicit conn: Connection): Seq[WorkOrder] = {
    SQL("select * from work_order").on().as(parser.*)
  }

  def countAll(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order_view where (maintenance_date - CURDATE() >= 0 )").as(SqlParser.long("count").single)
  }

  def countFiltered(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select count(*) as count from work_order_view where (maintenance_date - CURDATE() >= 0 )" + searchCriteria ).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrderView] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select * from work_order_view where (maintenance_date - CURDATE() >= 0 )" + searchCriteria + " order by maintenance_date Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(viewParser.*)
  }

  def countAllByItem(item_name: String)(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order_view where item_name={item_name} and (maintenance_date - CURDATE() >= 0 )").on(
      "item_name" -> item_name
    ).as(SqlParser.long("count").single)
  }

  def countFilteredByItem(item_name: String, searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select count(*) as count from work_order_view where (item_name={item_name}) and (maintenance_date - CURDATE() >= 0 )" + searchCriteria ).on(
      "searchText" -> ("%" + searchText + "%"),
      "item_name" -> item_name
    ).as(SqlParser.long("count").single)
  }

  def searchByItem(item_name: String, start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrderView] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select * from work_order_view where (item_name={item_name}) and (maintenance_date - CURDATE() >= 0 )" + searchCriteria + " order by maintenance_date Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%"),
      "item_name" -> item_name
    ).as(viewParser.*)
  }

  def countAllForPending(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order_view where (status = 'Pending')").as(SqlParser.long("count").single)
  }

  def countFilteredForPending(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select count(*) as count from work_order_view where (status = 'Pending')" + searchCriteria ).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def searchForPending(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrderView] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select * from work_order_view where (status = 'Pending')" + searchCriteria + " order by maintenance_date Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(viewParser.*)
  }

  def countAllForInProgress(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order_view where (status != 'Rejected') and (maintenance_date = CURDATE())").as(SqlParser.long("count").single)
  }

  def countFilteredForInProgress(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select count(*) as count from work_order_view where (status != 'Rejected') and (maintenance_date = CURDATE())" + searchCriteria ).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def searchForInProgress(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrderView] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select * from work_order_view where (status != 'Rejected') and (maintenance_date = CURDATE())" + searchCriteria + " order by maintenance_date Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(viewParser.*)
  }

  def countAllForTodo(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order_view where (status = 'Todo')").as(SqlParser.long("count").single)
  }

  def countFilteredForTodo(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select count(*) as count from work_order_view where (status = 'Todo')" + searchCriteria ).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def searchForTodo(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrderView] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select * from work_order_view where (status = 'Todo')" + searchCriteria + " order by maintenance_date Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(viewParser.*)
  }

  def countAllHistory(implicit conn: Connection): Long = {
    SQL("select count(*) as count from work_order_view where (maintenance_date - CURDATE() < 0 )").as(SqlParser.long("count").single)
  }

  def countFilteredHistory(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select count(*) as count from work_order_view where (maintenance_date - CURDATE() < 0 )" + searchCriteria ).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def searchHistory(start: Long, count: Long, searchText: String)(implicit conn: Connection): Seq[WorkOrderView] = {
    val searchCriteria =
      if (searchText.isEmpty)
        ""
      else
        "and (maintenance_date like {searchText} or user_name like {searchText} or item_name like {searchText})"
    SQL("select * from work_order_view where (maintenance_date - CURDATE() < 0 )" + searchCriteria + " order by maintenance_date Asc limit {start}, {count}").on(
      "start" -> start,
      "count" -> count,
      "searchText" -> ("%" + searchText + "%")
    ).as(viewParser.*)
  }

  def findViewById(id: Long)(implicit conn: Connection): Option[WorkOrderView] = {
    SQL("select * from work_order_view where id = {id}").on(
      "id" -> id
    ).as(viewParser.singleOpt)
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
    SQL("insert into work_order (maintenance_id, user_id, technician_id, maintenance_date, maintenance_time, status) " +
      "values ({maintenance_id}, {user_id}, {technician_id}, {maintenance_date}, {maintenance_time}, {status})").on(
      "maintenance_id" -> workOrder.maintenance_id,
      "user_id" -> workOrder.user_id,
      "technician_id" -> workOrder.technician_id,
      "maintenance_date" -> workOrder.maintenance_date,
      "maintenance_time" -> workOrder.maintenance_time,
      "status" -> workOrder.status,
    ).executeInsert().get
  }

  def update(workOrder: WorkOrder)(implicit conn: Connection) = {
    SQL("update work_order set maintenance_id={maintenance_id}, user_id={user_id}, technician_id={technician_id}, maintenance_date={maintenance_date}, maintenance_time={maintenance_time}, status = {status}" +
      "where id={id}").on(
      "id" -> workOrder.id,
      "maintenance_id" -> workOrder.maintenance_id,
      "user_id" -> workOrder.user_id,
      "technician_id" -> workOrder.technician_id,
      "maintenance_date" -> workOrder.maintenance_date,
      "maintenance_time" -> workOrder.maintenance_time,
      "status" -> workOrder.status,
    ).executeUpdate()
  }

  def searchById(user_name: String, searchText: String, limit: Option[LimitClause], orderBy: Option[OrderByClause])(implicit conn: Connection): Seq[WorkOrderView] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    println("orderCriteria: " + orderCriteria)
    val searchCriteria =
      if(searchText.isEmpty)
        orderCriteria
      else
        "and (maintenance_date like {searchText} || status like {searchText} || item_code like {searchText})" + orderCriteria
    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](
        "searchText" -> ("%" + searchText + "%"),
        "user_name" -> user_name
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from work_order_view where user_name={user_name}" + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(viewParser.*)
  }

  def searchViewById(id: Long, searchText: String, limit: Option[LimitClause], orderBy: Option[OrderByClause])(implicit conn: Connection): Seq[WorkOrderView] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    val searchCriteria =
      if(searchText.isEmpty)
        orderCriteria
      else
        "and (maintenance_date like {searchText})" + orderCriteria
    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](
        "searchText" -> ("%" + searchText + "%"),
        "id" -> id
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from work_order_view where id={id}" + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(viewParser.*)
  }

  def searchSampleById(searchText: String, limit: Option[LimitClause], orderBy: Option[OrderByClause])(implicit conn: Connection): Seq[WorkOrderSampleView] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    println("orderCriteria: " + orderCriteria)
    val searchCriteria =
      if(searchText.isEmpty)
        orderCriteria
      else
        "where (item_name like {searchText})" + orderCriteria
    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](
        "searchText" -> ("%" + searchText + "%")
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from work_order_sample_view " + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(viewSampleParser.*)
  }

  def searchByIdAndStatus(user_name: String, status: String, searchText: String, limit: Option[LimitClause], orderBy: Option[OrderByClause])(implicit conn: Connection): Seq[WorkOrderView] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    println("orderCriteria: " + orderCriteria)
    val searchCriteria =
      if(searchText.isEmpty)
        orderCriteria
      else
        "and (maintenance_date like {searchText})" + orderCriteria
    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](
        "searchText" -> ("%" + searchText + "%"),
        "user_name" -> user_name,
        "status" -> status,
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from work_order_view where user_name={user_name} and status={status}" + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(viewParser.*)
  }

  def searchSampleDetailById(id: Long, searchText: String, limit: Option[LimitClause], orderBy: Option[OrderByClause])(implicit conn: Connection): Seq[WorkOrderSampleView] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    val searchCriteria =
      if(searchText.isEmpty)
        orderCriteria
      else
        "and (item_name like {searchText})" + orderCriteria
    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](
        "searchText" -> ("%" + searchText + "%"),
        "id" -> id
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from work_order_sample_view where id = {id}" + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(viewSampleParser.*)
  }

}
