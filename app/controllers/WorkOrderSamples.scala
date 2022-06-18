package controllers

import helpers.FirebaseHelper
import models._
import stores._
import play.api.cache.SyncCacheApi
import play.api.data.Form
import play.api.data.Forms.{date, email, localDateTime, localTime, longNumber, mapping, nonEmptyText, optional, sqlTimestamp}
import play.api.db.Database
import play.api.libs.json.Json
import play.api.mvc.{AnyContent, Flash, MessagesControllerComponents, Request}

import java.sql.Time
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.util.Date
import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class WorkOrderSamples @Inject()(
                            mcc: MessagesControllerComponents,
                            db: Database,
                            cache: SyncCacheApi,
                            userStore: UserStore,
                            workOrderSampleStore: WorkOrderSampleStore,
                            maintenanceItemStore: MaintenanceItemStore,
                            technicianStore: TechnicianStore,
                            firebaseHelper: FirebaseHelper,
                            userPushNotifTokenStore: UserPushNotifTokenStore
                          ) (implicit execCtx: ExecutionContext) extends BaseController(mcc, db, cache, userStore) {

  def list = SecuredAction(UserRole.USER) { implicit request =>
    Ok(views.html.workOrderSamples.list())
  }

  def listWorkOrderSampleJson = SecuredAction(UserRole.USER) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = workOrderSampleStore.countAll
      val filtered = workOrderSampleStore.countFiltered(searchText)
      val data = workOrderSampleStore.search(start, length, searchText)
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
      workOrderSampleStore.findViewById(id).map { item =>
        Ok(views.html.workOrderSamples.detail(item))
      }.getOrElse(NotFound)
    }
  }

  private val workOrderSamplesForm: Form[WorkOrderSample] = Form(
    mapping(
      "id" -> optional(longNumber),
      "maintenance_id" -> longNumber,
      "technician_id" -> longNumber,
      "status" -> nonEmptyText,
    )(WorkOrderSample.apply)(WorkOrderSample.unapply)
  )

  def create = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (workOrderSamplesForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (workOrderSamplesForm.fill(WorkOrderSample(None, 0, 0, "")), Array.empty[String])
        }
      Ok(views.html.workOrderSamples.form(form, errors, "Create", maintenanceItemStore.options, technicianStore.options))
    }
  }

  def postWorkOrderSamplesDb = SecuredAction(UserRole.ADMIN) { implicit request =>
    workOrderSamplesForm.bindFromRequest().fold(
      hasErrors = { form =>
        val id = form.data.getOrElse("id", "")
        println("debuging: " + form.errors)
        if (id == "") {
          Redirect(routes.WorkOrderSamples.create)
            .flashing(Flash(form.data) +
              ("errors" -> form.errors.map(_.key).mkString(",")))
        } else {
          Redirect(routes.WorkOrderSamples.update(id.toLong)).flashing(Flash(form.data) +
            ("errors" -> form.errors.map(_.key).mkString(","))) }
      },
      success = { data =>
        db.withTransaction { implicit conn =>
          workOrderSampleStore.findById(data.id.getOrElse(-1)) match {
            case Some(wo) =>
              workOrderSampleStore.update(WorkOrderSample(data.id, data.maintenance_id, data.technician_id, data.status))
              Redirect(routes.WorkOrderSamples.detail(wo.id.get))
                .flashing(("success" -> "successfullyUpdated"))
            case None =>
              val id: Long = workOrderSampleStore.insert(WorkOrderSample(None, data.maintenance_id, data.technician_id, data.status))
              Redirect(routes.WorkOrderSamples.detail(id))
                .flashing(("success" -> "successfullyCreated"))
          }
        }
      }
    )
  }

  def update(id: Long) = SecuredAction(UserRole.USER) { implicit request =>
    db.withConnection { implicit conn =>
      workOrderSampleStore.findById(id).map { wo =>
        val (form, errors) = {
          request.flash.get("errors") match {
            case Some(errorsStr) =>
              (workOrderSamplesForm.bind(request.flash.data), errorsStr.split(","))
            case None =>
              (workOrderSamplesForm.fill(WorkOrderSample(wo.id, wo.maintenance_id, wo.technician_id, wo.status)), Array.empty[String])
          }
        }
        Ok(views.html.workOrderSamples.form(form, errors, "Update", maintenanceItemStore.options, technicianStore.options))
      }.getOrElse(NotFound)
    }
  }

  def delete(id: Long) = Action { implicit request =>
    db.withTransaction { implicit conn =>
      workOrderSampleStore.delete(id)
      Redirect(routes.WorkOrderSamples.list)
        .flashing(("success" -> "successfullyDeleted"))
    }
  }

  private val workOrdersForm: Form[WorkOrder] = Form(
    mapping(
      "id" -> optional(longNumber),
      "maintenance_id" -> longNumber,
      "user_id" -> longNumber,
      "technician_id" -> longNumber,
      "maintenance_date" -> date,
      "maintenance_time" -> nonEmptyText,
      "status" -> nonEmptyText,
    )(WorkOrder.apply)(WorkOrder.unapply)
  )

  def createWorkOrder(id: Long)= SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      workOrderSampleStore.findById(id).map { wos =>
        val (form, errors) = {
          request.flash.get("errors") match {
            case Some(errorsStr) =>
              (workOrdersForm.bind(request.flash.data), errorsStr.split(","))
            case None =>
              (workOrdersForm.fill(WorkOrder(None, wos.maintenance_id, 0, wos.technician_id, new Date(), "09:00", "Todo")), Array.empty[String])
          }
        }
        Ok(views.html.workOrderSamples.workOrderForm(form, errors, "Create", maintenanceItemStore.options, userStore.options, technicianStore.options))
      }.getOrElse(NotFound)
    }
  }

  /* do not edit below this line */
}
