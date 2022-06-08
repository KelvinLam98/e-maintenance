package models

import anorm._
import play.api.mvc.{AnyContent, Request}

case class OrderByClause(orderByClause: Seq[String]) {
  lazy val value: String = s" order by ${orderByClause.mkString(", ")} "
  //: Todo
  lazy val namedParameters: Seq[NamedParameter] = Vector()
}

object OrderByClause {

  def fromRequest(request: Request[AnyContent], sortableCols: Seq[String]): Option[OrderByClause] = {
    val orderByString = request.getQueryString("orderBy").getOrElse("")
    val orderBys = orderByString.split(",").map(_.trim).toList
    if(
      orderBys.nonEmpty &&
        (
          (orderBys.size == 1 && sortableCols.exists(c => c.toLowerCase == orderByString.toLowerCase))
            ||
            (orderBys.size > 1 && !orderBys.map(e => sortableCols.exists(c => c.toLowerCase == e.toLowerCase)).exists(_.==(false)))
          )
    ) {
      val orderDirString = request.getQueryString("orderDir").getOrElse("asc").toLowerCase
      val orderDirs = orderDirString.split(",").map(_.trim).toList
      val defaultOrderDir = orderDirs.headOption.getOrElse("asc")
      val filteredOrderDirs = orderDirs.map {
        case "asc" => "asc"
        case "desc" => "desc"
        case _ => "asc"
      }
      val orderByClause =
        if(orderBys.size == 1)
          List(orderBys.head.concat(s" ${defaultOrderDir}"))
        else
          if(filteredOrderDirs.size == orderBys.size) orderBys.zipWithIndex.map { case (eachOrderBy, idx) => eachOrderBy.concat(" " + filteredOrderDirs(idx)) }
          else List(orderBys.mkString(", ").concat(s" ${defaultOrderDir}"))
      Some(OrderByClause(orderByClause))
    } else None
  }

  def manualOrdering(columnName: String, direction: String, sortableCols: Seq[String]): Option[OrderByClause] =
    columnName match {
      case (orderBy) if(sortableCols.exists(c => c.toLowerCase == orderBy)) => Some(OrderByClause(List(orderBy.concat(s" $direction"))))
      case _ => None
    }

}