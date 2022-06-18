
package views.html.maintenanceItems

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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[MaintenanceItem,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(maintenanceItem: MaintenanceItem)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.115*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<script>
    $(document).ready(function() """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""
        """),format.raw/*5.9*/("""$('#dataTables').DataTable("""),format.raw/*5.36*/("""{"""),format.raw/*5.37*/("""
            """),format.raw/*6.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/maintenanceItems/detail/"""),_display_(/*8.48*/maintenanceItem/*8.63*/.id),format.raw/*8.66*/("""/list.json",
            columns: [
                """),format.raw/*10.17*/("""{"""),format.raw/*10.18*/(""" """),format.raw/*10.19*/("""data: 'item_name'"""),format.raw/*10.36*/("""}"""),format.raw/*10.37*/(""",
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'user_name'"""),format.raw/*11.36*/("""}"""),format.raw/*11.37*/(""",
                """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""data: 'technician_name'"""),format.raw/*12.42*/("""}"""),format.raw/*12.43*/(""",
                """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*14.63*/("""{"""),format.raw/*14.64*/("""
                            """),format.raw/*15.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*16.21*/("""}"""),format.raw/*16.22*/("""
                """),format.raw/*17.17*/("""}"""),format.raw/*17.18*/(""",
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/(""" """),format.raw/*18.19*/("""data: 'status'"""),format.raw/*18.33*/("""}"""),format.raw/*18.34*/("""
            """),format.raw/*19.13*/("""],
            responsive: true
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/(""");
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");

    </script>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Maintenance Items</h1>
        <div id="msg">
            <label class="control-label"></label>
        </div>
    </div>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a id="update" href=""""),_display_(/*36.39*/routes/*36.45*/.MaintenanceItems.update(maintenanceItem.id.get)),format.raw/*36.93*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Update
                    </button>
                </a>
                <a id="delete" href=""""),_display_(/*41.39*/routes/*41.45*/.MaintenanceItems.delete(maintenanceItem.id.get)),format.raw/*41.93*/("""" onclick="return confirm('Are you sure you want to delete this item?');">
                    <button type="button" class="btn btn-danger badge" onclick="">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*46.37*/routes/*46.43*/.MaintenanceItems.list),format.raw/*46.65*/("""">
                    <button type="button" class="btn btn-primary badge" onclick="">
                        Back
                    </button>
                </a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                        <tr>
                            <th style="width:20%">Code</th>
                            <td>"""),_display_(/*58.34*/maintenanceItem/*58.49*/.item_code),format.raw/*58.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Name</th>
                            <td>"""),_display_(/*62.34*/maintenanceItem/*62.49*/.item_name),format.raw/*62.59*/("""</td>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>
        <hr>
        <h1 class="page-header">In Coming Work Order</h1>
        <div class="table-responsive">
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
    </div>
</div>
""")))}))
      }
    }
  }

  def render(maintenanceItem:MaintenanceItem,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(maintenanceItem)(flash,messages,request)

  def f:((MaintenanceItem) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (maintenanceItem) => (flash,messages,request) => apply(maintenanceItem)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/maintenanceItems/detail.scala.html
                  HASH: 1992ea0b9627faebbd2ecc46218bec58021408e9
                  MATRIX: 826->1|1035->114|1063->117|1092->138|1131->140|1159->142|1229->185|1257->186|1293->196|1347->223|1375->224|1416->238|1543->339|1566->354|1589->357|1671->411|1700->412|1729->413|1774->430|1803->431|1850->450|1879->451|1908->452|1953->469|1982->470|2029->489|2058->490|2087->491|2138->514|2167->515|2214->534|2243->535|2272->536|2389->625|2418->626|2476->656|2567->719|2596->720|2642->738|2671->739|2718->758|2747->759|2776->760|2818->774|2847->775|2889->789|2958->831|2987->832|3022->840|3050->841|3458->1222|3473->1228|3542->1276|3770->1477|3785->1483|3854->1531|4162->1812|4177->1818|4220->1840|4754->2347|4778->2362|4809->2372|4980->2516|5004->2531|5035->2541
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|32->5|32->5|33->6|35->8|35->8|35->8|37->10|37->10|37->10|37->10|37->10|38->11|38->11|38->11|38->11|38->11|39->12|39->12|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|42->15|43->16|43->16|44->17|44->17|45->18|45->18|45->18|45->18|45->18|46->19|48->21|48->21|49->22|49->22|63->36|63->36|63->36|68->41|68->41|68->41|73->46|73->46|73->46|85->58|85->58|85->58|89->62|89->62|89->62
                  -- GENERATED --
              */
          