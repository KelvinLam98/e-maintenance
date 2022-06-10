
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
                <a id="updateUser" href=""""),_display_(/*13.43*/routes/*13.49*/.WorkOrders.update(workOrder.id.get)),format.raw/*13.85*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Update
                    </button>
                </a>
                <a id="deleteUser" href=""""),_display_(/*18.43*/routes/*18.49*/.WorkOrders.delete(workOrder.id.get)),format.raw/*18.85*/("""">
                    <button type="button" class="btn btn-danger badge" onclick="">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*23.37*/routes/*23.43*/.WorkOrders.list),format.raw/*23.59*/("""">
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
                            <th style="width:20%">Maintenance Code</th>
                            <td>"""),_display_(/*35.34*/workOrder/*35.43*/.item_code),format.raw/*35.53*/("""</td>
                        </tr>
                        <tr>
                            <th style="width:20%">Maintenance Item</th>
                            <td>"""),_display_(/*39.34*/workOrder/*39.43*/.item_name),format.raw/*39.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge</th>
                            <td>"""),_display_(/*43.34*/workOrder/*43.43*/.user_name),format.raw/*43.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge Contact</th>
                            <td>"""),_display_(/*47.34*/workOrder/*47.43*/.user_contact),format.raw/*47.56*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician</th>
                            <td>"""),_display_(/*51.34*/workOrder/*51.43*/.technician_name),format.raw/*51.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician Contact</th>
                            <td>"""),_display_(/*55.34*/workOrder/*55.43*/.technician_contact),format.raw/*55.62*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Date</th>
                            <td>"""),_display_(/*59.34*/workOrder/*59.43*/.maintenance_date),format.raw/*59.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Time</th>
                            <td>"""),_display_(/*63.34*/workOrder/*63.43*/.maintenance_time),format.raw/*63.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Status</th>
                            <td>"""),_display_(/*67.34*/workOrder/*67.43*/.status),format.raw/*67.50*/("""</td>
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
                  HASH: 7c17c934d4c3f2cd23f21cc479c6d188fc3a36c4
                  MATRIX: 818->1|1019->106|1047->109|1076->130|1115->132|1143->134|1526->490|1541->496|1598->532|1830->737|1845->743|1902->779|2138->988|2153->994|2190->1010|2736->1529|2754->1538|2785->1548|2986->1722|3004->1731|3035->1741|3217->1896|3235->1905|3266->1915|3456->2078|3474->2087|3508->2100|3685->2250|3703->2259|3740->2275|3925->2433|3943->2442|3983->2461|4166->2617|4184->2626|4222->2643|4405->2799|4423->2808|4461->2825|4634->2971|4652->2980|4680->2987
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|45->18|45->18|45->18|50->23|50->23|50->23|62->35|62->35|62->35|66->39|66->39|66->39|70->43|70->43|70->43|74->47|74->47|74->47|78->51|78->51|78->51|82->55|82->55|82->55|86->59|86->59|86->59|90->63|90->63|90->63|94->67|94->67|94->67
                  -- GENERATED --
              */
          