// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:65
package appcontrollers.javascript {

  // @LINE:65
  class ReverseUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def loginApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.loginApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
        }
      """
    )
  
  }

  // @LINE:66
  class ReverseWorkOrders(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def workOrderList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder"})
        }
      """
    )
  
  }


}
