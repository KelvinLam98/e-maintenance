package controllers

import models._
import stores._
import play.api.cache.SyncCacheApi
import play.api.data.Form
import play.api.data.Forms.{date, email, longNumber, mapping, nonEmptyText, optional}
import play.api.data.validation.Constraints.emailAddress
import play.api.db.Database
import play.api.libs.json.Json
import play.api.mvc.{AnyContent, Flash, MessagesControllerComponents, Request}

import java.util.Date
import javax.inject.Inject

class Users @Inject()(
                       mcc: MessagesControllerComponents,
                       db: Database,
                       cache: SyncCacheApi,
                       userStore: UserStore,
                       workOrderStore: WorkOrderStore,
                     ) extends BaseController(mcc, db, cache, userStore) {

  def listUser = SecuredAction(UserRole.USER) { implicit request =>
    Ok(views.html.users.listUser())
  }

  def listUserJson = SecuredAction(UserRole.USER) { implicit request =>
   val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = userStore.countAll
      val filtered = userStore.countFiltered(searchText)
      val data = userStore.search(start, length, searchText)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def detail(id: Long) = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
        userStore.findById(id).map { user =>
          Ok(views.html.users.detail(user))
        }.getOrElse(NotFound)
      }
    }

  private val userForm: Form[UserForm] = Form(
    mapping(
      "id" -> optional(longNumber),
      "username" -> nonEmptyText,
      "password" -> nonEmptyText,
      "name" -> nonEmptyText,
      "ic_number" -> nonEmptyText,
      "contact_number" -> nonEmptyText,
      "address" -> nonEmptyText,
      "email" -> email.verifying( emailAddress ),
      "role" -> nonEmptyText
    )(UserForm.apply)(UserForm.unapply)
  )

  def create = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (userForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (userForm.fill(UserForm(None, "-", "-", "", "", "", "", "", "user")), Array.empty[String])
        }
      Ok(views.html.users.form(form, errors, "Create"))
    }
  }

  def postUserDb = SecuredAction(UserRole.ADMIN) { implicit request =>
    userForm.bindFromRequest().fold(
      hasErrors = { form =>
        println(form.errors)
        val id = form.data.getOrElse("id", "")
        if (id == "") {
          Redirect(routes.Users.create)
            .flashing(Flash(form.data) +
              ("errors" -> form.errors.map(_.key).mkString(",")))
        } else {
          Redirect(routes.Users.update(id.toLong)).flashing(Flash(form.data) +
          ("errors" -> form.errors.map(_.key).mkString(","))) }
      },
      success = { data =>
        db.withTransaction { implicit conn =>
          userStore.findById(data.id.getOrElse(-1)) match {
            case Some(user) =>
              if (data.name == user.name) {
                if (data.email == user.email){
                  userStore.update(User(data.id, data.name, user.password, data.name, data.ic_number, data.contact_number, data.address, data.email, data.role, user.created, new Date))
                  Redirect(routes.Users.detail(user.id.get))
                .flashing(("success" -> "successfullyUpdated"))
                } else userStore.findByEmail(data.email) match {
                case Some(email) =>
                  Redirect(routes.Users.update(user.id.get))
                    .flashing(Flash(userForm.fill(data).data) +
                      ("errors" -> "emailIsAlreadyExists"))
                case None =>
                  userStore.update(User(data.id, data.name, user.password, data.name, data.ic_number, data.contact_number, data.address, data.email, data.role, user.created, new Date))
                  Redirect(routes.Users.detail(user.id.get))
                    .flashing(("success" -> "successfullyUpdated"))
              }}else {
                userStore.findByUserName(data.name) match {
                  case Some(username) =>
                    Redirect(routes.Users.update(user.id.get))
                      .flashing(Flash(userForm.fill(data).data) +
                        ("errors" -> "userIsAlreadyExists"))
                  case None =>
                    if (data.email == user.email) {
                      userStore.update(User(data.id, data.name, user.password, data.name, data.ic_number, data.contact_number, data.address, data.email, data.role, user.created, new Date))
                      Redirect(routes.Users.detail(user.id.get))
                        .flashing(("success" -> "successfullyUpdated"))
                    }
                    else {
                      userStore.findByEmail(data.email) match {
                        case Some(email) =>
                          Redirect(routes.Users.update(user.id.get))
                            .flashing(Flash(userForm.fill(data).data) +
                              ("errors" -> "emailIsAlreadyExists"))
                        case None =>
                          userStore.update(User(data.id, data.name, user.password, data.name, data.ic_number, data.contact_number, data.address, data.email, data.role, user.created, new Date))
                          Redirect(routes.Users.detail(user.id.get))
                            .flashing(("success" -> "successfullyUpdated"))
                      }
                    }
                }
              }
            case None =>
              if (userStore.findByEmail(data.email).isDefined) {
                Redirect(routes.Users.create)
                  .flashing(Flash(userForm.fill(data).data) +
                    ("errors" -> "emailIsAlreadyExists"))
              } else if (userStore.findByUserName(data.name).isDefined) {
              Redirect(routes.Users.create)
                .flashing(Flash(userForm.fill(data).data) +
                  ("errors" -> "userIsAlreadyExists"))
            } else {
                val id: Long = userStore.insert(User(None, data.name, data.contact_number, data.name, data.ic_number, data.contact_number, data.address, data.email, data.role, new Date, new Date))
                Redirect(routes.Users.detail(id))
                  .flashing(("success" -> "successfullyCreated"))
              }
          }
        }
      }
    )
  }

  def update(id: Long) = SecuredAction(UserRole.USER) { implicit request =>
    db.withConnection { implicit conn =>
        userStore.findById(id).map { user =>
          val (form, errors) =
            request.flash.get("errors") match {
              case Some(errorsStr) =>
                (userForm.bind(request.flash.data), errorsStr.split(","))
              case None =>
                (userForm.fill(UserForm(user.id, user.username, user.password, user.name, user.ic_number, user.contact_number, user.address, user.email, user.role)), Array.empty[String])
            }
          Ok(views.html.users.form(form, errors, "Update"))
        }.getOrElse(NotFound)
      }
    }

  def delete(id: Long) = Action { implicit request =>
    db.withTransaction { implicit conn =>
      userStore.delete(id)
      Redirect(routes.Users.listUser)
        .flashing(("success" -> "successfullyDeleted"))
    }
  }

  def dashboard = SecuredAction(UserRole.ADMIN) { implicit request =>
    Ok(views.html.dashboard())
  }

  def dashboardListJson = SecuredAction(UserRole.ADMIN) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = workOrderStore.countAllForPending
      val filtered = workOrderStore.countFilteredForPending(searchText)
      val data = workOrderStore.searchForPending(start, length, searchText)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def dashboardListInProgressJson = SecuredAction(UserRole.ADMIN) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = workOrderStore.countAllForInProgress
      val filtered = workOrderStore.countFilteredForInProgress(searchText)
      val data = workOrderStore.searchForInProgress(start, length, searchText)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def dashboardListTodoJson = SecuredAction(UserRole.USER) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = workOrderStore.countAllForTodo
      val filtered = workOrderStore.countFilteredForTodo(searchText)
      val data = workOrderStore.searchForTodo(start, length, searchText)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  /* do not edit below this line */
}
