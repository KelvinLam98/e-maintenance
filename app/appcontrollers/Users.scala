package appcontrollers

import helpers._

import java.util.Date
import javax.inject.{Inject, Singleton}
import models._
import play.api.cache.SyncCacheApi
import play.api.db.{Database, NamedDatabase}
import play.api.libs.json._
import play.api.libs.mailer.Email
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
}