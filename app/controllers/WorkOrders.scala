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

class WorkOrders @Inject()(
                                  mcc: MessagesControllerComponents,
                                  db: Database,
                                  cache: SyncCacheApi,
                                  userStore: UserStore,
                                  workOrderStore: WorkOrderStore,
                                  maintenanceItemStore: MaintenanceItemStore,
                                  technicianStore: TechnicianStore,
                                  firebaseHelper: FirebaseHelper,
                                  userPushNotifTokenStore: UserPushNotifTokenStore
                                ) (implicit execCtx: ExecutionContext) extends BaseController(mcc, db, cache, userStore) {

  def list = SecuredAction(UserRole.USER) { implicit request =>
    Ok(views.html.workOrders.list())
  }

  def historyList = SecuredAction(UserRole.USER) { implicit request =>
    Ok(views.html.workOrders.historyList())
  }

  def listWorkOrderJson = SecuredAction(UserRole.USER) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
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

  def historyListWorkOrderJson = SecuredAction(UserRole.USER) { implicit request =>
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      val total = workOrderStore.countAllHistory
      val filtered = workOrderStore.countFilteredHistory(searchText)
      val data = workOrderStore.searchHistory(start, length, searchText)
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
      workOrderStore.findViewById(id).map { item =>
        Ok(views.html.workOrders.detail(item))
      }.getOrElse(NotFound)
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

  def create = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (workOrdersForm.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (workOrdersForm.fill(WorkOrder(None, 0, 0, 0, new Date(), "09:00", "")), Array.empty[String])
        }
      Ok(views.html.workOrders.form(form, errors, "Create", maintenanceItemStore.options, userStore.options, technicianStore.options))
    }
  }

  def postWorkOrdersDb = SecuredAction(UserRole.ADMIN) { implicit request =>
    workOrdersForm.bindFromRequest().fold(
      hasErrors = { form =>
        println(form.errors)
        val id = form.data.getOrElse("id", "")
        if (id == "") {
          Redirect(routes.WorkOrders.create)
            .flashing(Flash(form.data) +
              ("errors" -> form.errors.map(_.key).mkString(",")))
        } else {
          Redirect(routes.WorkOrders.update(id.toLong)).flashing(Flash(form.data) +
            ("errors" -> "invalidData")) }
      },
      success = { data =>
        db.withTransaction { implicit conn =>
          workOrderStore.findById(data.id.getOrElse(-1)) match {
            case Some(wo) =>
              if (wo.user_id == data.user_id) {
                userPushNotifTokenStore.findByPushTokenById(data.user_id).map { user =>
                  firebaseHelper.sendNotificationMessage(user.push_token.get, "Modified Work Order", "Check Your Work Order at " + data.status, "module", "src", data.id.toString).map { messageId =>
                    println("Sent, message ID: " + messageId + user.id)
                  }
                }
              } else {
                userPushNotifTokenStore.findByPushTokenById(data.user_id).map { user =>
                  firebaseHelper.sendNotificationMessage(user.push_token.get, "New Work Order", "Check Your Work Order at " + data.status, "module", "src", data.id.toString).map { messageId =>
                    println("Sent, message ID: " + messageId + user.id)
                  }
                }
              }
              workOrderStore.update(WorkOrder(data.id, data.maintenance_id, data.user_id, data.technician_id, data.maintenance_date, data.maintenance_time, data.status))
              Redirect(routes.WorkOrders.detail(wo.id.get))
                .flashing(("success" -> "successfullyUpdated"))
            case None =>
              val id: Long = workOrderStore.insert(WorkOrder(None, data.maintenance_id, data.user_id, data.technician_id, data.maintenance_date, data.maintenance_time, data.status))
                userPushNotifTokenStore.findByPushTokenById(data.user_id).map { user =>
                  println(user)
                  firebaseHelper.sendNotificationMessage(user.push_token.get, "New Work Order", "Check Your Work Order at " + data.status, "module", "src", id.toString).map { messageId =>
                    println("Sent, message ID: " + messageId + user.id)
                  }
                }
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
        val (form, errors) = {
          request.flash.get("errors") match {
            case Some(errorsStr) =>
              (workOrdersForm.bind(request.flash.data), errorsStr.split(","))
            case None =>
              (workOrdersForm.fill(WorkOrder(wo.id, wo.maintenance_id, wo.user_id, wo.technician_id, toDateFormat(wo.maintenance_date), wo.maintenance_time, wo.status)), Array.empty[String])
          }
        }
        Ok(views.html.workOrders.form(form, errors, "Update", maintenanceItemStore.options, userStore.options, technicianStore.options))
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

  def updatePending(id: Long) = SecuredAction(UserRole.ADMIN) { implicit request =>
    db.withConnection { implicit conn =>
      workOrderStore.findById(id).map { wos =>
        val (form, errors) = {
          request.flash.get("errors") match {
            case Some(errorsStr) =>
              (workOrdersForm.bind(request.flash.data), errorsStr.split(","))
            case None =>
              println(wos)
              (workOrdersForm.fill(WorkOrder(wos.id, wos.maintenance_id, wos.user_id, wos.technician_id, toDateFormat(wos.maintenance_date), wos.maintenance_time, "Pending")), Array.empty[String])
          }
        }
        Ok(views.html.workOrders.workOrderPendingForm(form, errors, "Update", maintenanceItemStore.options, userStore.options, technicianStore.options))
      }.getOrElse(NotFound)
    }
  }
  /* TODO */

  /* do not edit below this line */
}
