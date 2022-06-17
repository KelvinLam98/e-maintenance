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
  // @LINE:36
  MaintenanceItems_6: controllers.MaintenanceItems,
  // @LINE:59
  WorkOrderSamples_1: controllers.WorkOrderSamples,
  // @LINE:70
  Technicians_4: controllers.Technicians,
  // @LINE:82
  Users_3: appcontrollers.Users,
  // @LINE:90
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
    // @LINE:36
    MaintenanceItems_6: controllers.MaintenanceItems,
    // @LINE:59
    WorkOrderSamples_1: controllers.WorkOrderSamples,
    // @LINE:70
    Technicians_4: controllers.Technicians,
    // @LINE:82
    Users_3: appcontrollers.Users,
    // @LINE:90
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/listAll.json""", """controllers.WorkOrders.listWorkOrderJson"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/""" + "$" + """id<[^/]+>/""" + "$" + """status<[^/]+>""", """appcontrollers.WorkOrders.workOrderDetailByStatus(id:Long, status:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrderSample/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderSampleList(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrderSample/detail/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderSampleDetailList(id:Long)"""),
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
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/listAll.json")))
  )
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson8_invoker = createInvoker(
    WorkOrders_2.listWorkOrderJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "listWorkOrderJson",
      Nil,
      "GET",
      this.prefix + """dashboard/listAll.json""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_WorkOrders_detail9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/pending/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail9_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_WorkOrders_updatePending10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/pending/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_updatePending10_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Users_listUserJson11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list.json")))
  )
  private[this] lazy val controllers_Users_listUserJson11_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Users_detail12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_detail12_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_HomeController_resetPasswords13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("email", """[^/]+""",true), StaticPart("/resetPassword")))
  )
  private[this] lazy val controllers_HomeController_resetPasswords13_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_HomeController_postResetPassword14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/resetPassword/post")))
  )
  private[this] lazy val controllers_HomeController_postResetPassword14_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Users_create15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create")))
  )
  private[this] lazy val controllers_Users_create15_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Users_update16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Users_update16_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Users_delete17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Users_delete17_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Users_postUserDb18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create/post")))
  )
  private[this] lazy val controllers_Users_postUserDb18_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_MaintenanceItems_list19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list")))
  )
  private[this] lazy val controllers_MaintenanceItems_list19_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list.json")))
  )
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson20_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_MaintenanceItems_detail21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceItems_detail21_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_MaintenanceItems_create22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create")))
  )
  private[this] lazy val controllers_MaintenanceItems_create22_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_MaintenanceItems_update23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_MaintenanceItems_update23_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_MaintenanceItems_delete24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_MaintenanceItems_delete24_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create/post")))
  )
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb25_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_WorkOrders_list26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list")))
  )
  private[this] lazy val controllers_WorkOrders_list26_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_WorkOrders_historyList27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list")))
  )
  private[this] lazy val controllers_WorkOrders_historyList27_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson28_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson29_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_WorkOrders_detail30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail30_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_WorkOrders_detail31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail31_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_WorkOrders_create32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create")))
  )
  private[this] lazy val controllers_WorkOrders_create32_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_WorkOrders_update33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_update33_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_WorkOrders_delete34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrders_delete34_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create/post")))
  )
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb35_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_WorkOrderSamples_list36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list")))
  )
  private[this] lazy val controllers_WorkOrderSamples_list36_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list.json")))
  )
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson37_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_WorkOrderSamples_detail38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrderSamples_detail38_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_WorkOrderSamples_create39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create")))
  )
  private[this] lazy val controllers_WorkOrderSamples_create39_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_WorkOrderSamples_createWorkOrder40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/createWorkOrder")))
  )
  private[this] lazy val controllers_WorkOrderSamples_createWorkOrder40_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_WorkOrderSamples_update41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrderSamples_update41_invoker = createInvoker(
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

  // @LINE:65
  private[this] lazy val controllers_WorkOrderSamples_delete42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrderSamples_delete42_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create/post")))
  )
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb43_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_Technicians_list44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list")))
  )
  private[this] lazy val controllers_Technicians_list44_invoker = createInvoker(
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

  // @LINE:71
  private[this] lazy val controllers_Technicians_listTechniciansJson45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list.json")))
  )
  private[this] lazy val controllers_Technicians_listTechniciansJson45_invoker = createInvoker(
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

  // @LINE:72
  private[this] lazy val controllers_Technicians_detail46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Technicians_detail46_invoker = createInvoker(
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

  // @LINE:73
  private[this] lazy val controllers_Technicians_create47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create")))
  )
  private[this] lazy val controllers_Technicians_create47_invoker = createInvoker(
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

  // @LINE:74
  private[this] lazy val controllers_Technicians_update48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Technicians_update48_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_Technicians_delete49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Technicians_delete49_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_Technicians_postTechniciansDb50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create/post")))
  )
  private[this] lazy val controllers_Technicians_postTechniciansDb50_invoker = createInvoker(
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

  // @LINE:82
  private[this] lazy val appcontrollers_Users_loginApi51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val appcontrollers_Users_loginApi51_invoker = createInvoker(
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

  // @LINE:83
  private[this] lazy val appcontrollers_Users_profile52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_profile52_invoker = createInvoker(
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

  // @LINE:85
  private[this] lazy val appcontrollers_Users_postUpdateProfile53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdateProfile53_invoker = createInvoker(
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

  // @LINE:87
  private[this] lazy val appcontrollers_Users_postUpdatePassword54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/changePassword/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdatePassword54_invoker = createInvoker(
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

  // @LINE:90
  private[this] lazy val appcontrollers_WorkOrders_workOrderList55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderList55_invoker = createInvoker(
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

  // @LINE:91
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetailByStatus56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("status", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetailByStatus56_invoker = createInvoker(
    WorkOrders_5.workOrderDetailByStatus(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderDetailByStatus",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """api/workOrder/""" + "$" + """id<[^/]+>/""" + "$" + """status<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleList57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderSample/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleList57_invoker = createInvoker(
    WorkOrders_5.workOrderSampleList(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderSampleList",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/workOrderSample/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleDetailList58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderSample/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleDetailList58_invoker = createInvoker(
    WorkOrders_5.workOrderSampleDetailList(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderSampleDetailList",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/workOrderSample/detail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderHistory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory59_invoker = createInvoker(
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

  // @LINE:95
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail60_invoker = createInvoker(
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

  // @LINE:97
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder61_invoker = createInvoker(
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

  // @LINE:101
  private[this] lazy val appcontrollers_Users_registerFirebaseToken62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/register-firebase-token")))
  )
  private[this] lazy val appcontrollers_Users_registerFirebaseToken62_invoker = createInvoker(
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

  // @LINE:102
  private[this] lazy val appcontrollers_Users_testSendPushNotification63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/test-notification/"), DynamicPart("workOrderId", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_testSendPushNotification63_invoker = createInvoker(
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
    case controllers_WorkOrders_listWorkOrderJson8_route(params@_) =>
      call { 
        controllers_WorkOrders_listWorkOrderJson8_invoker.call(WorkOrders_2.listWorkOrderJson)
      }
  
    // @LINE:22
    case controllers_WorkOrders_detail9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail9_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:23
    case controllers_WorkOrders_updatePending10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_updatePending10_invoker.call(WorkOrders_2.updatePending(id))
      }
  
    // @LINE:24
    case controllers_Users_listUserJson11_route(params@_) =>
      call { 
        controllers_Users_listUserJson11_invoker.call(Users_0.listUserJson)
      }
  
    // @LINE:25
    case controllers_Users_detail12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_detail12_invoker.call(Users_0.detail(id))
      }
  
    // @LINE:26
    case controllers_HomeController_resetPasswords13_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_resetPasswords13_invoker.call(HomeController_8.resetPasswords(email))
      }
  
    // @LINE:28
    case controllers_HomeController_postResetPassword14_route(params@_) =>
      call { 
        controllers_HomeController_postResetPassword14_invoker.call(HomeController_8.postResetPassword)
      }
  
    // @LINE:29
    case controllers_Users_create15_route(params@_) =>
      call { 
        controllers_Users_create15_invoker.call(Users_0.create)
      }
  
    // @LINE:30
    case controllers_Users_update16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_update16_invoker.call(Users_0.update(id))
      }
  
    // @LINE:31
    case controllers_Users_delete17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_delete17_invoker.call(Users_0.delete(id))
      }
  
    // @LINE:33
    case controllers_Users_postUserDb18_route(params@_) =>
      call { 
        controllers_Users_postUserDb18_invoker.call(Users_0.postUserDb)
      }
  
    // @LINE:36
    case controllers_MaintenanceItems_list19_route(params@_) =>
      call { 
        controllers_MaintenanceItems_list19_invoker.call(MaintenanceItems_6.list)
      }
  
    // @LINE:37
    case controllers_MaintenanceItems_listMaintenanceItemsJson20_route(params@_) =>
      call { 
        controllers_MaintenanceItems_listMaintenanceItemsJson20_invoker.call(MaintenanceItems_6.listMaintenanceItemsJson)
      }
  
    // @LINE:38
    case controllers_MaintenanceItems_detail21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_detail21_invoker.call(MaintenanceItems_6.detail(id))
      }
  
    // @LINE:39
    case controllers_MaintenanceItems_create22_route(params@_) =>
      call { 
        controllers_MaintenanceItems_create22_invoker.call(MaintenanceItems_6.create)
      }
  
    // @LINE:40
    case controllers_MaintenanceItems_update23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_update23_invoker.call(MaintenanceItems_6.update(id))
      }
  
    // @LINE:41
    case controllers_MaintenanceItems_delete24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_delete24_invoker.call(MaintenanceItems_6.delete(id))
      }
  
    // @LINE:43
    case controllers_MaintenanceItems_postMaintenanceItemsDb25_route(params@_) =>
      call { 
        controllers_MaintenanceItems_postMaintenanceItemsDb25_invoker.call(MaintenanceItems_6.postMaintenanceItemsDb)
      }
  
    // @LINE:46
    case controllers_WorkOrders_list26_route(params@_) =>
      call { 
        controllers_WorkOrders_list26_invoker.call(WorkOrders_2.list)
      }
  
    // @LINE:47
    case controllers_WorkOrders_historyList27_route(params@_) =>
      call { 
        controllers_WorkOrders_historyList27_invoker.call(WorkOrders_2.historyList)
      }
  
    // @LINE:48
    case controllers_WorkOrders_listWorkOrderJson28_route(params@_) =>
      call { 
        controllers_WorkOrders_listWorkOrderJson28_invoker.call(WorkOrders_2.listWorkOrderJson)
      }
  
    // @LINE:49
    case controllers_WorkOrders_historyListWorkOrderJson29_route(params@_) =>
      call { 
        controllers_WorkOrders_historyListWorkOrderJson29_invoker.call(WorkOrders_2.historyListWorkOrderJson)
      }
  
    // @LINE:50
    case controllers_WorkOrders_detail30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail30_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:51
    case controllers_WorkOrders_detail31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail31_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:52
    case controllers_WorkOrders_create32_route(params@_) =>
      call { 
        controllers_WorkOrders_create32_invoker.call(WorkOrders_2.create)
      }
  
    // @LINE:53
    case controllers_WorkOrders_update33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_update33_invoker.call(WorkOrders_2.update(id))
      }
  
    // @LINE:54
    case controllers_WorkOrders_delete34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_delete34_invoker.call(WorkOrders_2.delete(id))
      }
  
    // @LINE:56
    case controllers_WorkOrders_postWorkOrdersDb35_route(params@_) =>
      call { 
        controllers_WorkOrders_postWorkOrdersDb35_invoker.call(WorkOrders_2.postWorkOrdersDb)
      }
  
    // @LINE:59
    case controllers_WorkOrderSamples_list36_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_list36_invoker.call(WorkOrderSamples_1.list)
      }
  
    // @LINE:60
    case controllers_WorkOrderSamples_listWorkOrderSampleJson37_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_listWorkOrderSampleJson37_invoker.call(WorkOrderSamples_1.listWorkOrderSampleJson)
      }
  
    // @LINE:61
    case controllers_WorkOrderSamples_detail38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_detail38_invoker.call(WorkOrderSamples_1.detail(id))
      }
  
    // @LINE:62
    case controllers_WorkOrderSamples_create39_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_create39_invoker.call(WorkOrderSamples_1.create)
      }
  
    // @LINE:63
    case controllers_WorkOrderSamples_createWorkOrder40_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_createWorkOrder40_invoker.call(WorkOrderSamples_1.createWorkOrder(id))
      }
  
    // @LINE:64
    case controllers_WorkOrderSamples_update41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_update41_invoker.call(WorkOrderSamples_1.update(id))
      }
  
    // @LINE:65
    case controllers_WorkOrderSamples_delete42_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_delete42_invoker.call(WorkOrderSamples_1.delete(id))
      }
  
    // @LINE:67
    case controllers_WorkOrderSamples_postWorkOrderSamplesDb43_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_postWorkOrderSamplesDb43_invoker.call(WorkOrderSamples_1.postWorkOrderSamplesDb)
      }
  
    // @LINE:70
    case controllers_Technicians_list44_route(params@_) =>
      call { 
        controllers_Technicians_list44_invoker.call(Technicians_4.list)
      }
  
    // @LINE:71
    case controllers_Technicians_listTechniciansJson45_route(params@_) =>
      call { 
        controllers_Technicians_listTechniciansJson45_invoker.call(Technicians_4.listTechniciansJson)
      }
  
    // @LINE:72
    case controllers_Technicians_detail46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_detail46_invoker.call(Technicians_4.detail(id))
      }
  
    // @LINE:73
    case controllers_Technicians_create47_route(params@_) =>
      call { 
        controllers_Technicians_create47_invoker.call(Technicians_4.create)
      }
  
    // @LINE:74
    case controllers_Technicians_update48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_update48_invoker.call(Technicians_4.update(id))
      }
  
    // @LINE:75
    case controllers_Technicians_delete49_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_delete49_invoker.call(Technicians_4.delete(id))
      }
  
    // @LINE:77
    case controllers_Technicians_postTechniciansDb50_route(params@_) =>
      call { 
        controllers_Technicians_postTechniciansDb50_invoker.call(Technicians_4.postTechniciansDb)
      }
  
    // @LINE:82
    case appcontrollers_Users_loginApi51_route(params@_) =>
      call { 
        appcontrollers_Users_loginApi51_invoker.call(Users_3.loginApi)
      }
  
    // @LINE:83
    case appcontrollers_Users_profile52_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_profile52_invoker.call(Users_3.profile(id))
      }
  
    // @LINE:85
    case appcontrollers_Users_postUpdateProfile53_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdateProfile53_invoker.call(Users_3.postUpdateProfile(id))
      }
  
    // @LINE:87
    case appcontrollers_Users_postUpdatePassword54_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdatePassword54_invoker.call(Users_3.postUpdatePassword(id))
      }
  
    // @LINE:90
    case appcontrollers_WorkOrders_workOrderList55_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderList55_invoker.call(WorkOrders_5.workOrderList(id))
      }
  
    // @LINE:91
    case appcontrollers_WorkOrders_workOrderDetailByStatus56_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("status", None)) { (id, status) =>
        appcontrollers_WorkOrders_workOrderDetailByStatus56_invoker.call(WorkOrders_5.workOrderDetailByStatus(id, status))
      }
  
    // @LINE:92
    case appcontrollers_WorkOrders_workOrderSampleList57_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderSampleList57_invoker.call(WorkOrders_5.workOrderSampleList(id))
      }
  
    // @LINE:93
    case appcontrollers_WorkOrders_workOrderSampleDetailList58_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderSampleDetailList58_invoker.call(WorkOrders_5.workOrderSampleDetailList(id))
      }
  
    // @LINE:94
    case appcontrollers_WorkOrders_workOrderListHistory59_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderListHistory59_invoker.call(WorkOrders_5.workOrderListHistory(id))
      }
  
    // @LINE:95
    case appcontrollers_WorkOrders_workOrderDetail60_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderDetail60_invoker.call(WorkOrders_5.workOrderDetail(id))
      }
  
    // @LINE:97
    case appcontrollers_WorkOrders_postUpdateWorkOrder61_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_postUpdateWorkOrder61_invoker.call(WorkOrders_5.postUpdateWorkOrder(id))
      }
  
    // @LINE:101
    case appcontrollers_Users_registerFirebaseToken62_route(params@_) =>
      call { 
        appcontrollers_Users_registerFirebaseToken62_invoker.call(Users_3.registerFirebaseToken)
      }
  
    // @LINE:102
    case appcontrollers_Users_testSendPushNotification63_route(params@_) =>
      call(params.fromPath[Long]("workOrderId", None)) { (workOrderId) =>
        appcontrollers_Users_testSendPushNotification63_invoker.call(Users_3.testSendPushNotification(workOrderId))
      }
  }
}
