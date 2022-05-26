
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

object listUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""

"""),_display_(/*3.2*/main("E-Maintenance")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<script>
    $(document).ready(function() """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""
        """),format.raw/*6.9*/("""$('#dataTables').DataTable("""),format.raw/*6.36*/("""{"""),format.raw/*6.37*/("""
            """),format.raw/*7.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/user/list.json",
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

        <div class="col-lg-12">
            <h1 class="page-header">
                Users
                <a href=""""),_display_(/*28.27*/routes/*28.33*/.Users.create),format.raw/*28.46*/("""">
                    <button type="button" class="btn btn-primary">
                    Create
                    </button>
                </a>
            </h1>
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

""")))}))
      }
    }
  }

  def render(request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/users/listUser.scala.html
                  HASH: 3bcd03d10a6e7cb126691fc4208204d4e746e621
                  MATRIX: 786->1|928->48|958->53|987->74|1026->76|1058->82|1128->125|1156->126|1192->136|1246->163|1274->164|1315->178|1477->312|1506->313|1535->314|1644->395|1673->396|1727->422|1849->516|1878->517|1924->535|1953->536|2000->555|2029->556|2058->557|2099->570|2128->571|2175->590|2204->591|2233->592|2279->610|2308->611|2355->630|2384->631|2413->632|2454->645|2483->646|2567->703|2596->704|2631->712|2659->713|2827->854|2842->860|2876->873
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|45->18|45->18|45->18|45->18|45->18|48->21|48->21|49->22|49->22|55->28|55->28|55->28
                  -- GENERATED --
              */
          