
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.77*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>E-Maintenance</title>
    <!-- BOOTSTRAP STYLES-->
    <link href='"""),_display_(/*17.18*/routes/*17.24*/.Assets.versioned("css/bootstrap.css")),format.raw/*17.62*/("""' rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href='"""),_display_(/*19.18*/routes/*19.24*/.Assets.versioned("css/font-awesome.css")),format.raw/*19.65*/("""' rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href='"""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("css/custom.css")),format.raw/*21.59*/("""' rel="stylesheet" />
    <!-- jQuery -->
    <script src='"""),_display_(/*23.19*/routes/*23.25*/.Assets.versioned("jquery/jquery.min.js")),format.raw/*23.66*/("""'></script>
    <!-- DataTables JavaScript -->
    <script src='"""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("datatables/js/jquery.dataTables.min.js")),format.raw/*25.84*/("""'></script>
    <script src='"""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("datatables-plugins/dataTables.bootstrap.min.js")),format.raw/*26.92*/("""'></script>
    <script src='"""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("datatables-responsive/dataTables.responsive.js")),format.raw/*27.92*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*28.42*/routes/*28.48*/.Assets.versioned("javascripts/moment.min.js")),format.raw/*28.94*/("""'></script>
    <!-- DataTables CSS -->
    <link href='"""),_display_(/*30.18*/routes/*30.24*/.Assets.versioned("vendor/datatables-plugins/dataTables.bootstrap.css")),format.raw/*30.95*/("""' rel="stylesheet">
    <!-- DataTables Responsive CSS -->
    <link href='"""),_display_(/*32.18*/routes/*32.24*/.Assets.versioned("vendor/datatables-responsive/dataTables.responsive.css")),format.raw/*32.99*/("""' rel="stylesheet">
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <script>
    </script>

</head>
<body>
<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="adjust-nav">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <img src='"""),_display_(/*45.32*/routes/*45.38*/.Assets.versioned("img/logo2.png")),format.raw/*45.72*/("""' />
                </a>
            </div>
            <span class="navbar-brand"><h2 style="color: white">E-Maintenance</h2></span>
            <span class="logout-spn" >
                  <a href=""""),_display_(/*50.29*/routes/*50.35*/.HomeController.logout()),format.raw/*50.59*/("""" style="color:#fff;">LOGOUT</a>
            </span>
        </div>
    </div>
    <!-- top navigator  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <a id="dashboard" href=""""),_display_(/*59.46*/routes/*59.52*/.Users.dashboard),format.raw/*59.68*/(""""><i class="fa fa-dashboard"></i>Dashboard</a>
                </li>
                <li>
                    <a id="users" href=""""),_display_(/*62.42*/routes/*62.48*/.Users.listUser),format.raw/*62.63*/(""""><i class="fa fa-group"></i>Users</a>
                </li>
                <li>
                    <a id="maintenance" href=""""),_display_(/*65.48*/routes/*65.54*/.MaintenanceItems.list),format.raw/*65.76*/(""""><i class="fa fa-wrench"></i>Maintenance Items</a>
                </li>
                <li>
                    <a id="technicians" href=""""),_display_(/*68.48*/routes/*68.54*/.Technicians.list),format.raw/*68.71*/(""""><i class="fa fa-user"></i>Technicians</a>
                </li>
                <li>
                    <a id="work_orders" href=""""),_display_(/*71.48*/routes/*71.54*/.WorkOrders.list),format.raw/*71.70*/(""""><i class="fa fa-briefcase"></i>Work Orders</a>
                </li>
                <li>
                    <a id="work_order_samples" href=""""),_display_(/*74.55*/routes/*74.61*/.WorkOrderSamples.list),format.raw/*74.83*/(""""><i class="fa fa-suitcase"></i>Work Orders Sample</a>
                </li>
            </ul>
        </div>

    </nav>
    <!-- Side Menu  -->
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-lg-12">
                    """),_display_(/*85.22*/content),format.raw/*85.29*/("""
                """),format.raw/*86.17*/("""</div>
            </div>
            <!-- row  -->
        </div>
        <!-- PAGE INNER  -->
    </div>
    <!-- PAGE WRAPPER  -->
</div>
<div class="footer">
</div>
<!-- /. WRAPPER  -->
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(request)

  def f:((String) => (Html) => (models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (request) => apply(title)(content)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 81132e7788eccc7045dd406bccd9ee09d69e288b
                  MATRIX: 1047->266|1217->341|1247->345|1535->606|1550->612|1609->650|1708->722|1723->728|1785->769|1879->836|1894->842|1950->877|2039->939|2054->945|2116->986|2210->1053|2225->1059|2305->1118|2363->1149|2378->1155|2466->1222|2524->1253|2539->1259|2627->1326|2708->1380|2723->1386|2790->1432|2876->1491|2891->1497|2983->1568|3088->1646|3103->1652|3199->1727|3659->2160|3674->2166|3729->2200|3963->2407|3978->2413|4023->2437|4378->2765|4393->2771|4430->2787|4591->2921|4606->2927|4642->2942|4801->3074|4816->3080|4859->3102|5031->3247|5046->3253|5084->3270|5248->3407|5263->3413|5300->3429|5476->3578|5491->3584|5534->3606|5868->3913|5896->3920|5942->3938
                  LINES: 28->7|33->7|35->9|43->17|43->17|43->17|45->19|45->19|45->19|47->21|47->21|47->21|49->23|49->23|49->23|51->25|51->25|51->25|52->26|52->26|52->26|53->27|53->27|53->27|54->28|54->28|54->28|56->30|56->30|56->30|58->32|58->32|58->32|71->45|71->45|71->45|76->50|76->50|76->50|85->59|85->59|85->59|88->62|88->62|88->62|91->65|91->65|91->65|94->68|94->68|94->68|97->71|97->71|97->71|100->74|100->74|100->74|111->85|111->85|112->86
                  -- GENERATED --
              */
          