
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
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                        <tr>
                            <th style="width:20%">Maintenance Code</th>
                            <td>"""),_display_(/*30.34*/workOrder/*30.43*/.item_code),format.raw/*30.53*/("""</td>
                        </tr>
                        <tr>
                            <th style="width:20%">Maintenance Item</th>
                            <td>"""),_display_(/*34.34*/workOrder/*34.43*/.item_name),format.raw/*34.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge</th>
                            <td>"""),_display_(/*38.34*/workOrder/*38.43*/.user_name),format.raw/*38.53*/("""</td>
                        </tr>
                        <tr>
                            <th>Staff In Charge Contact</th>
                            <td>"""),_display_(/*42.34*/workOrder/*42.43*/.user_contact),format.raw/*42.56*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician</th>
                            <td>"""),_display_(/*46.34*/workOrder/*46.43*/.technician_name),format.raw/*46.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Technician Contact</th>
                            <td>"""),_display_(/*50.34*/workOrder/*50.43*/.technician_contact),format.raw/*50.62*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Date</th>
                            <td>"""),_display_(/*54.34*/workOrder/*54.43*/.maintenance_date),format.raw/*54.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Maintenance Time</th>
                            <td>"""),_display_(/*58.34*/workOrder/*58.43*/.maintenance_time),format.raw/*58.60*/("""</td>
                        </tr>
                        <tr>
                            <th>Status</th>
                            <td>"""),_display_(/*62.34*/workOrder/*62.43*/.status),format.raw/*62.50*/("""</td>
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
                  HASH: 35e53dc376bb722893f4041e73c93c5b988a3eaf
                  MATRIX: 818->1|1019->106|1047->109|1076->130|1115->132|1143->134|1526->490|1541->496|1598->532|1830->737|1845->743|1902->779|2449->1299|2467->1308|2498->1318|2699->1492|2717->1501|2748->1511|2930->1666|2948->1675|2979->1685|3169->1848|3187->1857|3221->1870|3398->2020|3416->2029|3453->2045|3638->2203|3656->2212|3696->2231|3879->2387|3897->2396|3935->2413|4118->2569|4136->2578|4174->2595|4347->2741|4365->2750|4393->2757
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|45->18|45->18|45->18|57->30|57->30|57->30|61->34|61->34|61->34|65->38|65->38|65->38|69->42|69->42|69->42|73->46|73->46|73->46|77->50|77->50|77->50|81->54|81->54|81->54|85->58|85->58|85->58|89->62|89->62|89->62
                  -- GENERATED --
              */
          