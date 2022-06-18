
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

object workOrderPendingForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[WorkOrder],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrderForm: Form[WorkOrder], errors: Array[String], formType: String, itemOptions: Seq[(Long,String)], userOptions: Seq[(Long,String)], techOptions: Seq[(Long,String)])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.253*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div class="col-lg-12">
    <h1 class="page-header">Work Order - """),_display_(/*5.43*/formType),format.raw/*5.51*/("""</h1>
</div>
<form action=""""),_display_(/*7.16*/routes/*7.22*/.WorkOrders.postWorkOrdersDb),format.raw/*7.50*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*8.53*/workOrderForm("id")/*8.72*/.value),format.raw/*8.78*/("""'>
    <input type="hidden" id="maintenance_id " name="maintenance_id" value='"""),_display_(/*9.77*/workOrderForm("maintenance_id")/*9.108*/.value),format.raw/*9.114*/("""'>
    <input type="hidden" id="user_id " name="user_id" value='"""),_display_(/*10.63*/workOrderForm("user_id")/*10.87*/.value),format.raw/*10.93*/("""'>
    <input type="hidden" id="technician_id " name="technician_id" value='"""),_display_(/*11.75*/workOrderForm("technician_id")/*11.105*/.value),format.raw/*11.111*/("""'>
    <input type="hidden" id="maintenance_date " name="maintenance_date" value='"""),_display_(/*12.81*/workOrderForm("maintenance_date")/*12.114*/.value),format.raw/*12.120*/("""'>
    <input type="hidden" id="maintenance_time " name="maintenance_time" value='"""),_display_(/*13.81*/workOrderForm("maintenance_time")/*13.114*/.value),format.raw/*13.120*/("""'>

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*18.22*/if(workOrderForm("status").value.get == "Todo")/*18.69*/{_display_(Seq[Any](format.raw/*18.70*/(""" """),format.raw/*18.71*/("""selected """)))}),format.raw/*18.81*/(""" """),format.raw/*18.82*/("""value="Todo">Accepted - """),_display_(/*18.107*/workOrderForm("maintenance_time")/*18.140*/.value),format.raw/*18.146*/("""</option>
            <option """),_display_(/*19.22*/if(workOrderForm("status").value.get == "Rejected")/*19.73*/{_display_(Seq[Any](format.raw/*19.74*/(""" """),format.raw/*19.75*/("""selected """)))}),format.raw/*19.85*/(""" """),format.raw/*19.86*/("""value="Rejected">Rejected</option>
        </select>
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*23.53*/formType),format.raw/*23.61*/("""</button>
</form>

""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(workOrderForm:Form[WorkOrder],errors:Array[String],formType:String,itemOptions:Seq[scala.Tuple2[Long, String]],userOptions:Seq[scala.Tuple2[Long, String]],techOptions:Seq[scala.Tuple2[Long, String]],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrderForm,errors,formType,itemOptions,userOptions,techOptions)(flash,messages,request)

  def f:((Form[WorkOrder],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrderForm,errors,formType,itemOptions,userOptions,techOptions) => (flash,messages,request) => apply(workOrderForm,errors,formType,itemOptions,userOptions,techOptions)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrders/workOrderPendingForm.scala.html
                  HASH: 4779d5152ef7447a0f3bb3d43f89de940909bc39
                  MATRIX: 951->1|1298->252|1326->255|1355->276|1394->278|1424->282|1517->349|1545->357|1601->387|1615->393|1663->421|1759->491|1786->510|1812->516|1918->596|1958->627|1985->633|2078->699|2111->723|2138->729|2243->807|2283->837|2311->843|2422->927|2465->960|2493->966|2604->1050|2647->1083|2675->1089|2836->1223|2892->1270|2931->1271|2960->1272|3001->1282|3030->1283|3083->1308|3126->1341|3154->1347|3213->1379|3273->1430|3312->1431|3341->1432|3382->1442|3411->1443|3567->1572|3596->1580|3649->1603
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|46->19|46->19|46->19|46->19|46->19|46->19|50->23|50->23|53->26
                  -- GENERATED --
              */
          