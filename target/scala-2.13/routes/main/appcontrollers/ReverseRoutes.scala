// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:79
package appcontrollers {

  // @LINE:79
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def postUpdateProfile(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/profile/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:79
    def loginApi: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
    // @LINE:95
    def registerFirebaseToken: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/register-firebase-token")
    }
  
    // @LINE:96
    def testSendPushNotification(workOrderId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/test-notification/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("workOrderId", workOrderId)))
    }
  
    // @LINE:80
    def profile(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/profile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:84
    def postUpdatePassword(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/profile/changePassword/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:87
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:87
    def workOrderList(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:88
    def workOrderListHistory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrderHistory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:89
    def workOrderDetail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:91
    def postUpdateWorkOrder(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/workOrder/detail/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}
