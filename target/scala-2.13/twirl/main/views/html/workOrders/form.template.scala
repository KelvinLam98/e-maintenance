
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[WorkOrder],Array[String],String,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[WorkOrder], errors: Array[String], formType: String)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.145*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div class="col-lg-12">
    <h1 class="page-header">Work Order - """),_display_(/*5.43*/formType),format.raw/*5.51*/("""</h1>
</div>
<form action=""""),_display_(/*7.16*/routes/*7.22*/.WorkOrders.postWorkOrdersDb),format.raw/*7.50*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*8.53*/form("id")/*8.63*/.value),format.raw/*8.69*/("""' class="form-control" placeholder="Required">

    <div class='form-group """),_display_(/*10.29*/if(errors.contains("maintenance_id"))/*10.66*/{_display_(Seq[Any](format.raw/*10.67*/(""" """),format.raw/*10.68*/("""has-error """)))}),format.raw/*10.79*/("""'>
        <label>Code</label>
        <option value='"""),_display_(/*12.25*/form("maintenance_id")/*12.47*/.value),format.raw/*12.53*/("""' id="maintenance_id" name="maintenance_id"></option>
    </div>

    <div class='form-group """),_display_(/*15.29*/if(errors.contains("maintenance_date"))/*15.68*/{_display_(Seq[Any](format.raw/*15.69*/(""" """),format.raw/*15.70*/("""has-error """)))}),format.raw/*15.81*/("""'>
        <label>Date</label>
        <input id="maintenance_date" name="maintenance_date" value='"""),_display_(/*17.70*/form("maintenance_date")/*17.94*/.value),format.raw/*17.100*/("""' class="form-control" placeholder="Required" type="date">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*20.53*/formType),format.raw/*20.61*/("""</button>
</form>

""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(form:Form[WorkOrder],errors:Array[String],formType:String,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(form,errors,formType)(flash,messages,request)

  def f:((Form[WorkOrder],Array[String],String) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (form,errors,formType) => (flash,messages,request) => apply(form,errors,formType)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/workOrders/form.scala.html
                  HASH: 03ac9e3dc4926f54540a1837df0a2d0b01272d6e
                  MATRIX: 839->1|1078->144|1106->147|1135->168|1174->170|1204->174|1297->241|1325->249|1381->279|1395->285|1443->313|1539->383|1557->393|1583->399|1688->477|1734->514|1773->515|1802->516|1844->527|1928->584|1959->606|1986->612|2110->709|2158->748|2197->749|2226->750|2268->761|2397->863|2430->887|2458->893|2619->1027|2648->1035|2701->1058
                  LINES: 23->1|28->1|29->2|29->2|29->2|31->4|32->5|32->5|34->7|34->7|34->7|35->8|35->8|35->8|37->10|37->10|37->10|37->10|37->10|39->12|39->12|39->12|42->15|42->15|42->15|42->15|42->15|44->17|44->17|44->17|47->20|47->20|50->23
                  -- GENERATED --
              */
          