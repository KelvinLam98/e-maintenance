
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
            "ajax": "/dashboard/inProgress.json",
            columns: [
                """),format.raw/*38.17*/("""{"""),format.raw/*38.18*/(""" """),format.raw/*38.19*/("""data: 'item_name',
                    "render": function(data, type, full, meta)"""),format.raw/*39.63*/("""{"""),format.raw/*39.64*/("""
                        """),format.raw/*40.25*/("""return '<a href="dashboard/today/' + full.id + ' " class="link">' + data + '</a>';
                        """),format.raw/*41.25*/("""}"""),format.raw/*41.26*/("""
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/(""",
                """),format.raw/*43.17*/("""{"""),format.raw/*43.18*/(""" """),format.raw/*43.19*/("""data: 'user_name'"""),format.raw/*43.36*/("""}"""),format.raw/*43.37*/(""",
                """),format.raw/*44.17*/("""{"""),format.raw/*44.18*/(""" """),format.raw/*44.19*/("""data: 'technician_name'"""),format.raw/*44.42*/("""}"""),format.raw/*44.43*/(""",
                """),format.raw/*45.17*/("""{"""),format.raw/*45.18*/(""" """),format.raw/*45.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*46.63*/("""{"""),format.raw/*46.64*/("""
                            """),format.raw/*47.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/("""
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/(""",
                """),format.raw/*50.17*/("""{"""),format.raw/*50.18*/(""" """),format.raw/*50.19*/("""data: 'status',
                    "render": function(data, type, full, meta)"""),format.raw/*51.63*/("""{"""),format.raw/*51.64*/("""
                        """),format.raw/*52.25*/("""if (data == "Completed")
                            return '<text style="color: green">' + data + '</text>';
                        else if (data != "In Progress")
                            return '<text style="color: red">' + data + '</text>';
                        else
                            return data;
                    """),format.raw/*58.21*/("""}"""),format.raw/*58.22*/("""
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""
            """),format.raw/*60.13*/("""],
            responsive: true
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""");
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""");

    $(document).ready(function() """),format.raw/*65.34*/("""{"""),format.raw/*65.35*/("""
        """),format.raw/*66.9*/("""$('#dataTablesListTodo').DataTable("""),format.raw/*66.44*/("""{"""),format.raw/*66.45*/("""
            """),format.raw/*67.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/dashboard/todoList.json",
            columns: [
                """),format.raw/*71.17*/("""{"""),format.raw/*71.18*/(""" """),format.raw/*71.19*/("""data: 'item_name'"""),format.raw/*71.36*/("""}"""),format.raw/*71.37*/(""",
                """),format.raw/*72.17*/("""{"""),format.raw/*72.18*/(""" """),format.raw/*72.19*/("""data: 'user_name'"""),format.raw/*72.36*/("""}"""),format.raw/*72.37*/(""",
                """),format.raw/*73.17*/("""{"""),format.raw/*73.18*/(""" """),format.raw/*73.19*/("""data: 'technician_name'"""),format.raw/*73.42*/("""}"""),format.raw/*73.43*/(""",
                """),format.raw/*74.17*/("""{"""),format.raw/*74.18*/(""" """),format.raw/*74.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*75.63*/("""{"""),format.raw/*75.64*/("""
                            """),format.raw/*76.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/("""
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/(""",
                """),format.raw/*79.17*/("""{"""),format.raw/*79.18*/(""" """),format.raw/*79.19*/("""data: 'status'"""),format.raw/*79.33*/("""}"""),format.raw/*79.34*/("""
            """),format.raw/*80.13*/("""],
            responsive: true
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""");
    """),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""");
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
    <h3>Work Order For Today</h3>
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

    <hr>
    <h3>In Coming Work Order</h3>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTablesListTodo">
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
                  HASH: 946e1bc930eb2ff5ed76482ea41b1cc00354df6c
                  MATRIX: 796->1|972->82|1002->87|1031->108|1070->110|1098->112|1168->155|1196->156|1232->166|1286->193|1314->194|1355->208|1506->331|1535->332|1579->348|1672->413|1701->414|1772->457|1801->458|1830->459|1940->541|1969->542|2023->568|2157->674|2186->675|2232->693|2261->694|2308->713|2337->714|2366->715|2411->732|2440->733|2487->752|2516->753|2545->754|2596->777|2625->778|2672->797|2701->798|2730->799|2847->888|2876->889|2934->919|3025->982|3054->983|3100->1001|3129->1002|3176->1021|3205->1022|3234->1023|3276->1037|3305->1038|3347->1052|3416->1094|3445->1095|3480->1103|3508->1104|3575->1143|3604->1144|3641->1154|3703->1188|3732->1189|3774->1203|3947->1348|3976->1349|4005->1350|4115->1432|4144->1433|4198->1459|4334->1567|4363->1568|4409->1586|4438->1587|4485->1606|4514->1607|4543->1608|4588->1625|4617->1626|4664->1645|4693->1646|4722->1647|4773->1670|4802->1671|4849->1690|4878->1691|4907->1692|5024->1781|5053->1782|5111->1812|5202->1875|5231->1876|5277->1894|5306->1895|5353->1914|5382->1915|5411->1916|5518->1995|5547->1996|5601->2022|5974->2367|6003->2368|6049->2386|6078->2387|6120->2401|6189->2443|6218->2444|6253->2452|6281->2453|6348->2492|6377->2493|6414->2503|6477->2538|6506->2539|6548->2553|6719->2696|6748->2697|6777->2698|6822->2715|6851->2716|6898->2735|6927->2736|6956->2737|7001->2754|7030->2755|7077->2774|7106->2775|7135->2776|7186->2799|7215->2800|7262->2819|7291->2820|7320->2821|7437->2910|7466->2911|7524->2941|7615->3004|7644->3005|7690->3023|7719->3024|7766->3043|7795->3044|7824->3045|7866->3059|7895->3060|7937->3074|8006->3116|8035->3117|8070->3125|8098->3126
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|37->10|37->10|38->11|39->12|39->12|41->14|41->14|41->14|42->15|42->15|43->16|44->17|44->17|45->18|45->18|46->19|46->19|46->19|46->19|46->19|47->20|47->20|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|50->23|51->24|51->24|52->25|52->25|53->26|53->26|53->26|53->26|53->26|54->27|56->29|56->29|57->30|57->30|59->32|59->32|60->33|60->33|60->33|61->34|65->38|65->38|65->38|66->39|66->39|67->40|68->41|68->41|69->42|69->42|70->43|70->43|70->43|70->43|70->43|71->44|71->44|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|74->47|75->48|75->48|76->49|76->49|77->50|77->50|77->50|78->51|78->51|79->52|85->58|85->58|86->59|86->59|87->60|89->62|89->62|90->63|90->63|92->65|92->65|93->66|93->66|93->66|94->67|98->71|98->71|98->71|98->71|98->71|99->72|99->72|99->72|99->72|99->72|100->73|100->73|100->73|100->73|100->73|101->74|101->74|101->74|102->75|102->75|103->76|104->77|104->77|105->78|105->78|106->79|106->79|106->79|106->79|106->79|107->80|109->82|109->82|110->83|110->83
                  -- GENERATED --
              */
          