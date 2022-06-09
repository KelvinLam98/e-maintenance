
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Form[WorkOrder],Array[String],String,Seq[String],Seq[String],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrderForm: Form[WorkOrder], errors: Array[String], formType: String, itemOptions: Seq[String], userOptions: Seq[String])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.206*/("""
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
        <label>Status</label>
        <select id="status" name="status" class="form-control">
            <option """),_display_(/*28.22*/if(workOrderForm("status").value.get == "Created")/*28.72*/{_display_(Seq[Any](format.raw/*28.73*/(""" """),format.raw/*28.74*/("""selected """)))}),format.raw/*28.84*/(""" """),format.raw/*28.85*/("""value="Created">Created</option>
            <option """),_display_(/*29.22*/if(workOrderForm("status").value.get == "In Progress")/*29.76*/{_display_(Seq[Any](format.raw/*29.77*/(""" """),format.raw/*29.78*/("""selected """)))}),format.raw/*29.88*/(""" """),format.raw/*29.89*/("""value="In Progress">In Progress</option>
            <option """),_display_(/*30.22*/if(workOrderForm("status").value.get == "Completed")/*30.74*/{_display_(Seq[Any](format.raw/*30.75*/(""" """),format.raw/*30.76*/("""selected """)))}),format.raw/*30.86*/(""" """),format.raw/*30.87*/("""value="Completed">Completed</option>
        </select>
    </div>

    <div class='form-group """),_display_(/*34.29*/if(errors.contains("maintenance_date"))/*34.68*/{_display_(Seq[Any](format.raw/*34.69*/(""" """),format.raw/*34.70*/("""has-error """)))}),format.raw/*34.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*36.70*/workOrderForm("maintenance_date")/*36.103*/.value),format.raw/*36.109*/("""' class="form-control" type="date">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*39.53*/formType),format.raw/*39.61*/("""</button>
</form>

""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(workOrderForm:Form[WorkOrder],errors:Array[String],formType:String,itemOptions:Seq[String],userOptions:Seq[String],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrderForm,errors,formType,itemOptions,userOptions)(flash,messages,request)

  def f:((Form[WorkOrder],Array[String],String,Seq[String],Seq[String]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrderForm,errors,formType,itemOptions,userOptions) => (flash,messages,request) => apply(workOrderForm,errors,formType,itemOptions,userOptions)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrders/form.scala.html
                  HASH: df871ddcd8d6af31786d32aad0e42f3b84818e13
                  MATRIX: 863->1|1163->205|1191->208|1220->229|1259->231|1289->235|1382->302|1410->310|1466->340|1480->346|1528->374|1624->444|1651->463|1677->469|1858->623|1904->653|1943->654|1985->668|2021->677|2094->741|2133->742|2162->743|2203->753|2232->754|2268->762|2300->772|2331->775|2363->785|2418->809|2455->819|2654->991|2700->1021|2739->1022|2781->1036|2817->1045|2890->1109|2929->1110|2958->1111|2999->1121|3028->1122|3064->1130|3096->1140|3127->1143|3159->1153|3214->1177|3251->1187|3429->1338|3488->1388|3527->1389|3556->1390|3597->1400|3626->1401|3708->1456|3771->1510|3810->1511|3839->1512|3880->1522|3909->1523|3999->1586|4060->1638|4099->1639|4128->1640|4169->1650|4198->1651|4324->1750|4372->1789|4411->1790|4440->1791|4482->1802|4611->1904|4654->1937|4682->1943|4820->2054|4849->2062|4902->2085
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|47->20|47->20|47->20|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|49->22|50->23|55->28|55->28|55->28|55->28|55->28|55->28|56->29|56->29|56->29|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|57->30|61->34|61->34|61->34|61->34|61->34|63->36|63->36|63->36|66->39|66->39|69->42
                  -- GENERATED --
              */
          