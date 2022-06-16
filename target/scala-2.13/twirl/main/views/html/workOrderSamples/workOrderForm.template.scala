
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

object workOrderForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[WorkOrder],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Flash,Messages,models.RequestWithUser[_$1] forSome { 
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

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*16.22*/if(workOrderForm("status").value.get == "Pending")/*16.72*/{_display_(Seq[Any](format.raw/*16.73*/(""" """),format.raw/*16.74*/("""selected """)))}),format.raw/*16.84*/(""" """),format.raw/*16.85*/("""value="Pending">Pending</option>
            <option """),_display_(/*17.22*/if(workOrderForm("status").value.get == "Created")/*17.72*/{_display_(Seq[Any](format.raw/*17.73*/(""" """),format.raw/*17.74*/("""selected """)))}),format.raw/*17.84*/(""" """),format.raw/*17.85*/("""value="Created">Created</option>
            <option """),_display_(/*18.22*/if(workOrderForm("status").value.get == "In Progress")/*18.76*/{_display_(Seq[Any](format.raw/*18.77*/(""" """),format.raw/*18.78*/("""selected """)))}),format.raw/*18.88*/(""" """),format.raw/*18.89*/("""value="In Progress">In Progress</option>
            <option """),_display_(/*19.22*/if(workOrderForm("status").value.get == "Completed")/*19.74*/{_display_(Seq[Any](format.raw/*19.75*/(""" """),format.raw/*19.76*/("""selected """)))}),format.raw/*19.86*/(""" """),format.raw/*19.87*/("""value="Completed">Completed</option>
        </select>
    </div>

    <div class='form-group """),_display_(/*23.29*/if(errors.contains("maintenance_date"))/*23.68*/{_display_(Seq[Any](format.raw/*23.69*/(""" """),format.raw/*23.70*/("""has-error """)))}),format.raw/*23.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*25.70*/workOrderForm("maintenance_date")/*25.103*/.value),format.raw/*25.109*/("""' class="form-control" type="date" placeholder="dd-mm-yyyy">
    </div>

    <div class='form-group """),_display_(/*28.29*/if(errors.contains("maintenance_time"))/*28.68*/{_display_(Seq[Any](format.raw/*28.69*/(""" """),format.raw/*28.70*/("""has-error """)))}),format.raw/*28.81*/("""'>
        <label>Time (Note: keep minutes as 00)</label>
        <input id="maintenance_time" name="maintenance_time" value='"""),_display_(/*30.70*/workOrderForm("maintenance_time")/*30.103*/.value),format.raw/*30.109*/("""' class="form-control" type="time" min="09:00" max="18:00" step="3600">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*33.53*/formType),format.raw/*33.61*/("""</button>
</form>

""")))}),format.raw/*36.2*/("""
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
                  SOURCE: app/views/workOrderSamples/workOrderForm.scala.html
                  HASH: 438421f3700f3de90e57589485249a94a24a3f08
                  MATRIX: 950->1|1297->252|1325->255|1354->276|1393->278|1423->282|1516->349|1544->357|1600->387|1614->393|1662->421|1758->491|1785->510|1811->516|1917->596|1957->627|1984->633|2077->699|2110->723|2137->729|2242->807|2282->837|2310->843|2471->977|2530->1027|2569->1028|2598->1029|2639->1039|2668->1040|2750->1095|2809->1145|2848->1146|2877->1147|2918->1157|2947->1158|3029->1213|3092->1267|3131->1268|3160->1269|3201->1279|3230->1280|3320->1343|3381->1395|3420->1396|3449->1397|3490->1407|3519->1408|3645->1507|3693->1546|3732->1547|3761->1548|3803->1559|3932->1661|3975->1694|4003->1700|4134->1804|4182->1843|4221->1844|4250->1845|4292->1856|4448->1985|4491->2018|4519->2024|4693->2171|4722->2179|4775->2202
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|43->16|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|44->17|45->18|45->18|45->18|45->18|45->18|45->18|46->19|46->19|46->19|46->19|46->19|46->19|50->23|50->23|50->23|50->23|50->23|52->25|52->25|52->25|55->28|55->28|55->28|55->28|55->28|57->30|57->30|57->30|60->33|60->33|63->36
                  -- GENERATED --
              */
          