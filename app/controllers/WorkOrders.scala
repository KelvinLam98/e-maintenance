package controllers

import models._
import stores._
import play.api.cache.SyncCacheApi
import play.api.data.Form
import play.api.data.Forms.{date, email, longNumber, mapping, nonEmptyText, optional}
import play.api.db.Database
import play.api.libs.json.Json
import play.api.mvc.{AnyContent, Flash, MessagesControllerComponents, Request}

import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject

class WorkOrders @Inject()(
                                  mcc: MessagesControllerComponents,
                                  db: Database,
                                  cache: SyncCacheApi,
                                  userStore: UserStore,
                                  workOrderStore: WorkOrderStore,
                                  maintenanceItemStore: MaintenanceItemStore
                                ) extends BaseController(mcc, db, cache, userStore) {

  def list = SecuredAction(UserRole.USER) { implicit request =>
    println("list workOrders#####################")
    Ok(views.html.workOrders.list())
  }

  def listWorkOrderJson = SecuredAction(UserRole.USER) { implicit request =>
    println("json request workOrders#####################")
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      println("json db conn workOrders######################")
      val total = workOrderStore.countAll
      val filtered = workOrderStore.countFiltered(searchText)
      val data = workOrderStore.search(start, length, searchText)
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
      workOrderStore.findInfoById(id).map { item =>
        Ok(views.html.workOrders.detail(item))
      }.getOrElse(NotFound)
    }
  }

  private val workOrdersForm: Form[WorkOrder] = Form(
    mapping(
      "id" -> optional(longNumber),
      "maintenance_name" -> nonEmptyText,
      "person_in_charge" -> nonEmptyText,
      "maintenance_date" -> date,
      "status" -> nonEmptyText,
    )(WorkOrder.apply)(WorkOrder.unapply)
  )

  def create = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (workOrdersForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (workOrdersForm.fill(WorkOrder(None, "", "", new Date, "")), Array.empty[String])
        }
      Ok(views.html.workOrders.form(form, errors, "Create", maintenanceItemStore.options, userStore.options))
    }
  }

  def postWorkOrdersDb = SecuredAction(UserRole.ADMIN) { implicit request =>
    workOrdersForm.bindFromRequest().fold(
      hasErrors = { form =>
        val id = form.data.getOrElse("id", "")
        if (id == "") {
          println("if: " + form.errors)
          Redirect(routes.WorkOrders.create)
            .flashing(Flash(form.data) +
              ("errors" -> form.errors.map(_.key).mkString(",")))
        } else { println("else: " + form.errors)
          Redirect(routes.WorkOrders.create).flashing(Flash(form.data) +
            ("errors" -> "invalidData")) }
      },
      success = { data =>
        println("debug#####################" + data.maintenance_name)
        db.withTransaction { implicit conn =>
          workOrderStore.findById(data.id.getOrElse(-1)) match {
            case Some(wo) =>
              workOrderStore.update(WorkOrder(data.id, data.maintenance_name, data.person_in_charge, data.maintenance_date, data.status))
              Redirect(routes.WorkOrders.detail(wo.id.get))
                .flashing(("success" -> "successfullyUpdated"))
            case None =>
              val id: Long = workOrderStore.insert(WorkOrder(None, data.maintenance_name, data.person_in_charge, data.maintenance_date, data.status))
              Redirect(routes.WorkOrders.detail(id))
                .flashing(("success" -> "successfullyCreated"))
          }
        }
      }
    )
  }

  val dateFormatter = new SimpleDateFormat(("dd/MM/yyyy"))
  def toDateFormat(date: Date): Date = {
    (new SimpleDateFormat("dd/MM/yyyy")).parse(dateFormatter.format(date))
  }

  def update(id: Long) = SecuredAction(UserRole.USER) { implicit request =>
    db.withConnection { implicit conn =>
      workOrderStore.findById(id).map { wo =>
        val (form, errors) =
          request.flash.get("errors") match {
            case Some(errorsStr) =>
              (workOrdersForm.bind(request.flash.data), errorsStr.split(","))
            case None =>
              println("debug: "+wo)
              (workOrdersForm.fill(WorkOrder(wo.id, wo.maintenance_name, wo.person_in_charge, toDateFormat(wo.maintenance_date), wo.status)), Array.empty[String])
          }
        Ok(views.html.workOrders.form(form, errors, "Update", maintenanceItemStore.options, userStore.options))
      }.getOrElse(NotFound)
    }
  }

  def delete(id: Long) = Action { implicit request =>
    db.withTransaction { implicit conn =>
      workOrderStore.delete(id)
      Redirect(routes.WorkOrders.list)
        .flashing(("success" -> "successfullyDeleted"))
    }
  }
  /* TODO */

  /* do not edit below this line */
}
