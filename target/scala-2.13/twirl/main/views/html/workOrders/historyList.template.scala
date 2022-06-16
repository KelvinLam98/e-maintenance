
package views.html.workOrders

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

object historyList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Flash,Messages,models.RequestWithUser[_$1] forSome { 
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
            "ajax": "/workOrders/history/list.json",
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
                """),format.raw/*23.17*/("""{"""),format.raw/*23.18*/(""" """),format.raw/*23.19*/("""data: 'status',
                    "render": function(data, type, full, meta)"""),format.raw/*24.63*/("""{"""),format.raw/*24.64*/("""
                        """),format.raw/*25.25*/("""if (data != "Completed")
                            return '<text style="color: red">' + data + '</text>'
                        else
                            return data;
                    """),format.raw/*29.21*/("""}"""),format.raw/*29.22*/("""
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/("""
            """),format.raw/*31.13*/("""],
            responsive: true
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/(""");
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/(""");

      $(document).ready(function() """),format.raw/*36.36*/("""{"""),format.raw/*36.37*/("""
      """),format.raw/*37.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*39.16*/flash/*39.21*/.get("success")),format.raw/*39.36*/("""" == "successfullyDeleted")"""),format.raw/*39.63*/("""{"""),format.raw/*39.64*/("""
              """),format.raw/*40.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('User has been deleted.')
          """),format.raw/*42.11*/("""}"""),format.raw/*42.12*/("""
      """),format.raw/*43.7*/("""}"""),format.raw/*43.8*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Work Orders
        <a href=""""),_display_(/*49.19*/routes/*49.25*/.WorkOrders.list),format.raw/*49.41*/("""">
            <button type="button" class="btn btn-primary badge">
                Back
            </button>
        </a>
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
                  SOURCE: app/views/workOrders/historyList.scala.html
                  HASH: 2879abf793fddbcf204b9aeba9894089858b2544
                  MATRIX: 809->1|985->82|1015->87|1044->108|1083->110|1111->112|1181->155|1209->156|1245->166|1299->193|1327->194|1368->208|1544->356|1573->357|1602->358|1712->440|1741->441|1795->467|1917->561|1946->562|1992->580|2021->581|2068->600|2097->601|2126->602|2171->619|2200->620|2247->639|2276->640|2305->641|2356->664|2385->665|2432->684|2461->685|2490->686|2607->775|2636->776|2694->806|2785->869|2814->870|2860->888|2889->889|2936->908|2965->909|2994->910|3101->989|3130->990|3184->1016|3413->1217|3442->1218|3488->1236|3517->1237|3559->1251|3628->1293|3657->1294|3692->1302|3720->1303|3789->1344|3818->1345|3853->1353|3946->1419|3960->1424|3996->1439|4051->1466|4080->1467|4124->1483|4307->1638|4336->1639|4371->1647|4399->1648|4541->1763|4556->1769|4593->1785
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|47->20|48->21|48->21|49->22|49->22|50->23|50->23|50->23|51->24|51->24|52->25|56->29|56->29|57->30|57->30|58->31|60->33|60->33|61->34|61->34|63->36|63->36|64->37|66->39|66->39|66->39|66->39|66->39|67->40|69->42|69->42|70->43|70->43|76->49|76->49|76->49
                  -- GENERATED --
              */
          