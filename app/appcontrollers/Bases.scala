package appcontrollers

import java.net.URL
import play.api.mvc._
import models.{ErrorResponse, User}
import play.api.db.Database
import stores._
import scala.concurrent.{ExecutionContext, Future}
import java.sql.{Connection, Time}
import helpers.CryptoHelper
import play.api.data.format.Formats.parsing
import play.api.data.format.Formatter
import play.api.libs.json.Json
import play.api.cache.SyncCacheApi
import java.util.Date
import play.api.Logging

class Bases(mcc: MessagesControllerComponents, db: Database, userStore: UserStore, cacheApi: SyncCacheApi) extends MessagesAbstractController(mcc) with Logging {

  def withConnection(fun: Connection => Result): Result =
    db.withConnection { implicit conn =>
      try {
        val result = fun(conn)
        result
      }
      catch {
        case t: Throwable =>
          logger.error(t.getMessage, t)
          Ok(Json.toJson(ErrorResponse("Server Error: " + t.getMessage, 500)))
      }
    }

  def withTransaction(fun: Connection => Result): Result =
    db.withTransaction { implicit conn =>
      try {
        val result = fun(conn)
        conn.commit()
        result
      }
      catch {
        case t: Throwable =>
          logger.error(t.getMessage, t)
          conn.rollback()
          Ok(Json.toJson(ErrorResponse("Server Error: " + t.getMessage, 500)))
      }
    }

  protected def getUserJWT[A](request: RequestHeader): Option[User] =
    request.headers.get("jwt-token") flatMap { jwtToken =>
      CryptoHelper.decodeJWT(jwtToken)
    }

  protected def getUserJWTFromQueryParameter(request: RequestHeader): Option[User] =
    request.getQueryString("t") flatMap { jwtToken =>
      CryptoHelper.decodeReadOnlyJWT(jwtToken)
    }

  case class RequestWithLoginInfo[A](user: User, request: Request[A]) extends WrappedRequest(request)

  def accessControlAllowOrigin(request: Request[_]): String = request.headers.get("Referer").map { ref =>
    val url = new URL(ref)
    val port = url.getPort
    if (port >= 0)
      url.getProtocol + "://" + url.getHost + ":" + url.getPort
    else
      url.getProtocol + "://" + url.getHost
  }.getOrElse("https://www.ebuildex.com")

  object ApiAction extends ActionBuilder[Request, AnyContent] {
    override protected def executionContext: ExecutionContext = mcc.executionContext
    override def parser: BodyParser[AnyContent] = mcc.parsers.defaultBodyParser

    def invokeBlock[A](request: Request[A],
                       block: (Request[A]) => Future[Result]): Future[Result] = {
      block(request).map(_.withHeaders("Access-Control-Allow-Origin" -> accessControlAllowOrigin(request), "Access-Control-Allow-Credentials" -> "true"))(executionContext)
    }
  }

  val inactiveTimeout: Int = 30 * 60 * 1000 // 30 minutes - formula: m * s * ms
  //need to check on this also: val closingList = loginSessionStore.findExpiredOpenSession

  def lastAccessCacheKey(user: User): String = "e-maintenance-last-access-" + user.email

  case class SecuredApiAction(accessRight: Int) extends ActionBuilder[RequestWithLoginInfo, AnyContent] {
    override protected def executionContext: ExecutionContext = mcc.executionContext
    override def parser: BodyParser[AnyContent] = mcc.parsers.defaultBodyParser

    def invokeBlock[A](request: Request[A], block: (RequestWithLoginInfo[A]) => Future[Result]): Future[Result] = {
      getUserJWT(request) match {
        case Some(loginInfo) =>
          /*if (AccessUtil.hasAccess(loginInfo.accessRights, accessRight))
            block(RequestWithLoginInfo(loginInfo, request)).map(_.withHeaders("Access-Control-Allow-Origin" -> accessControlAllowOrigin(request), "Access-Control-Allow-Credentials" -> "true"))(executionContext)
          else*/
          Future.successful(Ok("REQUIRE-LOGIN").withHeaders("Access-Control-Allow-Origin" -> accessControlAllowOrigin(request), "Access-Control-Allow-Credentials" -> "true"))

        case None =>
          Future.successful(Ok("REQUIRE-LOGIN").withHeaders("Access-Control-Allow-Origin" -> accessControlAllowOrigin(request), "Access-Control-Allow-Credentials" -> "true"))
      }
    }
  }

  case class ReadOnlySecuredApiAction(accessRight: Int) extends ActionBuilder[RequestWithLoginInfo, AnyContent] {
    override protected def executionContext: ExecutionContext = mcc.executionContext
    override def parser: BodyParser[AnyContent] = mcc.parsers.defaultBodyParser

    def invokeBlock[A](request: Request[A], block: (RequestWithLoginInfo[A]) => Future[Result]): Future[Result] = {
      getUserJWTFromQueryParameter(request) match {
        case Some(loginInfo) =>
          /*if (AccessUtil.hasAccess(loginInfo.accessRights, accessRight))
            block(RequestWithLoginInfo(loginInfo, request)).map(_.withHeaders("Access-Control-Allow-Origin" -> accessControlAllowOrigin(request), "Access-Control-Allow-Credentials" -> "true"))(executionContext)
          else*/
          Future.successful(Ok("REQUIRE-LOGIN").withHeaders("Access-Control-Allow-Origin" -> accessControlAllowOrigin(request), "Access-Control-Allow-Credentials" -> "true"))

        case None =>
          Future.successful(Ok("REQUIRE-LOGIN").withHeaders("Access-Control-Allow-Origin" -> accessControlAllowOrigin(request), "Access-Control-Allow-Credentials" -> "true"))
      }
    }
  }

  implicit def request2User(implicit request : RequestWithLoginInfo[_]) : User =
    request.user

//  implicit object TimeFormatter extends Formatter[Time] {
//    override val format = Some(("format.time", Nil))
//    override def bind(key: String, data: Map[String, String]) = {
//      parsing({ strValue =>
//        val date = DateHelper.parse(strValue, "h : mm a")
//        new Time(date.getTime)
//      }, "error.time", Nil)(key, data)
//    }
//    override def unbind(key: String, value: Time) = Map(key -> value.toString)
//  }


  // For XSS prevention: https://jsoup.org/cookbook/cleaning-html/whitelist-sanitizer
}

object Bases {

  val disableSessionCheck = System.getenv("E_MAINTENANCE_DISABLE_SESSION_CHECK") == "true"

}