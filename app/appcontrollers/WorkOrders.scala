package appcontrollers

import java.util.Date

import javax.inject.{Inject, Singleton}
import models._
import play.api.cache.SyncCacheApi
import play.api.db.{Database, NamedDatabase}
import play.api.libs.json._
import play.api.mvc.MessagesControllerComponents
import stores.{WorkOrderStore, UserStore}

@Singleton
class WorkOrders @Inject()(
                            mcc: MessagesControllerComponents,
                            db: Database,
                            userStore: UserStore,
                            workOrderStore: WorkOrderStore,
                            cacheApi: SyncCacheApi,
                          ) extends Bases(mcc, db, userStore, cacheApi) {

  def workOrderList = ApiAction { implicit request =>
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("searchText").getOrElse("")
    val limit = LimitClause.fromRequest(request)
    val orderBy = OrderByClause.fromRequest(request, WorkOrder.sortableCols)

    db.withConnection { implicit conn =>
      val total = workOrderStore.countAll
      val filtered = workOrderStore.countFiltered(searchText)
      val data = workOrderStore.searchById(searchText, limit, orderBy)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }
}