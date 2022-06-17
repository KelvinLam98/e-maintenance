
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
            """),format.raw/*13.13*/("""<option """),_display_(/*13.22*/if(workOrderSampleForm("maintenance_id").value.get == itemOption._1.toString)/*13.99*/{_display_(Seq[Any](format.raw/*13.100*/(""" """),format.raw/*13.101*/("""selected """)))}),format.raw/*13.111*/(""" """),format.raw/*13.112*/("""value=""""),_display_(/*13.120*/itemOption/*13.130*/._1),format.raw/*13.133*/("""">"""),_display_(/*13.136*/itemOption/*13.146*/._2),format.raw/*13.149*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
    </div>
    <div>
        <label>Staff In Charge</label>
        <select id="user_id" name="user_id" class="form-control">
            """),_display_(/*20.14*/for(userOption <- userOptions) yield /*20.44*/{_display_(Seq[Any](format.raw/*20.45*/("""
            """),format.raw/*21.13*/("""<option """),_display_(/*21.22*/if(workOrderSampleForm("user_id").value.get == userOption._1.toString)/*21.92*/{_display_(Seq[Any](format.raw/*21.93*/(""" """),format.raw/*21.94*/("""selected """)))}),format.raw/*21.104*/(""" """),format.raw/*21.105*/("""value=""""),_display_(/*21.113*/userOption/*21.123*/._1),format.raw/*21.126*/("""">"""),_display_(/*21.129*/userOption/*21.139*/._2),format.raw/*21.142*/("""</option>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</select>
    </div>

    <div>
        <label>Technician</label>
        <select id="technician_id" name="technician_id" class="form-control">
            """),_display_(/*29.14*/for(techOption <- techOptions) yield /*29.44*/{_display_(Seq[Any](format.raw/*29.45*/("""
            """),format.raw/*30.13*/("""<option """),_display_(/*30.22*/if(workOrderSampleForm("technician_id").value.get == techOption._1.toString)/*30.98*/{_display_(Seq[Any](format.raw/*30.99*/(""" """),format.raw/*30.100*/("""selected """)))}),format.raw/*30.110*/(""" """),format.raw/*30.111*/("""value=""""),_display_(/*30.119*/techOption/*30.129*/._1),format.raw/*30.132*/("""">"""),_display_(/*30.135*/techOption/*30.145*/._2),format.raw/*30.148*/("""</option>
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
                  HASH: 9733cd63acf33e5e85eba8c462e3e761e7c55c74
                  MATRIX: 947->1|1306->264|1334->267|1363->288|1402->290|1432->294|1525->361|1553->369|1609->399|1623->405|1683->445|1779->515|1812->540|1838->546|2015->696|2061->726|2100->727|2142->741|2178->750|2264->827|2304->828|2334->829|2376->839|2406->840|2442->848|2462->858|2487->861|2518->864|2538->874|2563->877|2618->901|2655->911|2836->1065|2882->1095|2921->1096|2963->1110|2999->1119|3078->1189|3117->1190|3146->1191|3188->1201|3218->1202|3254->1210|3274->1220|3299->1223|3330->1226|3350->1236|3375->1239|3430->1263|3467->1273|3657->1436|3703->1466|3742->1467|3784->1481|3820->1490|3905->1566|3944->1567|3974->1568|4016->1578|4046->1579|4082->1587|4102->1597|4127->1600|4158->1603|4178->1613|4203->1616|4258->1640|4295->1650|4475->1803|4540->1859|4579->1860|4608->1861|4649->1871|4678->1872|4832->1999|4861->2007|4914->2030
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|47->20|47->20|47->20|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|49->22|50->23|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|58->31|59->32|65->38|65->38|65->38|65->38|65->38|65->38|69->42|69->42|72->45
                  -- GENERATED --
              */
          