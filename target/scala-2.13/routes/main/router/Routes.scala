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
  // @LINE:23
  WorkOrders_2: controllers.WorkOrders,
  // @LINE:38
  MaintenanceItems_6: controllers.MaintenanceItems,
  // @LINE:62
  WorkOrderSamples_1: controllers.WorkOrderSamples,
  // @LINE:73
  Technicians_4: controllers.Technicians,
  // @LINE:85
  Users_3: appcontrollers.Users,
  // @LINE:93
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
    // @LINE:23
    WorkOrders_2: controllers.WorkOrders,
    // @LINE:38
    MaintenanceItems_6: controllers.MaintenanceItems,
    // @LINE:62
    WorkOrderSamples_1: controllers.WorkOrderSamples,
    // @LINE:73
    Technicians_4: controllers.Technicians,
    // @LINE:85
    Users_3: appcontrollers.Users,
    // @LINE:93
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/inProgress.json""", """controllers.Users.dashboardListInProgressJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/todoList.json""", """controllers.Users.dashboardListTodoJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/pending/""" + "$" + """id<[^/]+>""", """controllers.WorkOrders.detail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard/today/""" + "$" + """id<[^/]+>""", """controllers.WorkOrders.detail(id:Long)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenanceItems/detail/""" + "$" + """id<[^/]+>/list.json""", """controllers.MaintenanceItems.detailWorkOrder(id:Long)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/detail/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderDetail(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/""" + "$" + """id<[^/]+>/""" + "$" + """status<[^/]+>""", """appcontrollers.WorkOrders.workOrderDetailByStatus(id:Long, status:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrderSample""", """appcontrollers.WorkOrders.workOrderSampleList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrderSample/detail/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.workOrderSampleDetailList(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder/detail/edit/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.postUpdateWorkOrder(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrderSample/detail/create/""" + "$" + """id<[^/]+>""", """appcontrollers.WorkOrders.postCreateWorkOrderWithSample(id:Long)"""),
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
  private[this] lazy val controllers_Users_dashboardListInProgressJson8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/inProgress.json")))
  )
  private[this] lazy val controllers_Users_dashboardListInProgressJson8_invoker = createInvoker(
    Users_0.dashboardListInProgressJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "dashboardListInProgressJson",
      Nil,
      "GET",
      this.prefix + """dashboard/inProgress.json""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Users_dashboardListTodoJson9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/todoList.json")))
  )
  private[this] lazy val controllers_Users_dashboardListTodoJson9_invoker = createInvoker(
    Users_0.dashboardListTodoJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "dashboardListTodoJson",
      Nil,
      "GET",
      this.prefix + """dashboard/todoList.json""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_WorkOrders_detail10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/pending/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail10_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_WorkOrders_detail11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/today/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail11_invoker = createInvoker(
    WorkOrders_2.detail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkOrders",
      "detail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """dashboard/today/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_WorkOrders_updatePending12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard/pending/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_updatePending12_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_Users_listUserJson13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list.json")))
  )
  private[this] lazy val controllers_Users_listUserJson13_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Users_detail14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_detail14_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_HomeController_resetPasswords15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("email", """[^/]+""",true), StaticPart("/resetPassword")))
  )
  private[this] lazy val controllers_HomeController_resetPasswords15_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_HomeController_postResetPassword16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/resetPassword/post")))
  )
  private[this] lazy val controllers_HomeController_postResetPassword16_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Users_create17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create")))
  )
  private[this] lazy val controllers_Users_create17_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_Users_update18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Users_update18_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Users_delete19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Users_delete19_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_Users_postUserDb20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create/post")))
  )
  private[this] lazy val controllers_Users_postUserDb20_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_MaintenanceItems_list21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list")))
  )
  private[this] lazy val controllers_MaintenanceItems_list21_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list.json")))
  )
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson22_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_MaintenanceItems_detail23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceItems_detail23_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_MaintenanceItems_detailWorkOrder24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/list.json")))
  )
  private[this] lazy val controllers_MaintenanceItems_detailWorkOrder24_invoker = createInvoker(
    MaintenanceItems_6.detailWorkOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaintenanceItems",
      "detailWorkOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """maintenanceItems/detail/""" + "$" + """id<[^/]+>/list.json""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_MaintenanceItems_create25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create")))
  )
  private[this] lazy val controllers_MaintenanceItems_create25_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_MaintenanceItems_update26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_MaintenanceItems_update26_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_MaintenanceItems_delete27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_MaintenanceItems_delete27_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create/post")))
  )
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb28_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_WorkOrders_list29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list")))
  )
  private[this] lazy val controllers_WorkOrders_list29_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_WorkOrders_historyList30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list")))
  )
  private[this] lazy val controllers_WorkOrders_historyList30_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson31_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson32_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_WorkOrders_detail33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail33_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_WorkOrders_detail34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail34_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_WorkOrders_create35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create")))
  )
  private[this] lazy val controllers_WorkOrders_create35_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_WorkOrders_update36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_update36_invoker = createInvoker(
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

  // @LINE:57
  private[this] lazy val controllers_WorkOrders_delete37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrders_delete37_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create/post")))
  )
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb38_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_WorkOrderSamples_list39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list")))
  )
  private[this] lazy val controllers_WorkOrderSamples_list39_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list.json")))
  )
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson40_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_WorkOrderSamples_detail41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrderSamples_detail41_invoker = createInvoker(
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

  // @LINE:65
  private[this] lazy val controllers_WorkOrderSamples_create42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create")))
  )
  private[this] lazy val controllers_WorkOrderSamples_create42_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_WorkOrderSamples_createWorkOrder43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/createWorkOrder")))
  )
  private[this] lazy val controllers_WorkOrderSamples_createWorkOrder43_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_WorkOrderSamples_update44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrderSamples_update44_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_WorkOrderSamples_delete45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrderSamples_delete45_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create/post")))
  )
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb46_invoker = createInvoker(
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

  // @LINE:73
  private[this] lazy val controllers_Technicians_list47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list")))
  )
  private[this] lazy val controllers_Technicians_list47_invoker = createInvoker(
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

  // @LINE:74
  private[this] lazy val controllers_Technicians_listTechniciansJson48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list.json")))
  )
  private[this] lazy val controllers_Technicians_listTechniciansJson48_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_Technicians_detail49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Technicians_detail49_invoker = createInvoker(
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

  // @LINE:76
  private[this] lazy val controllers_Technicians_create50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create")))
  )
  private[this] lazy val controllers_Technicians_create50_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_Technicians_update51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Technicians_update51_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_Technicians_delete52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Technicians_delete52_invoker = createInvoker(
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

  // @LINE:80
  private[this] lazy val controllers_Technicians_postTechniciansDb53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create/post")))
  )
  private[this] lazy val controllers_Technicians_postTechniciansDb53_invoker = createInvoker(
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

  // @LINE:85
  private[this] lazy val appcontrollers_Users_loginApi54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val appcontrollers_Users_loginApi54_invoker = createInvoker(
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

  // @LINE:86
  private[this] lazy val appcontrollers_Users_profile55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_profile55_invoker = createInvoker(
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

  // @LINE:88
  private[this] lazy val appcontrollers_Users_postUpdateProfile56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdateProfile56_invoker = createInvoker(
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

  // @LINE:90
  private[this] lazy val appcontrollers_Users_postUpdatePassword57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/changePassword/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdatePassword57_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val appcontrollers_WorkOrders_workOrderList58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderList58_invoker = createInvoker(
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

  // @LINE:94
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail59_invoker = createInvoker(
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

  // @LINE:95
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetailByStatus60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("status", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetailByStatus60_invoker = createInvoker(
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

  // @LINE:96
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleList61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderSample")))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleList61_invoker = createInvoker(
    WorkOrders_5.workOrderSampleList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderSampleList",
      Nil,
      "GET",
      this.prefix + """api/workOrderSample""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleDetailList62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderSample/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderSampleDetailList62_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder63_invoker = createInvoker(
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
  private[this] lazy val appcontrollers_WorkOrders_postCreateWorkOrderWithSample64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderSample/detail/create/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_postCreateWorkOrderWithSample64_invoker = createInvoker(
    WorkOrders_5.postCreateWorkOrderWithSample(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "postCreateWorkOrderWithSample",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """api/workOrderSample/detail/create/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:104
  private[this] lazy val appcontrollers_Users_registerFirebaseToken65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/register-firebase-token")))
  )
  private[this] lazy val appcontrollers_Users_registerFirebaseToken65_invoker = createInvoker(
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

  // @LINE:105
  private[this] lazy val appcontrollers_Users_testSendPushNotification66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/test-notification/"), DynamicPart("workOrderId", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_testSendPushNotification66_invoker = createInvoker(
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
    case controllers_Users_dashboardListInProgressJson8_route(params@_) =>
      call { 
        controllers_Users_dashboardListInProgressJson8_invoker.call(Users_0.dashboardListInProgressJson)
      }
  
    // @LINE:22
    case controllers_Users_dashboardListTodoJson9_route(params@_) =>
      call { 
        controllers_Users_dashboardListTodoJson9_invoker.call(Users_0.dashboardListTodoJson)
      }
  
    // @LINE:23
    case controllers_WorkOrders_detail10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail10_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:24
    case controllers_WorkOrders_detail11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail11_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:25
    case controllers_WorkOrders_updatePending12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_updatePending12_invoker.call(WorkOrders_2.updatePending(id))
      }
  
    // @LINE:26
    case controllers_Users_listUserJson13_route(params@_) =>
      call { 
        controllers_Users_listUserJson13_invoker.call(Users_0.listUserJson)
      }
  
    // @LINE:27
    case controllers_Users_detail14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_detail14_invoker.call(Users_0.detail(id))
      }
  
    // @LINE:28
    case controllers_HomeController_resetPasswords15_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_resetPasswords15_invoker.call(HomeController_8.resetPasswords(email))
      }
  
    // @LINE:30
    case controllers_HomeController_postResetPassword16_route(params@_) =>
      call { 
        controllers_HomeController_postResetPassword16_invoker.call(HomeController_8.postResetPassword)
      }
  
    // @LINE:31
    case controllers_Users_create17_route(params@_) =>
      call { 
        controllers_Users_create17_invoker.call(Users_0.create)
      }
  
    // @LINE:32
    case controllers_Users_update18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_update18_invoker.call(Users_0.update(id))
      }
  
    // @LINE:33
    case controllers_Users_delete19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_delete19_invoker.call(Users_0.delete(id))
      }
  
    // @LINE:35
    case controllers_Users_postUserDb20_route(params@_) =>
      call { 
        controllers_Users_postUserDb20_invoker.call(Users_0.postUserDb)
      }
  
    // @LINE:38
    case controllers_MaintenanceItems_list21_route(params@_) =>
      call { 
        controllers_MaintenanceItems_list21_invoker.call(MaintenanceItems_6.list)
      }
  
    // @LINE:39
    case controllers_MaintenanceItems_listMaintenanceItemsJson22_route(params@_) =>
      call { 
        controllers_MaintenanceItems_listMaintenanceItemsJson22_invoker.call(MaintenanceItems_6.listMaintenanceItemsJson)
      }
  
    // @LINE:40
    case controllers_MaintenanceItems_detail23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_detail23_invoker.call(MaintenanceItems_6.detail(id))
      }
  
    // @LINE:41
    case controllers_MaintenanceItems_detailWorkOrder24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_detailWorkOrder24_invoker.call(MaintenanceItems_6.detailWorkOrder(id))
      }
  
    // @LINE:42
    case controllers_MaintenanceItems_create25_route(params@_) =>
      call { 
        controllers_MaintenanceItems_create25_invoker.call(MaintenanceItems_6.create)
      }
  
    // @LINE:43
    case controllers_MaintenanceItems_update26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_update26_invoker.call(MaintenanceItems_6.update(id))
      }
  
    // @LINE:44
    case controllers_MaintenanceItems_delete27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_delete27_invoker.call(MaintenanceItems_6.delete(id))
      }
  
    // @LINE:46
    case controllers_MaintenanceItems_postMaintenanceItemsDb28_route(params@_) =>
      call { 
        controllers_MaintenanceItems_postMaintenanceItemsDb28_invoker.call(MaintenanceItems_6.postMaintenanceItemsDb)
      }
  
    // @LINE:49
    case controllers_WorkOrders_list29_route(params@_) =>
      call { 
        controllers_WorkOrders_list29_invoker.call(WorkOrders_2.list)
      }
  
    // @LINE:50
    case controllers_WorkOrders_historyList30_route(params@_) =>
      call { 
        controllers_WorkOrders_historyList30_invoker.call(WorkOrders_2.historyList)
      }
  
    // @LINE:51
    case controllers_WorkOrders_listWorkOrderJson31_route(params@_) =>
      call { 
        controllers_WorkOrders_listWorkOrderJson31_invoker.call(WorkOrders_2.listWorkOrderJson)
      }
  
    // @LINE:52
    case controllers_WorkOrders_historyListWorkOrderJson32_route(params@_) =>
      call { 
        controllers_WorkOrders_historyListWorkOrderJson32_invoker.call(WorkOrders_2.historyListWorkOrderJson)
      }
  
    // @LINE:53
    case controllers_WorkOrders_detail33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail33_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:54
    case controllers_WorkOrders_detail34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail34_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:55
    case controllers_WorkOrders_create35_route(params@_) =>
      call { 
        controllers_WorkOrders_create35_invoker.call(WorkOrders_2.create)
      }
  
    // @LINE:56
    case controllers_WorkOrders_update36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_update36_invoker.call(WorkOrders_2.update(id))
      }
  
    // @LINE:57
    case controllers_WorkOrders_delete37_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_delete37_invoker.call(WorkOrders_2.delete(id))
      }
  
    // @LINE:59
    case controllers_WorkOrders_postWorkOrdersDb38_route(params@_) =>
      call { 
        controllers_WorkOrders_postWorkOrdersDb38_invoker.call(WorkOrders_2.postWorkOrdersDb)
      }
  
    // @LINE:62
    case controllers_WorkOrderSamples_list39_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_list39_invoker.call(WorkOrderSamples_1.list)
      }
  
    // @LINE:63
    case controllers_WorkOrderSamples_listWorkOrderSampleJson40_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_listWorkOrderSampleJson40_invoker.call(WorkOrderSamples_1.listWorkOrderSampleJson)
      }
  
    // @LINE:64
    case controllers_WorkOrderSamples_detail41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_detail41_invoker.call(WorkOrderSamples_1.detail(id))
      }
  
    // @LINE:65
    case controllers_WorkOrderSamples_create42_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_create42_invoker.call(WorkOrderSamples_1.create)
      }
  
    // @LINE:66
    case controllers_WorkOrderSamples_createWorkOrder43_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_createWorkOrder43_invoker.call(WorkOrderSamples_1.createWorkOrder(id))
      }
  
    // @LINE:67
    case controllers_WorkOrderSamples_update44_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_update44_invoker.call(WorkOrderSamples_1.update(id))
      }
  
    // @LINE:68
    case controllers_WorkOrderSamples_delete45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_delete45_invoker.call(WorkOrderSamples_1.delete(id))
      }
  
    // @LINE:70
    case controllers_WorkOrderSamples_postWorkOrderSamplesDb46_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_postWorkOrderSamplesDb46_invoker.call(WorkOrderSamples_1.postWorkOrderSamplesDb)
      }
  
    // @LINE:73
    case controllers_Technicians_list47_route(params@_) =>
      call { 
        controllers_Technicians_list47_invoker.call(Technicians_4.list)
      }
  
    // @LINE:74
    case controllers_Technicians_listTechniciansJson48_route(params@_) =>
      call { 
        controllers_Technicians_listTechniciansJson48_invoker.call(Technicians_4.listTechniciansJson)
      }
  
    // @LINE:75
    case controllers_Technicians_detail49_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_detail49_invoker.call(Technicians_4.detail(id))
      }
  
    // @LINE:76
    case controllers_Technicians_create50_route(params@_) =>
      call { 
        controllers_Technicians_create50_invoker.call(Technicians_4.create)
      }
  
    // @LINE:77
    case controllers_Technicians_update51_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_update51_invoker.call(Technicians_4.update(id))
      }
  
    // @LINE:78
    case controllers_Technicians_delete52_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_delete52_invoker.call(Technicians_4.delete(id))
      }
  
    // @LINE:80
    case controllers_Technicians_postTechniciansDb53_route(params@_) =>
      call { 
        controllers_Technicians_postTechniciansDb53_invoker.call(Technicians_4.postTechniciansDb)
      }
  
    // @LINE:85
    case appcontrollers_Users_loginApi54_route(params@_) =>
      call { 
        appcontrollers_Users_loginApi54_invoker.call(Users_3.loginApi)
      }
  
    // @LINE:86
    case appcontrollers_Users_profile55_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_profile55_invoker.call(Users_3.profile(id))
      }
  
    // @LINE:88
    case appcontrollers_Users_postUpdateProfile56_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdateProfile56_invoker.call(Users_3.postUpdateProfile(id))
      }
  
    // @LINE:90
    case appcontrollers_Users_postUpdatePassword57_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdatePassword57_invoker.call(Users_3.postUpdatePassword(id))
      }
  
    // @LINE:93
    case appcontrollers_WorkOrders_workOrderList58_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderList58_invoker.call(WorkOrders_5.workOrderList(id))
      }
  
    // @LINE:94
    case appcontrollers_WorkOrders_workOrderDetail59_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderDetail59_invoker.call(WorkOrders_5.workOrderDetail(id))
      }
  
    // @LINE:95
    case appcontrollers_WorkOrders_workOrderDetailByStatus60_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("status", None)) { (id, status) =>
        appcontrollers_WorkOrders_workOrderDetailByStatus60_invoker.call(WorkOrders_5.workOrderDetailByStatus(id, status))
      }
  
    // @LINE:96
    case appcontrollers_WorkOrders_workOrderSampleList61_route(params@_) =>
      call { 
        appcontrollers_WorkOrders_workOrderSampleList61_invoker.call(WorkOrders_5.workOrderSampleList)
      }
  
    // @LINE:97
    case appcontrollers_WorkOrders_workOrderSampleDetailList62_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderSampleDetailList62_invoker.call(WorkOrders_5.workOrderSampleDetailList(id))
      }
  
    // @LINE:99
    case appcontrollers_WorkOrders_postUpdateWorkOrder63_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_postUpdateWorkOrder63_invoker.call(WorkOrders_5.postUpdateWorkOrder(id))
      }
  
    // @LINE:101
    case appcontrollers_WorkOrders_postCreateWorkOrderWithSample64_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_postCreateWorkOrderWithSample64_invoker.call(WorkOrders_5.postCreateWorkOrderWithSample(id))
      }
  
    // @LINE:104
    case appcontrollers_Users_registerFirebaseToken65_route(params@_) =>
      call { 
        appcontrollers_Users_registerFirebaseToken65_invoker.call(Users_3.registerFirebaseToken)
      }
  
    // @LINE:105
    case appcontrollers_Users_testSendPushNotification66_route(params@_) =>
      call(params.fromPath[Long]("workOrderId", None)) { (workOrderId) =>
        appcontrollers_Users_testSendPushNotification66_invoker.call(Users_3.testSendPushNotification(workOrderId))
      }
  }
}
