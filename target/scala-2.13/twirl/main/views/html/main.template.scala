
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
                    <img src='"""),_display_(/*44.32*/routes/*44.38*/.Assets.versioned("img/logo2.png")),format.raw/*44.72*/("""' />
                </a>
            </div>
            <span class="navbar-brand"><h2 style="color: white">E-Maintenance</h2></span>
            <span class="logout-spn" >
                  <a href=""""),_display_(/*49.29*/routes/*49.35*/.HomeController.index()),format.raw/*49.58*/("""" style="color:#fff;">LOGOUT</a>
            </span>
        </div>
    </div>
    <!-- top navigator  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <a id="dashboard" href=# ><i class="fa fa-desktop "></i>Dashboard</a>
                </li>
                <li>
                    <a id="users" href=""""),_display_(/*61.42*/routes/*61.48*/.Users.listUser),format.raw/*61.63*/(""""><i class="fa fa-group"></i>Users</a>
                </li>
                <li>
                    <a id="maintenance" href=""""),_display_(/*64.48*/routes/*64.54*/.MaintenanceItems.list),format.raw/*64.76*/(""""><i class="fa fa-wrench"></i>Maintenance Items</a>
                </li>
                <li>
                    <a id="workOrders" href=""""),_display_(/*67.47*/routes/*67.53*/.WorkOrders.list),format.raw/*67.69*/(""""><i class="fa fa-briefcase"></i>Work Orders</a>
                </li>
            </ul>
        </div>

    </nav>
    <!-- Side Menu  -->
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-lg-12">
                    <h2>ADMIN DASHBOARD</h2>
                </div>
            </div>
            <!-- row  -->
            <hr />
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
                  HASH: ecd4bc3b736fc3a53cb638008ebb9664dea95ba4
                  MATRIX: 1047->266|1217->341|1247->345|1535->606|1550->612|1609->650|1708->722|1723->728|1785->769|1879->836|1894->842|1950->877|2039->939|2054->945|2116->986|2210->1053|2225->1059|2305->1118|2363->1149|2378->1155|2466->1222|2524->1253|2539->1259|2627->1326|2708->1380|2723->1386|2790->1432|2876->1491|2891->1497|2983->1568|3088->1646|3103->1652|3199->1727|3653->2154|3668->2160|3723->2194|3957->2401|3972->2407|4016->2430|4503->2890|4518->2896|4554->2911|4713->3043|4728->3049|4771->3071|4942->3215|4957->3221|4994->3237|5531->3747|5559->3754|5605->3772
                  LINES: 28->7|33->7|35->9|43->17|43->17|43->17|45->19|45->19|45->19|47->21|47->21|47->21|49->23|49->23|49->23|51->25|51->25|51->25|52->26|52->26|52->26|53->27|53->27|53->27|54->28|54->28|54->28|56->30|56->30|56->30|58->32|58->32|58->32|70->44|70->44|70->44|75->49|75->49|75->49|87->61|87->61|87->61|90->64|90->64|90->64|93->67|93->67|93->67|111->85|111->85|112->86
                  -- GENERATED --
              */
          