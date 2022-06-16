
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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[WorkOrderView,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrder: WorkOrderView)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.107*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Work Orders</h1>
        <div id="msg">
            <label class="control-label"></label>
        </div>
    </div>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                """),_display_(/*13.18*/if(workOrder.status == "Pending")/*13.51*/{_display_(Seq[Any](format.raw/*13.52*/("""
                """),format.raw/*14.17*/("""<a id="updatePending" href=""""),_display_(/*14.46*/routes/*14.52*/.WorkOrders.updatePending(workOrder.id.get)),format.raw/*14.95*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Set Status
                    </button>
                </a>
                <a id="reject" href=""""),_display_(/*19.39*/routes/*19.45*/.WorkOrders.delete(workOrder.id.get)),format.raw/*19.81*/("""">
                    <button type="button" class="btn btn-danger badge" onclick="return confirm('Are you sure you want to reject and delete this item?');">
                        Reject
                    </button>
                </a>
                <a id="backToDashboard" href=""""),_display_(/*24.48*/routes/*24.54*/.Users.dashboard),format.raw/*24.70*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Back
                    </button>
                </a>
                """)))}/*29.19*/else/*29.24*/{_display_(Seq[Any](format.raw/*29.25*/("""
                """),format.raw/*30.17*/("""<a id="update" href=""""),_display_(/*30.39*/routes/*30.45*/.WorkOrders.update(workOrder.id.get)),format.raw/*30.81*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Update
                    </button>
                </a>
                <a id="delete" href=""""),_display_(/*35.39*/routes/*35.45*/.WorkOrders.delete(workOrder.id.get)),format.raw/*35.81*/("""">
                    <button type="button" class="btn btn-danger badge" onclick="return confirm('Are you sure you want to delete this item?');">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*40.37*/routes/*40.43*/.WorkOrders.list),format.raw/*40.59*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Back
                    </button>
                </a>
                """)))}),format.raw/*45.18*/("""
            """),format.raw/*46.13*/("""</div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                        <tr>
                            <th style="width:20%">Maintenance Code</th>
                            <td>"""),_display_(/*53.34*/workOrder/*53.43*/.item_code),format.raw/*53.53*/("""</td>
                        </tr>
                        <tr>
                            <th style="width:20%">Maintenance Item</th>
                            <td>"""),_display_(/*57.34*/workOrder/*57.43*/.item_name),format.raw/*57.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge</th>
                            <td>"""),_display_(/*61.34*/workOrder/*61.43*/.user_name),format.raw/*61.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge Contact</th>
                            <td>"""),_display_(/*65.34*/workOrder/*65.43*/.user_contact),format.raw/*65.56*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician</th>
                            <td>"""),_display_(/*69.34*/workOrder/*69.43*/.technician_name),format.raw/*69.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician Contact</th>
                            <td>"""),_display_(/*73.34*/workOrder/*73.43*/.technician_contact),format.raw/*73.62*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Date</th>
                            <td>"""),_display_(/*77.34*/workOrder/*77.43*/.maintenance_date),format.raw/*77.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Time</th>
                            <td>"""),_display_(/*81.34*/workOrder/*81.43*/.maintenance_time),format.raw/*81.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Status</th>
                            <td>"""),_display_(/*85.34*/workOrder/*85.43*/.status),format.raw/*85.50*/("""</td>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
""")))}))
      }
    }
  }

  def render(workOrder:WorkOrderView,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrder)(flash,messages,request)

  def f:((WorkOrderView) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrder) => (flash,messages,request) => apply(workOrder)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrders/detail.scala.html
                  HASH: 9341589b1d31e3bf3dad955dc69c1902af361403
                  MATRIX: 818->1|1019->106|1047->109|1076->130|1115->132|1143->134|1501->465|1543->498|1582->499|1628->517|1684->546|1699->552|1763->595|1995->800|2010->806|2067->842|2386->1134|2401->1140|2438->1156|2635->1335|2648->1340|2687->1341|2733->1359|2782->1381|2797->1387|2854->1423|3082->1624|3097->1630|3154->1666|3451->1936|3466->1942|3503->1958|3712->2136|3754->2150|4116->2485|4134->2494|4165->2504|4366->2678|4384->2687|4415->2697|4597->2852|4615->2861|4646->2871|4836->3034|4854->3043|4888->3056|5065->3206|5083->3215|5120->3231|5305->3389|5323->3398|5363->3417|5546->3573|5564->3582|5602->3599|5785->3755|5803->3764|5841->3781|6014->3927|6032->3936|6060->3943
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|41->14|41->14|41->14|41->14|46->19|46->19|46->19|51->24|51->24|51->24|56->29|56->29|56->29|57->30|57->30|57->30|57->30|62->35|62->35|62->35|67->40|67->40|67->40|72->45|73->46|80->53|80->53|80->53|84->57|84->57|84->57|88->61|88->61|88->61|92->65|92->65|92->65|96->69|96->69|96->69|100->73|100->73|100->73|104->77|104->77|104->77|108->81|108->81|108->81|112->85|112->85|112->85
                  -- GENERATED --
              */
          