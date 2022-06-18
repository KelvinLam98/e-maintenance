// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:85
package appcontrollers.javascript {

  // @LINE:85
  class ReverseUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def postUpdateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.postUpdateProfile",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/profile/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:85
    def loginApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.loginApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
        }
      """
    )
  
    // @LINE:104
    def registerFirebaseToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.registerFirebaseToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/register-firebase-token"})
        }
      """
    )
  
    // @LINE:105
    def testSendPushNotification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.testSendPushNotification",
      """
        function(workOrderId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/test-notification/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("workOrderId", workOrderId0))})
        }
      """
    )
  
    // @LINE:86
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.profile",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/profile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:90
    def postUpdatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.Users.postUpdatePassword",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/profile/changePassword/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:93
  class ReverseWorkOrders(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:95
    def workOrderDetailByStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderDetailByStatus",
      """
        function(id0,status1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("status", status1))})
        }
      """
    )
  
    // @LINE:94
    def workOrderDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderDetail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:93
    def workOrderList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderList",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:101
    def postCreateWorkOrderWithSample: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.postCreateWorkOrderWithSample",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrderSample/detail/create/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:99
    def postUpdateWorkOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.postUpdateWorkOrder",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrder/detail/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:97
    def workOrderSampleDetailList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderSampleDetailList",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrderSample/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:96
    def workOrderSampleList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "appcontrollers.WorkOrders.workOrderSampleList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/workOrderSample"})
        }
      """
    )
  
  }


}
