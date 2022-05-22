
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
    <link href='"""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("css/bootstrap.css")),format.raw/*16.62*/("""' rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href='"""),_display_(/*18.18*/routes/*18.24*/.Assets.versioned("css/font-awesome.css")),format.raw/*18.65*/("""' rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href='"""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("css/custom.css")),format.raw/*20.59*/("""' rel="stylesheet" />
    <!-- jQuery -->
    <script src='"""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("jquery/jquery.min.js")),format.raw/*22.66*/("""'></script>
    <!-- DataTables JavaScript -->
    <script src='"""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("datatables/js/jquery.dataTables.min.js")),format.raw/*24.84*/("""'></script>
    <script src='"""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("datatables-plugins/dataTables.bootstrap.min.js")),format.raw/*25.92*/("""'></script>
    <script src='"""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("datatables-responsive/dataTables.responsive.js")),format.raw/*26.92*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*27.42*/routes/*27.48*/.Assets.versioned("javascripts/moment.min.js")),format.raw/*27.94*/("""'></script>
    <!-- DataTables CSS -->
    <link href='"""),_display_(/*29.18*/routes/*29.24*/.Assets.versioned("vendor/datatables-plugins/dataTables.bootstrap.css")),format.raw/*29.95*/("""' rel="stylesheet">
    <!-- DataTables Responsive CSS -->
    <link href='"""),_display_(/*31.18*/routes/*31.24*/.Assets.versioned("vendor/datatables-responsive/dataTables.responsive.css")),format.raw/*31.99*/("""' rel="stylesheet">
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
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
                  <a href="#" style="color:#fff;">LOGOUT</a>
            </span>
        </div>
    </div>
    <!-- top navigator  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li class="active-link">
                    <a href=""""),_display_(/*58.31*/routes/*58.37*/.HomeController.index()),format.raw/*58.60*/("""" ><i class="fa fa-desktop "></i>Dashboard</a>
                </li>
                <li>
                    <a href=""""),_display_(/*61.31*/routes/*61.37*/.Users.listUser),format.raw/*61.52*/(""""><i class="fa fa-group"></i>Users</a>
                </li>
                <li>
                    <a href=#><i class="fa fa-wrench"></i>Maintenance</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-briefcase"></i>Work Orders</a>
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
            <div class="row text-center pad-top">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href=""""),_display_(/*92.35*/routes/*92.41*/.Users.listUser),format.raw/*92.56*/("""">
                            <i class="fa fa-group fa-5x"></i>
                            <h4>Check Users</h4>
                        </a>
                    </div>
                </div>

                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href=# >
                            <i class="fa fa-wrench fa-5x"></i>
                            <h4>Maintenance</h4>
                        </a>
                    </div>
                </div>

                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href=# >
                            <i class="fa fa-briefcase fa-5x"></i>
                            <h4>Work Orders</h4>
                        </a>
                    </div>
                </div>
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
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="assets/js/custom.js"></script>
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
                  HASH: ff86bf3689c3f5dded3b21e28e58922ef0219aef
                  MATRIX: 1047->266|1217->341|1247->345|1533->604|1548->610|1607->648|1706->720|1721->726|1783->767|1877->834|1892->840|1948->875|2037->937|2052->943|2114->984|2208->1051|2223->1057|2303->1116|2361->1147|2376->1153|2464->1220|2522->1251|2537->1257|2625->1324|2706->1378|2721->1384|2788->1430|2874->1489|2889->1495|2981->1566|3086->1644|3101->1650|3197->1725|3632->2133|3647->2139|3702->2173|4269->2713|4284->2719|4328->2742|4478->2865|4493->2871|4529->2886|5301->3631|5329->3638|5375->3656|5655->3909|5670->3915|5706->3930
                  LINES: 28->7|33->7|35->9|42->16|42->16|42->16|44->18|44->18|44->18|46->20|46->20|46->20|48->22|48->22|48->22|50->24|50->24|50->24|51->25|51->25|51->25|52->26|52->26|52->26|53->27|53->27|53->27|55->29|55->29|55->29|57->31|57->31|57->31|70->44|70->44|70->44|84->58|84->58|84->58|87->61|87->61|87->61|111->85|111->85|112->86|118->92|118->92|118->92
                  -- GENERATED --
              */
          