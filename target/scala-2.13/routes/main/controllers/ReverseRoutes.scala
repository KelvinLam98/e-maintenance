// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:21
    def detail(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:21
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "dashboard/pending/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:51
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/create")
    }
  
    // @LINE:48
    def historyListWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list.json")
    }
  
    // @LINE:55
    def postWorkOrdersDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workOrders/create/post")
    }
  
    // @LINE:52
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:46
    def historyList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list")
    }
  
    // @LINE:22
    def updatePending(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/pending/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:45
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list")
    }
  
    // @LINE:47
    def listWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list.json")
    }
  
  }

  // @LINE:18
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:23
    def listUserJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/list.json")
    }
  
    // @LINE:24
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:28
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/create")
    }
  
    // @LINE:19
    def dashboard: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:20
    def dashboardListJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/list.json")
    }
  
    // @LINE:29
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:32
    def postUserDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/create/post")
    }
  
    // @LINE:18
    def listUser: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/list")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def postLoginData: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/post/login")
    }
  
    // @LINE:15
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/logout")
    }
  
    // @LINE:27
    def postResetPassword: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/detail/resetPassword/post")
    }
  
    // @LINE:25
    def resetPasswords(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)) + "/resetPassword")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/login")
    }
  
  }

  // @LINE:35
  class ReverseMaintenanceItems(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:37
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:38
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/create")
    }
  
    // @LINE:39
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:35
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list")
    }
  
    // @LINE:42
    def postMaintenanceItemsDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "maintenanceItems/create/post")
    }
  
    // @LINE:36
    def listMaintenanceItemsJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list.json")
    }
  
  }

  // @LINE:58
  class ReverseWorkOrderSamples(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:60
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:59
    def listWorkOrderSampleJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/list.json")
    }
  
    // @LINE:61
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/create")
    }
  
    // @LINE:66
    def postWorkOrderSamplesDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workOrderSamples/create/post")
    }
  
    // @LINE:63
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:62
    def createWorkOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/createWorkOrder")
    }
  
    // @LINE:58
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/list")
    }
  
  }

  // @LINE:69
  class ReverseTechnicians(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def listTechniciansJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list.json")
    }
  
    // @LINE:74
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:71
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:72
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/create")
    }
  
    // @LINE:73
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:69
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list")
    }
  
    // @LINE:76
    def postTechniciansDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technicians/create/post")
    }
  
  }


}
