package controllers

import models.UserRole
import play.api.cache.SyncCacheApi
import play.api.db.Database
import play.api.libs.json.Json
import play.api.mvc.{AnyContent, MessagesControllerComponents, Request}
import stores.UserStore

import javax.inject.Inject

class Users @Inject()(
                       mcc: MessagesControllerComponents,
                       db: Database,
                       cache: SyncCacheApi,
                       userStore: UserStore
                     ) extends BaseController(mcc, db, cache, userStore) {

  def listUser = SecuredAction(UserRole.USER) { implicit request =>
    println("list user#####################")
    Ok(views.html.users.listUser())
  }

  def listUserJson = SecuredAction(UserRole.USER) { implicit request =>
    println("json request#####################")
    val start = request.getQueryString("start").map(_.toLong).getOrElse(0L)
    val length = request.getQueryString("length").map(_.toLong).getOrElse(10L)
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("search[value]").getOrElse("")

    db.withConnection { implicit conn =>
      println("json db conn######################")
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

  def detail(id: Long) = SecuredAction(UserRole.USER) { implicit request =>
    db.withConnection { implicit conn =>
        userStore.findInfoById(id).map { user =>
          Ok(views.html.users.detail(user))
        }.getOrElse(NotFound)
      }
    }

}
