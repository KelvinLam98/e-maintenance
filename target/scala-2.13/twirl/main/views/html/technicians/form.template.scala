
package views.html.technicians

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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Technician],Array[String],String,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Technician], errors: Array[String], formType: String)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.146*/("""
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
    <h1 class="page-header">Technician - """),_display_(/*16.43*/formType),format.raw/*16.51*/("""</h1>
</div>
<form action=""""),_display_(/*18.16*/routes/*18.22*/.Technicians.postTechniciansDb),format.raw/*18.52*/("""" method="post">
    <input type="hidden" id="id " name="id" value='"""),_display_(/*19.53*/form("id")/*19.63*/.value),format.raw/*19.69*/("""' class="form-control" placeholder="Required">

    <div class='form-group """),_display_(/*21.29*/if(errors.contains("name"))/*21.56*/{_display_(Seq[Any](format.raw/*21.57*/(""" """),format.raw/*21.58*/("""has-error """)))}),format.raw/*21.69*/("""'>
        <label>Name</label>
        <input id="name" name="name" value='"""),_display_(/*23.46*/form("name")/*23.58*/.value),format.raw/*23.64*/("""' class="form-control" placeholder="Required">
    </div>

    <div class='form-group """),_display_(/*26.29*/if(errors.contains("contact_number"))/*26.66*/{_display_(Seq[Any](format.raw/*26.67*/(""" """),format.raw/*26.68*/("""has-error """)))}),format.raw/*26.79*/("""'>
        <label>Contact Number</label>
        <input id="contact_number" name="contact_number" value='"""),_display_(/*28.66*/form("contact_number")/*28.88*/.value),format.raw/*28.94*/("""' class="form-control" placeholder="Required">
    </div>
    <br>
    <button type="submit" class="btn btn-primary ">"""),_display_(/*31.53*/formType),format.raw/*31.61*/("""</button>
</form>

""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(form:Form[Technician],errors:Array[String],formType:String,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(form,errors,formType)(flash,messages,request)

  def f:((Form[Technician],Array[String],String) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (form,errors,formType) => (flash,messages,request) => apply(form,errors,formType)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/technicians/form.scala.html
                  HASH: 68289b8c6f62684a0d57661d93c82a0102163d39
                  MATRIX: 841->1|1081->145|1109->148|1138->169|1177->171|1205->173|1302->243|1330->244|1366->254|1412->273|1440->274|1481->288|1732->512|1761->513|1794->519|1822->520|1933->604|1962->612|2019->642|2034->648|2085->678|2182->748|2201->758|2228->764|2333->842|2369->869|2408->870|2437->871|2479->882|2584->960|2605->972|2632->978|2749->1068|2795->1105|2834->1106|2863->1107|2905->1118|3040->1226|3071->1248|3098->1254|3247->1376|3276->1384|3329->1407
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|32->5|32->5|33->6|38->11|38->11|39->12|39->12|43->16|43->16|45->18|45->18|45->18|46->19|46->19|46->19|48->21|48->21|48->21|48->21|48->21|50->23|50->23|50->23|53->26|53->26|53->26|53->26|53->26|55->28|55->28|55->28|58->31|58->31|61->34
                  -- GENERATED --
              */
          