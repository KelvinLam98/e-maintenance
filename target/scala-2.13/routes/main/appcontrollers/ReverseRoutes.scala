// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:65
package appcontrollers {

  // @LINE:65
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def loginApi: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
  }

  // @LINE:66
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def workOrderList(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:67
    def workOrderListHistory: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrderHistory")
    }
  
  }


}
