package appcontrollers

import java.util.Date
import javax.inject.{Inject, Singleton}
import models._
import play.api.cache.SyncCacheApi
import play.api.db.{Database, NamedDatabase}
import play.api.libs.json._
import play.api.mvc.{Action, AnyContent, MessagesControllerComponents}
import stores.{UserStore, WorkOrderStore}

@Singleton
class WorkOrders @Inject()(
                            mcc: MessagesControllerComponents,
                            db: Database,
                            userStore: UserStore,
                            workOrderStore: WorkOrderStore,
                            cacheApi: SyncCacheApi,
                          ) extends Bases(mcc, db, userStore, cacheApi) {

  def workOrderList(id: Long) = ApiAction { implicit request =>
    println("request: " + request)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("searchText").getOrElse("")
    val limit = LimitClause.fromRequest(request)
    val orderBy = OrderByClause.fromRequest(request, WorkOrder.sortableCols)

    db.withConnection { implicit conn =>
      val user = userStore.findById(id)
      val name = user.get.name
      val total = workOrderStore.countAll
      val filtered = workOrderStore.countFiltered(searchText)
      val data = workOrderStore.searchById(name, searchText, limit, orderBy)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def workOrderListHistory(id: Long) = ApiAction { implicit request =>
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("searchText").getOrElse("")
    val limit = LimitClause.fromRequest(request)
    val orderBy = OrderByClause.fromRequest(request, WorkOrder.sortableCols)

    db.withConnection { implicit conn =>
      val user = userStore.findById(id)
      val name = user.get.name
      val total = workOrderStore.countAll
      val filtered = workOrderStore.countFiltered(searchText)
      val data = workOrderStore.searchByIdHistory(name, searchText, limit, orderBy)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def workOrderDetail(id: Long) = ApiAction { implicit request =>
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("searchText").getOrElse("")
    val limit = LimitClause.fromRequest(request)
    val orderBy = OrderByClause.fromRequest(request, WorkOrder.sortableCols)

    db.withConnection { implicit conn =>
      val total = workOrderStore.countAll
      val filtered = workOrderStore.countFiltered(searchText)
      val data = workOrderStore.searchViewById(id, searchText, limit, orderBy)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def postUpdateWorkOrder(id: Long): Action[AnyContent] = ApiAction { implicit request =>
    withConnection { implicit conn =>
      val json = request.body.asJson.get
      json.validate[UpdateWorkOrderRequest].fold(
        valid = { input =>
          workOrderStore.findById(id) match {
            case Some(wo) =>
              println("wo: " + wo)
              println("input: " + input)
              workOrderStore.update(WorkOrder(
                wo.id, wo.maintenance_id, wo.user_id, wo.technician_id, input.maintenance_date, input.maintenance_time, input.status
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