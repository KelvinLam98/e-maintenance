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

class Technicians @Inject()(
                                  mcc: MessagesControllerComponents,
                                  db: Database,
                                  cache: SyncCacheApi,
                                  userStore: UserStore,
                                  technicianStore: TechnicianStore
                                ) extends BaseController(mcc, db, cache, userStore) {

  def list = SecuredAction(UserRole.USER) { implicit request =>
    Ok(views.html.technicians.list())
  }

  def listTechniciansJson = SecuredAction(UserRole.USER) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = technicianStore.countAll
      val filtered = technicianStore.countFiltered(searchText)
      val data = technicianStore.search(start, length, searchText)
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
      technicianStore.findInfoById(id).map { item =>
        Ok(views.html.technicians.detail(item))
      }.getOrElse(NotFound)
    }
  }

  private val techniciansForm: Form[Technician] = Form(
    mapping(
      "id" -> optional(longNumber),
      "name" -> nonEmptyText,
      "contact_number" -> nonEmptyText,
    )(Technician.apply)(Technician.unapply)
  )

  def create = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (techniciansForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (techniciansForm.fill(Technician(None, "-", "-")), Array.empty[String])
        }
      Ok(views.html.technicians.form(form, errors, "Create"))
    }
  }

  def postTechniciansDb = SecuredAction(UserRole.ADMIN) { implicit request =>
    techniciansForm.bindFromRequest().fold(
      hasErrors = { form =>
        val id = form.data.getOrElse("id", "")
        if (id == "") {
          Redirect(routes.Technicians.create)
            .flashing(Flash(form.data) +
              ("errors" -> form.errors.map(_.key).mkString(",")))
        } else {
          Redirect(routes.Technicians.update(id.toLong)).flashing(Flash(form.data) +
            ("errors" -> form.errors.map(_.key).mkString(","))) }
      },
      success = { data =>
        db.withTransaction { implicit conn =>
          technicianStore.findById(data.id.getOrElse(-1)) match {
            case Some(item) =>
              technicianStore.update(Technician(data.id, data.name, data.contact_number))
              Redirect(routes.Technicians.detail(item.id.get))
                .flashing(("success" -> "successfullyUpdated"))
            case None =>
              val id: Long = technicianStore.insert(Technician(None, data.name, data.contact_number))
              Redirect(routes.Technicians.detail(id))
                .flashing(("success" -> "successfullyCreated"))
          }
        }
      }
    )
  }

  def update(id: Long) = SecuredAction(UserRole.USER) { implicit request =>
    db.withConnection { implicit conn =>
      technicianStore.findById(id).map { item =>
        val (form, errors) =
          request.flash.get("errors") match {
            case Some(errorsStr) =>
              (techniciansForm.bind(request.flash.data), errorsStr.split(","))
            case None =>
              (techniciansForm.fill(Technician(item.id, item.name, item.contact_number)), Array.empty[String])
          }
        Ok(views.html.technicians.form(form, errors, "Update"))
      }.getOrElse(NotFound)
    }
  }

  def delete(id: Long) = Action { implicit request =>
    db.withTransaction { implicit conn =>
      technicianStore.delete(id)
      Redirect(routes.Technicians.list)
        .flashing(("success" -> "successfullyDeleted"))
    }
  }
  /* TODO */

  /* do not edit below this line */
}
