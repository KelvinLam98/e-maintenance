
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
                <a id="backToDashboard" href=""""),_display_(/*19.48*/routes/*19.54*/.Users.dashboard),format.raw/*19.70*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Back
                    </button>
                </a>
                """)))}/*24.19*/else/*24.24*/{_display_(Seq[Any](format.raw/*24.25*/("""
                """),format.raw/*25.17*/("""<a id="update" href=""""),_display_(/*25.39*/routes/*25.45*/.WorkOrders.update(workOrder.id.get)),format.raw/*25.81*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Update
                    </button>
                </a>
                <a id="delete" href=""""),_display_(/*30.39*/routes/*30.45*/.WorkOrders.delete(workOrder.id.get)),format.raw/*30.81*/("""">
                    <button type="button" class="btn btn-danger badge" onclick="return confirm('Are you sure you want to delete this item?');">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*35.37*/routes/*35.43*/.WorkOrders.list),format.raw/*35.59*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Back
                    </button>
                </a>
                """)))}),format.raw/*40.18*/("""
            """),format.raw/*41.13*/("""</div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                        <tr>
                            <th style="width:20%">Maintenance Code</th>
                            <td>"""),_display_(/*48.34*/workOrder/*48.43*/.item_code),format.raw/*48.53*/("""</td>
                        </tr>
                        <tr>
                            <th style="width:20%">Maintenance Item</th>
                            <td>"""),_display_(/*52.34*/workOrder/*52.43*/.item_name),format.raw/*52.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge</th>
                            <td>"""),_display_(/*56.34*/workOrder/*56.43*/.user_name),format.raw/*56.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge Contact</th>
                            <td>"""),_display_(/*60.34*/workOrder/*60.43*/.user_contact),format.raw/*60.56*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician</th>
                            <td>"""),_display_(/*64.34*/workOrder/*64.43*/.technician_name),format.raw/*64.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician Contact</th>
                            <td>"""),_display_(/*68.34*/workOrder/*68.43*/.technician_contact),format.raw/*68.62*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Date</th>
                            <td>"""),_display_(/*72.34*/workOrder/*72.43*/.maintenance_date),format.raw/*72.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Time</th>
                            <td>"""),_display_(/*76.34*/workOrder/*76.43*/.maintenance_time),format.raw/*76.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Status</th>
                            <td>"""),_display_(/*80.34*/workOrder/*80.43*/.status),format.raw/*80.50*/("""</td>
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
                  HASH: b1c4d8a2b9d05c4339637102125b3dbdbc0b6bb1
                  MATRIX: 818->1|1019->106|1047->109|1076->130|1115->132|1143->134|1501->465|1543->498|1582->499|1628->517|1684->546|1699->552|1763->595|2004->809|2019->815|2056->831|2253->1010|2266->1015|2305->1016|2351->1034|2400->1056|2415->1062|2472->1098|2700->1299|2715->1305|2772->1341|3069->1611|3084->1617|3121->1633|3330->1811|3372->1825|3734->2160|3752->2169|3783->2179|3984->2353|4002->2362|4033->2372|4215->2527|4233->2536|4264->2546|4454->2709|4472->2718|4506->2731|4683->2881|4701->2890|4738->2906|4923->3064|4941->3073|4981->3092|5164->3248|5182->3257|5220->3274|5403->3430|5421->3439|5459->3456|5632->3602|5650->3611|5678->3618
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|41->14|41->14|41->14|41->14|46->19|46->19|46->19|51->24|51->24|51->24|52->25|52->25|52->25|52->25|57->30|57->30|57->30|62->35|62->35|62->35|67->40|68->41|75->48|75->48|75->48|79->52|79->52|79->52|83->56|83->56|83->56|87->60|87->60|87->60|91->64|91->64|91->64|95->68|95->68|95->68|99->72|99->72|99->72|103->76|103->76|103->76|107->80|107->80|107->80
                  -- GENERATED --
              */
          