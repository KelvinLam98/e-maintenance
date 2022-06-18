
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
    <h1 class="page-header">Work Order - """),_display_(/*5.43*/formType),format.raw/*5.51*/("""</h1>
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
                  HASH: 60cd84bfc5600ac1aac8638ad79e881cc404b5c9
                  MATRIX: 915->1|1241->231|1269->234|1298->255|1337->257|1367->261|1460->328|1488->336|1544->366|1558->372|1618->412|1714->482|1747->507|1773->513|1950->663|1996->693|2035->694|2077->708|2113->717|2199->794|2239->795|2269->796|2311->806|2341->807|2377->815|2397->825|2422->828|2453->831|2473->841|2498->844|2553->868|2590->878|2780->1041|2826->1071|2865->1072|2907->1086|2943->1095|3028->1171|3067->1172|3097->1173|3139->1183|3169->1184|3205->1192|3225->1202|3250->1205|3281->1208|3301->1218|3326->1221|3381->1245|3418->1255|3598->1408|3663->1464|3702->1465|3731->1466|3772->1476|3801->1477|3955->1604|3984->1612|4037->1635
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|48->21|48->21|48->21|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|50->23|51->24|57->30|57->30|57->30|57->30|57->30|57->30|61->34|61->34|64->37
                  -- GENERATED --
              */
          