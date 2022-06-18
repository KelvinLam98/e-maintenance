// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:85
package appcontrollers {

  // @LINE:85
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def postUpdateProfile(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/profile/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:85
    def loginApi: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
    // @LINE:104
    def registerFirebaseToken: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/register-firebase-token")
    }
  
    // @LINE:105
    def testSendPushNotification(workOrderId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/test-notification/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("workOrderId", workOrderId)))
    }
  
    // @LINE:86
    def profile(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/profile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:90
    def postUpdatePassword(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/profile/changePassword/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:93
  class ReverseWorkOrders(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:95
    def workOrderDetailByStatus(id:Long, status:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("status", status)))
    }
  
    // @LINE:94
    def workOrderDetail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:93
    def workOrderList(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:101
    def postCreateWorkOrderWithSample(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/workOrderSample/detail/create/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:99
    def postUpdateWorkOrder(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/workOrder/detail/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:97
    def workOrderSampleDetailList(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrderSample/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:96
    def workOrderSampleList: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/workOrderSample")
    }
  
  }


}
