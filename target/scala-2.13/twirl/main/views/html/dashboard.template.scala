
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
                    """),format.raw/*16.21*/("""if (data )
                        return '<a href="dashboard/pending/' + full.id + ' " class="link">' + data + '</a>';
                    """),format.raw/*18.21*/("""}"""),format.raw/*18.22*/("""
                """),format.raw/*19.17*/("""}"""),format.raw/*19.18*/(""",
                """),format.raw/*20.17*/("""{"""),format.raw/*20.18*/(""" """),format.raw/*20.19*/("""data: 'user_name'"""),format.raw/*20.36*/("""}"""),format.raw/*20.37*/(""",
                """),format.raw/*21.17*/("""{"""),format.raw/*21.18*/(""" """),format.raw/*21.19*/("""data: 'technician_name'"""),format.raw/*21.42*/("""}"""),format.raw/*21.43*/(""",
                """),format.raw/*22.17*/("""{"""),format.raw/*22.18*/(""" """),format.raw/*22.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*23.63*/("""{"""),format.raw/*23.64*/("""
                            """),format.raw/*24.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*25.21*/("""}"""),format.raw/*25.22*/("""
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/(""",
                """),format.raw/*27.17*/("""{"""),format.raw/*27.18*/(""" """),format.raw/*27.19*/("""data: 'status'"""),format.raw/*27.33*/("""}"""),format.raw/*27.34*/("""
            """),format.raw/*28.13*/("""],
            responsive: true
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""");
    """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/(""");

    $(document).ready(function() """),format.raw/*33.34*/("""{"""),format.raw/*33.35*/("""
        """),format.raw/*34.9*/("""$('#dataTablesListAll').DataTable("""),format.raw/*34.43*/("""{"""),format.raw/*34.44*/("""
            """),format.raw/*35.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/dashboard/inProgress.json",
            columns: [
                """),format.raw/*39.17*/("""{"""),format.raw/*39.18*/(""" """),format.raw/*39.19*/("""data: 'item_name'"""),format.raw/*39.36*/("""}"""),format.raw/*39.37*/(""",
                """),format.raw/*40.17*/("""{"""),format.raw/*40.18*/(""" """),format.raw/*40.19*/("""data: 'user_name'"""),format.raw/*40.36*/("""}"""),format.raw/*40.37*/(""",
                """),format.raw/*41.17*/("""{"""),format.raw/*41.18*/(""" """),format.raw/*41.19*/("""data: 'technician_name'"""),format.raw/*41.42*/("""}"""),format.raw/*41.43*/(""",
                """),format.raw/*42.17*/("""{"""),format.raw/*42.18*/(""" """),format.raw/*42.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*43.63*/("""{"""),format.raw/*43.64*/("""
                            """),format.raw/*44.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*45.21*/("""}"""),format.raw/*45.22*/("""
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/(""",
                """),format.raw/*47.17*/("""{"""),format.raw/*47.18*/(""" """),format.raw/*47.19*/("""data: 'status'"""),format.raw/*47.33*/("""}"""),format.raw/*47.34*/("""
            """),format.raw/*48.13*/("""],
            responsive: true
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""");
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/(""");
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
    <h3>In Progress Work Order</h3>
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
                  HASH: 32f3544744e24e67795d3a68f6982c8746f7dedb
                  MATRIX: 796->1|972->82|1002->87|1031->108|1070->110|1098->112|1168->155|1196->156|1232->166|1286->193|1314->194|1355->208|1506->331|1535->332|1579->348|1672->413|1701->414|1772->457|1801->458|1830->459|1940->541|1969->542|2019->564|2189->706|2218->707|2264->725|2293->726|2340->745|2369->746|2398->747|2443->764|2472->765|2519->784|2548->785|2577->786|2628->809|2657->810|2704->829|2733->830|2762->831|2879->920|2908->921|2966->951|3057->1014|3086->1015|3132->1033|3161->1034|3208->1053|3237->1054|3266->1055|3308->1069|3337->1070|3379->1084|3448->1126|3477->1127|3512->1135|3540->1136|3607->1175|3636->1176|3673->1186|3735->1220|3764->1221|3806->1235|3979->1380|4008->1381|4037->1382|4082->1399|4111->1400|4158->1419|4187->1420|4216->1421|4261->1438|4290->1439|4337->1458|4366->1459|4395->1460|4446->1483|4475->1484|4522->1503|4551->1504|4580->1505|4697->1594|4726->1595|4784->1625|4875->1688|4904->1689|4950->1707|4979->1708|5026->1727|5055->1728|5084->1729|5126->1743|5155->1744|5197->1758|5266->1800|5295->1801|5330->1809|5358->1810
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|37->10|37->10|38->11|39->12|39->12|41->14|41->14|41->14|42->15|42->15|43->16|45->18|45->18|46->19|46->19|47->20|47->20|47->20|47->20|47->20|48->21|48->21|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|51->24|52->25|52->25|53->26|53->26|54->27|54->27|54->27|54->27|54->27|55->28|57->30|57->30|58->31|58->31|60->33|60->33|61->34|61->34|61->34|62->35|66->39|66->39|66->39|66->39|66->39|67->40|67->40|67->40|67->40|67->40|68->41|68->41|68->41|68->41|68->41|69->42|69->42|69->42|70->43|70->43|71->44|72->45|72->45|73->46|73->46|74->47|74->47|74->47|74->47|74->47|75->48|77->50|77->50|78->51|78->51
                  -- GENERATED --
              */
          