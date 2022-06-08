package models

import anorm._
import play.api.mvc.{AnyContent, Request}

import scala.util.Try

case class LimitClause(start: Long, length: Long) {

  lazy val value: String = s" limit $start, $length"
  //TODO: may need remove namedParameters
  lazy val namedParameters: Seq[NamedParameter] =
    Vector(
      "start" -> start,
      "count" -> length
    )

}

object LimitClause {

  def fromRequest(request: Request[AnyContent]): Option[LimitClause] =
    (request.getQueryString("start"), request.getQueryString("length")) match {
      case (Some(start), Some(length)) => Try(Some(LimitClause(start.toLong, length.toLong))).getOrElse(None)
      case _ => None
    }

}