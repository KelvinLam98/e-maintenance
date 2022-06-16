// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseWorkOrders(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:21
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.detail",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/pending/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
          }
        
        }
      """
    )
  
    // @LINE:51
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/create"})
        }
      """
    )
  
    // @LINE:48
    def historyListWorkOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.historyListWorkOrderJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/history/list.json"})
        }
      """
    )
  
    // @LINE:55
    def postWorkOrdersDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.postWorkOrdersDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/create/post"})
        }
      """
    )
  
    // @LINE:52
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:46
    def historyList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.historyList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/history/list"})
        }
      """
    )
  
    // @LINE:22
    def updatePending: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.updatePending",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/pending/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:45
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/list"})
        }
      """
    )
  
    // @LINE:47
    def listWorkOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.listWorkOrderJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/list.json"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:23
    def listUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.listUserJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/list.json"})
        }
      """
    )
  
    // @LINE:24
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:28
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/create"})
        }
      """
    )
  
    // @LINE:19
    def dashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.dashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:20
    def dashboardListJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.dashboardListJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/list.json"})
        }
      """
    )
  
    // @LINE:29
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:32
    def postUserDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.postUserDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/create/post"})
        }
      """
    )
  
    // @LINE:18
    def listUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.listUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/list"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def postLoginData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.postLoginData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/post/login"})
        }
      """
    )
  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/logout"})
        }
      """
    )
  
    // @LINE:27
    def postResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.postResetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/resetPassword/post"})
        }
      """
    )
  
    // @LINE:25
    def resetPasswords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.resetPasswords",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0)) + "/resetPassword"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/login"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseMaintenanceItems(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:37
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:38
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/create"})
        }
      """
    )
  
    // @LINE:39
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:35
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/list"})
        }
      """
    )
  
    // @LINE:42
    def postMaintenanceItemsDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.postMaintenanceItemsDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/create/post"})
        }
      """
    )
  
    // @LINE:36
    def listMaintenanceItemsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.listMaintenanceItemsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/list.json"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseWorkOrderSamples(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:60
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:59
    def listWorkOrderSampleJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.listWorkOrderSampleJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/list.json"})
        }
      """
    )
  
    // @LINE:61
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/create"})
        }
      """
    )
  
    // @LINE:66
    def postWorkOrderSamplesDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.postWorkOrderSamplesDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/create/post"})
        }
      """
    )
  
    // @LINE:63
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:62
    def createWorkOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.createWorkOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/createWorkOrder"})
        }
      """
    )
  
    // @LINE:58
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/list"})
        }
      """
    )
  
  }

  // @LINE:69
  class ReverseTechnicians(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def listTechniciansJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.listTechniciansJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/list.json"})
        }
      """
    )
  
    // @LINE:74
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:71
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:72
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/create"})
        }
      """
    )
  
    // @LINE:73
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:69
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/list"})
        }
      """
    )
  
    // @LINE:76
    def postTechniciansDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.postTechniciansDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/create/post"})
        }
      """
    )
  
  }


}
