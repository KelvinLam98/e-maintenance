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
  // @LINE:31
  MaintenanceItems_6: controllers.MaintenanceItems,
  // @LINE:41
  WorkOrders_2: controllers.WorkOrders,
  // @LINE:54
  WorkOrderSamples_1: controllers.WorkOrderSamples,
  // @LINE:64
  Technicians_4: controllers.Technicians,
  // @LINE:76
  Users_3: appcontrollers.Users,
  // @LINE:84
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
    // @LINE:31
    MaintenanceItems_6: controllers.MaintenanceItems,
    // @LINE:41
    WorkOrders_2: controllers.WorkOrders,
    // @LINE:54
    WorkOrderSamples_1: controllers.WorkOrderSamples,
    // @LINE:64
    Technicians_4: controllers.Technicians,
    // @LINE:76
    Users_3: appcontrollers.Users,
    // @LINE:84
    WorkOrders_5: appcontrollers.WorkOrders
  ) = this(errorHandler, HomeController_8, Assets_7, Users_0, MaintenanceItems_6, WorkOrders_2, WorkOrderSamples_1, Technicians_4, Users_3, WorkOrders_5, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_8, Assets_7, Users_0, MaintenanceItems_6, WorkOrders_2, WorkOrderSamples_1, Technicians_4, Users_3, WorkOrders_5, prefix)
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

  // @LINE:20
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_resetPasswords8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("email", """[^/]+""",true), StaticPart("/resetPassword")))
  )
  private[this] lazy val controllers_HomeController_resetPasswords8_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_postResetPassword9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/resetPassword/post")))
  )
  private[this] lazy val controllers_HomeController_postResetPassword9_invoker = createInvoker(
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

  // @LINE:24
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

  // @LINE:25
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

  // @LINE:26
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

  // @LINE:28
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

  // @LINE:31
  private[this] lazy val controllers_MaintenanceItems_list14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list")))
  )
  private[this] lazy val controllers_MaintenanceItems_list14_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list.json")))
  )
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson15_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_MaintenanceItems_detail16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceItems_detail16_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_MaintenanceItems_create17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create")))
  )
  private[this] lazy val controllers_MaintenanceItems_create17_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_MaintenanceItems_update18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_MaintenanceItems_update18_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_MaintenanceItems_delete19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_MaintenanceItems_delete19_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create/post")))
  )
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb20_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_WorkOrders_list21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list")))
  )
  private[this] lazy val controllers_WorkOrders_list21_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_WorkOrders_historyList22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list")))
  )
  private[this] lazy val controllers_WorkOrders_historyList22_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson23_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson24_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_WorkOrders_detail25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail25_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_WorkOrders_detail26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail26_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_WorkOrders_create27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create")))
  )
  private[this] lazy val controllers_WorkOrders_create27_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_WorkOrders_update28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_update28_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_WorkOrders_delete29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrders_delete29_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create/post")))
  )
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb30_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_WorkOrderSamples_list31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list")))
  )
  private[this] lazy val controllers_WorkOrderSamples_list31_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/list.json")))
  )
  private[this] lazy val controllers_WorkOrderSamples_listWorkOrderSampleJson32_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_WorkOrderSamples_detail33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrderSamples_detail33_invoker = createInvoker(
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

  // @LINE:57
  private[this] lazy val controllers_WorkOrderSamples_create34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create")))
  )
  private[this] lazy val controllers_WorkOrderSamples_create34_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_WorkOrderSamples_update35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrderSamples_update35_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_WorkOrderSamples_delete36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrderSamples_delete36_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrderSamples/create/post")))
  )
  private[this] lazy val controllers_WorkOrderSamples_postWorkOrderSamplesDb37_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_Technicians_list38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list")))
  )
  private[this] lazy val controllers_Technicians_list38_invoker = createInvoker(
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

  // @LINE:65
  private[this] lazy val controllers_Technicians_listTechniciansJson39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list.json")))
  )
  private[this] lazy val controllers_Technicians_listTechniciansJson39_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_Technicians_detail40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Technicians_detail40_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_Technicians_create41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create")))
  )
  private[this] lazy val controllers_Technicians_create41_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_Technicians_update42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Technicians_update42_invoker = createInvoker(
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

  // @LINE:69
  private[this] lazy val controllers_Technicians_delete43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Technicians_delete43_invoker = createInvoker(
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

  // @LINE:71
  private[this] lazy val controllers_Technicians_postTechniciansDb44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create/post")))
  )
  private[this] lazy val controllers_Technicians_postTechniciansDb44_invoker = createInvoker(
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

  // @LINE:76
  private[this] lazy val appcontrollers_Users_loginApi45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val appcontrollers_Users_loginApi45_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val appcontrollers_Users_profile46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_profile46_invoker = createInvoker(
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

  // @LINE:79
  private[this] lazy val appcontrollers_Users_postUpdateProfile47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdateProfile47_invoker = createInvoker(
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

  // @LINE:81
  private[this] lazy val appcontrollers_Users_postUpdatePassword48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/profile/changePassword/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_postUpdatePassword48_invoker = createInvoker(
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

  // @LINE:84
  private[this] lazy val appcontrollers_WorkOrders_workOrderList49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderList49_invoker = createInvoker(
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

  // @LINE:85
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrderHistory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderListHistory50_invoker = createInvoker(
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

  // @LINE:86
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderDetail51_invoker = createInvoker(
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

  // @LINE:88
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder/detail/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_WorkOrders_postUpdateWorkOrder52_invoker = createInvoker(
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

  // @LINE:92
  private[this] lazy val appcontrollers_Users_registerFirebaseToken53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/register-firebase-token")))
  )
  private[this] lazy val appcontrollers_Users_registerFirebaseToken53_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val appcontrollers_Users_testSendPushNotification54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/test-notification/"), DynamicPart("workOrderId", """[^/]+""",true)))
  )
  private[this] lazy val appcontrollers_Users_testSendPushNotification54_invoker = createInvoker(
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
    case controllers_Users_listUserJson6_route(params@_) =>
      call { 
        controllers_Users_listUserJson6_invoker.call(Users_0.listUserJson)
      }
  
    // @LINE:20
    case controllers_Users_detail7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_detail7_invoker.call(Users_0.detail(id))
      }
  
    // @LINE:21
    case controllers_HomeController_resetPasswords8_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_resetPasswords8_invoker.call(HomeController_8.resetPasswords(email))
      }
  
    // @LINE:23
    case controllers_HomeController_postResetPassword9_route(params@_) =>
      call { 
        controllers_HomeController_postResetPassword9_invoker.call(HomeController_8.postResetPassword)
      }
  
    // @LINE:24
    case controllers_Users_create10_route(params@_) =>
      call { 
        controllers_Users_create10_invoker.call(Users_0.create)
      }
  
    // @LINE:25
    case controllers_Users_update11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_update11_invoker.call(Users_0.update(id))
      }
  
    // @LINE:26
    case controllers_Users_delete12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_delete12_invoker.call(Users_0.delete(id))
      }
  
    // @LINE:28
    case controllers_Users_postUserDb13_route(params@_) =>
      call { 
        controllers_Users_postUserDb13_invoker.call(Users_0.postUserDb)
      }
  
    // @LINE:31
    case controllers_MaintenanceItems_list14_route(params@_) =>
      call { 
        controllers_MaintenanceItems_list14_invoker.call(MaintenanceItems_6.list)
      }
  
    // @LINE:32
    case controllers_MaintenanceItems_listMaintenanceItemsJson15_route(params@_) =>
      call { 
        controllers_MaintenanceItems_listMaintenanceItemsJson15_invoker.call(MaintenanceItems_6.listMaintenanceItemsJson)
      }
  
    // @LINE:33
    case controllers_MaintenanceItems_detail16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_detail16_invoker.call(MaintenanceItems_6.detail(id))
      }
  
    // @LINE:34
    case controllers_MaintenanceItems_create17_route(params@_) =>
      call { 
        controllers_MaintenanceItems_create17_invoker.call(MaintenanceItems_6.create)
      }
  
    // @LINE:35
    case controllers_MaintenanceItems_update18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_update18_invoker.call(MaintenanceItems_6.update(id))
      }
  
    // @LINE:36
    case controllers_MaintenanceItems_delete19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_delete19_invoker.call(MaintenanceItems_6.delete(id))
      }
  
    // @LINE:38
    case controllers_MaintenanceItems_postMaintenanceItemsDb20_route(params@_) =>
      call { 
        controllers_MaintenanceItems_postMaintenanceItemsDb20_invoker.call(MaintenanceItems_6.postMaintenanceItemsDb)
      }
  
    // @LINE:41
    case controllers_WorkOrders_list21_route(params@_) =>
      call { 
        controllers_WorkOrders_list21_invoker.call(WorkOrders_2.list)
      }
  
    // @LINE:42
    case controllers_WorkOrders_historyList22_route(params@_) =>
      call { 
        controllers_WorkOrders_historyList22_invoker.call(WorkOrders_2.historyList)
      }
  
    // @LINE:43
    case controllers_WorkOrders_listWorkOrderJson23_route(params@_) =>
      call { 
        controllers_WorkOrders_listWorkOrderJson23_invoker.call(WorkOrders_2.listWorkOrderJson)
      }
  
    // @LINE:44
    case controllers_WorkOrders_historyListWorkOrderJson24_route(params@_) =>
      call { 
        controllers_WorkOrders_historyListWorkOrderJson24_invoker.call(WorkOrders_2.historyListWorkOrderJson)
      }
  
    // @LINE:45
    case controllers_WorkOrders_detail25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail25_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:46
    case controllers_WorkOrders_detail26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail26_invoker.call(WorkOrders_2.detail(id))
      }
  
    // @LINE:47
    case controllers_WorkOrders_create27_route(params@_) =>
      call { 
        controllers_WorkOrders_create27_invoker.call(WorkOrders_2.create)
      }
  
    // @LINE:48
    case controllers_WorkOrders_update28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_update28_invoker.call(WorkOrders_2.update(id))
      }
  
    // @LINE:49
    case controllers_WorkOrders_delete29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_delete29_invoker.call(WorkOrders_2.delete(id))
      }
  
    // @LINE:51
    case controllers_WorkOrders_postWorkOrdersDb30_route(params@_) =>
      call { 
        controllers_WorkOrders_postWorkOrdersDb30_invoker.call(WorkOrders_2.postWorkOrdersDb)
      }
  
    // @LINE:54
    case controllers_WorkOrderSamples_list31_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_list31_invoker.call(WorkOrderSamples_1.list)
      }
  
    // @LINE:55
    case controllers_WorkOrderSamples_listWorkOrderSampleJson32_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_listWorkOrderSampleJson32_invoker.call(WorkOrderSamples_1.listWorkOrderSampleJson)
      }
  
    // @LINE:56
    case controllers_WorkOrderSamples_detail33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_detail33_invoker.call(WorkOrderSamples_1.detail(id))
      }
  
    // @LINE:57
    case controllers_WorkOrderSamples_create34_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_create34_invoker.call(WorkOrderSamples_1.create)
      }
  
    // @LINE:58
    case controllers_WorkOrderSamples_update35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_update35_invoker.call(WorkOrderSamples_1.update(id))
      }
  
    // @LINE:59
    case controllers_WorkOrderSamples_delete36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrderSamples_delete36_invoker.call(WorkOrderSamples_1.delete(id))
      }
  
    // @LINE:61
    case controllers_WorkOrderSamples_postWorkOrderSamplesDb37_route(params@_) =>
      call { 
        controllers_WorkOrderSamples_postWorkOrderSamplesDb37_invoker.call(WorkOrderSamples_1.postWorkOrderSamplesDb)
      }
  
    // @LINE:64
    case controllers_Technicians_list38_route(params@_) =>
      call { 
        controllers_Technicians_list38_invoker.call(Technicians_4.list)
      }
  
    // @LINE:65
    case controllers_Technicians_listTechniciansJson39_route(params@_) =>
      call { 
        controllers_Technicians_listTechniciansJson39_invoker.call(Technicians_4.listTechniciansJson)
      }
  
    // @LINE:66
    case controllers_Technicians_detail40_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_detail40_invoker.call(Technicians_4.detail(id))
      }
  
    // @LINE:67
    case controllers_Technicians_create41_route(params@_) =>
      call { 
        controllers_Technicians_create41_invoker.call(Technicians_4.create)
      }
  
    // @LINE:68
    case controllers_Technicians_update42_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_update42_invoker.call(Technicians_4.update(id))
      }
  
    // @LINE:69
    case controllers_Technicians_delete43_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_delete43_invoker.call(Technicians_4.delete(id))
      }
  
    // @LINE:71
    case controllers_Technicians_postTechniciansDb44_route(params@_) =>
      call { 
        controllers_Technicians_postTechniciansDb44_invoker.call(Technicians_4.postTechniciansDb)
      }
  
    // @LINE:76
    case appcontrollers_Users_loginApi45_route(params@_) =>
      call { 
        appcontrollers_Users_loginApi45_invoker.call(Users_3.loginApi)
      }
  
    // @LINE:77
    case appcontrollers_Users_profile46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_profile46_invoker.call(Users_3.profile(id))
      }
  
    // @LINE:79
    case appcontrollers_Users_postUpdateProfile47_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdateProfile47_invoker.call(Users_3.postUpdateProfile(id))
      }
  
    // @LINE:81
    case appcontrollers_Users_postUpdatePassword48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_Users_postUpdatePassword48_invoker.call(Users_3.postUpdatePassword(id))
      }
  
    // @LINE:84
    case appcontrollers_WorkOrders_workOrderList49_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderList49_invoker.call(WorkOrders_5.workOrderList(id))
      }
  
    // @LINE:85
    case appcontrollers_WorkOrders_workOrderListHistory50_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderListHistory50_invoker.call(WorkOrders_5.workOrderListHistory(id))
      }
  
    // @LINE:86
    case appcontrollers_WorkOrders_workOrderDetail51_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_workOrderDetail51_invoker.call(WorkOrders_5.workOrderDetail(id))
      }
  
    // @LINE:88
    case appcontrollers_WorkOrders_postUpdateWorkOrder52_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        appcontrollers_WorkOrders_postUpdateWorkOrder52_invoker.call(WorkOrders_5.postUpdateWorkOrder(id))
      }
  
    // @LINE:92
    case appcontrollers_Users_registerFirebaseToken53_route(params@_) =>
      call { 
        appcontrollers_Users_registerFirebaseToken53_invoker.call(Users_3.registerFirebaseToken)
      }
  
    // @LINE:93
    case appcontrollers_Users_testSendPushNotification54_route(params@_) =>
      call(params.fromPath[Long]("workOrderId", None)) { (workOrderId) =>
        appcontrollers_Users_testSendPushNotification54_invoker.call(Users_3.testSendPushNotification(workOrderId))
      }
  }
}
