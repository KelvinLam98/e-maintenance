
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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[WorkOrder,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrder: WorkOrder)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.103*/("""
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
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                        <tr>
                            <th style="width:20%">Maintenance Item</th>
                            <td>"""),_display_(/*30.34*/workOrder/*30.43*/.maintenance_id),format.raw/*30.58*/("""</td>
                        </tr>
                        <tr>
                            <th>Date</th>
                            <td>"""),_display_(/*34.34*/workOrder/*34.43*/.maintenance_date),format.raw/*34.60*/("""</td>
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

  def render(workOrder:WorkOrder,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrder)(flash,messages,request)

  def f:((WorkOrder) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrder) => (flash,messages,request) => apply(workOrder)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrders/detail.scala.html
                  HASH: ca550ae4682814bb24adcec0e3a9b0040c1a4ade
                  MATRIX: 814->1|1011->102|1039->105|1068->126|1107->128|1135->130|1518->486|1533->492|1590->528|1822->733|1837->739|1894->775|2441->1295|2459->1304|2495->1319|2666->1463|2684->1472|2722->1489
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|45->18|45->18|45->18|57->30|57->30|57->30|61->34|61->34|61->34
                  -- GENERATED --
              */
          