
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[WorkOrder],Array[String],String,Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Seq[scala.Tuple2[Long, String]],Flash,Messages,models.RequestWithUser[_$1] forSome { 
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
    <div>
        <label>Maintenance Item</label>
        <select id="maintenance_id" name="maintenance_id" class="form-control">
            """),_display_(/*12.14*/for(itemOption <- itemOptions) yield /*12.44*/{_display_(Seq[Any](format.raw/*12.45*/("""
            """),format.raw/*13.13*/("""<option """),_display_(/*13.22*/if(workOrderForm("maintenance_id").value.get == itemOption._1.toString)/*13.93*/{_display_(Seq[Any](format.raw/*13.94*/(""" """),format.raw/*13.95*/("""selected """)))}),format.raw/*13.105*/(""" """),format.raw/*13.106*/("""value=""""),_display_(/*13.114*/itemOption/*13.124*/._1),format.raw/*13.127*/("""">"""),_display_(/*13.130*/itemOption/*13.140*/._2),format.raw/*13.143*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
    </div>
    <div>
        <label>Staff In Charge</label>
        <select id="user_id" name="user_id" class="form-control">
            """),_display_(/*20.14*/for(userOption <- userOptions) yield /*20.44*/{_display_(Seq[Any](format.raw/*20.45*/("""
            """),format.raw/*21.13*/("""<option """),_display_(/*21.22*/if(workOrderForm("user_id").value.get == userOption._1.toString)/*21.86*/{_display_(Seq[Any](format.raw/*21.87*/(""" """),format.raw/*21.88*/("""selected """)))}),format.raw/*21.98*/(""" """),format.raw/*21.99*/("""value=""""),_display_(/*21.107*/userOption/*21.117*/._1),format.raw/*21.120*/("""">"""),_display_(/*21.123*/userOption/*21.133*/._2),format.raw/*21.136*/("""</option>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</select>
    </div>

    <div>
        <label>Technician</label>
        <select id="technician_id" name="technician_id" class="form-control">
            """),_display_(/*29.14*/for(techOption <- techOptions) yield /*29.44*/{_display_(Seq[Any](format.raw/*29.45*/("""
            """),format.raw/*30.13*/("""<option """),_display_(/*30.22*/if(workOrderForm("technician_id").value.get == techOption._1.toString)/*30.92*/{_display_(Seq[Any](format.raw/*30.93*/(""" """),format.raw/*30.94*/("""selected """)))}),format.raw/*30.104*/(""" """),format.raw/*30.105*/("""value=""""),_display_(/*30.113*/techOption/*30.123*/._1),format.raw/*30.126*/("""">"""),_display_(/*30.129*/techOption/*30.139*/._2),format.raw/*30.142*/("""</option>
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</select>
    </div>

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*38.22*/if(workOrderForm("status").value.get == "Pending")/*38.72*/{_display_(Seq[Any](format.raw/*38.73*/(""" """),format.raw/*38.74*/("""selected """)))}),format.raw/*38.84*/(""" """),format.raw/*38.85*/("""value="Pending">Pending</option>
            <option """),_display_(/*39.22*/if(workOrderForm("status").value.get == "Created")/*39.72*/{_display_(Seq[Any](format.raw/*39.73*/(""" """),format.raw/*39.74*/("""selected """)))}),format.raw/*39.84*/(""" """),format.raw/*39.85*/("""value="Created">Created</option>
            <option """),_display_(/*40.22*/if(workOrderForm("status").value.get == "In Progress")/*40.76*/{_display_(Seq[Any](format.raw/*40.77*/(""" """),format.raw/*40.78*/("""selected """)))}),format.raw/*40.88*/(""" """),format.raw/*40.89*/("""value="In Progress">In Progress</option>
            <option """),_display_(/*41.22*/if(workOrderForm("status").value.get == "Completed")/*41.74*/{_display_(Seq[Any](format.raw/*41.75*/(""" """),format.raw/*41.76*/("""selected """)))}),format.raw/*41.86*/(""" """),format.raw/*41.87*/("""value="Completed">Completed</option>
        </select>
    </div>

    <div class='form-group """),_display_(/*45.29*/if(errors.contains("maintenance_date"))/*45.68*/{_display_(Seq[Any](format.raw/*45.69*/(""" """),format.raw/*45.70*/("""has-error """)))}),format.raw/*45.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*47.70*/workOrderForm("maintenance_date")/*47.103*/.value),format.raw/*47.109*/("""' class="form-control" type="date" placeholder="dd-mm-yyyy">
    </div>

    <div class='form-group """),_display_(/*50.29*/if(errors.contains("maintenance_time"))/*50.68*/{_display_(Seq[Any](format.raw/*50.69*/(""" """),format.raw/*50.70*/("""has-error """)))}),format.raw/*50.81*/("""'>
        <label>Time (Note: keep minutes as 00)</label>
        <input id="maintenance_time" name="maintenance_time" value='"""),_display_(/*52.70*/workOrderForm("maintenance_time")/*52.103*/.value),format.raw/*52.109*/("""' class="form-control" type="time" min="09:00" max="18:00" step="3600">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*55.53*/formType),format.raw/*55.61*/("""</button>
</form>

""")))}),format.raw/*58.2*/("""
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
                  SOURCE: app/views/workOrders/form.scala.html
                  HASH: 7a30f6cbc282016ae2c653fc160d9ffed8651844
                  MATRIX: 935->1|1282->252|1310->255|1339->276|1378->278|1408->282|1501->349|1529->357|1585->387|1599->393|1647->421|1743->491|1770->510|1796->516|1973->666|2019->696|2058->697|2100->711|2136->720|2216->791|2255->792|2284->793|2326->803|2356->804|2392->812|2412->822|2437->825|2468->828|2488->838|2513->841|2568->865|2605->875|2786->1029|2832->1059|2871->1060|2913->1074|2949->1083|3022->1147|3061->1148|3090->1149|3131->1159|3160->1160|3196->1168|3216->1178|3241->1181|3272->1184|3292->1194|3317->1197|3372->1221|3409->1231|3599->1394|3645->1424|3684->1425|3726->1439|3762->1448|3841->1518|3880->1519|3909->1520|3951->1530|3981->1531|4017->1539|4037->1549|4062->1552|4093->1555|4113->1565|4138->1568|4193->1592|4230->1602|4410->1755|4469->1805|4508->1806|4537->1807|4578->1817|4607->1818|4689->1873|4748->1923|4787->1924|4816->1925|4857->1935|4886->1936|4968->1991|5031->2045|5070->2046|5099->2047|5140->2057|5169->2058|5259->2121|5320->2173|5359->2174|5388->2175|5429->2185|5458->2186|5584->2285|5632->2324|5671->2325|5700->2326|5742->2337|5871->2439|5914->2472|5942->2478|6073->2582|6121->2621|6160->2622|6189->2623|6231->2634|6387->2763|6430->2796|6458->2802|6632->2949|6661->2957|6714->2980
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|47->20|47->20|47->20|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|49->22|50->23|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|58->31|59->32|65->38|65->38|65->38|65->38|65->38|65->38|66->39|66->39|66->39|66->39|66->39|66->39|67->40|67->40|67->40|67->40|67->40|67->40|68->41|68->41|68->41|68->41|68->41|68->41|72->45|72->45|72->45|72->45|72->45|74->47|74->47|74->47|77->50|77->50|77->50|77->50|77->50|79->52|79->52|79->52|82->55|82->55|85->58
                  -- GENERATED --
              */
          