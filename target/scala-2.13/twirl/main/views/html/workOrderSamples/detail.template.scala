
package views.html.workOrderSamples

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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[WorkOrderSampleView,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrderSample: WorkOrderSampleView)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Work Orders Sample</h1>
        <div id="msg">
            <label class="control-label"></label>
        </div>
    </div>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a id="update" href=""""),_display_(/*13.39*/routes/*13.45*/.WorkOrderSamples.update(workOrderSample.id.get)),format.raw/*13.93*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Update
                    </button>
                </a>
                <a id="create" href=""""),_display_(/*18.39*/routes/*18.45*/.WorkOrderSamples.createWorkOrder(workOrderSample.id.get)),format.raw/*18.102*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Create Work Order
                    </button>
                </a>
                <a id="delete" href=""""),_display_(/*23.39*/routes/*23.45*/.WorkOrderSamples.delete(workOrderSample.id.get)),format.raw/*23.93*/("""" onclick="return confirm('Are you sure you want to delete this item?');">
                    <button type="button" class="btn btn-danger badge" onclick="">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*28.37*/routes/*28.43*/.WorkOrderSamples.list),format.raw/*28.65*/("""">
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
                            <td>"""),_display_(/*40.34*/workOrderSample/*40.49*/.item_code),format.raw/*40.59*/("""</td>
                        </tr>
                        <tr>
                            <th style="width:20%">Maintenance Item</th>
                            <td>"""),_display_(/*44.34*/workOrderSample/*44.49*/.item_name),format.raw/*44.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician</th>
                            <td>"""),_display_(/*48.34*/workOrderSample/*48.49*/.technician_name),format.raw/*48.65*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician Contact</th>
                            <td>"""),_display_(/*52.34*/workOrderSample/*52.49*/.technician_contact),format.raw/*52.68*/("""</td>
                        <tr>
                            <th>Status</th>
                            <td>"""),_display_(/*55.34*/workOrderSample/*55.49*/.status),format.raw/*55.56*/("""</td>
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

  def render(workOrderSample:WorkOrderSampleView,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrderSample)(flash,messages,request)

  def f:((WorkOrderSampleView) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrderSample) => (flash,messages,request) => apply(workOrderSample)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrderSamples/detail.scala.html
                  HASH: 11321c59096033a7833d9fa012f8258f88023772
                  MATRIX: 830->1|1043->118|1071->121|1100->142|1139->144|1167->146|1553->505|1568->511|1637->559|1865->760|1880->766|1959->823|2198->1035|2213->1041|2282->1089|2590->1370|2605->1376|2648->1398|3194->1917|3218->1932|3249->1942|3450->2116|3474->2131|3505->2141|3682->2291|3706->2306|3743->2322|3928->2480|3952->2495|3992->2514|4134->2629|4158->2644|4186->2651
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|45->18|45->18|45->18|50->23|50->23|50->23|55->28|55->28|55->28|67->40|67->40|67->40|71->44|71->44|71->44|75->48|75->48|75->48|79->52|79->52|79->52|82->55|82->55|82->55
                  -- GENERATED --
              */
          