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

  // @LINE:23
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:23
    def detail(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:23
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "dashboard/pending/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:55
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/create")
    }
  
    // @LINE:52
    def historyListWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list.json")
    }
  
    // @LINE:59
    def postWorkOrdersDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workOrders/create/post")
    }
  
    // @LINE:56
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:50
    def historyList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list")
    }
  
    // @LINE:25
    def updatePending(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/pending/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:49
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list")
    }
  
    // @LINE:51
    def listWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list.json")
    }
  
  }

  // @LINE:18
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:26
    def listUserJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/list.json")
    }
  
    // @LINE:27
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/create")
    }
  
    // @LINE:21
    def dashboardListInProgressJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/inProgress.json")
    }
  
    // @LINE:19
    def dashboard: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:20
    def dashboardListJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/list.json")
    }
  
    // @LINE:32
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:35
    def postUserDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/create/post")
    }
  
    // @LINE:18
    def listUser: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/list")
    }
  
    // @LINE:22
    def dashboardListTodoJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard/todoList.json")
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
  
    // @LINE:30
    def postResetPassword: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/detail/resetPassword/post")
    }
  
    // @LINE:28
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

  // @LINE:38
  class ReverseMaintenanceItems(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:41
    def detailWorkOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/list.json")
    }
  
    // @LINE:40
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:42
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/create")
    }
  
    // @LINE:43
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:38
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list")
    }
  
    // @LINE:46
    def postMaintenanceItemsDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "maintenanceItems/create/post")
    }
  
    // @LINE:39
    def listMaintenanceItemsJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list.json")
    }
  
  }

  // @LINE:62
  class ReverseWorkOrderSamples(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:64
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:63
    def listWorkOrderSampleJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/list.json")
    }
  
    // @LINE:65
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/create")
    }
  
    // @LINE:70
    def postWorkOrderSamplesDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workOrderSamples/create/post")
    }
  
    // @LINE:67
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:66
    def createWorkOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/createWorkOrder")
    }
  
    // @LINE:62
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrderSamples/list")
    }
  
  }

  // @LINE:73
  class ReverseTechnicians(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def listTechniciansJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list.json")
    }
  
    // @LINE:78
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:75
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:76
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/create")
    }
  
    // @LINE:77
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:73
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list")
    }
  
    // @LINE:80
    def postTechniciansDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technicians/create/post")
    }
  
  }


}
