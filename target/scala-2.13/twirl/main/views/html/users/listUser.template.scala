
package views.html.users

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

object listUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("E-Maintenance")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<script>
    $(document).ready(function() """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""
        """),format.raw/*6.9*/("""$('#dataTables').DataTable("""),format.raw/*6.36*/("""{"""),format.raw/*6.37*/("""
            """),format.raw/*7.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/users/list.json",
            columns: [
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'username'"""),format.raw/*11.35*/("""}"""),format.raw/*11.36*/(""",
                """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""data: 'name' """),format.raw/*12.32*/("""}"""),format.raw/*12.33*/(""",
                """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""data: 'ic_number' """),format.raw/*13.37*/("""}"""),format.raw/*13.38*/(""",
                """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""data: 'role' """),format.raw/*14.32*/("""}"""),format.raw/*14.33*/(""",
            ],
            responsive: true
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/(""");
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/(""");
    </script>

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">
                Users
                <a href=#><button type="button" class="btn btn-primary">
                    Create
                </button></a>
            </h1>
        <p>This is a list page. </p>
        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
            <thead>
            <tr>
                <th>Username</th>
                <th>Name</th>
                <th>IC</th>
                <th>Role</th>
            </tr>
            </thead>
        </table>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/users/listUser.scala.html
                  HASH: acf45afd8f9a1d3efdca2b009d7c6073804eb1af
                  MATRIX: 731->1|827->3|857->8|886->29|925->31|957->37|1027->80|1055->81|1091->91|1145->118|1173->119|1214->133|1377->268|1406->269|1435->270|1479->286|1508->287|1555->306|1584->307|1613->308|1654->321|1683->322|1730->341|1759->342|1788->343|1834->361|1863->362|1910->381|1939->382|1968->383|2009->396|2038->397|2122->454|2151->455|2186->463|2214->464
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|30->5|31->6|31->6|31->6|32->7|36->11|36->11|36->11|36->11|36->11|37->12|37->12|37->12|37->12|37->12|38->13|38->13|38->13|38->13|38->13|39->14|39->14|39->14|39->14|39->14|42->17|42->17|43->18|43->18
                  -- GENERATED --
              */
          