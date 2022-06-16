
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
                <a id="delete" href=""""),_display_(/*18.39*/routes/*18.45*/.WorkOrderSamples.delete(workOrderSample.id.get)),format.raw/*18.93*/("""" onclick="return confirm('Are you sure you want to delete this item?');">
                    <button type="button" class="btn btn-danger badge" onclick="">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*23.37*/routes/*23.43*/.WorkOrderSamples.list),format.raw/*23.65*/("""">
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
                            <td>"""),_display_(/*35.34*/workOrderSample/*35.49*/.item_code),format.raw/*35.59*/("""</td>
                        </tr>
                        <tr>
                            <th style="width:20%">Maintenance Item</th>
                            <td>"""),_display_(/*39.34*/workOrderSample/*39.49*/.item_name),format.raw/*39.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge</th>
                            <td>"""),_display_(/*43.34*/workOrderSample/*43.49*/.user_name),format.raw/*43.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge Contact</th>
                            <td>"""),_display_(/*47.34*/workOrderSample/*47.49*/.user_contact),format.raw/*47.62*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician</th>
                            <td>"""),_display_(/*51.34*/workOrderSample/*51.49*/.technician_name),format.raw/*51.65*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician Contact</th>
                            <td>"""),_display_(/*55.34*/workOrderSample/*55.49*/.technician_contact),format.raw/*55.68*/("""</td>
                        <tr>
                            <th>Status</th>
                            <td>"""),_display_(/*58.34*/workOrderSample/*58.49*/.status),format.raw/*58.56*/("""</td>
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
                  HASH: 4b7166a2a28faf1254b0ec8527a5516b135e6465
                  MATRIX: 830->1|1043->118|1071->121|1100->142|1139->144|1167->146|1553->505|1568->511|1637->559|1865->760|1880->766|1949->814|2257->1095|2272->1101|2315->1123|2861->1642|2885->1657|2916->1667|3117->1841|3141->1856|3172->1866|3354->2021|3378->2036|3409->2046|3599->2209|3623->2224|3657->2237|3834->2387|3858->2402|3895->2418|4080->2576|4104->2591|4144->2610|4286->2725|4310->2740|4338->2747
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|45->18|45->18|45->18|50->23|50->23|50->23|62->35|62->35|62->35|66->39|66->39|66->39|70->43|70->43|70->43|74->47|74->47|74->47|78->51|78->51|78->51|82->55|82->55|82->55|85->58|85->58|85->58
                  -- GENERATED --
              */
          