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
  HomeController_8: controllers.HomeController,
  // @LINE:10
  Assets_7: controllers.Assets,
  // @LINE:18
  Users_0: controllers.Users,
  // @LINE:21
  WorkOrders_2: controllers.WorkOrders,
  // @LINE:35
  MaintenanceItems_6: controllers.MaintenanceItems,
  // @LINE:58
  WorkOrderSamples_1: controllers.WorkOrderSamples,
  // @LINE:69
  Technicians_4: controllers.Technicians,
  // @LINE:81
  Users_3: appcontrollers.Users,
  // @LINE:89
  WorkOrders_5: appcontrollers.WorkOrders,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_8: controllers.HomeController,
    // @LINE:10
    Assets_7: controllers.Assets,
    // @LINE:18
    Users_0: controllers.Users,
    // @LINE:21
    WorkOrders_2: controllers.WorkOrders,
    // @LINE:35
    MaintenanceItems_6: controllers.MaintenanceItems,
    // @LINE:58
    WorkOrderSamples_1: controllers.WorkOrderSamples,
    // @LINE:69
    Technicians_4: controllers.Technicians,
    // @LINE:81
    Users_3: appcontrollers.Users,
    // @LINE:89
    WorkOrders_5: appcontrollers.WorkOrders
  ) = this(errorHandler, HomeController_8, Assets_7, Users_0, WorkOrders_2, MaintenanceItems_6, WorkOrderSamples_1, Technicians_4, Users_3, WorkOrders_5, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_8, Assets_7, Users_0, WorkOrders_2, MaintenanceItems_6, WorkOrderSamples_1, Technicians_4, Users_3, WorkOrders_5, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Users.dashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/list.json""", """controllers.Users.dashboardListJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/pending/""" + "$" + """id<[^/]+>""", """controllers.WorkOrders.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/pending/""" + "$" + """id<[^/]+>/update""", """controllers.WorkOrders.updatePending(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list.json""", """controllers.Users.listUserJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/""" + "$" + """id<[^/]+>""", """controllers.Users.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/""" + "$" + """email<[^/]+>/resetPassword""", """controllers.HomeController.resetPasswords(email:String)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/list""", """controllers.WorkOrderSamples.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/list.json""", """controllers.WorkOrderSamples.listWorkOrderSampleJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/detail/""" + "$" + """id<[^/]+>""", """controllers.WorkOrderSamples.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/create""", """controllers.WorkOrderSamples.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/detail/""" + "$" + """id<[^/]+>/createWorkOrder""", """controllers.WorkOrderSamples.createWorkOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/detail/""" + "$" + """id<[^/]+>/update""", """controllers.WorkOrderSamples.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/detail/""" + "$" + """id<[^/]+>/delete""", """controllers.WorkOrderSamples.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workOrderSamples/create/post""", """controllers.WorkOrderSamples.postWorkOrderSamplesDb"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/list""", """controllers.Technicians.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/list.json""", """controllers.Technicians.listTechniciansJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/detail/""" + "$" + """id<[^/]+>""", """controllers.Technicians.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/create""", """controllers.Technicians.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/detail/""" + "$" + """id<[^/]+>/update""", """controllers.Technicians.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/detail/""" + "$" + """id<[^/]+>/delete""", """controllers.Technicians.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technicians/create/post""", """controllers.Technicians.postTechniciansDb"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/login""", """appcontrollers.Users.loginApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/profile/""" + "$" + """id<[^/]+>""", """appcontrollers.Users.profile(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/profile/edit/""" + "$" + """id<[^/]+>""", """appcontrollers.Users.postUpdateProfile(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/profile/changePassword/""" + "$" + """id<[^/]+>""", """appcontrollers.Users.postUpdatePassword(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderList(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrderHistory/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderListHistory(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/detail/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderDetail(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/detail/edit/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.postUpdateWorkOrder(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/register-firebase-token""", """appcontrollers.Users.registerFirebaseToken"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/test-notification/""" + "$" + """workOrderId<[^/]+>""", """appcontrollers.Users.testSendPushNotification(workOrderId:Long)"""),
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
    HomeController_8.index(),
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
    Assets_7.versioned(fakeValue[String]),
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

  // @LINE:14
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_8.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      this.prefix + """user/login""",
      """WEB ROUTES
users""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/logout")))
  )
  private[this] lazy val controllers_HomeController_logout3_invoker = createInvoker(
    HomeController_8.logout(),
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_postLoginData4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/post/login")))
  )
  private[this] lazy val controllers_HomeController_postLoginData4_invoker = createInvoker(
    HomeController_8.postLoginData,
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

  // @LINE:18
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

  // @LINE:19
  private[this] lazy val controllers_Users_dashboard6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Users_dashboard6_invoker = createInvoker(
    Users_0.dashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "dashboard",
      Nil,
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Users_dashboardListJson7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/list.json")))
  )
  private[this] lazy val controllers_Users_dashboardListJson7_invoker = createInvoker(
    Users_0.dashboardListJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "dashboardListJson",
      Nil,
      "GET",
      this.prefix + """dashboard/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_WorkOrders_detail8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/pending/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail8_invoker = createInvoker(
    WorkOrders_2.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """dashboard/pending/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_WorkOrders_updatePending9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/pending/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_updatePending9_invoker = createInvoker(
    WorkOrders_2.updatePending(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "updatePending",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """dashboard/pending/""" + "$" + """id<[^/]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Users_listUserJson10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list.json")))
  )
  private[this] lazy val controllers_Users_listUserJson10_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Users_detail11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_detail11_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_HomeController_resetPasswords12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("email", """[^/]+""",true), StaticPart("/resetPassword")))
  )
  private[this] lazy val controllers_HomeController_resetPasswords12_invoker = createInvoker(
    HomeController_8.resetPasswords(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "resetPasswords",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/detail/""" + "$" + """email<[^/]+>/resetPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_postResetPassword13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/resetPassword/post")))
  )
  private[this] lazy val controllers_HomeController_postResetPassword13_invoker = createInvoker(
    HomeController_8.postResetPassword,
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

  // @LINE:28
  private[this] lazy val controllers_Users_create14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create")))
  )
  private[this] lazy val controllers_Users_create14_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Users_update15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Users_update15_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Users_delete16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Users_delete16_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_Users_postUserDb17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create/post")))
  )
  private[this] lazy val controllers_Users_postUserDb17_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_MaintenanceItems_list18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list")))
  )
  private[this] lazy val controllers_MaintenanceItems_list18_invoker = createInvoker(
    MaintenanceItems_6.list,
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

  // @LINE:36
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list.json")))
  )
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson19_invoker = createInvoker(
    MaintenanceItems_6.listMaintenanceItemsJson,
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

  // @LINE:37
  private[this] lazy val controllers_MaintenanceItems_detail20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceItems_detail20_invoker = createInvoker(
    MaintenanceItems_6.detail(fakeValue[Long]),
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

  // @LINE:38
  private[this] lazy val controllers_MaintenanceItems_create21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create")))
  )
  private[this] lazy val controllers_MaintenanceItems_create21_invoker = createInvoker(
    MaintenanceItems_6.create,
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

  // @LINE:39
  private[this] lazy val controllers_MaintenanceItems_update22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_MaintenanceItems_update22_invoker = createInvoker(
    MaintenanceItems_6.update(fakeValue[Long]),
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

  // @LINE:40
  private[this] lazy val controllers_MaintenanceItems_delete23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_MaintenanceItems_delete23_invoker = createInvoker(
    MaintenanceItems_6.delete(fakeValue[Long]),
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

  // @LINE:42
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create/post")))
  )
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb24_invoker = createInvoker(
    MaintenanceItems_6.postMaintenanceItemsDb,
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

  // @LINE:45
  private[this] lazy val controllers_WorkOrders_list25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list")))
  )
  private[this] lazy val controllers_WorkOrders_list25_invoker = createInvoker(
    WorkOrders_2.list,
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

  // @LINE:46
  private[this] lazy val controllers_WorkOrders_historyList26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list")))
  )
  private[this] lazy val controllers_WorkOrders_historyList26_invoker = createInvoker(
    WorkOrders_2.historyList,
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

  // @LINE:47
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson27_invoker = createInvoker(
    WorkOrders_2.listWorkOrderJson,
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

  // @LINE:48
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson28_invoker = createInvoker(
    WorkOrders_2.historyListWorkOrderJson,
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

  // @LINE:49
  private[this] lazy val controllers_WorkOrders_detail29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail29_invoker = createInvoker(
    WorkOrders_2.detail(fakeValue[Long]),
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

  // @LINE:50
  private[this] lazy val controllers_WorkOrders_detail30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail30_invoker = createInvoker(
    WorkOrders_2.detail(fakeValue[Long]),
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

  // @LINE:51
  private[this] lazy val controllers_WorkOrders_create31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create")))
  )
  private[this] lazy val controllers_WorkOrders_create31_invoker = createInvoker(
    WorkOrders_2.create,
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

  // @LINE:52
  private[this] lazy val controllers_WorkOrders_update32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_update32_invoker = createInvoker(
    WorkOrders_2.update(fakeValue[Long]),
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

  // @LINE:53
  private[this] lazy val controllers_WorkOrders_delete33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrders_delete33_invoker = createInvoker(
    WorkOrders_2.delete(fakeValue[Long]),
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

  // @LINE:55
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create/post")))
  )
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb34_invoker = createInvoker(
    WorkOrders_2.postWorkOrdersDb,
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

  // @LINE:58
  private[this] lazy val controllers_WorkOrderSamples_list35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list")))
  )
  private[this] lazy val controllers_WorkOrderSamples_list35_invoker = createInvoker(
    WorkOrderSamples_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "list",
      Nil,
      "GET",
      this.prefix + """workOrderSamples/list""",
      """work orders sample""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list.json")))
  )
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson36_invoker = createInvoker(
    WorkOrderSamples_1.listWorkOrderSampleJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "listWorkOrderSampleJson",
      Nil,
      "GET",
      this.prefix + """workOrderSamples/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_WorkOrderSamples_detail37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrderSamples_detail37_invoker = createInvoker(
    WorkOrderSamples_1.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrderSamples/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_WorkOrderSamples_create38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create")))
  )
  private[this] lazy val controllers_WorkOrderSamples_create38_invoker = createInvoker(
    WorkOrderSamples_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "create",
      Nil,
      "GET",
      this.prefix + """workOrderSamples/create""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_WorkOrderSamples_createWorkOrder39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/createWorkOrder")))
  )
  private[this] lazy val controllers_WorkOrderSamples_createWorkOrder39_invoker = createInvoker(
    WorkOrderSamples_1.createWorkOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "createWorkOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrderSamples/detail/""" + "$" + """id<[^/]+>/createWorkOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_WorkOrderSamples_update40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrderSamples_update40_invoker = createInvoker(
    WorkOrderSamples_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "update",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrderSamples/detail/""" + "$" + """id<[^/]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_WorkOrderSamples_delete41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrderSamples_delete41_invoker = createInvoker(
    WorkOrderSamples_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """workOrderSamples/detail/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create/post")))
  )
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb42_invoker = createInvoker(
    WorkOrderSamples_1.postWorkOrderSamplesDb,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrderSamples",
      "postWorkOrderSamplesDb",
      Nil,
      "POST",
      this.prefix + """workOrderSamples/create/post""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:69
  private[this] lazy val controllers_Technicians_list43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list")))
  )
  private[this] lazy val controllers_Technicians_list43_invoker = createInvoker(
    Technicians_4.list,
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

  // @LINE:70
  private[this] lazy val controllers_Technicians_listTechniciansJson44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list.json")))
  )
  private[this] lazy val controllers_Technicians_listTechniciansJson44_invoker = createInvoker(
    Technicians_4.listTechniciansJson,
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

  // @LINE:71
  private[this] lazy val controllers_Technicians_detail45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Technicians_detail45_invoker = createInvoker(
    Technicians_4.detail(fakeValue[Long]),
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

  // @LINE:72
  private[this] lazy val controllers_Technicians_create46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create")))
  )
  private[this] lazy val controllers_Technicians_create46_invoker = createInvoker(
    Technicians_4.create,
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

  // @LINE:73
  private[this] lazy val controllers_Technicians_update47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Technicians_update47_invoker = createInvoker(
    Technicians_4.update(fakeValue[Long]),
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

  // @LINE:74
  private[this] lazy val controllers_Technicians_delete48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Technicians_delete48_invoker = createInvoker(
    Technicians_4.delete(fakeValue[Long]),
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

  // @LINE:76
  private[this] lazy val controllers_Technicians_postTechniciansDb49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create/post")))
  )
  private[this] lazy val controllers_Technicians_postTechniciansDb49_invoker = createInvoker(
    Technicians_4.postTechniciansDb,
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

  // @LINE:81
  private[this] lazy val appcontrollers_Users_loginApi50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val appcontrollers_Users_loginApi50_invoker = createInvoker(
    Users_3.loginApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.Users",
      "loginApi",
      Nil,
      "POST",
      this.prefix + """api/login""",
      """APP ROUTES
user""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:82
  private[this] lazy val appcontrollers_Users_profile51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_profile51_invoker = createInvoker(
    Users_3.profile(fakeValue[Long]),
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

  // @LINE:84
  private[this] lazy val appcontrollers_Users_postUpdateProfile52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdateProfile52_invoker = createInvoker(
    Users_3.postUpdateProfile(fakeValue[Long]),
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

  // @LINE:86
  private[this] lazy val appcontrollers_Users_postUpdatePassword53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/changePassword/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdatePassword53_invoker = createInvoker(
    Users_3.postUpdatePassword(fakeValue[Long]),
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

  // @LINE:89
  private[this] lazy val appcontrollers_WorkOrders_workOrderList54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderList54_invoker = createInvoker(
    WorkOrders_5.workOrderList(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderList",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/workOrder/""" + "$" + """id<[^/]+>""",
      """work order""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderHistory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory55_invoker = createInvoker(
    WorkOrders_5.workOrderListHistory(fakeValue[Long]),
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

  // @LINE:91
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail56_invoker = createInvoker(
    WorkOrders_5.workOrderDetail(fakeValue[Long]),
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

  // @LINE:93
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder57_invoker = createInvoker(
    WorkOrders_5.postUpdateWorkOrder(fakeValue[Long]),
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

  // @LINE:97
  private[this] lazy val appcontrollers_Users_registerFirebaseToken58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/register-firebase-token")))
  )
  private[this] lazy val appcontrollers_Users_registerFirebaseToken58_invoker = createInvoker(
    Users_3.registerFirebaseToken,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.Users",
      "registerFirebaseToken",
      Nil,
      "POST",
      this.prefix + """api/register-firebase-token""",
      """notification""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:98
  private[this] lazy val appcontrollers_Users_testSendPushNotification59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/test-notification/"), DynamicPart("workOrderId", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_testSendPushNotification59_invoker = createInvoker(
    Users_3.testSendPushNotification(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.Users",
      "testSendPushNotification",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/test-notification/""" + "$" + """workOrderId<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_8.index())
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned1_invoker.call(Assets_7.versioned(file))
      }
  
    // @LINE:14
    case controllers_HomeController_login2_route(params@_) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_8.login())
      }
  
    // @LINE:15
    case controllers_HomeController_logout3_route(params@_) =>
      call { 
        controllers_HomeController_logout3_invoker.call(HomeController_8.logout())
      }
  
    // @LINE:17
    case controllers_HomeController_postLoginData4_route(params@_) =>
      call { 
        controllers_HomeController_postLoginData4_invoker.call(HomeController_8.postLoginData)
      }
  
    // @LINE:18
    case controllers_Users_listUser5_route(params@_) =>
      call { 
        controllers_Users_listUser5_invoker.call(Users_0.listUser)
      }
  
    // @LINE:19
    case controllers_Users_dashboard6_route(params@_) =>
      call { 
        controllers_Users_dashboard6_invoker.call(Users_0.dashboard)
      }
  
    // @LINE:20
    case controllers_Users_dashboardListJson7_route(params@_) =>
      call { 
        controllers_Users_dashboardListJson7_invoker.call(Users_0.dashboardListJson)
      }
  
    // @LINE:21
    case controllers_WorkOrders_detail8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail8_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:22
    case controllers_WorkOrders_updatePending9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_updatePending9_invoker.call(WorkOrders_2.updatePending(id))
      }
  
    // @LINE:23
    case controllers_Users_listUserJson10_route(params@_) =>
      call { 
        controllers_Users_listUserJson10_invoker.call(Users_0.listUserJson)
      }
  
    // @LINE:24
    case controllers_Users_detail11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_detail11_invoker.call(Users_0.detail(id))
      }
  
    // @LINE:25
    case controllers_HomeController_resetPasswords12_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_resetPasswords12_invoker.call(HomeController_8.resetPasswords(email))
      }
  
    // @LINE:27
    case controllers_HomeController_postResetPassword13_route(params@_) =>
      call { 
        controllers_HomeController_postResetPassword13_invoker.call(HomeController_8.postResetPassword)
      }
  
    // @LINE:28
    case controllers_Users_create14_route(params@_) =>
      call { 
        controllers_Users_create14_invoker.call(Users_0.create)
      }
  
    // @LINE:29
    case controllers_Users_update15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_update15_invoker.call(Users_0.update(id))
      }
  
    // @LINE:30
    case controllers_Users_delete16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_delete16_invoker.call(Users_0.delete(id))
      }
  
    // @LINE:32
    case controllers_Users_postUserDb17_route(params@_) =>
      call { 
        controllers_Users_postUserDb17_invoker.call(Users_0.postUserDb)
      }
  
    // @LINE:35
    case controllers_MaintenanceItems_list18_route(params@_) =>
      call { 
        controllers_MaintenanceItems_list18_invoker.call(MaintenanceItems_6.list)
      }
  
    // @LINE:36
    case controllers_MaintenanceItems_listMaintenanceItemsJson19_route(params@_) =>
      call { 
        controllers_MaintenanceItems_listMaintenanceItemsJson19_invoker.call(MaintenanceItems_6.listMaintenanceItemsJson)
      }
  
    // @LINE:37
    case controllers_MaintenanceItems_detail20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_detail20_invoker.call(MaintenanceItems_6.detail(id))
      }
  
    // @LINE:38
    case controllers_MaintenanceItems_create21_route(params@_) =>
      call { 
        controllers_MaintenanceItems_create21_invoker.call(MaintenanceItems_6.create)
      }
  
    // @LINE:39
    case controllers_MaintenanceItems_update22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_update22_invoker.call(MaintenanceItems_6.update(id))
      }
  
    // @LINE:40
    case controllers_MaintenanceItems_delete23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_delete23_invoker.call(MaintenanceItems_6.delete(id))
      }
  
    // @LINE:42
    case controllers_MaintenanceItems_postMaintenanceItemsDb24_route(params@_) =>
      call { 
        controllers_MaintenanceItems_postMaintenanceItemsDb24_invoker.call(MaintenanceItems_6.postMaintenanceItemsDb)
      }
  
    // @LINE:45
    case controllers_WorkOrders_list25_route(params@_) =>
      call { 
        controllers_WorkOrders_list25_invoker.call(WorkOrders_2.list)
      }
  
    // @LINE:46
    case controllers_WorkOrders_historyList26_route(params@_) =>
      call { 
        controllers_WorkOrders_historyList26_invoker.call(WorkOrders_2.historyList)
      }
  
    // @LINE:47
    case controllers_WorkOrders_listWorkOrderJson27_route(params@_) =>
      call { 
        controllers_WorkOrders_listWorkOrderJson27_invoker.call(WorkOrders_2.listWorkOrderJson)
      }
  
    // @LINE:48
    case controllers_WorkOrders_historyListWorkOrderJson28_route(params@_) =>
      call { 
        controllers_WorkOrders_historyListWorkOrderJson28_invoker.call(WorkOrders_2.historyListWorkOrderJson)
      }
  
    // @LINE:49
    case controllers_WorkOrders_detail29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail29_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:50
    case controllers_WorkOrders_detail30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail30_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:51
    case controllers_WorkOrders_create31_route(params@_) =>
      call { 
        controllers_WorkOrders_create31_invoker.call(WorkOrders_2.create)
      }
  
    // @LINE:52
    case controllers_WorkOrders_update32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_update32_invoker.call(WorkOrders_2.update(id))
      }
  
    // @LINE:53
    case controllers_WorkOrders_delete33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_delete33_invoker.call(WorkOrders_2.delete(id))
      }
  
    // @LINE:55
    case controllers_WorkOrders_postWorkOrdersDb34_route(params@_) =>
      call { 
        controllers_WorkOrders_postWorkOrdersDb34_invoker.call(WorkOrders_2.postWorkOrdersDb)
      }
  
    // @LINE:58
    case controllers_WorkOrderSamples_list35_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_list35_invoker.call(WorkOrderSamples_1.list)
      }
  
    // @LINE:59
    case controllers_WorkOrderSamples_listWorkOrderSampleJson36_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_listWorkOrderSampleJson36_invoker.call(WorkOrderSamples_1.listWorkOrderSampleJson)
      }
  
    // @LINE:60
    case controllers_WorkOrderSamples_detail37_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_detail37_invoker.call(WorkOrderSamples_1.detail(id))
      }
  
    // @LINE:61
    case controllers_WorkOrderSamples_create38_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_create38_invoker.call(WorkOrderSamples_1.create)
      }
  
    // @LINE:62
    case controllers_WorkOrderSamples_createWorkOrder39_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_createWorkOrder39_invoker.call(WorkOrderSamples_1.createWorkOrder(id))
      }
  
    // @LINE:63
    case controllers_WorkOrderSamples_update40_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_update40_invoker.call(WorkOrderSamples_1.update(id))
      }
  
    // @LINE:64
    case controllers_WorkOrderSamples_delete41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_delete41_invoker.call(WorkOrderSamples_1.delete(id))
      }
  
    // @LINE:66
    case controllers_WorkOrderSamples_postWorkOrderSamplesDb42_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_postWorkOrderSamplesDb42_invoker.call(WorkOrderSamples_1.postWorkOrderSamplesDb)
      }
  
    // @LINE:69
    case controllers_Technicians_list43_route(params@_) =>
      call { 
        controllers_Technicians_list43_invoker.call(Technicians_4.list)
      }
  
    // @LINE:70
    case controllers_Technicians_listTechniciansJson44_route(params@_) =>
      call { 
        controllers_Technicians_listTechniciansJson44_invoker.call(Technicians_4.listTechniciansJson)
      }
  
    // @LINE:71
    case controllers_Technicians_detail45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_detail45_invoker.call(Technicians_4.detail(id))
      }
  
    // @LINE:72
    case controllers_Technicians_create46_route(params@_) =>
      call { 
        controllers_Technicians_create46_invoker.call(Technicians_4.create)
      }
  
    // @LINE:73
    case controllers_Technicians_update47_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_update47_invoker.call(Technicians_4.update(id))
      }
  
    // @LINE:74
    case controllers_Technicians_delete48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_delete48_invoker.call(Technicians_4.delete(id))
      }
  
    // @LINE:76
    case controllers_Technicians_postTechniciansDb49_route(params@_) =>
      call { 
        controllers_Technicians_postTechniciansDb49_invoker.call(Technicians_4.postTechniciansDb)
      }
  
    // @LINE:81
    case appcontrollers_Users_loginApi50_route(params@_) =>
      call { 
        appcontrollers_Users_loginApi50_invoker.call(Users_3.loginApi)
      }
  
    // @LINE:82
    case appcontrollers_Users_profile51_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_profile51_invoker.call(Users_3.profile(id))
      }
  
    // @LINE:84
    case appcontrollers_Users_postUpdateProfile52_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdateProfile52_invoker.call(Users_3.postUpdateProfile(id))
      }
  
    // @LINE:86
    case appcontrollers_Users_postUpdatePassword53_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdatePassword53_invoker.call(Users_3.postUpdatePassword(id))
      }
  
    // @LINE:89
    case appcontrollers_WorkOrders_workOrderList54_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderList54_invoker.call(WorkOrders_5.workOrderList(id))
      }
  
    // @LINE:90
    case appcontrollers_WorkOrders_workOrderListHistory55_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderListHistory55_invoker.call(WorkOrders_5.workOrderListHistory(id))
      }
  
    // @LINE:91
    case appcontrollers_WorkOrders_workOrderDetail56_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderDetail56_invoker.call(WorkOrders_5.workOrderDetail(id))
      }
  
    // @LINE:93
    case appcontrollers_WorkOrders_postUpdateWorkOrder57_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_postUpdateWorkOrder57_invoker.call(WorkOrders_5.postUpdateWorkOrder(id))
      }
  
    // @LINE:97
    case appcontrollers_Users_registerFirebaseToken58_route(params@_) =>
      call { 
        appcontrollers_Users_registerFirebaseToken58_invoker.call(Users_3.registerFirebaseToken)
      }
  
    // @LINE:98
    case appcontrollers_Users_testSendPushNotification59_route(params@_) =>
      call(params.fromPath[Long]("workOrderId", None)) { (workOrderId) =>
        appcontrollers_Users_testSendPushNotification59_invoker.call(Users_3.testSendPushNotification(workOrderId))
      }
  }
}
