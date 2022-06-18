
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[WorkOrderSample],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrderSampleForm: Form[WorkOrderSample], errors: Array[String], formType: String, itemOptions: Seq[(Long,String)], techOptions: Seq[(Long,String)])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.232*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div class="col-lg-12">
    <h1 class="page-header">Work Order Sample- """),_display_(/*5.49*/formType),format.raw/*5.57*/("""</h1>
</div>
<form action=""""),_display_(/*7.16*/routes/*7.22*/.WorkOrderSamples.postWorkOrderSamplesDb),format.raw/*7.62*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*8.53*/workOrderSampleForm("id")/*8.78*/.value),format.raw/*8.84*/("""'>
    <div>
        <label>Maintenance Item</label>
        <select id="maintenance_id" name="maintenance_id" class="form-control">
            """),_display_(/*12.14*/for(itemOption <- itemOptions) yield /*12.44*/{_display_(Seq[Any](format.raw/*12.45*/("""
            """),format.raw/*13.13*/("""<option """),_display_(/*13.22*/if(workOrderSampleForm("maintenance_id").value.get == itemOption._1.toString)/*13.99*/{_display_(Seq[Any](format.raw/*13.100*/(""" """),format.raw/*13.101*/("""selected """)))}),format.raw/*13.111*/(""" """),format.raw/*13.112*/("""value=""""),_display_(/*13.120*/itemOption/*13.130*/._1),format.raw/*13.133*/("""">"""),_display_(/*13.136*/itemOption/*13.146*/._2),format.raw/*13.149*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
    </div>

    <div>
        <label>Technician</label>
        <select id="technician_id" name="technician_id" class="form-control">
            """),_display_(/*21.14*/for(techOption <- techOptions) yield /*21.44*/{_display_(Seq[Any](format.raw/*21.45*/("""
            """),format.raw/*22.13*/("""<option """),_display_(/*22.22*/if(workOrderSampleForm("technician_id").value.get == techOption._1.toString)/*22.98*/{_display_(Seq[Any](format.raw/*22.99*/(""" """),format.raw/*22.100*/("""selected """)))}),format.raw/*22.110*/(""" """),format.raw/*22.111*/("""value=""""),_display_(/*22.119*/techOption/*22.129*/._1),format.raw/*22.132*/("""">"""),_display_(/*22.135*/techOption/*22.145*/._2),format.raw/*22.148*/("""</option>
            """)))}),format.raw/*23.14*/("""
        """),format.raw/*24.9*/("""</select>
    </div>

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*30.22*/if(workOrderSampleForm("status").value.get == "Pending")/*30.78*/{_display_(Seq[Any](format.raw/*30.79*/(""" """),format.raw/*30.80*/("""selected """)))}),format.raw/*30.90*/(""" """),format.raw/*30.91*/("""value="Pending">Pending</option>
        </select>
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*34.53*/formType),format.raw/*34.61*/("""</button>
</form>

""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(workOrderSampleForm:Form[WorkOrderSample],errors:Array[String],formType:String,itemOptions:Seq[scala.Tuple2[Long, String]],techOptions:Seq[scala.Tuple2[Long, String]],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrderSampleForm,errors,formType,itemOptions,techOptions)(flash,messages,request)

  def f:((Form[WorkOrderSample],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrderSampleForm,errors,formType,itemOptions,techOptions) => (flash,messages,request) => apply(workOrderSampleForm,errors,formType,itemOptions,techOptions)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrderSamples/form.scala.html
                  HASH: fe3d4427aab430c3d014a2844659291420308e3f
                  MATRIX: 915->1|1241->231|1269->234|1298->255|1337->257|1367->261|1466->334|1494->342|1550->372|1564->378|1624->418|1720->488|1753->513|1779->519|1956->669|2002->699|2041->700|2083->714|2119->723|2205->800|2245->801|2275->802|2317->812|2347->813|2383->821|2403->831|2428->834|2459->837|2479->847|2504->850|2559->874|2596->884|2786->1047|2832->1077|2871->1078|2913->1092|2949->1101|3034->1177|3073->1178|3103->1179|3145->1189|3175->1190|3211->1198|3231->1208|3256->1211|3287->1214|3307->1224|3332->1227|3387->1251|3424->1261|3604->1414|3669->1470|3708->1471|3737->1472|3778->1482|3807->1483|3961->1610|3990->1618|4043->1641
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|48->21|48->21|48->21|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|50->23|51->24|57->30|57->30|57->30|57->30|57->30|57->30|61->34|61->34|64->37
                  -- GENERATED --
              */
          