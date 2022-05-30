
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[Form[WorkOrder],Array[String],String,Seq[String],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workOrderForm: Form[WorkOrder], errors: Array[String], formType: String, itemOptions: Seq[String])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.180*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div class="col-lg-12">
    <h1 class="page-header">Work Order - """),_display_(/*5.43*/formType),format.raw/*5.51*/("""</h1>
</div>
<form action=""""),_display_(/*7.16*/routes/*7.22*/.WorkOrders.postWorkOrdersDb),format.raw/*7.50*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*8.53*/workOrderForm("id")/*8.72*/.value),format.raw/*8.78*/("""' class="form-control" placeholder="Required">
    <div>
        <label>Maintenance Item</label>
        <select id="maintenance_name" name="maintenance_name" class="form-control">
            """),_display_(/*12.14*/for(itemOption <- itemOptions) yield /*12.44*/{_display_(Seq[Any](format.raw/*12.45*/("""
            """),format.raw/*13.13*/("""<option """),_display_(/*13.22*/if(workOrderForm("maintenance_name").value.get == "@itemOption")/*13.86*/{_display_(Seq[Any](format.raw/*13.87*/(""" """),format.raw/*13.88*/("""selected """)))}),format.raw/*13.98*/(""" """),format.raw/*13.99*/("""value=""""),_display_(/*13.107*/itemOption),format.raw/*13.117*/("""">"""),_display_(/*13.120*/itemOption),format.raw/*13.130*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
    </div>
    <div class='form-group """),_display_(/*17.29*/if(errors.contains("maintenance_date"))/*17.68*/{_display_(Seq[Any](format.raw/*17.69*/(""" """),format.raw/*17.70*/("""has-error """)))}),format.raw/*17.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*19.70*/workOrderForm("maintenance_date")/*19.103*/.value),format.raw/*19.109*/("""' class="form-control" type="date">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*22.53*/formType),format.raw/*22.61*/("""</button>
</form>

""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(workOrderForm:Form[WorkOrder],errors:Array[String],formType:String,itemOptions:Seq[String],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(workOrderForm,errors,formType,itemOptions)(flash,messages,request)

  def f:((Form[WorkOrder],Array[String],String,Seq[String]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (workOrderForm,errors,formType,itemOptions) => (flash,messages,request) => apply(workOrderForm,errors,formType,itemOptions)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrders/form.scala.html
                  HASH: 6ffcd05455829ee700bd8a366c3b1c525dcf646d
                  MATRIX: 851->1|1125->179|1153->182|1182->203|1221->205|1251->209|1344->276|1372->284|1428->314|1442->320|1490->348|1586->418|1613->437|1639->443|1864->641|1910->671|1949->672|1991->686|2027->695|2100->759|2139->760|2168->761|2209->771|2238->772|2274->780|2306->790|2337->793|2369->803|2424->827|2461->837|2539->888|2587->927|2626->928|2655->929|2697->940|2826->1042|2869->1075|2897->1081|3035->1192|3064->1200|3117->1223
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|42->15|44->17|44->17|44->17|44->17|44->17|46->19|46->19|46->19|49->22|49->22|52->25
                  -- GENERATED --
              */
          