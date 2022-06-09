// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:58
package appcontrollers {

  // @LINE:58
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def loginApi: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
  }

  // @LINE:59
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def workOrderList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder")
    }
  
  }


}
