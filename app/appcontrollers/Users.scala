package appcontrollers

import helpers._

import java.util.Date
import javax.inject.{Inject, Singleton}
import models._
import play.api.cache.SyncCacheApi
import play.api.db.{Database, NamedDatabase}
import play.api.libs.json._
import play.api.libs.mailer.Email
import play.api.mvc.Results.Ok
import play.api.mvc.{Action, AnyContent, MessagesControllerComponents, Result}
import stores._

import java.net.URLEncoder
import java.sql.Connection

@Singleton
class Users @Inject()(
                       mcc: MessagesControllerComponents,
                       db: Database,
                       userStore: UserStore,
                       cacheApi: SyncCacheApi,
                       loginHelper: LoginHelper,
                     ) extends Bases(mcc, db, userStore, cacheApi) {

  def loginApi: Action[AnyContent] = ApiAction { implicit request =>
    withConnection { implicit conn =>
      val json = request.body.asJson.get
      json.validate[LoginRequest].fold(
        valid = { input =>
          userStore.findByEmail(input.loginEmail) match {
            case Some(user) =>
              if (input.loginPassword == user.password) {
                loginHelper.login(user, None)
              } else Ok("Wrong username or password")
            case None =>
              Ok("Wrong username or password")
          }
        }, invalid = { error =>
          Ok(Json.toJson(ErrorResponse("Invalid JSON: " + error.toString(), 400)))
        }
      )
    }
  }

  def profile(id: Long) = ApiAction { implicit request =>
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("searchText").getOrElse("")
    val limit = LimitClause.fromRequest(request)
    val orderBy = OrderByClause.fromRequest(request, WorkOrder.sortableCols)

    db.withConnection { implicit conn =>
      val total = userStore.countAll
      val filtered = userStore.countFiltered(searchText)
      val data = userStore.searchProfileById(id, searchText, limit, orderBy)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def postUpdateProfile(id: Long): Action[AnyContent] = ApiAction { implicit request =>
    withConnection { implicit conn =>
      val json = request.body.asJson.get
      json.validate[UpdateProfileRequest].fold(
        valid = { input =>
          userStore.findById(id) match {
            case Some(user) =>
              userStore.update(User(
                user.id, user.username, user.password, input.name, input.ic_number, input.contact_number, input.address, input.email, user.role, user.created, new Date
              ))
              Ok(Json.toJson("Update Successfully"))
            case None =>
              Ok("Please contact admin")
          }
        }, invalid = { error =>
          Ok(Json.toJson(ErrorResponse("Invalid JSON: " + error.toString(), 400)))
        }
      )
    }
  }
}