package controllers

import models.UserRole
import play.api.cache.SyncCacheApi
import play.api.db.Database

import javax.inject._
import play.api.mvc.{AnyContent, MessagesControllerComponents, Request}
import stores.UserStore

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
    println("here")
    Ok(views.html.index())
  }

}
