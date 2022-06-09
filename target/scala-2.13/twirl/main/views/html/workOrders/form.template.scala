
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Form[WorkOrder],Array[String],String,Seq[String],Seq[String],Seq[scala.Tuple2[Long, String]],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrderForm: Form[WorkOrder], errors: Array[String], formType: String, itemOptions: Seq[String], userOptions: Seq[String], techOptions: Seq[(Long,String)])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.239*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div class="col-lg-12">
    <h1 class="page-header">Work Order - """),_display_(/*5.43*/formType),format.raw/*5.51*/("""</h1>
</div>
<form action=""""),_display_(/*7.16*/routes/*7.22*/.WorkOrders.postWorkOrdersDb),format.raw/*7.50*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*8.53*/workOrderForm("id")/*8.72*/.value),format.raw/*8.78*/("""'>
    <div>
        <label>Maintenance Item</label>
        <select id="maintenance_name" name="maintenance_name" class="form-control">
            """),_display_(/*12.14*/for(itemOption <- itemOptions) yield /*12.44*/{_display_(Seq[Any](format.raw/*12.45*/("""
            """),format.raw/*13.13*/("""<option """),_display_(/*13.22*/if(workOrderForm("maintenance_name").value.get == "@itemOption")/*13.86*/{_display_(Seq[Any](format.raw/*13.87*/(""" """),format.raw/*13.88*/("""selected """)))}),format.raw/*13.98*/(""" """),format.raw/*13.99*/("""value=""""),_display_(/*13.107*/itemOption),format.raw/*13.117*/("""">"""),_display_(/*13.120*/itemOption),format.raw/*13.130*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
    </div>
    <div>
        <label>Staff In Charge</label>
        <select id="person_in_charge" name="person_in_charge" class="form-control">
            """),_display_(/*20.14*/for(userOption <- userOptions) yield /*20.44*/{_display_(Seq[Any](format.raw/*20.45*/("""
            """),format.raw/*21.13*/("""<option """),_display_(/*21.22*/if(workOrderForm("person_in_charge").value.get == "@userOption")/*21.86*/{_display_(Seq[Any](format.raw/*21.87*/(""" """),format.raw/*21.88*/("""selected """)))}),format.raw/*21.98*/(""" """),format.raw/*21.99*/("""value=""""),_display_(/*21.107*/userOption),format.raw/*21.117*/("""">"""),_display_(/*21.120*/userOption),format.raw/*21.130*/("""</option>
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
        <input id="maintenance_time" name="maintenance_time" value='"""),_display_(/*51.70*/workOrderForm("maintenance_time")/*51.103*/.value.toString()),format.raw/*51.120*/("""' class="form-control" type="time">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*54.53*/formType),format.raw/*54.61*/("""</button>
</form>

""")))}),format.raw/*57.2*/("""
"""))
      }
    }
  }

  def render(workOrderForm:Form[WorkOrder],errors:Array[String],formType:String,itemOptions:Seq[String],userOptions:Seq[String],techOptions:Seq[scala.Tuple2[Long, String]],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrderForm,errors,formType,itemOptions,userOptions,techOptions)(flash,messages,request)

  def f:((Form[WorkOrder],Array[String],String,Seq[String],Seq[String],Seq[scala.Tuple2[Long, String]]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrderForm,errors,formType,itemOptions,userOptions,techOptions) => (flash,messages,request) => apply(workOrderForm,errors,formType,itemOptions,userOptions,techOptions)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrders/form.scala.html
                  HASH: 2a7fcf2aa664827d67c60bc13c9200c486d7fa1d
                  MATRIX: 895->1|1228->238|1256->241|1285->262|1324->264|1354->268|1447->335|1475->343|1531->373|1545->379|1593->407|1689->477|1716->496|1742->502|1923->656|1969->686|2008->687|2050->701|2086->710|2159->774|2198->775|2227->776|2268->786|2297->787|2333->795|2365->805|2396->808|2428->818|2483->842|2520->852|2719->1024|2765->1054|2804->1055|2846->1069|2882->1078|2955->1142|2994->1143|3023->1144|3064->1154|3093->1155|3129->1163|3161->1173|3192->1176|3224->1186|3279->1210|3316->1220|3506->1383|3552->1413|3591->1414|3633->1428|3669->1437|3742->1501|3781->1502|3810->1503|3851->1513|3880->1514|3916->1522|3936->1532|3961->1535|3992->1538|4012->1548|4037->1551|4092->1575|4129->1585|4309->1738|4368->1788|4407->1789|4436->1790|4477->1800|4506->1801|4588->1856|4651->1910|4690->1911|4719->1912|4760->1922|4789->1923|4879->1986|4940->2038|4979->2039|5008->2040|5049->2050|5078->2051|5204->2150|5252->2189|5291->2190|5320->2191|5362->2202|5491->2304|5534->2337|5562->2343|5668->2422|5716->2461|5755->2462|5784->2463|5826->2474|5955->2576|5998->2609|6037->2626|6175->2737|6204->2745|6257->2768
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|47->20|47->20|47->20|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|49->22|50->23|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|58->31|59->32|65->38|65->38|65->38|65->38|65->38|65->38|66->39|66->39|66->39|66->39|66->39|66->39|67->40|67->40|67->40|67->40|67->40|67->40|71->44|71->44|71->44|71->44|71->44|73->46|73->46|73->46|76->49|76->49|76->49|76->49|76->49|78->51|78->51|78->51|81->54|81->54|84->57
                  -- GENERATED --
              */
          