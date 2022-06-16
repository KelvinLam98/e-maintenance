
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
        <input id="item_code" name="item_code" value='"""),_display_(/*23.56*/form("item_code")/*23.73*/.value),format.raw/*23.79*/("""' class="form-control" placeholder="Required" maxlength="5">
    </div>
    """),_display_(/*25.6*/if(errors.contains("item_code"))/*25.38*/{_display_(Seq[Any](format.raw/*25.39*/("""
    """),format.raw/*26.5*/("""<div class="form-group has-error">
        <label class="control-label">Please enter valid data for code.</label>
    </div>
    """)))}),format.raw/*29.6*/("""

    """),format.raw/*31.5*/("""<div class='form-group """),_display_(/*31.29*/if(errors.contains("item_name"))/*31.61*/{_display_(Seq[Any](format.raw/*31.62*/(""" """),format.raw/*31.63*/("""has-error """)))}),format.raw/*31.74*/("""'>
        <label>Name</label>
        <input id="item_name" name="item_name" value='"""),_display_(/*33.56*/form("item_name")/*33.73*/.value),format.raw/*33.79*/("""' class="form-control" placeholder="Required">
    </div>
    """),_display_(/*35.6*/if(errors.contains("item_name"))/*35.38*/{_display_(Seq[Any](format.raw/*35.39*/("""
    """),format.raw/*36.5*/("""<div class="form-group has-error">
        <label class="control-label">Please enter valid data for name.</label>
    </div>
    """)))}),format.raw/*39.6*/("""
    """),format.raw/*40.5*/("""<br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*41.53*/formType),format.raw/*41.61*/("""</button>
</form>

""")))}),format.raw/*44.2*/("""
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
                  HASH: 800caa4ac862b785870879765163fc2be242688e
                  MATRIX: 851->1|1096->150|1124->153|1153->174|1192->176|1220->178|1317->248|1345->249|1381->259|1427->278|1455->279|1496->293|1747->517|1776->518|1809->524|1837->525|1954->615|1983->623|2040->653|2055->659|2116->699|2213->769|2232->779|2259->785|2364->863|2405->895|2444->896|2473->897|2515->908|2630->996|2656->1013|2683->1019|2788->1098|2829->1130|2868->1131|2901->1137|3064->1270|3099->1278|3150->1302|3191->1334|3230->1335|3259->1336|3301->1347|3416->1435|3442->1452|3469->1458|3560->1523|3601->1555|3640->1556|3673->1562|3836->1695|3869->1701|3954->1759|3983->1767|4036->1790
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|32->5|32->5|33->6|38->11|38->11|39->12|39->12|43->16|43->16|45->18|45->18|45->18|46->19|46->19|46->19|48->21|48->21|48->21|48->21|48->21|50->23|50->23|50->23|52->25|52->25|52->25|53->26|56->29|58->31|58->31|58->31|58->31|58->31|58->31|60->33|60->33|60->33|62->35|62->35|62->35|63->36|66->39|67->40|68->41|68->41|71->44
                  -- GENERATED --
              */
          