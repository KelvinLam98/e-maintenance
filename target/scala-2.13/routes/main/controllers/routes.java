// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWorkOrders WorkOrders = new controllers.ReverseWorkOrders(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsers Users = new controllers.ReverseUsers(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMaintenanceItems MaintenanceItems = new controllers.ReverseMaintenanceItems(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWorkOrderSamples WorkOrderSamples = new controllers.ReverseWorkOrderSamples(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTechnicians Technicians = new controllers.ReverseTechnicians(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWorkOrders WorkOrders = new controllers.javascript.ReverseWorkOrders(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsers Users = new controllers.javascript.ReverseUsers(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMaintenanceItems MaintenanceItems = new controllers.javascript.ReverseMaintenanceItems(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWorkOrderSamples WorkOrderSamples = new controllers.javascript.ReverseWorkOrderSamples(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTechnicians Technicians = new controllers.javascript.ReverseTechnicians(RoutesPrefix.byNamePrefix());
  }

}
