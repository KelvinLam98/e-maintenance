
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>E-Maintenance</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>



<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="adjust-nav">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <img src="assets/img/logo2.png" />
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
                    <a href=""""),_display_(/*47.31*/routes/*47.37*/.HomeController.index()),format.raw/*47.60*/("""" ><i class="fa fa-desktop "></i>Dashboard</a>
                </li>
                <li>
                    <a href=""""),_display_(/*50.31*/routes/*50.37*/.Users.listUser),format.raw/*50.52*/(""""><i class="fa fa-group"></i>Users</a>
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
                    """),_display_(/*74.22*/content),format.raw/*74.29*/("""
                """),format.raw/*75.17*/("""</div>
            </div>
            <!-- row  -->
            <div class="row text-center pad-top">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href=""""),_display_(/*81.35*/routes/*81.41*/.Users.listUser),format.raw/*81.56*/("""">
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

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: d242869c142b66bf102c471e0675c254735d3c0e
                  MATRIX: 992->266|1117->296|1147->300|2610->1736|2625->1742|2669->1765|2819->1888|2834->1894|2870->1909|3642->2654|3670->2661|3716->2679|3996->2932|4011->2938|4047->2953
                  LINES: 26->7|31->7|33->9|71->47|71->47|71->47|74->50|74->50|74->50|98->74|98->74|99->75|105->81|105->81|105->81
                  -- GENERATED --
              */
          