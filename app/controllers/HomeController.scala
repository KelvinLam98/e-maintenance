package controllers

import anorm.Macro.Placeholder.Parser.success
import models.{LoginForm, UserRole}
import play.api.cache.SyncCacheApi
import play.api.data.Form
import play.api.data.Forms.{mapping, nonEmptyText}
import play.api.db.Database

import javax.inject._
import play.api.mvc.{AnyContent, Flash, MessagesControllerComponents, Request}
import stores.UserStore

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(
                                mcc: MessagesControllerComponents,
                                db: Database,
                                cache: SyncCacheApi,
                                userStore: UserStore
                              ) (implicit assetsFinder: AssetsFinder)
                            extends BaseController(mcc, db, cache, userStore) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request =>
    println("here")
    Redirect(routes.HomeController.login())
  }

  def login() = Action { implicit request =>
    if (request.session.get("username").isEmpty) {
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (loginDataForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (loginDataForm, Array.empty[String])
        }
      Ok(views.html.login(form, errors))
    } else {
      Redirect(routes.HomeController.index())
    }
  }

  private val loginDataForm: Form[LoginForm] = Form(
    mapping(
      "username" -> nonEmptyText,
      "password" -> nonEmptyText
    )(LoginForm.apply)(LoginForm.unapply)
  )

  def postLoginData = Action { implicit request =>
    loginDataForm.bindFromRequest().fold(
      hasErrors = { form =>
        Redirect(routes.HomeController.login())
          .flashing(Flash(form.data) +
            ("errors" -> form.errors.map(_.key).mkString(",")))
      },
      success = { data =>
        db.withConnection { implicit conn =>
          userStore.findByUserName(data.username) match {
            case Some(user) =>
              if (data.password == user.password) {
                println("if" + data.username)
                Redirect(routes.Users.listUser).withSession("username"-> user.username)
              } else {
                println("else" + data.username)
                Redirect(routes.HomeController.index())
              }
            case _ =>
              Ok("Success")
          }
        }
      })
  }
}
