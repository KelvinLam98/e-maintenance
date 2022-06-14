// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_7: controllers.HomeController,
  // @LINE:10
  Assets_6: controllers.Assets,
  // @LINE:17
  Users_0: controllers.Users,
  // @LINE:30
  MaintenanceItems_5: controllers.MaintenanceItems,
  // @LINE:40
  WorkOrders_1: controllers.WorkOrders,
  // @LINE:53
  Technicians_3: controllers.Technicians,
  // @LINE:65
  Users_2: appcontrollers.Users,
  // @LINE:66
  WorkOrders_4: appcontrollers.WorkOrders,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_7: controllers.HomeController,
    // @LINE:10
    Assets_6: controllers.Assets,
    // @LINE:17
    Users_0: controllers.Users,
    // @LINE:30
    MaintenanceItems_5: controllers.MaintenanceItems,
    // @LINE:40
    WorkOrders_1: controllers.WorkOrders,
    // @LINE:53
    Technicians_3: controllers.Technicians,
    // @LINE:65
    Users_2: appcontrollers.Users,
    // @LINE:66
    WorkOrders_4: appcontrollers.WorkOrders
  ) = this(errorHandler, HomeController_7, Assets_6, Users_0, MaintenanceItems_5, WorkOrders_1, Technicians_3, Users_2, WorkOrders_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_7, Assets_6, Users_0, MaintenanceItems_5, WorkOrders_1, Technicians_3, Users_2, WorkOrders_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/login""", """controllers.HomeController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/logout""", """controllers.HomeController.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/post/login""", """controllers.HomeController.postLoginData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list""", """controllers.Users.listUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list.json""", """controllers.Users.listUserJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/""" + "$" + """id<[^/]+>""", """controllers.Users.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/""" + "$" + """id<[^/]+>/resetPassword""", """controllers.HomeController.resetPasswords(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/resetPassword/post""", """controllers.HomeController.postResetPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/create""", """controllers.Users.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/""" + "$" + """id<[^/]+>/update""", """controllers.Users.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/""" + "$" + """id<[^/]+>/delete""", """controllers.Users.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/create/post""", """controllers.Users.postUserDb"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/list""", """controllers.MaintenanceItems.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/list.json""", """controllers.MaintenanceItems.listMaintenanceItemsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/detail/""" + "$" + """id<[^/]+>""", """controllers.MaintenanceItems.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/create""", """controllers.MaintenanceItems.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/detail/""" + "$" + """id<[^/]+>/update""", """controllers.MaintenanceItems.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/detail/""" + "$" + """id<[^/]+>/delete""", """controllers.MaintenanceItems.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/create/post""", """controllers.MaintenanceItems.postMaintenanceItemsDb"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/list""", """controllers.WorkOrders.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/history/list""", """controllers.WorkOrders.historyList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/list.json""", """controllers.WorkOrders.listWorkOrderJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/history/list.json""", """controllers.WorkOrders.historyListWorkOrderJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/detail/""" + "$" + """id<[^/]+>""", """controllers.WorkOrders.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/history/detail/""" + "$" + """id<[^/]+>""", """controllers.WorkOrders.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/create""", """controllers.WorkOrders.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/detail/""" + "$" + """id<[^/]+>/update""", """controllers.WorkOrders.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/detail/""" + "$" + """id<[^/]+>/delete""", """controllers.WorkOrders.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrders/create/post""", """controllers.WorkOrders.postWorkOrdersDb"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/list""", """controllers.Technicians.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/list.json""", """controllers.Technicians.listTechniciansJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/detail/""" + "$" + """id<[^/]+>""", """controllers.Technicians.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/create""", """controllers.Technicians.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/detail/""" + "$" + """id<[^/]+>/update""", """controllers.Technicians.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/detail/""" + "$" + """id<[^/]+>/delete""", """controllers.Technicians.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/create/post""", """controllers.Technicians.postTechniciansDb"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/login""", """appcontrollers.Users.loginApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderList(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrderHistory/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderListHistory(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/detail/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderDetail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/profile/""" + "$" + """id<[^/]+>""", """appcontrollers.Users.profile(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/profile/edit/""" + "$" + """id<[^/]+>""", """appcontrollers.Users.postUpdateProfile(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/detail/edit/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.postUpdateWorkOrder(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/profile/changePassword/""" + "$" + """id<[^/]+>""", """appcontrollers.Users.postUpdatePassword(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_7.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_7.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      this.prefix + """user/login""",
      """users""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/logout")))
  )
  private[this] lazy val controllers_HomeController_logout3_invoker = createInvoker(
    HomeController_7.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      this.prefix + """user/logout""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_postLoginData4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/post/login")))
  )
  private[this] lazy val controllers_HomeController_postLoginData4_invoker = createInvoker(
    HomeController_7.postLoginData,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postLoginData",
      Nil,
      "POST",
      this.prefix + """user/post/login""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Users_listUser5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list")))
  )
  private[this] lazy val controllers_Users_listUser5_invoker = createInvoker(
    Users_0.listUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "listUser",
      Nil,
      "GET",
      this.prefix + """user/list""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Users_listUserJson6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list.json")))
  )
  private[this] lazy val controllers_Users_listUserJson6_invoker = createInvoker(
    Users_0.listUserJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "listUserJson",
      Nil,
      "GET",
      this.prefix + """user/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Users_detail7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_detail7_invoker = createInvoker(
    Users_0.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_resetPasswords8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/resetPassword")))
  )
  private[this] lazy val controllers_HomeController_resetPasswords8_invoker = createInvoker(
    HomeController_7.resetPasswords(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "resetPasswords",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/detail/""" + "$" + """id<[^/]+>/resetPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_postResetPassword9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/resetPassword/post")))
  )
  private[this] lazy val controllers_HomeController_postResetPassword9_invoker = createInvoker(
    HomeController_7.postResetPassword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postResetPassword",
      Nil,
      "POST",
      this.prefix + """user/detail/resetPassword/post""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Users_create10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create")))
  )
  private[this] lazy val controllers_Users_create10_invoker = createInvoker(
    Users_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "create",
      Nil,
      "GET",
      this.prefix + """user/create""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Users_update11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Users_update11_invoker = createInvoker(
    Users_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "update",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/detail/""" + "$" + """id<[^/]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Users_delete12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Users_delete12_invoker = createInvoker(
    Users_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/detail/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Users_postUserDb13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create/post")))
  )
  private[this] lazy val controllers_Users_postUserDb13_invoker = createInvoker(
    Users_0.postUserDb,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "postUserDb",
      Nil,
      "POST",
      this.prefix + """user/create/post""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:30
  private[this] lazy val controllers_MaintenanceItems_list14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list")))
  )
  private[this] lazy val controllers_MaintenanceItems_list14_invoker = createInvoker(
    MaintenanceItems_5.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "list",
      Nil,
      "GET",
      this.prefix + """maintenanceItems/list""",
      """maintenance items""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list.json")))
  )
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson15_invoker = createInvoker(
    MaintenanceItems_5.listMaintenanceItemsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "listMaintenanceItemsJson",
      Nil,
      "GET",
      this.prefix + """maintenanceItems/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_MaintenanceItems_detail16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceItems_detail16_invoker = createInvoker(
    MaintenanceItems_5.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """maintenanceItems/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_MaintenanceItems_create17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create")))
  )
  private[this] lazy val controllers_MaintenanceItems_create17_invoker = createInvoker(
    MaintenanceItems_5.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "create",
      Nil,
      "GET",
      this.prefix + """maintenanceItems/create""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_MaintenanceItems_update18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_MaintenanceItems_update18_invoker = createInvoker(
    MaintenanceItems_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "update",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """maintenanceItems/detail/""" + "$" + """id<[^/]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_MaintenanceItems_delete19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_MaintenanceItems_delete19_invoker = createInvoker(
    MaintenanceItems_5.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """maintenanceItems/detail/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create/post")))
  )
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb20_invoker = createInvoker(
    MaintenanceItems_5.postMaintenanceItemsDb,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "postMaintenanceItemsDb",
      Nil,
      "POST",
      this.prefix + """maintenanceItems/create/post""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:40
  private[this] lazy val controllers_WorkOrders_list21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list")))
  )
  private[this] lazy val controllers_WorkOrders_list21_invoker = createInvoker(
    WorkOrders_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "list",
      Nil,
      "GET",
      this.prefix + """workOrders/list""",
      """work orders""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_WorkOrders_historyList22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list")))
  )
  private[this] lazy val controllers_WorkOrders_historyList22_invoker = createInvoker(
    WorkOrders_1.historyList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "historyList",
      Nil,
      "GET",
      this.prefix + """workOrders/history/list""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson23_invoker = createInvoker(
    WorkOrders_1.listWorkOrderJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "listWorkOrderJson",
      Nil,
      "GET",
      this.prefix + """workOrders/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson24_invoker = createInvoker(
    WorkOrders_1.historyListWorkOrderJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "historyListWorkOrderJson",
      Nil,
      "GET",
      this.prefix + """workOrders/history/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_WorkOrders_detail25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail25_invoker = createInvoker(
    WorkOrders_1.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrders/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_WorkOrders_detail26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail26_invoker = createInvoker(
    WorkOrders_1.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrders/history/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_WorkOrders_create27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create")))
  )
  private[this] lazy val controllers_WorkOrders_create27_invoker = createInvoker(
    WorkOrders_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "create",
      Nil,
      "GET",
      this.prefix + """workOrders/create""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_WorkOrders_update28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_update28_invoker = createInvoker(
    WorkOrders_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "update",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrders/detail/""" + "$" + """id<[^/]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_WorkOrders_delete29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrders_delete29_invoker = createInvoker(
    WorkOrders_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrders/detail/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create/post")))
  )
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb30_invoker = createInvoker(
    WorkOrders_1.postWorkOrdersDb,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "postWorkOrdersDb",
      Nil,
      "POST",
      this.prefix + """workOrders/create/post""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Technicians_list31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list")))
  )
  private[this] lazy val controllers_Technicians_list31_invoker = createInvoker(
    Technicians_3.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Technicians",
      "list",
      Nil,
      "GET",
      this.prefix + """technicians/list""",
      """technicians""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Technicians_listTechniciansJson32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list.json")))
  )
  private[this] lazy val controllers_Technicians_listTechniciansJson32_invoker = createInvoker(
    Technicians_3.listTechniciansJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Technicians",
      "listTechniciansJson",
      Nil,
      "GET",
      this.prefix + """technicians/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Technicians_detail33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Technicians_detail33_invoker = createInvoker(
    Technicians_3.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Technicians",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technicians/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Technicians_create34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create")))
  )
  private[this] lazy val controllers_Technicians_create34_invoker = createInvoker(
    Technicians_3.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Technicians",
      "create",
      Nil,
      "GET",
      this.prefix + """technicians/create""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Technicians_update35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Technicians_update35_invoker = createInvoker(
    Technicians_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Technicians",
      "update",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technicians/detail/""" + "$" + """id<[^/]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Technicians_delete36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Technicians_delete36_invoker = createInvoker(
    Technicians_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Technicians",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technicians/detail/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Technicians_postTechniciansDb37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create/post")))
  )
  private[this] lazy val controllers_Technicians_postTechniciansDb37_invoker = createInvoker(
    Technicians_3.postTechniciansDb,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Technicians",
      "postTechniciansDb",
      Nil,
      "POST",
      this.prefix + """technicians/create/post""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:65
  private[this] lazy val appcontrollers_Users_loginApi38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val appcontrollers_Users_loginApi38_invoker = createInvoker(
    Users_2.loginApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.Users",
      "loginApi",
      Nil,
      "POST",
      this.prefix + """api/login""",
      """APP ROUTES
login""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:66
  private[this] lazy val appcontrollers_WorkOrders_workOrderList39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderList39_invoker = createInvoker(
    WorkOrders_4.workOrderList(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderList",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/workOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderHistory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory40_invoker = createInvoker(
    WorkOrders_4.workOrderListHistory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderListHistory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/workOrderHistory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail41_invoker = createInvoker(
    WorkOrders_4.workOrderDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/workOrder/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val appcontrollers_Users_profile42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_profile42_invoker = createInvoker(
    Users_2.profile(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.Users",
      "profile",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/profile/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val appcontrollers_Users_postUpdateProfile43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdateProfile43_invoker = createInvoker(
    Users_2.postUpdateProfile(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.Users",
      "postUpdateProfile",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """api/profile/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:73
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder44_invoker = createInvoker(
    WorkOrders_4.postUpdateWorkOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "postUpdateWorkOrder",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """api/workOrder/detail/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:75
  private[this] lazy val appcontrollers_Users_postUpdatePassword45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/changePassword/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdatePassword45_invoker = createInvoker(
    Users_2.postUpdatePassword(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.Users",
      "postUpdatePassword",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """api/profile/changePassword/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_7.index())
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned1_invoker.call(Assets_6.versioned(file))
      }
  
    // @LINE:13
    case controllers_HomeController_login2_route(params@_) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_7.login())
      }
  
    // @LINE:14
    case controllers_HomeController_logout3_route(params@_) =>
      call { 
        controllers_HomeController_logout3_invoker.call(HomeController_7.logout())
      }
  
    // @LINE:16
    case controllers_HomeController_postLoginData4_route(params@_) =>
      call { 
        controllers_HomeController_postLoginData4_invoker.call(HomeController_7.postLoginData)
      }
  
    // @LINE:17
    case controllers_Users_listUser5_route(params@_) =>
      call { 
        controllers_Users_listUser5_invoker.call(Users_0.listUser)
      }
  
    // @LINE:18
    case controllers_Users_listUserJson6_route(params@_) =>
      call { 
        controllers_Users_listUserJson6_invoker.call(Users_0.listUserJson)
      }
  
    // @LINE:19
    case controllers_Users_detail7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_detail7_invoker.call(Users_0.detail(id))
      }
  
    // @LINE:20
    case controllers_HomeController_resetPasswords8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_resetPasswords8_invoker.call(HomeController_7.resetPasswords(id))
      }
  
    // @LINE:22
    case controllers_HomeController_postResetPassword9_route(params@_) =>
      call { 
        controllers_HomeController_postResetPassword9_invoker.call(HomeController_7.postResetPassword)
      }
  
    // @LINE:23
    case controllers_Users_create10_route(params@_) =>
      call { 
        controllers_Users_create10_invoker.call(Users_0.create)
      }
  
    // @LINE:24
    case controllers_Users_update11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_update11_invoker.call(Users_0.update(id))
      }
  
    // @LINE:25
    case controllers_Users_delete12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_delete12_invoker.call(Users_0.delete(id))
      }
  
    // @LINE:27
    case controllers_Users_postUserDb13_route(params@_) =>
      call { 
        controllers_Users_postUserDb13_invoker.call(Users_0.postUserDb)
      }
  
    // @LINE:30
    case controllers_MaintenanceItems_list14_route(params@_) =>
      call { 
        controllers_MaintenanceItems_list14_invoker.call(MaintenanceItems_5.list)
      }
  
    // @LINE:31
    case controllers_MaintenanceItems_listMaintenanceItemsJson15_route(params@_) =>
      call { 
        controllers_MaintenanceItems_listMaintenanceItemsJson15_invoker.call(MaintenanceItems_5.listMaintenanceItemsJson)
      }
  
    // @LINE:32
    case controllers_MaintenanceItems_detail16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_detail16_invoker.call(MaintenanceItems_5.detail(id))
      }
  
    // @LINE:33
    case controllers_MaintenanceItems_create17_route(params@_) =>
      call { 
        controllers_MaintenanceItems_create17_invoker.call(MaintenanceItems_5.create)
      }
  
    // @LINE:34
    case controllers_MaintenanceItems_update18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_update18_invoker.call(MaintenanceItems_5.update(id))
      }
  
    // @LINE:35
    case controllers_MaintenanceItems_delete19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_delete19_invoker.call(MaintenanceItems_5.delete(id))
      }
  
    // @LINE:37
    case controllers_MaintenanceItems_postMaintenanceItemsDb20_route(params@_) =>
      call { 
        controllers_MaintenanceItems_postMaintenanceItemsDb20_invoker.call(MaintenanceItems_5.postMaintenanceItemsDb)
      }
  
    // @LINE:40
    case controllers_WorkOrders_list21_route(params@_) =>
      call { 
        controllers_WorkOrders_list21_invoker.call(WorkOrders_1.list)
      }
  
    // @LINE:41
    case controllers_WorkOrders_historyList22_route(params@_) =>
      call { 
        controllers_WorkOrders_historyList22_invoker.call(WorkOrders_1.historyList)
      }
  
    // @LINE:42
    case controllers_WorkOrders_listWorkOrderJson23_route(params@_) =>
      call { 
        controllers_WorkOrders_listWorkOrderJson23_invoker.call(WorkOrders_1.listWorkOrderJson)
      }
  
    // @LINE:43
    case controllers_WorkOrders_historyListWorkOrderJson24_route(params@_) =>
      call { 
        controllers_WorkOrders_historyListWorkOrderJson24_invoker.call(WorkOrders_1.historyListWorkOrderJson)
      }
  
    // @LINE:44
    case controllers_WorkOrders_detail25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail25_invoker.call(WorkOrders_1.detail(id))
      }
  
    // @LINE:45
    case controllers_WorkOrders_detail26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail26_invoker.call(WorkOrders_1.detail(id))
      }
  
    // @LINE:46
    case controllers_WorkOrders_create27_route(params@_) =>
      call { 
        controllers_WorkOrders_create27_invoker.call(WorkOrders_1.create)
      }
  
    // @LINE:47
    case controllers_WorkOrders_update28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_update28_invoker.call(WorkOrders_1.update(id))
      }
  
    // @LINE:48
    case controllers_WorkOrders_delete29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_delete29_invoker.call(WorkOrders_1.delete(id))
      }
  
    // @LINE:50
    case controllers_WorkOrders_postWorkOrdersDb30_route(params@_) =>
      call { 
        controllers_WorkOrders_postWorkOrdersDb30_invoker.call(WorkOrders_1.postWorkOrdersDb)
      }
  
    // @LINE:53
    case controllers_Technicians_list31_route(params@_) =>
      call { 
        controllers_Technicians_list31_invoker.call(Technicians_3.list)
      }
  
    // @LINE:54
    case controllers_Technicians_listTechniciansJson32_route(params@_) =>
      call { 
        controllers_Technicians_listTechniciansJson32_invoker.call(Technicians_3.listTechniciansJson)
      }
  
    // @LINE:55
    case controllers_Technicians_detail33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_detail33_invoker.call(Technicians_3.detail(id))
      }
  
    // @LINE:56
    case controllers_Technicians_create34_route(params@_) =>
      call { 
        controllers_Technicians_create34_invoker.call(Technicians_3.create)
      }
  
    // @LINE:57
    case controllers_Technicians_update35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_update35_invoker.call(Technicians_3.update(id))
      }
  
    // @LINE:58
    case controllers_Technicians_delete36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_delete36_invoker.call(Technicians_3.delete(id))
      }
  
    // @LINE:60
    case controllers_Technicians_postTechniciansDb37_route(params@_) =>
      call { 
        controllers_Technicians_postTechniciansDb37_invoker.call(Technicians_3.postTechniciansDb)
      }
  
    // @LINE:65
    case appcontrollers_Users_loginApi38_route(params@_) =>
      call { 
        appcontrollers_Users_loginApi38_invoker.call(Users_2.loginApi)
      }
  
    // @LINE:66
    case appcontrollers_WorkOrders_workOrderList39_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderList39_invoker.call(WorkOrders_4.workOrderList(id))
      }
  
    // @LINE:67
    case appcontrollers_WorkOrders_workOrderListHistory40_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderListHistory40_invoker.call(WorkOrders_4.workOrderListHistory(id))
      }
  
    // @LINE:68
    case appcontrollers_WorkOrders_workOrderDetail41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderDetail41_invoker.call(WorkOrders_4.workOrderDetail(id))
      }
  
    // @LINE:69
    case appcontrollers_Users_profile42_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_profile42_invoker.call(Users_2.profile(id))
      }
  
    // @LINE:71
    case appcontrollers_Users_postUpdateProfile43_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdateProfile43_invoker.call(Users_2.postUpdateProfile(id))
      }
  
    // @LINE:73
    case appcontrollers_WorkOrders_postUpdateWorkOrder44_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_postUpdateWorkOrder44_invoker.call(WorkOrders_4.postUpdateWorkOrder(id))
      }
  
    // @LINE:75
    case appcontrollers_Users_postUpdatePassword45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdatePassword45_invoker.call(Users_2.postUpdatePassword(id))
      }
  }
}
