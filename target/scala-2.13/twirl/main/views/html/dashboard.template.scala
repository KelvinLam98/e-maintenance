
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

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""

"""),_display_(/*3.2*/main("E-Maintenance")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<script>
    $(document).ready(function() """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""
        """),format.raw/*6.9*/("""$('#dataTables').DataTable("""),format.raw/*6.36*/("""{"""),format.raw/*6.37*/("""
            """),format.raw/*7.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/dashboard/list.json",
            columns: [
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'item_name',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'user_name'"""),format.raw/*16.36*/("""}"""),format.raw/*16.37*/(""",
                """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/(""" """),format.raw/*17.19*/("""data: 'technician_name'"""),format.raw/*17.42*/("""}"""),format.raw/*17.43*/(""",
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/(""" """),format.raw/*18.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*19.63*/("""{"""),format.raw/*19.64*/("""
                            """),format.raw/*20.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*21.21*/("""}"""),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/(""",
                """),format.raw/*23.17*/("""{"""),format.raw/*23.18*/(""" """),format.raw/*23.19*/("""data: 'status'"""),format.raw/*23.33*/("""}"""),format.raw/*23.34*/("""
            """),format.raw/*24.13*/("""],
            responsive: true
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""");
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Admin Dashboard
    </h1>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
        <thead>
        <tr>
            <th width="20%">Maintenance Item</th>
            <th width="20%">Staff In Charge</th>
            <th width="20%">Technician</th>
            <th width="20%">Date</th>
            <th>Status</th>
        </tr>
        </thead>
    </table>
</div>

""")))}))
      }
    }
  }

  def render(flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply()(flash,messages,request)

  def f:(() => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = () => (flash,messages,request) => apply()(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/dashboard.scala.html
                  HASH: d048d28927ddcb02cd4eb81a5dbd9d6d2d481431
                  MATRIX: 796->1|972->82|1002->87|1031->108|1070->110|1098->112|1168->155|1196->156|1232->166|1286->193|1314->194|1355->208|1522->347|1551->348|1580->349|1690->431|1719->432|1773->458|1895->552|1924->553|1970->571|1999->572|2046->591|2075->592|2104->593|2149->610|2178->611|2225->630|2254->631|2283->632|2334->655|2363->656|2410->675|2439->676|2468->677|2585->766|2614->767|2672->797|2763->860|2792->861|2838->879|2867->880|2914->899|2943->900|2972->901|3014->915|3043->916|3085->930|3154->972|3183->973|3218->981|3246->982
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|47->20|48->21|48->21|49->22|49->22|50->23|50->23|50->23|50->23|50->23|51->24|53->26|53->26|54->27|54->27
                  -- GENERATED --
              */
          