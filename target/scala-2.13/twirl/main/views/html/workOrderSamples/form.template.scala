
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[WorkOrderSample],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrderSampleForm: Form[WorkOrderSample], errors: Array[String], formType: String, itemOptions: Seq[(Long,String)], userOptions: Seq[(Long,String)], techOptions: Seq[(Long,String)])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.265*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div class="col-lg-12">
    <h1 class="page-header">Work Order - """),_display_(/*5.43*/formType),format.raw/*5.51*/("""</h1>
</div>
<form action=""""),_display_(/*7.16*/routes/*7.22*/.WorkOrderSamples.postWorkOrderSamplesDb),format.raw/*7.62*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*8.53*/workOrderSampleForm("id")/*8.78*/.value),format.raw/*8.84*/("""'>
    <div>
        <label>Maintenance Item</label>
        <select id="maintenance_id" name="maintenance_id" class="form-control">
            """),_display_(/*12.14*/for(itemOption <- itemOptions) yield /*12.44*/{_display_(Seq[Any](format.raw/*12.45*/("""
            """),format.raw/*13.13*/("""<option """),_display_(/*13.22*/if(workOrderSampleForm("maintenance_id").value.get == "@itemOption._1")/*13.93*/{_display_(Seq[Any](format.raw/*13.94*/(""" """),format.raw/*13.95*/("""selected """)))}),format.raw/*13.105*/(""" """),format.raw/*13.106*/("""value=""""),_display_(/*13.114*/itemOption/*13.124*/._1),format.raw/*13.127*/("""">"""),_display_(/*13.130*/itemOption/*13.140*/._2),format.raw/*13.143*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
    </div>
    <div>
        <label>Staff In Charge</label>
        <select id="user_id" name="user_id" class="form-control">
            """),_display_(/*20.14*/for(userOption <- userOptions) yield /*20.44*/{_display_(Seq[Any](format.raw/*20.45*/("""
            """),format.raw/*21.13*/("""<option """),_display_(/*21.22*/if(workOrderSampleForm("user_id").value.get == "@userOption._1")/*21.86*/{_display_(Seq[Any](format.raw/*21.87*/(""" """),format.raw/*21.88*/("""selected """)))}),format.raw/*21.98*/(""" """),format.raw/*21.99*/("""value=""""),_display_(/*21.107*/userOption/*21.117*/._1),format.raw/*21.120*/("""">"""),_display_(/*21.123*/userOption/*21.133*/._2),format.raw/*21.136*/("""</option>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</select>
    </div>

    <div>
        <label>Technician</label>
        <select id="technician_id" name="technician_id" class="form-control">
            """),_display_(/*29.14*/for(techOption <- techOptions) yield /*29.44*/{_display_(Seq[Any](format.raw/*29.45*/("""
            """),format.raw/*30.13*/("""<option """),_display_(/*30.22*/if(workOrderSampleForm("technician_id").value.get == "@techOption._1")/*30.92*/{_display_(Seq[Any](format.raw/*30.93*/(""" """),format.raw/*30.94*/("""selected """)))}),format.raw/*30.104*/(""" """),format.raw/*30.105*/("""value=""""),_display_(/*30.113*/techOption/*30.123*/._1),format.raw/*30.126*/("""">"""),_display_(/*30.129*/techOption/*30.139*/._2),format.raw/*30.142*/("""</option>
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</select>
    </div>

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*38.22*/if(workOrderSampleForm("status").value.get == "Pending")/*38.78*/{_display_(Seq[Any](format.raw/*38.79*/(""" """),format.raw/*38.80*/("""selected """)))}),format.raw/*38.90*/(""" """),format.raw/*38.91*/("""value="Pending">Pending</option>
        </select>
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*42.53*/formType),format.raw/*42.61*/("""</button>
</form>

""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(workOrderSampleForm:Form[WorkOrderSample],errors:Array[String],formType:String,itemOptions:Seq[scala.Tuple2[Long, String]],userOptions:Seq[scala.Tuple2[Long, String]],techOptions:Seq[scala.Tuple2[Long, String]],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrderSampleForm,errors,formType,itemOptions,userOptions,techOptions)(flash,messages,request)

  def f:((Form[WorkOrderSample],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrderSampleForm,errors,formType,itemOptions,userOptions,techOptions) => (flash,messages,request) => apply(workOrderSampleForm,errors,formType,itemOptions,userOptions,techOptions)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrderSamples/form.scala.html
                  HASH: a39b1484b1b6d78551e8a0c69c19844d009acbaf
                  MATRIX: 947->1|1306->264|1334->267|1363->288|1402->290|1432->294|1525->361|1553->369|1609->399|1623->405|1683->445|1779->515|1812->540|1838->546|2015->696|2061->726|2100->727|2142->741|2178->750|2258->821|2297->822|2326->823|2368->833|2398->834|2434->842|2454->852|2479->855|2510->858|2530->868|2555->871|2610->895|2647->905|2828->1059|2874->1089|2913->1090|2955->1104|2991->1113|3064->1177|3103->1178|3132->1179|3173->1189|3202->1190|3238->1198|3258->1208|3283->1211|3314->1214|3334->1224|3359->1227|3414->1251|3451->1261|3641->1424|3687->1454|3726->1455|3768->1469|3804->1478|3883->1548|3922->1549|3951->1550|3993->1560|4023->1561|4059->1569|4079->1579|4104->1582|4135->1585|4155->1595|4180->1598|4235->1622|4272->1632|4452->1785|4517->1841|4556->1842|4585->1843|4626->1853|4655->1854|4809->1981|4838->1989|4891->2012
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|47->20|47->20|47->20|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|49->22|50->23|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|58->31|59->32|65->38|65->38|65->38|65->38|65->38|65->38|69->42|69->42|72->45
                  -- GENERATED --
              */
          