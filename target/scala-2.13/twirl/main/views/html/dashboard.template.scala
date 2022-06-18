
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
            "language": """),format.raw/*37.25*/("""{"""),format.raw/*37.26*/("""
              """),format.raw/*38.15*/(""""emptyTable": "No Work Order Today ! "
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/(""",
            columns: [
                """),format.raw/*41.17*/("""{"""),format.raw/*41.18*/(""" """),format.raw/*41.19*/("""data: 'item_name',
                    "render": function(data, type, full, meta)"""),format.raw/*42.63*/("""{"""),format.raw/*42.64*/("""
                        """),format.raw/*43.25*/("""return '<a href="dashboard/today/' + full.id + ' " class="link">' + data + '</a>';
                        """),format.raw/*44.25*/("""}"""),format.raw/*44.26*/("""
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/(""",
                """),format.raw/*46.17*/("""{"""),format.raw/*46.18*/(""" """),format.raw/*46.19*/("""data: 'user_name'"""),format.raw/*46.36*/("""}"""),format.raw/*46.37*/(""",
                """),format.raw/*47.17*/("""{"""),format.raw/*47.18*/(""" """),format.raw/*47.19*/("""data: 'technician_name'"""),format.raw/*47.42*/("""}"""),format.raw/*47.43*/(""",
                """),format.raw/*48.17*/("""{"""),format.raw/*48.18*/(""" """),format.raw/*48.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*49.63*/("""{"""),format.raw/*49.64*/("""
                            """),format.raw/*50.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/("""
                """),format.raw/*52.17*/("""}"""),format.raw/*52.18*/(""",
                """),format.raw/*53.17*/("""{"""),format.raw/*53.18*/(""" """),format.raw/*53.19*/("""data: 'status',
                    "render": function(data, type, full, meta)"""),format.raw/*54.63*/("""{"""),format.raw/*54.64*/("""
                        """),format.raw/*55.25*/("""if (data == "Completed")
                            return '<text style="color: green">' + data + '</text>';
                        else if (data != "In Progress")
                            return '<text style="color: red">' + data + '</text>';
                        else
                            return data;
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/("""
            """),format.raw/*63.13*/("""],
            responsive: true
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/(""");
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""");

    $(document).ready(function() """),format.raw/*68.34*/("""{"""),format.raw/*68.35*/("""
        """),format.raw/*69.9*/("""$('#dataTablesListTodo').DataTable("""),format.raw/*69.44*/("""{"""),format.raw/*69.45*/("""
            """),format.raw/*70.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/dashboard/todoList.json",
            "language": """),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
              """),format.raw/*74.15*/(""""emptyTable": "No In Coming Work Order, Please Check Your Work Order "
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/(""",
            columns: [
                """),format.raw/*77.17*/("""{"""),format.raw/*77.18*/(""" """),format.raw/*77.19*/("""data: 'item_name'"""),format.raw/*77.36*/("""}"""),format.raw/*77.37*/(""",
                """),format.raw/*78.17*/("""{"""),format.raw/*78.18*/(""" """),format.raw/*78.19*/("""data: 'user_name'"""),format.raw/*78.36*/("""}"""),format.raw/*78.37*/(""",
                """),format.raw/*79.17*/("""{"""),format.raw/*79.18*/(""" """),format.raw/*79.19*/("""data: 'technician_name'"""),format.raw/*79.42*/("""}"""),format.raw/*79.43*/(""",
                """),format.raw/*80.17*/("""{"""),format.raw/*80.18*/(""" """),format.raw/*80.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*81.63*/("""{"""),format.raw/*81.64*/("""
                            """),format.raw/*82.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/("""
                """),format.raw/*84.17*/("""}"""),format.raw/*84.18*/(""",
                """),format.raw/*85.17*/("""{"""),format.raw/*85.18*/(""" """),format.raw/*85.19*/("""data: 'status'"""),format.raw/*85.33*/("""}"""),format.raw/*85.34*/("""
            """),format.raw/*86.13*/("""],
            responsive: true
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/(""");
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/(""");
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
                  HASH: 4d6095761bf8e9aa003f7883f79eca3aae483009
                  MATRIX: 796->1|972->82|1002->87|1031->108|1070->110|1098->112|1168->155|1196->156|1232->166|1286->193|1314->194|1355->208|1506->331|1535->332|1579->348|1672->413|1701->414|1772->457|1801->458|1830->459|1940->541|1969->542|2023->568|2157->674|2186->675|2232->693|2261->694|2308->713|2337->714|2366->715|2411->732|2440->733|2487->752|2516->753|2545->754|2596->777|2625->778|2672->797|2701->798|2730->799|2847->888|2876->889|2934->919|3025->982|3054->983|3100->1001|3129->1002|3176->1021|3205->1022|3234->1023|3276->1037|3305->1038|3347->1052|3416->1094|3445->1095|3480->1103|3508->1104|3575->1143|3604->1144|3641->1154|3703->1188|3732->1189|3774->1203|3931->1332|3960->1333|4004->1349|4084->1401|4113->1402|4184->1445|4213->1446|4242->1447|4352->1529|4381->1530|4435->1556|4571->1664|4600->1665|4646->1683|4675->1684|4722->1703|4751->1704|4780->1705|4825->1722|4854->1723|4901->1742|4930->1743|4959->1744|5010->1767|5039->1768|5086->1787|5115->1788|5144->1789|5261->1878|5290->1879|5348->1909|5439->1972|5468->1973|5514->1991|5543->1992|5590->2011|5619->2012|5648->2013|5755->2092|5784->2093|5838->2119|6211->2464|6240->2465|6286->2483|6315->2484|6357->2498|6426->2540|6455->2541|6490->2549|6518->2550|6585->2589|6614->2590|6651->2600|6714->2635|6743->2636|6785->2650|6940->2777|6969->2778|7013->2794|7125->2878|7154->2879|7225->2922|7254->2923|7283->2924|7328->2941|7357->2942|7404->2961|7433->2962|7462->2963|7507->2980|7536->2981|7583->3000|7612->3001|7641->3002|7692->3025|7721->3026|7768->3045|7797->3046|7826->3047|7943->3136|7972->3137|8030->3167|8121->3230|8150->3231|8196->3249|8225->3250|8272->3269|8301->3270|8330->3271|8372->3285|8401->3286|8443->3300|8512->3342|8541->3343|8576->3351|8604->3352
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|37->10|37->10|38->11|39->12|39->12|41->14|41->14|41->14|42->15|42->15|43->16|44->17|44->17|45->18|45->18|46->19|46->19|46->19|46->19|46->19|47->20|47->20|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|50->23|51->24|51->24|52->25|52->25|53->26|53->26|53->26|53->26|53->26|54->27|56->29|56->29|57->30|57->30|59->32|59->32|60->33|60->33|60->33|61->34|64->37|64->37|65->38|66->39|66->39|68->41|68->41|68->41|69->42|69->42|70->43|71->44|71->44|72->45|72->45|73->46|73->46|73->46|73->46|73->46|74->47|74->47|74->47|74->47|74->47|75->48|75->48|75->48|76->49|76->49|77->50|78->51|78->51|79->52|79->52|80->53|80->53|80->53|81->54|81->54|82->55|88->61|88->61|89->62|89->62|90->63|92->65|92->65|93->66|93->66|95->68|95->68|96->69|96->69|96->69|97->70|100->73|100->73|101->74|102->75|102->75|104->77|104->77|104->77|104->77|104->77|105->78|105->78|105->78|105->78|105->78|106->79|106->79|106->79|106->79|106->79|107->80|107->80|107->80|108->81|108->81|109->82|110->83|110->83|111->84|111->84|112->85|112->85|112->85|112->85|112->85|113->86|115->88|115->88|116->89|116->89
                  -- GENERATED --
              */
          