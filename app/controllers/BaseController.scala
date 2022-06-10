package controllers

import java.sql.Time

import models.{RequestWithUser, User}
import play.api.cache._
import play.api.data.format.Formats._
import play.api.data.format.Formatter
import play.api.db.Database
import play.api.mvc._
import stores.UserStore

import scala.concurrent.{ExecutionContext, Future}

class BaseController(mcc: MessagesControllerComponents, db: Database, cache: SyncCacheApi, userStore: UserStore) extends MessagesAbstractController(mcc) {

  protected def getUser[A](request: Request[A]): Option[User] =
    request.session.get("emaint-userId") flatMap { userId =>
      db.withConnection { implicit conn =>
        userStore.findByUserName(userId)
      }
    }

  case class SecuredAction(accessLevel: Int) extends ActionBuilder[RequestWithUser, AnyContent] {

    override protected def executionContext: ExecutionContext = mcc.executionContext
    override def parser: BodyParser[AnyContent] = mcc.parsers.defaultBodyParser

    def invokeBlock[A](request: Request[A],
                       block: (RequestWithUser[A]) => Future[Result]): Future[Result] = {
      getUser(request) match {
        case Some(user) =>

          val userAccessLevel = if (user.role == "admin") 1 else 0
          if (userAccessLevel >= accessLevel)
            block(RequestWithUser(user, request))
          else
          //Future.successful(Unauthorized(views.html.responseMessage("You are not authorized to view this page.")))
            Future.successful(Ok("You are not authorized to view this page."))
        case None =>
          //Future.successful(Redirect(routes.Users.login()))
          Future.successful(Redirect(routes.HomeController.index()))
      }
    }
  }

  implicit def request2Messages(implicit request : play.api.mvc.RequestHeader) : play.api.i18n.Messages = {
    request.session.get("emaint-language") match {
      case Some(lang) => mcc.messagesApi.preferred(List(play.api.i18n.Lang(lang)))
      case None => mcc.messagesApi.preferred(List(play.api.i18n.Lang("en")))
    }
  }

  implicit def request2User(implicit request : RequestWithUser[_]) : User =
    request.user
}
