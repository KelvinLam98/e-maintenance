
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
            """),format.raw/*13.13*/("""<option """),_display_(/*13.22*/if(workOrderForm("maintenance_id").value.get == "@itemOption._1")/*13.87*/{_display_(Seq[Any](format.raw/*13.88*/(""" """),format.raw/*13.89*/("""selected """)))}),format.raw/*13.99*/(""" """),format.raw/*13.100*/("""value=""""),_display_(/*13.108*/itemOption/*13.118*/._1),format.raw/*13.121*/("""">"""),_display_(/*13.124*/itemOption/*13.134*/._2),format.raw/*13.137*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
    </div>
    <div>
        <label>Staff In Charge</label>
        <select id="user_id" name="user_id" class="form-control">
            """),_display_(/*20.14*/for(userOption <- userOptions) yield /*20.44*/{_display_(Seq[Any](format.raw/*20.45*/("""
            """),format.raw/*21.13*/("""<option """),_display_(/*21.22*/if(workOrderForm("user_id").value.get == "@userOption._1")/*21.80*/{_display_(Seq[Any](format.raw/*21.81*/(""" """),format.raw/*21.82*/("""selected """)))}),format.raw/*21.92*/(""" """),format.raw/*21.93*/("""value=""""),_display_(/*21.101*/userOption/*21.111*/._1),format.raw/*21.114*/("""">"""),_display_(/*21.117*/userOption/*21.127*/._2),format.raw/*21.130*/("""</option>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</select>
    </div>

    <div>
        <label>Technician</label>
        <select id="technician_id" name="technician_id" class="form-control">
            """),_display_(/*29.14*/for(techOption <- techOptions) yield /*29.44*/{_display_(Seq[Any](format.raw/*29.45*/("""
            """),format.raw/*30.13*/("""<option """),_display_(/*30.22*/if(workOrderForm("technician_id").value.get == "@techOption._1")/*30.86*/{_display_(Seq[Any](format.raw/*30.87*/(""" """),format.raw/*30.88*/("""selected """)))}),format.raw/*30.98*/(""" """),format.raw/*30.99*/("""value=""""),_display_(/*30.107*/techOption/*30.117*/._1),format.raw/*30.120*/("""">"""),_display_(/*30.123*/techOption/*30.133*/._2),format.raw/*30.136*/("""</option>
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</select>
    </div>

    <div>
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*38.22*/if(workOrderForm("status").value.get == "Created")/*38.72*/{_display_(Seq[Any](format.raw/*38.73*/(""" """),format.raw/*38.74*/("""selected """)))}),format.raw/*38.84*/(""" """),format.raw/*38.85*/("""value="Created">Created</option>
            <option """),_display_(/*39.22*/if(workOrderForm("status").value.get == "In Progress")/*39.76*/{_display_(Seq[Any](format.raw/*39.77*/(""" """),format.raw/*39.78*/("""selected """)))}),format.raw/*39.88*/(""" """),format.raw/*39.89*/("""value="In Progress">In Progress</option>
            <option """),_display_(/*40.22*/if(workOrderForm("status").value.get == "Completed")/*40.74*/{_display_(Seq[Any](format.raw/*40.75*/(""" """),format.raw/*40.76*/("""selected """)))}),format.raw/*40.86*/(""" """),format.raw/*40.87*/("""value="Completed">Completed</option>
        </select>
    </div>

    <div class='form-group """),_display_(/*44.29*/if(errors.contains("maintenance_date"))/*44.68*/{_display_(Seq[Any](format.raw/*44.69*/(""" """),format.raw/*44.70*/("""has-error """)))}),format.raw/*44.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*46.70*/workOrderForm("maintenance_date")/*46.103*/.value),format.raw/*46.109*/("""' class="form-control" type="date">
    </div>

    <div class='form-group """),_display_(/*49.29*/if(errors.contains("maintenance_time"))/*49.68*/{_display_(Seq[Any](format.raw/*49.69*/(""" """),format.raw/*49.70*/("""has-error """)))}),format.raw/*49.81*/("""'>
        <label>Time</label>
        <input id="maintenance_time" name="maintenance_time" value='"""),_display_(/*51.70*/workOrderForm("maintenance_time")/*51.103*/.value),format.raw/*51.109*/("""' class="form-control" type="time">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*54.53*/formType),format.raw/*54.61*/("""</button>
</form>

""")))}),format.raw/*57.2*/("""
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
                  HASH: f400f0b4559309d48d2d39cd9ea8de43b41f30ff
                  MATRIX: 935->1|1282->252|1310->255|1339->276|1378->278|1408->282|1501->349|1529->357|1585->387|1599->393|1647->421|1743->491|1770->510|1796->516|1973->666|2019->696|2058->697|2100->711|2136->720|2210->785|2249->786|2278->787|2319->797|2349->798|2385->806|2405->816|2430->819|2461->822|2481->832|2506->835|2561->859|2598->869|2779->1023|2825->1053|2864->1054|2906->1068|2942->1077|3009->1135|3048->1136|3077->1137|3118->1147|3147->1148|3183->1156|3203->1166|3228->1169|3259->1172|3279->1182|3304->1185|3359->1209|3396->1219|3586->1382|3632->1412|3671->1413|3713->1427|3749->1436|3822->1500|3861->1501|3890->1502|3931->1512|3960->1513|3996->1521|4016->1531|4041->1534|4072->1537|4092->1547|4117->1550|4172->1574|4209->1584|4389->1737|4448->1787|4487->1788|4516->1789|4557->1799|4586->1800|4668->1855|4731->1909|4770->1910|4799->1911|4840->1921|4869->1922|4959->1985|5020->2037|5059->2038|5088->2039|5129->2049|5158->2050|5284->2149|5332->2188|5371->2189|5400->2190|5442->2201|5571->2303|5614->2336|5642->2342|5748->2421|5796->2460|5835->2461|5864->2462|5906->2473|6035->2575|6078->2608|6106->2614|6244->2725|6273->2733|6326->2756
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|47->20|47->20|47->20|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|49->22|50->23|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|58->31|59->32|65->38|65->38|65->38|65->38|65->38|65->38|66->39|66->39|66->39|66->39|66->39|66->39|67->40|67->40|67->40|67->40|67->40|67->40|71->44|71->44|71->44|71->44|71->44|73->46|73->46|73->46|76->49|76->49|76->49|76->49|76->49|78->51|78->51|78->51|81->54|81->54|84->57
                  -- GENERATED --
              */
          