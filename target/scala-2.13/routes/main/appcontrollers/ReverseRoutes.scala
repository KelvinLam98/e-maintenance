// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:77
package appcontrollers {

  // @LINE:77
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def postUpdateProfile(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/profile/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:77
    def loginApi: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
    // @LINE:93
    def registerFirebaseToken: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/register-firebase-token")
    }
  
    // @LINE:94
    def testSendPushNotification(workOrderId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/test-notification/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("workOrderId", workOrderId)))
    }
  
    // @LINE:78
    def profile(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/profile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:82
    def postUpdatePassword(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/profile/changePassword/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:85
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
    def workOrderList(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:86
    def workOrderListHistory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrderHistory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:87
    def workOrderDetail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:89
    def postUpdateWorkOrder(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/workOrder/detail/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}
