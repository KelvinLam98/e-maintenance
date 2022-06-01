
package views.html.maintenanceItems

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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[MaintenanceItem],Array[String],String,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[MaintenanceItem], errors: Array[String], formType: String)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.151*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<script>
    $(document).on('keypress', 'input,select', function (e) """),format.raw/*4.61*/("""{"""),format.raw/*4.62*/("""
        """),format.raw/*5.9*/("""if (e.which == 13) """),format.raw/*5.28*/("""{"""),format.raw/*5.29*/("""
            """),format.raw/*6.13*/("""e.preventDefault();
            var $canfocus = $(':focusable');
            var index = $canfocus.index(this) + 1;
            if (index >= $canfocus.length) index = 0;
            $canfocus.eq(index).focus();
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/(""");
</script>

<div class="col-lg-12">
    <h1 class="page-header">Maintenance Item - """),_display_(/*16.49*/formType),format.raw/*16.57*/("""</h1>
</div>
<form action=""""),_display_(/*18.16*/routes/*18.22*/.MaintenanceItems.postMaintenanceItemsDb),format.raw/*18.62*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*19.53*/form("id")/*19.63*/.value),format.raw/*19.69*/("""' class="form-control" placeholder="Required">

    <div class='form-group """),_display_(/*21.29*/if(errors.contains("item_code"))/*21.61*/{_display_(Seq[Any](format.raw/*21.62*/(""" """),format.raw/*21.63*/("""has-error """)))}),format.raw/*21.74*/("""'>
        <label>Code</label>
        <input id="item_code" name="item_code" value='"""),_display_(/*23.56*/form("item_code")/*23.73*/.value),format.raw/*23.79*/("""' class="form-control" placeholder="Required">
    </div>

    <div class='form-group """),_display_(/*26.29*/if(errors.contains("item_name"))/*26.61*/{_display_(Seq[Any](format.raw/*26.62*/(""" """),format.raw/*26.63*/("""has-error """)))}),format.raw/*26.74*/("""'>
        <label>Name</label>
        <input id="item_name" name="item_name" value='"""),_display_(/*28.56*/form("item_name")/*28.73*/.value),format.raw/*28.79*/("""' class="form-control" placeholder="Required">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*31.53*/formType),format.raw/*31.61*/("""</button>
</form>

""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(form:Form[MaintenanceItem],errors:Array[String],formType:String,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(form,errors,formType)(flash,messages,request)

  def f:((Form[MaintenanceItem],Array[String],String) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (form,errors,formType) => (flash,messages,request) => apply(form,errors,formType)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/maintenanceItems/form.scala.html
                  HASH: ab02810f47d168688ccca1cae1b19e62d59d0211
                  MATRIX: 851->1|1096->150|1124->153|1153->174|1192->176|1220->178|1317->248|1345->249|1381->259|1427->278|1455->279|1496->293|1747->517|1776->518|1809->524|1837->525|1954->615|1983->623|2040->653|2055->659|2116->699|2213->769|2232->779|2259->785|2364->863|2405->895|2444->896|2473->897|2515->908|2630->996|2656->1013|2683->1019|2800->1109|2841->1141|2880->1142|2909->1143|2951->1154|3066->1242|3092->1259|3119->1265|3268->1387|3297->1395|3350->1418
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|32->5|32->5|33->6|38->11|38->11|39->12|39->12|43->16|43->16|45->18|45->18|45->18|46->19|46->19|46->19|48->21|48->21|48->21|48->21|48->21|50->23|50->23|50->23|53->26|53->26|53->26|53->26|53->26|55->28|55->28|55->28|58->31|58->31|61->34
                  -- GENERATED --
              */
          