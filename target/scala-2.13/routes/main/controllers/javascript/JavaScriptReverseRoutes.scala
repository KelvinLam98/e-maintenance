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

  // @LINE:22
  class ReverseWorkOrders(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:22
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
  
    // @LINE:52
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/create"})
        }
      """
    )
  
    // @LINE:49
    def historyListWorkOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.historyListWorkOrderJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/history/list.json"})
        }
      """
    )
  
    // @LINE:56
    def postWorkOrdersDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.postWorkOrdersDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/create/post"})
        }
      """
    )
  
    // @LINE:53
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:47
    def historyList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.historyList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/history/list"})
        }
      """
    )
  
    // @LINE:23
    def updatePending: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.updatePending",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/pending/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:46
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrders.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrders/list"})
        }
      """
    )
  
    // @LINE:48
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

  
    // @LINE:31
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:24
    def listUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.listUserJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/list.json"})
        }
      """
    )
  
    // @LINE:25
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:29
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/create"})
        }
      """
    )
  
    // @LINE:21
    def dashboardListInProgressJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.dashboardListInProgressJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/inProgress.json"})
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
  
    // @LINE:30
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:33
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
  
    // @LINE:28
    def postResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.postResetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/detail/resetPassword/post"})
        }
      """
    )
  
    // @LINE:26
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

  // @LINE:36
  class ReverseMaintenanceItems(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:38
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/create"})
        }
      """
    )
  
    // @LINE:40
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:36
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/list"})
        }
      """
    )
  
    // @LINE:43
    def postMaintenanceItemsDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.postMaintenanceItemsDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/create/post"})
        }
      """
    )
  
    // @LINE:37
    def listMaintenanceItemsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MaintenanceItems.listMaintenanceItemsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenanceItems/list.json"})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseWorkOrderSamples(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:61
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:60
    def listWorkOrderSampleJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.listWorkOrderSampleJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/list.json"})
        }
      """
    )
  
    // @LINE:62
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/create"})
        }
      """
    )
  
    // @LINE:67
    def postWorkOrderSamplesDb: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.postWorkOrderSamplesDb",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/create/post"})
        }
      """
    )
  
    // @LINE:64
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:63
    def createWorkOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.createWorkOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/createWorkOrder"})
        }
      """
    )
  
    // @LINE:59
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkOrderSamples.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workOrderSamples/list"})
        }
      """
    )
  
  }

  // @LINE:70
  class ReverseTechnicians(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def listTechniciansJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.listTechniciansJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/list.json"})
        }
      """
    )
  
    // @LINE:75
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:72
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:73
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/create"})
        }
      """
    )
  
    // @LINE:74
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.update",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
    // @LINE:70
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Technicians.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technicians/list"})
        }
      """
    )
  
    // @LINE:77
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
