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
  // @LINE:16
  Users_0: controllers.Users,
  // @LINE:26
  MaintenanceItems_5: controllers.MaintenanceItems,
  // @LINE:36
  WorkOrders_1: controllers.WorkOrders,
  // @LINE:49
  Technicians_3: controllers.Technicians,
  // @LINE:61
  Users_2: appcontrollers.Users,
  // @LINE:62
  WorkOrders_4: appcontrollers.WorkOrders,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_7: controllers.HomeController,
    // @LINE:10
    Assets_6: controllers.Assets,
    // @LINE:16
    Users_0: controllers.Users,
    // @LINE:26
    MaintenanceItems_5: controllers.MaintenanceItems,
    // @LINE:36
    WorkOrders_1: controllers.WorkOrders,
    // @LINE:49
    Technicians_3: controllers.Technicians,
    // @LINE:61
    Users_2: appcontrollers.Users,
    // @LINE:62
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/post/login""", """controllers.HomeController.postLoginData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list""", """controllers.Users.listUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list.json""", """controllers.Users.listUserJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/detail/""" + "$" + """id<[^/]+>""", """controllers.Users.detail(id:Long)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/workOrder""", """appcontrollers.WorkOrders.workOrderList"""),
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

  // @LINE:15
  private[this] lazy val controllers_HomeController_postLoginData3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/post/login")))
  )
  private[this] lazy val controllers_HomeController_postLoginData3_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_Users_listUser4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list")))
  )
  private[this] lazy val controllers_Users_listUser4_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_Users_listUserJson5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list.json")))
  )
  private[this] lazy val controllers_Users_listUserJson5_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_Users_detail6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_detail6_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_Users_create7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create")))
  )
  private[this] lazy val controllers_Users_create7_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_Users_update8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Users_update8_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_Users_delete9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Users_delete9_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Users_postUserDb10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create/post")))
  )
  private[this] lazy val controllers_Users_postUserDb10_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_MaintenanceItems_list11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list")))
  )
  private[this] lazy val controllers_MaintenanceItems_list11_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/list.json")))
  )
  private[this] lazy val controllers_MaintenanceItems_listMaintenanceItemsJson12_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_MaintenanceItems_detail13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaintenanceItems_detail13_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_MaintenanceItems_create14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create")))
  )
  private[this] lazy val controllers_MaintenanceItems_create14_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_MaintenanceItems_update15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_MaintenanceItems_update15_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_MaintenanceItems_delete16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_MaintenanceItems_delete16_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenanceItems/create/post")))
  )
  private[this] lazy val controllers_MaintenanceItems_postMaintenanceItemsDb17_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_WorkOrders_list18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list")))
  )
  private[this] lazy val controllers_WorkOrders_list18_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_WorkOrders_historyList19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list")))
  )
  private[this] lazy val controllers_WorkOrders_historyList19_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_listWorkOrderJson20_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/list.json")))
  )
  private[this] lazy val controllers_WorkOrders_historyListWorkOrderJson21_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_WorkOrders_detail22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail22_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_WorkOrders_detail23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/history/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkOrders_detail23_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_WorkOrders_create24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create")))
  )
  private[this] lazy val controllers_WorkOrders_create24_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_WorkOrders_update25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WorkOrders_update25_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_WorkOrders_delete26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_WorkOrders_delete26_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workOrders/create/post")))
  )
  private[this] lazy val controllers_WorkOrders_postWorkOrdersDb27_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_Technicians_list28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list")))
  )
  private[this] lazy val controllers_Technicians_list28_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_Technicians_listTechniciansJson29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/list.json")))
  )
  private[this] lazy val controllers_Technicians_listTechniciansJson29_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_Technicians_detail30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Technicians_detail30_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_Technicians_create31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create")))
  )
  private[this] lazy val controllers_Technicians_create31_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_Technicians_update32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_Technicians_update32_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_Technicians_delete33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/detail/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Technicians_delete33_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_Technicians_postTechniciansDb34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technicians/create/post")))
  )
  private[this] lazy val controllers_Technicians_postTechniciansDb34_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val appcontrollers_Users_loginApi35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val appcontrollers_Users_loginApi35_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val appcontrollers_WorkOrders_workOrderList36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/workOrder")))
  )
  private[this] lazy val appcontrollers_WorkOrders_workOrderList36_invoker = createInvoker(
    WorkOrders_4.workOrderList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "appcontrollers.WorkOrders",
      "workOrderList",
      Nil,
      "GET",
      this.prefix + """api/workOrder""",
      """""",
      Seq()
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
  
    // @LINE:15
    case controllers_HomeController_postLoginData3_route(params@_) =>
      call { 
        controllers_HomeController_postLoginData3_invoker.call(HomeController_7.postLoginData)
      }
  
    // @LINE:16
    case controllers_Users_listUser4_route(params@_) =>
      call { 
        controllers_Users_listUser4_invoker.call(Users_0.listUser)
      }
  
    // @LINE:17
    case controllers_Users_listUserJson5_route(params@_) =>
      call { 
        controllers_Users_listUserJson5_invoker.call(Users_0.listUserJson)
      }
  
    // @LINE:18
    case controllers_Users_detail6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_detail6_invoker.call(Users_0.detail(id))
      }
  
    // @LINE:19
    case controllers_Users_create7_route(params@_) =>
      call { 
        controllers_Users_create7_invoker.call(Users_0.create)
      }
  
    // @LINE:20
    case controllers_Users_update8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_update8_invoker.call(Users_0.update(id))
      }
  
    // @LINE:21
    case controllers_Users_delete9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_delete9_invoker.call(Users_0.delete(id))
      }
  
    // @LINE:23
    case controllers_Users_postUserDb10_route(params@_) =>
      call { 
        controllers_Users_postUserDb10_invoker.call(Users_0.postUserDb)
      }
  
    // @LINE:26
    case controllers_MaintenanceItems_list11_route(params@_) =>
      call { 
        controllers_MaintenanceItems_list11_invoker.call(MaintenanceItems_5.list)
      }
  
    // @LINE:27
    case controllers_MaintenanceItems_listMaintenanceItemsJson12_route(params@_) =>
      call { 
        controllers_MaintenanceItems_listMaintenanceItemsJson12_invoker.call(MaintenanceItems_5.listMaintenanceItemsJson)
      }
  
    // @LINE:28
    case controllers_MaintenanceItems_detail13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_detail13_invoker.call(MaintenanceItems_5.detail(id))
      }
  
    // @LINE:29
    case controllers_MaintenanceItems_create14_route(params@_) =>
      call { 
        controllers_MaintenanceItems_create14_invoker.call(MaintenanceItems_5.create)
      }
  
    // @LINE:30
    case controllers_MaintenanceItems_update15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_update15_invoker.call(MaintenanceItems_5.update(id))
      }
  
    // @LINE:31
    case controllers_MaintenanceItems_delete16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaintenanceItems_delete16_invoker.call(MaintenanceItems_5.delete(id))
      }
  
    // @LINE:33
    case controllers_MaintenanceItems_postMaintenanceItemsDb17_route(params@_) =>
      call { 
        controllers_MaintenanceItems_postMaintenanceItemsDb17_invoker.call(MaintenanceItems_5.postMaintenanceItemsDb)
      }
  
    // @LINE:36
    case controllers_WorkOrders_list18_route(params@_) =>
      call { 
        controllers_WorkOrders_list18_invoker.call(WorkOrders_1.list)
      }
  
    // @LINE:37
    case controllers_WorkOrders_historyList19_route(params@_) =>
      call { 
        controllers_WorkOrders_historyList19_invoker.call(WorkOrders_1.historyList)
      }
  
    // @LINE:38
    case controllers_WorkOrders_listWorkOrderJson20_route(params@_) =>
      call { 
        controllers_WorkOrders_listWorkOrderJson20_invoker.call(WorkOrders_1.listWorkOrderJson)
      }
  
    // @LINE:39
    case controllers_WorkOrders_historyListWorkOrderJson21_route(params@_) =>
      call { 
        controllers_WorkOrders_historyListWorkOrderJson21_invoker.call(WorkOrders_1.historyListWorkOrderJson)
      }
  
    // @LINE:40
    case controllers_WorkOrders_detail22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail22_invoker.call(WorkOrders_1.detail(id))
      }
  
    // @LINE:41
    case controllers_WorkOrders_detail23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_detail23_invoker.call(WorkOrders_1.detail(id))
      }
  
    // @LINE:42
    case controllers_WorkOrders_create24_route(params@_) =>
      call { 
        controllers_WorkOrders_create24_invoker.call(WorkOrders_1.create)
      }
  
    // @LINE:43
    case controllers_WorkOrders_update25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_update25_invoker.call(WorkOrders_1.update(id))
      }
  
    // @LINE:44
    case controllers_WorkOrders_delete26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkOrders_delete26_invoker.call(WorkOrders_1.delete(id))
      }
  
    // @LINE:46
    case controllers_WorkOrders_postWorkOrdersDb27_route(params@_) =>
      call { 
        controllers_WorkOrders_postWorkOrdersDb27_invoker.call(WorkOrders_1.postWorkOrdersDb)
      }
  
    // @LINE:49
    case controllers_Technicians_list28_route(params@_) =>
      call { 
        controllers_Technicians_list28_invoker.call(Technicians_3.list)
      }
  
    // @LINE:50
    case controllers_Technicians_listTechniciansJson29_route(params@_) =>
      call { 
        controllers_Technicians_listTechniciansJson29_invoker.call(Technicians_3.listTechniciansJson)
      }
  
    // @LINE:51
    case controllers_Technicians_detail30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_detail30_invoker.call(Technicians_3.detail(id))
      }
  
    // @LINE:52
    case controllers_Technicians_create31_route(params@_) =>
      call { 
        controllers_Technicians_create31_invoker.call(Technicians_3.create)
      }
  
    // @LINE:53
    case controllers_Technicians_update32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_update32_invoker.call(Technicians_3.update(id))
      }
  
    // @LINE:54
    case controllers_Technicians_delete33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Technicians_delete33_invoker.call(Technicians_3.delete(id))
      }
  
    // @LINE:56
    case controllers_Technicians_postTechniciansDb34_route(params@_) =>
      call { 
        controllers_Technicians_postTechniciansDb34_invoker.call(Technicians_3.postTechniciansDb)
      }
  
    // @LINE:61
    case appcontrollers_Users_loginApi35_route(params@_) =>
      call { 
        appcontrollers_Users_loginApi35_invoker.call(Users_2.loginApi)
      }
  
    // @LINE:62
    case appcontrollers_WorkOrders_workOrderList36_route(params@_) =>
      call { 
        appcontrollers_WorkOrders_workOrderList36_invoker.call(WorkOrders_4.workOrderList)
      }
  }
}
