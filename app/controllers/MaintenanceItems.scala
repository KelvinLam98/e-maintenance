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

class MaintenanceItems @Inject()(
                       mcc: MessagesControllerComponents,
                       db: Database,
                       cache: SyncCacheApi,
                       userStore: UserStore,
                       maintenanceItemStore: MaintenanceItemStore
                     ) extends BaseController(mcc, db, cache, userStore) {

  def list = SecuredAction(UserRole.USER) { implicit request =>
    Ok(views.html.maintenanceItems.list())
  }

  def listMaintenanceItemsJson = SecuredAction(UserRole.USER) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = maintenanceItemStore.countAll
      val filtered = maintenanceItemStore.countFiltered(searchText)
      val data = maintenanceItemStore.search(start, length, searchText)
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
      maintenanceItemStore.findInfoById(id).map { item =>
        Ok(views.html.maintenanceItems.detail(item))
      }.getOrElse(NotFound)
    }
  }

  private val maintenanceItemsForm: Form[MaintenanceItem] = Form(
    mapping(
      "id" -> optional(longNumber),
      "item_code" -> nonEmptyText,
      "item_name" -> nonEmptyText,
    )(MaintenanceItem.apply)(MaintenanceItem.unapply)
  )

  def create = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (maintenanceItemsForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (maintenanceItemsForm.fill(MaintenanceItem(None, "", "")), Array.empty[String])
        }
      Ok(views.html.maintenanceItems.form(form, errors, "Create"))
    }
  }

  def postMaintenanceItemsDb = SecuredAction(UserRole.ADMIN) { implicit request =>
    maintenanceItemsForm.bindFromRequest().fold(
      hasErrors = { form =>
        val id = form.data.getOrElse("id", "")
        if (id == "") {
          Redirect(routes.MaintenanceItems.create)
            .flashing(Flash(form.data) +
              ("errors" -> form.errors.map(_.key).mkString(",")))
        } else {
          Redirect(routes.MaintenanceItems.update(id.toLong)).flashing(Flash(form.data) +
            ("errors" -> form.errors.map(_.key).mkString(",")))
        }
      },
      success = { data =>
        db.withTransaction { implicit conn =>
          maintenanceItemStore.findById(data.id.getOrElse(-1)) match {
            case Some(item) =>
              if (item.item_name == data.item_name) {
                maintenanceItemStore.update(MaintenanceItem(data.id, data.item_code, data.item_name))
                Redirect(routes.MaintenanceItems.detail(item.id.get))
                  .flashing(("success" -> "successfullyUpdated"))
              }
              else maintenanceItemStore.findByItemName(data.item_name) match {
                case Some(itemName) =>
                  Redirect(routes.MaintenanceItems.update(item.id.get))
                    .flashing(Flash(maintenanceItemsForm.fill(data).data) +
                      ("errors" -> "itemIsAlreadyExists"))
                case None =>
                  maintenanceItemStore.update(MaintenanceItem(data.id, data.item_code, data.item_name))
                  Redirect(routes.MaintenanceItems.detail(item.id.get))
                    .flashing(("success" -> "successfullyUpdated"))
              }
            case None =>
              if (maintenanceItemStore.findByItemName(data.item_name).isDefined) {
                Redirect(routes.MaintenanceItems.create)
                  .flashing(Flash(maintenanceItemsForm.fill(data).data) +
                    ("errors" -> "itemIsAlreadyExists"))
              } else {
                val id: Long = maintenanceItemStore.insert(MaintenanceItem(None, data.item_code, data.item_name))
                Redirect(routes.MaintenanceItems.detail(id))
                  .flashing(("success" -> "successfullyCreated"))
              }
          }
        }
      }
    )
  }

  def update(id: Long) = SecuredAction(UserRole.USER) { implicit request =>
    db.withConnection { implicit conn =>
      maintenanceItemStore.findById(id).map { item =>
        val (form, errors) =
          request.flash.get("errors") match {
            case Some(errorsStr) =>
              (maintenanceItemsForm.bind(request.flash.data), errorsStr.split(","))
            case None =>
              (maintenanceItemsForm.fill(MaintenanceItem(item.id, item.item_code, item.item_name)), Array.empty[String])
          }
        Ok(views.html.maintenanceItems.form(form, errors, "Update"))
      }.getOrElse(NotFound)
    }
  }

  def delete(id: Long) = Action { implicit request =>
    db.withTransaction { implicit conn =>
      maintenanceItemStore.delete(id)
      Redirect(routes.MaintenanceItems.list)
        .flashing(("success" -> "successfullyDeleted"))
    }
  }
  /* TODO */

  /* do not edit below this line */
}
