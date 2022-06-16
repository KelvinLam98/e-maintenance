
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

    $(document).ready(function() """),format.raw/*14.34*/("""{"""),format.raw/*14.35*/("""
        """),format.raw/*15.9*/("""var message = $('#msg')
        message.hide()
        if(""""),_display_(/*17.14*/flash/*17.19*/.get("errors")),format.raw/*17.33*/("""" == "itemIsAlreadyExists")"""),format.raw/*17.60*/("""{"""),format.raw/*17.61*/("""
            """),format.raw/*18.13*/("""message.css('display', 'block').addClass('form-group has-error')
            message.find('.control-label').html('There is an Existing Maintenance Item, Please Change')
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/(""");
</script>

<div class="col-lg-12">
    <h1 class="page-header">Maintenance Item - """),_display_(/*25.49*/formType),format.raw/*25.57*/("""</h1>
</div>
<form action=""""),_display_(/*27.16*/routes/*27.22*/.MaintenanceItems.postMaintenanceItemsDb),format.raw/*27.62*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*28.53*/form("id")/*28.63*/.value),format.raw/*28.69*/("""' class="form-control" placeholder="Required">
    <div id="msg">
        <label class="control-label"></label>
    </div>
    <div class='form-group """),_display_(/*32.29*/if(errors.contains("item_code"))/*32.61*/{_display_(Seq[Any](format.raw/*32.62*/(""" """),format.raw/*32.63*/("""has-error """)))}),format.raw/*32.74*/("""'>
        <label>Code</label>
        <input id="item_code" name="item_code" value='"""),_display_(/*34.56*/form("item_code")/*34.73*/.value),format.raw/*34.79*/("""' class="form-control" placeholder="Required" maxlength="5">
    </div>
    """),_display_(/*36.6*/if(errors.contains("item_code"))/*36.38*/{_display_(Seq[Any](format.raw/*36.39*/("""
    """),format.raw/*37.5*/("""<div class="form-group has-error">
        <label class="control-label">Please enter valid data for code.</label>
    </div>
    """)))}),format.raw/*40.6*/("""

    """),format.raw/*42.5*/("""<div class='form-group """),_display_(/*42.29*/if(errors.contains("item_name"))/*42.61*/{_display_(Seq[Any](format.raw/*42.62*/(""" """),format.raw/*42.63*/("""has-error """)))}),format.raw/*42.74*/("""'>
        <label>Name</label>
        <input id="item_name" name="item_name" value='"""),_display_(/*44.56*/form("item_name")/*44.73*/.value),format.raw/*44.79*/("""' class="form-control" placeholder="Required">
    </div>
    """),_display_(/*46.6*/if(errors.contains("item_name"))/*46.38*/{_display_(Seq[Any](format.raw/*46.39*/("""
    """),format.raw/*47.5*/("""<div class="form-group has-error">
        <label class="control-label">Please enter valid data for name.</label>
    </div>
    """)))}),format.raw/*50.6*/("""
    """),format.raw/*51.5*/("""<br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*52.53*/formType),format.raw/*52.61*/("""</button>
</form>

""")))}),format.raw/*55.2*/("""
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
                  HASH: dc3bd8ab38fbe6f43aa2a2f4d67901cde08f0a40
                  MATRIX: 851->1|1096->150|1124->153|1153->174|1192->176|1220->178|1317->248|1345->249|1381->259|1427->278|1455->279|1496->293|1747->517|1776->518|1809->524|1837->525|1904->564|1933->565|1970->575|2059->637|2073->642|2108->656|2163->683|2192->684|2234->698|2440->877|2469->878|2502->884|2530->885|2647->975|2676->983|2733->1013|2748->1019|2809->1059|2906->1129|2925->1139|2952->1145|3134->1300|3175->1332|3214->1333|3243->1334|3285->1345|3400->1433|3426->1450|3453->1456|3558->1535|3599->1567|3638->1568|3671->1574|3834->1707|3869->1715|3920->1739|3961->1771|4000->1772|4029->1773|4071->1784|4186->1872|4212->1889|4239->1895|4330->1960|4371->1992|4410->1993|4443->1999|4606->2132|4639->2138|4724->2196|4753->2204|4806->2227
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|32->5|32->5|33->6|38->11|38->11|39->12|39->12|41->14|41->14|42->15|44->17|44->17|44->17|44->17|44->17|45->18|47->20|47->20|48->21|48->21|52->25|52->25|54->27|54->27|54->27|55->28|55->28|55->28|59->32|59->32|59->32|59->32|59->32|61->34|61->34|61->34|63->36|63->36|63->36|64->37|67->40|69->42|69->42|69->42|69->42|69->42|69->42|71->44|71->44|71->44|73->46|73->46|73->46|74->47|77->50|78->51|79->52|79->52|82->55
                  -- GENERATED --
              */
          