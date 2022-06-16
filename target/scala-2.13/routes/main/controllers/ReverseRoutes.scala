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

  // @LINE:41
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:45
    def detail(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:45
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:47
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/create")
    }
  
    // @LINE:44
    def historyListWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list.json")
    }
  
    // @LINE:51
    def postWorkOrdersDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workOrders/create/post")
    }
  
    // @LINE:48
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:42
    def historyList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list")
    }
  
    // @LINE:41
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list")
    }
  
    // @LINE:43
    def listWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list.json")
    }
  
  }

  // @LINE:18
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:19
    def listUserJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/list.json")
    }
  
    // @LINE:20
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/create")
    }
  
    // @LINE:25
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:28
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
  
    // @LINE:23
    def postResetPassword: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/detail/resetPassword/post")
    }
  
    // @LINE:21
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

  // @LINE:31
  class ReverseMaintenanceItems(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:33
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/create")
    }
  
    // @LINE:35
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:31
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list")
    }
  
    // @LINE:38
    def postMaintenanceItemsDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "maintenanceItems/create/post")
    }
  
    // @LINE:32
    def listMaintenanceItemsJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list.json")
    }
  
  }

  // @LINE:54
  class ReverseWorkOrderSamples(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:56
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:55
    def listWorkOrderSampleJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/list.json")
    }
  
    // @LINE:57
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/create")
    }
  
    // @LINE:62
    def postWorkOrderSamplesDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workOrderSamples/create/post")
    }
  
    // @LINE:59
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:58
    def createWorkOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/createWorkOrder")
    }
  
    // @LINE:54
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/list")
    }
  
  }

  // @LINE:65
  class ReverseTechnicians(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def listTechniciansJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list.json")
    }
  
    // @LINE:70
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:67
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:68
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/create")
    }
  
    // @LINE:69
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:65
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list")
    }
  
    // @LINE:72
    def postTechniciansDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technicians/create/post")
    }
  
  }


}
