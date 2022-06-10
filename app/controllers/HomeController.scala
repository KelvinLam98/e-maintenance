package controllers

import anorm.Macro.Placeholder.Parser.success
import models._
import play.api.cache.SyncCacheApi
import play.api.data.Form
import play.api.data.Forms.{longNumber, mapping, nonEmptyText}
import play.api.db.Database

import javax.inject._
import play.api.mvc.{AnyContent, Flash, MessagesControllerComponents, Request}
import stores.UserStore

import java.util.Date

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
    Redirect(routes.HomeController.login())
  }

  def login() = Action { implicit request =>
    if (request.session.get("emaint-userId").isEmpty) {
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (loginDataForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (loginDataForm, Array.empty[String])
        }
      Ok(views.html.login(form, errors))
    }else {
      Redirect(routes.Users.listUser)
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
        println(form.data)
        println(form.errors)
        Redirect(routes.HomeController.login())
          .flashing(Flash(form.data) +
            ("errors" -> form.errors.map(_.key).mkString(",")))
      },
      success = { data =>
        db.withConnection { implicit conn =>
          userStore.findByUserName(data.username) match {
            case Some(user) =>
              if (data.password == user.password) {
                user.role match {
                  case UserRole.Admin_String =>
                    val userDetail = userStore.findById(user.id.get)
                    userDetail match {
                      case Some(u) =>
                        if(userDetail.size == 1){
                          Redirect(routes.Users.listUser).withSession("emaint-userId" -> user.username)
                        }else{
                          Redirect(routes.Users.listUser).withSession("emaint-userId" -> user.username)
                        }
                      case None =>
                        Redirect(routes.HomeController.login())
                          .flashing(Flash(loginDataForm.fill(data).data) +
                            ("errors" -> "userNotFound"))
                    }
                  case _ =>
                    println("case _")
                    Redirect(routes.HomeController.index()).withSession("emaint-userId" -> user.username)
                }
              } else {
                Redirect(routes.HomeController.login())
                  .flashing(Flash(loginDataForm.fill(data).data) +
                    ("errors" -> "incorrectPasswordOrUsername"))
              }
            case None =>
              Redirect(routes.HomeController.login())
                .flashing(Flash(loginDataForm.fill(data).data) +
                  ("errors" -> "incorrectPasswordOrUsername"))
          }
        }
      })
  }

  def logout = Action { implicit request =>
    Redirect(routes.HomeController.login()).withNewSession
  }

  def resetPasswords(id: Long) = SecuredAction(UserRole.ADMIN) { implicit request =>
    val (form, errors) =
      request.flash.get("errors") match {
        case Some(errorsStr) =>
          (resetPasswordForm.bind(request.flash.data), errorsStr.split(","))
        case None =>
          (resetPasswordForm.fill(ResetPassword(id, "", "")), Array.empty[String])
      }
    Ok(views.html.resetPassword(id, form, errors))
  }

  private val resetPasswordForm: Form[ResetPassword] = Form(
    mapping(
      "id" -> longNumber,
      "newPassword" -> nonEmptyText,
      "confirmPassword" -> nonEmptyText
    )(ResetPassword.apply)(ResetPassword.unapply)
  )

  def postResetPassword = SecuredAction(UserRole.ADMIN) { implicit request =>
    resetPasswordForm.bindFromRequest().fold(
      hasErrors = { form =>
        val id = form.get.id
        Redirect(routes.HomeController.resetPasswords(id))
          .flashing(Flash(form.data) +
            ("errors" -> form.errors.map(_.key).mkString(",")))
      },
      success = { data =>
        db.withTransaction { implicit conn =>
          val newpass = data.newPassword
          if (newpass == data.confirmPassword) {
            userStore.updatePasswordByEmail(data.id, data.confirmPassword, new Date)
            Redirect(routes.HomeController.resetPasswords(data.id)).flashing(("errors" -> "successfully changed"))
          }
          else {
            Redirect(routes.HomeController.resetPasswords(data.id)).flashing(("errors" -> "new pass not same as confirm pass"))
          }

        }
      }
    )
  }
}
