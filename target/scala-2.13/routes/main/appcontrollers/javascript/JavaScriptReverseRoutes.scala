// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:66
package appcontrollers.javascript {

  // @LINE:66
  class ReverseUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def postUpdateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.postUpdateProfile",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/profile/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:66
    def loginApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.loginApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
        }
      """
    )
  
    // @LINE:82
    def registerFirebaseToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.registerFirebaseToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/register-firebase-token"})
        }
      """
    )
  
    // @LINE:67
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.profile",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/profile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:71
    def postUpdatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.postUpdatePassword",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/profile/changePassword/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:74
  class ReverseWorkOrders(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def workOrderList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderList",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:75
    def workOrderListHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderListHistory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrderHistory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:76
    def workOrderDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderDetail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:78
    def postUpdateWorkOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.postUpdateWorkOrder",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder/detail/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
