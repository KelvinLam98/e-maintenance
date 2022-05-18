
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
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'username',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'name' """),format.raw/*16.32*/("""}"""),format.raw/*16.33*/(""",
                """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/(""" """),format.raw/*17.19*/("""data: 'ic_number' """),format.raw/*17.37*/("""}"""),format.raw/*17.38*/(""",
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/(""" """),format.raw/*18.19*/("""data: 'role' """),format.raw/*18.32*/("""}"""),format.raw/*18.33*/(""",
            ],
            responsive: true
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/(""");
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");
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
                  HASH: d09c7029e878c039e305b36923ad0ca54159e811
                  MATRIX: 731->1|827->3|857->8|886->29|925->31|957->37|1027->80|1055->81|1091->91|1145->118|1173->119|1214->133|1377->268|1406->269|1435->270|1544->351|1573->352|1627->378|1749->472|1778->473|1824->491|1853->492|1900->511|1929->512|1958->513|1999->526|2028->527|2075->546|2104->547|2133->548|2179->566|2208->567|2255->586|2284->587|2313->588|2354->601|2383->602|2467->659|2496->660|2531->668|2559->669
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|30->5|31->6|31->6|31->6|32->7|36->11|36->11|36->11|37->12|37->12|38->13|39->14|39->14|40->15|40->15|41->16|41->16|41->16|41->16|41->16|42->17|42->17|42->17|42->17|42->17|43->18|43->18|43->18|43->18|43->18|46->21|46->21|47->22|47->22
                  -- GENERATED --
              */
          