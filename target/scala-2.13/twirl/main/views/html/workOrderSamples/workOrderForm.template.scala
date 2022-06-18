
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
    <input type="hidden" id="technician_id " name="technician_id" value='"""),_display_(/*10.75*/workOrderForm("technician_id")/*10.105*/.value),format.raw/*10.111*/("""'>

    <div>
        <label>Staff In Charge</label>
        <select id="user_id" name="user_id" class="form-control">
            """),_display_(/*15.14*/for(userOption <- userOptions) yield /*15.44*/{_display_(Seq[Any](format.raw/*15.45*/("""
            """),format.raw/*16.13*/("""<option """),_display_(/*16.22*/if(workOrderForm("user_id").value.get == userOption._1.toString)/*16.86*/{_display_(Seq[Any](format.raw/*16.87*/(""" """),format.raw/*16.88*/("""selected """)))}),format.raw/*16.98*/(""" """),format.raw/*16.99*/("""value=""""),_display_(/*16.107*/userOption/*16.117*/._1),format.raw/*16.120*/("""">"""),_display_(/*16.123*/userOption/*16.133*/._2),format.raw/*16.136*/("""</option>
            """)))}),format.raw/*17.14*/("""
        """),format.raw/*18.9*/("""</select>
    </div>

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*24.22*/if(workOrderForm("status").value.get == "Pending")/*24.72*/{_display_(Seq[Any](format.raw/*24.73*/(""" """),format.raw/*24.74*/("""selected """)))}),format.raw/*24.84*/(""" """),format.raw/*24.85*/("""value="Pending">Pending</option>
            <option """),_display_(/*25.22*/if(workOrderForm("status").value.get == "Todo")/*25.69*/{_display_(Seq[Any](format.raw/*25.70*/(""" """),format.raw/*25.71*/("""selected """)))}),format.raw/*25.81*/(""" """),format.raw/*25.82*/("""value="Todo">Todo</option>
            <option """),_display_(/*26.22*/if(workOrderForm("status").value.get == "In Progress")/*26.76*/{_display_(Seq[Any](format.raw/*26.77*/(""" """),format.raw/*26.78*/("""selected """)))}),format.raw/*26.88*/(""" """),format.raw/*26.89*/("""value="In Progress">In Progress</option>
            <option """),_display_(/*27.22*/if(workOrderForm("status").value.get == "Completed")/*27.74*/{_display_(Seq[Any](format.raw/*27.75*/(""" """),format.raw/*27.76*/("""selected """)))}),format.raw/*27.86*/(""" """),format.raw/*27.87*/("""value="Completed">Completed</option>
        </select>
    </div>

    <div class='form-group """),_display_(/*31.29*/if(errors.contains("maintenance_date"))/*31.68*/{_display_(Seq[Any](format.raw/*31.69*/(""" """),format.raw/*31.70*/("""has-error """)))}),format.raw/*31.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*33.70*/workOrderForm("maintenance_date")/*33.103*/.value),format.raw/*33.109*/("""' class="form-control" type="date" placeholder="dd-mm-yyyy">
    </div>

    <div class='form-group """),_display_(/*36.29*/if(errors.contains("maintenance_time"))/*36.68*/{_display_(Seq[Any](format.raw/*36.69*/(""" """),format.raw/*36.70*/("""has-error """)))}),format.raw/*36.81*/("""'>
        <label>Time (Note: keep minutes as 00)</label>
        <input id="maintenance_time" name="maintenance_time" value='"""),_display_(/*38.70*/workOrderForm("maintenance_time")/*38.103*/.value),format.raw/*38.109*/("""' class="form-control" type="time" min="09:00" max="18:00" step="3600">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*41.53*/formType),format.raw/*41.61*/("""</button>
</form>

""")))}),format.raw/*44.2*/("""
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
                  HASH: ea1775278678221d84fc172fa5619e64d23b1b3e
                  MATRIX: 950->1|1297->252|1325->255|1354->276|1393->278|1423->282|1516->349|1544->357|1600->387|1614->393|1662->421|1758->491|1785->510|1811->516|1917->596|1957->627|1984->633|2089->711|2129->741|2157->747|2321->884|2367->914|2406->915|2448->929|2484->938|2557->1002|2596->1003|2625->1004|2666->1014|2695->1015|2731->1023|2751->1033|2776->1036|2807->1039|2827->1049|2852->1052|2907->1076|2944->1086|3124->1239|3183->1289|3222->1290|3251->1291|3292->1301|3321->1302|3403->1357|3459->1404|3498->1405|3527->1406|3568->1416|3597->1417|3673->1466|3736->1520|3775->1521|3804->1522|3845->1532|3874->1533|3964->1596|4025->1648|4064->1649|4093->1650|4134->1660|4163->1661|4289->1760|4337->1799|4376->1800|4405->1801|4447->1812|4576->1914|4619->1947|4647->1953|4778->2057|4826->2096|4865->2097|4894->2098|4936->2109|5092->2238|5135->2271|5163->2277|5337->2424|5366->2432|5419->2455
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|42->15|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|44->17|45->18|51->24|51->24|51->24|51->24|51->24|51->24|52->25|52->25|52->25|52->25|52->25|52->25|53->26|53->26|53->26|53->26|53->26|53->26|54->27|54->27|54->27|54->27|54->27|54->27|58->31|58->31|58->31|58->31|58->31|60->33|60->33|60->33|63->36|63->36|63->36|63->36|63->36|65->38|65->38|65->38|68->41|68->41|71->44
                  -- GENERATED --
              */
          