
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
            "language": """),format.raw/*10.25*/("""{"""),format.raw/*10.26*/("""
              """),format.raw/*11.15*/(""""emptyTable": "All Pending Work Orders are Done ! "
            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/(""",
            columns: [
                """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""data: 'item_name',
                    "render": function(data, type, full, meta)"""),format.raw/*15.63*/("""{"""),format.raw/*15.64*/("""
                        """),format.raw/*16.25*/("""return '<a href="dashboard/pending/' + full.id + ' " class="link">' + data + '</a>';
                    """),format.raw/*17.21*/("""}"""),format.raw/*17.22*/("""
                """),format.raw/*18.17*/("""}"""),format.raw/*18.18*/(""",
                """),format.raw/*19.17*/("""{"""),format.raw/*19.18*/(""" """),format.raw/*19.19*/("""data: 'user_name'"""),format.raw/*19.36*/("""}"""),format.raw/*19.37*/(""",
                """),format.raw/*20.17*/("""{"""),format.raw/*20.18*/(""" """),format.raw/*20.19*/("""data: 'technician_name'"""),format.raw/*20.42*/("""}"""),format.raw/*20.43*/(""",
                """),format.raw/*21.17*/("""{"""),format.raw/*21.18*/(""" """),format.raw/*21.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*22.63*/("""{"""),format.raw/*22.64*/("""
                            """),format.raw/*23.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*24.21*/("""}"""),format.raw/*24.22*/("""
                """),format.raw/*25.17*/("""}"""),format.raw/*25.18*/(""",
                """),format.raw/*26.17*/("""{"""),format.raw/*26.18*/(""" """),format.raw/*26.19*/("""data: 'status'"""),format.raw/*26.33*/("""}"""),format.raw/*26.34*/("""
            """),format.raw/*27.13*/("""],
            responsive: true
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""");
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/(""");

    $(document).ready(function() """),format.raw/*32.34*/("""{"""),format.raw/*32.35*/("""
        """),format.raw/*33.9*/("""$('#dataTablesListAll').DataTable("""),format.raw/*33.43*/("""{"""),format.raw/*33.44*/("""
            """),format.raw/*34.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/dashboard/listAll.json",
            columns: [
                """),format.raw/*38.17*/("""{"""),format.raw/*38.18*/(""" """),format.raw/*38.19*/("""data: 'item_name'"""),format.raw/*38.36*/("""}"""),format.raw/*38.37*/(""",
                """),format.raw/*39.17*/("""{"""),format.raw/*39.18*/(""" """),format.raw/*39.19*/("""data: 'user_name'"""),format.raw/*39.36*/("""}"""),format.raw/*39.37*/(""",
                """),format.raw/*40.17*/("""{"""),format.raw/*40.18*/(""" """),format.raw/*40.19*/("""data: 'technician_name'"""),format.raw/*40.42*/("""}"""),format.raw/*40.43*/(""",
                """),format.raw/*41.17*/("""{"""),format.raw/*41.18*/(""" """),format.raw/*41.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*42.63*/("""{"""),format.raw/*42.64*/("""
                            """),format.raw/*43.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*44.21*/("""}"""),format.raw/*44.22*/("""
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/(""",
                """),format.raw/*46.17*/("""{"""),format.raw/*46.18*/(""" """),format.raw/*46.19*/("""data: 'status'"""),format.raw/*46.33*/("""}"""),format.raw/*46.34*/("""
            """),format.raw/*47.13*/("""],
            responsive: true
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Admin Dashboard
    </h1>
    <h3>Pending Work Order</h3>
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
    <hr>
    <h3>On Going Work Order</h3>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTablesListAll">
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
                  HASH: ef4ed9c4b5859fd07c15fdc0d8fd1d7a1504d38a
                  MATRIX: 796->1|972->82|1002->87|1031->108|1070->110|1098->112|1168->155|1196->156|1232->166|1286->193|1314->194|1355->208|1506->331|1535->332|1579->348|1672->413|1701->414|1772->457|1801->458|1830->459|1940->541|1969->542|2023->568|2157->674|2186->675|2232->693|2261->694|2308->713|2337->714|2366->715|2411->732|2440->733|2487->752|2516->753|2545->754|2596->777|2625->778|2672->797|2701->798|2730->799|2847->888|2876->889|2934->919|3025->982|3054->983|3100->1001|3129->1002|3176->1021|3205->1022|3234->1023|3276->1037|3305->1038|3347->1052|3416->1094|3445->1095|3480->1103|3508->1104|3575->1143|3604->1144|3641->1154|3703->1188|3732->1189|3774->1203|3944->1345|3973->1346|4002->1347|4047->1364|4076->1365|4123->1384|4152->1385|4181->1386|4226->1403|4255->1404|4302->1423|4331->1424|4360->1425|4411->1448|4440->1449|4487->1468|4516->1469|4545->1470|4662->1559|4691->1560|4749->1590|4840->1653|4869->1654|4915->1672|4944->1673|4991->1692|5020->1693|5049->1694|5091->1708|5120->1709|5162->1723|5231->1765|5260->1766|5295->1774|5323->1775
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|37->10|37->10|38->11|39->12|39->12|41->14|41->14|41->14|42->15|42->15|43->16|44->17|44->17|45->18|45->18|46->19|46->19|46->19|46->19|46->19|47->20|47->20|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|50->23|51->24|51->24|52->25|52->25|53->26|53->26|53->26|53->26|53->26|54->27|56->29|56->29|57->30|57->30|59->32|59->32|60->33|60->33|60->33|61->34|65->38|65->38|65->38|65->38|65->38|66->39|66->39|66->39|66->39|66->39|67->40|67->40|67->40|67->40|67->40|68->41|68->41|68->41|69->42|69->42|70->43|71->44|71->44|72->45|72->45|73->46|73->46|73->46|73->46|73->46|74->47|76->49|76->49|77->50|77->50
                  -- GENERATED --
              */
          