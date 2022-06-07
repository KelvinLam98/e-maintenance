// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package appcontrollers;

import router.RoutesPrefix;

public class routes {
  
  public static final appcontrollers.ReverseUsers Users = new appcontrollers.ReverseUsers(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final appcontrollers.javascript.ReverseUsers Users = new appcontrollers.javascript.ReverseUsers(RoutesPrefix.byNamePrefix());
  }

}
