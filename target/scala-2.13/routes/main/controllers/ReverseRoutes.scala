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

  // @LINE:40
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:44
    def detail(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:44
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:46
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/create")
    }
  
    // @LINE:43
    def historyListWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list.json")
    }
  
    // @LINE:50
    def postWorkOrdersDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workOrders/create/post")
    }
  
    // @LINE:47
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:41
    def historyList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/history/list")
    }
  
    // @LINE:40
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list")
    }
  
    // @LINE:42
    def listWorkOrderJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workOrders/list.json")
    }
  
  }

  // @LINE:17
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:18
    def listUserJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/list.json")
    }
  
    // @LINE:19
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:23
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/create")
    }
  
    // @LINE:24
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:27
    def postUserDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/create/post")
    }
  
    // @LINE:17
    def listUser: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/list")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def postLoginData: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/post/login")
    }
  
    // @LINE:14
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/logout")
    }
  
    // @LINE:22
    def postResetPassword: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/detail/resetPassword/post")
    }
  
    // @LINE:20
    def resetPasswords(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/resetPassword")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/login")
    }
  
  }

  // @LINE:30
  class ReverseMaintenanceItems(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:32
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:33
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/create")
    }
  
    // @LINE:34
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:30
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list")
    }
  
    // @LINE:37
    def postMaintenanceItemsDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "maintenanceItems/create/post")
    }
  
    // @LINE:31
    def listMaintenanceItemsJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "maintenanceItems/list.json")
    }
  
  }

  // @LINE:53
  class ReverseTechnicians(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def listTechniciansJson: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list.json")
    }
  
    // @LINE:58
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:55
    def detail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:56
    def create: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/create")
    }
  
    // @LINE:57
    def update(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/update")
    }
  
    // @LINE:53
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technicians/list")
    }
  
    // @LINE:60
    def postTechniciansDb: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technicians/create/post")
    }
  
  }


}
