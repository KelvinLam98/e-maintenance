
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
        <label>Staff In Charge</label>
        <select id="user_id" name="user_id" class="form-control">
            """),_display_(/*16.14*/for(userOption <- userOptions) yield /*16.44*/{_display_(Seq[Any](format.raw/*16.45*/("""
            """),format.raw/*17.13*/("""<option """),_display_(/*17.22*/if(workOrderForm("user_id").value.get == userOption._1.toString)/*17.86*/{_display_(Seq[Any](format.raw/*17.87*/(""" """),format.raw/*17.88*/("""selected """)))}),format.raw/*17.98*/(""" """),format.raw/*17.99*/("""value=""""),_display_(/*17.107*/userOption/*17.117*/._1),format.raw/*17.120*/("""">"""),_display_(/*17.123*/userOption/*17.133*/._2),format.raw/*17.136*/("""</option>
            """)))}),format.raw/*18.14*/("""
        """),format.raw/*19.9*/("""</select>
    </div>

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*25.22*/if(workOrderForm("status").value.get == "Pending")/*25.72*/{_display_(Seq[Any](format.raw/*25.73*/(""" """),format.raw/*25.74*/("""selected """)))}),format.raw/*25.84*/(""" """),format.raw/*25.85*/("""value="Pending">Pending</option>
            <option """),_display_(/*26.22*/if(workOrderForm("status").value.get == "Todo")/*26.69*/{_display_(Seq[Any](format.raw/*26.70*/(""" """),format.raw/*26.71*/("""selected """)))}),format.raw/*26.81*/(""" """),format.raw/*26.82*/("""value="Todo">Todo</option>
            <option """),_display_(/*27.22*/if(workOrderForm("status").value.get == "In Progress")/*27.76*/{_display_(Seq[Any](format.raw/*27.77*/(""" """),format.raw/*27.78*/("""selected """)))}),format.raw/*27.88*/(""" """),format.raw/*27.89*/("""value="In Progress">In Progress</option>
            <option """),_display_(/*28.22*/if(workOrderForm("status").value.get == "Completed")/*28.74*/{_display_(Seq[Any](format.raw/*28.75*/(""" """),format.raw/*28.76*/("""selected """)))}),format.raw/*28.86*/(""" """),format.raw/*28.87*/("""value="Completed">Completed</option>
        </select>
    </div>

    <div class='form-group """),_display_(/*32.29*/if(errors.contains("maintenance_date"))/*32.68*/{_display_(Seq[Any](format.raw/*32.69*/(""" """),format.raw/*32.70*/("""has-error """)))}),format.raw/*32.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*34.70*/workOrderForm("maintenance_date")/*34.103*/.value),format.raw/*34.109*/("""' class="form-control" type="date" placeholder="dd-mm-yyyy">
    </div>

    <div class='form-group """),_display_(/*37.29*/if(errors.contains("maintenance_time"))/*37.68*/{_display_(Seq[Any](format.raw/*37.69*/(""" """),format.raw/*37.70*/("""has-error """)))}),format.raw/*37.81*/("""'>
        <label>Time (Note: keep minutes as 00)</label>
        <input id="maintenance_time" name="maintenance_time" value='"""),_display_(/*39.70*/workOrderForm("maintenance_time")/*39.103*/.value),format.raw/*39.109*/("""' class="form-control" type="time" min="09:00" max="18:00" step="3600">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*42.53*/formType),format.raw/*42.61*/("""</button>
</form>

""")))}),format.raw/*45.2*/("""
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
                  HASH: 854ea69a6889991355a74d2090e2d651866a4dcc
                  MATRIX: 950->1|1297->252|1325->255|1354->276|1393->278|1423->282|1516->349|1544->357|1600->387|1614->393|1662->421|1758->491|1785->510|1811->516|1917->596|1957->627|1984->633|2077->699|2110->723|2137->729|2242->807|2282->837|2310->843|2474->980|2520->1010|2559->1011|2601->1025|2637->1034|2710->1098|2749->1099|2778->1100|2819->1110|2848->1111|2884->1119|2904->1129|2929->1132|2960->1135|2980->1145|3005->1148|3060->1172|3097->1182|3277->1335|3336->1385|3375->1386|3404->1387|3445->1397|3474->1398|3556->1453|3612->1500|3651->1501|3680->1502|3721->1512|3750->1513|3826->1562|3889->1616|3928->1617|3957->1618|3998->1628|4027->1629|4117->1692|4178->1744|4217->1745|4246->1746|4287->1756|4316->1757|4442->1856|4490->1895|4529->1896|4558->1897|4600->1908|4729->2010|4772->2043|4800->2049|4931->2153|4979->2192|5018->2193|5047->2194|5089->2205|5245->2334|5288->2367|5316->2373|5490->2520|5519->2528|5572->2551
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|45->18|46->19|52->25|52->25|52->25|52->25|52->25|52->25|53->26|53->26|53->26|53->26|53->26|53->26|54->27|54->27|54->27|54->27|54->27|54->27|55->28|55->28|55->28|55->28|55->28|55->28|59->32|59->32|59->32|59->32|59->32|61->34|61->34|61->34|64->37|64->37|64->37|64->37|64->37|66->39|66->39|66->39|69->42|69->42|72->45
                  -- GENERATED --
              */
          