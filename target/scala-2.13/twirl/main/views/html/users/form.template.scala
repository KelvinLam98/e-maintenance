
package views.html.users

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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[UserForm],Array[String],String,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[UserForm], errors: Array[String], formType: String)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.144*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<script>
    $(document).ready(function() """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""
        """),format.raw/*5.9*/("""var message = $('#msg')
        message.hide()
        if(""""),_display_(/*7.14*/flash/*7.19*/.get("errors")),format.raw/*7.33*/("""" == "userIsAlreadyExists")"""),format.raw/*7.60*/("""{"""),format.raw/*7.61*/("""
            """),format.raw/*8.13*/("""message.css('display', 'block').addClass('form-group has-error')
            message.find('.control-label').html('The User is already exists.')
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
        """),format.raw/*11.9*/("""if(""""),_display_(/*11.14*/flash/*11.19*/.get("errors")),format.raw/*11.33*/("""" == "emailIsAlreadyExists")"""),format.raw/*11.61*/("""{"""),format.raw/*11.62*/("""
            """),format.raw/*12.13*/("""message.css('display', 'block').addClass('form-group has-error')
            message.find('.control-label').html('The Email is already exists. Please use a different Email.')
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""
    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/(""");

    $(document).on('keypress', 'input,select', function (e) """),format.raw/*17.61*/("""{"""),format.raw/*17.62*/("""
        """),format.raw/*18.9*/("""if (e.which == 13) """),format.raw/*18.28*/("""{"""),format.raw/*18.29*/("""
            """),format.raw/*19.13*/("""e.preventDefault();
            var $canfocus = $(':focusable');
            var index = $canfocus.index(this) + 1;
            if (index >= $canfocus.length) index = 0;
            $canfocus.eq(index).focus();
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/(""");
</script>

        <div class="col-lg-12">
            <h1 class="page-header">User - """),_display_(/*29.45*/formType),format.raw/*29.53*/("""</h1>
        </div>
        <div id="msg">
            <label class="control-label"></label>
        </div>
        <form action=""""),_display_(/*34.24*/routes/*34.30*/.Users.postUserDb),format.raw/*34.47*/("""" method="post">
            <input type="hidden" id="id " name="id" value='"""),_display_(/*35.61*/form("id")/*35.71*/.value),format.raw/*35.77*/("""' class="form-control" placeholder="Required">
            <input type="hidden" id="password" name="password" value='"""),_display_(/*36.72*/form("password")/*36.88*/.value),format.raw/*36.94*/("""' class="form-control" placeholder="Required">

            <div class='form-group """),_display_(/*38.37*/if(errors.contains("username"))/*38.68*/{_display_(Seq[Any](format.raw/*38.69*/(""" """),format.raw/*38.70*/("""has-error """)))}),format.raw/*38.81*/("""'>
                <label>Username</label>
                <input id="username " name="username" value='"""),_display_(/*40.63*/form("username")/*40.79*/.value),format.raw/*40.85*/("""' class="form-control" placeholder="Required">
            </div>
            
            <div class='form-group """),_display_(/*43.37*/if(errors.contains("name"))/*43.64*/{_display_(Seq[Any](format.raw/*43.65*/(""" """),format.raw/*43.66*/("""has-error """)))}),format.raw/*43.77*/("""'>
                <label>Name</label>
                <input id="name" name="name" value='"""),_display_(/*45.54*/form("name")/*45.66*/.value),format.raw/*45.72*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*48.37*/if(errors.contains("ic_number"))/*48.69*/{_display_(Seq[Any](format.raw/*48.70*/(""" """),format.raw/*48.71*/("""has-error """)))}),format.raw/*48.82*/("""'>
                <label>IC Number</label>
                <input id="ic_number" name="ic_number" value='"""),_display_(/*50.64*/form("ic_number")/*50.81*/.value),format.raw/*50.87*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*53.37*/if(errors.contains("contact_number"))/*53.74*/{_display_(Seq[Any](format.raw/*53.75*/(""" """),format.raw/*53.76*/("""has-error """)))}),format.raw/*53.87*/("""'>
                <label>Contact Number</label>
                <input id="contact_number" name="contact_number" value='"""),_display_(/*55.74*/form("contact_number")/*55.96*/.value),format.raw/*55.102*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*58.37*/if(errors.contains("address"))/*58.67*/{_display_(Seq[Any](format.raw/*58.68*/(""" """),format.raw/*58.69*/("""has-error """)))}),format.raw/*58.80*/("""'>
                <label>Address</label>
                <input id="address" name="address" value='"""),_display_(/*60.60*/form("address")/*60.75*/.value),format.raw/*60.81*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*63.37*/if(errors.contains("email"))/*63.65*/{_display_(Seq[Any](format.raw/*63.66*/(""" """),format.raw/*63.67*/("""has-error """)))}),format.raw/*63.78*/("""'>
                <label>Email</label>
                <input id="email" name="email" value='"""),_display_(/*65.56*/form("email")/*65.69*/.value),format.raw/*65.75*/("""' class="form-control" placeholder="Required">
            </div>

            <div>
                <label>Role</label>
                <select name="role" class="form-control">
                    <option """),_display_(/*71.30*/if(form("role").value.get == "admin")/*71.67*/{_display_(Seq[Any](format.raw/*71.68*/(""" """),format.raw/*71.69*/("""selected """)))}),format.raw/*71.79*/(""" """),format.raw/*71.80*/("""value="admin">Admin</option>
                    <option """),_display_(/*72.30*/if(form("role").value.get == "user")/*72.66*/{_display_(Seq[Any](format.raw/*72.67*/(""" """),format.raw/*72.68*/("""selected """)))}),format.raw/*72.78*/(""" """),format.raw/*72.79*/("""value="user">User</option>
                </select>
            </div>
            <br>
                <button type="submit" class="btn btn-primary ">"""),_display_(/*76.65*/formType),format.raw/*76.73*/("""</button>
            </form>

""")))}),format.raw/*79.2*/("""
"""))
      }
    }
  }

  def render(form:Form[UserForm],errors:Array[String],formType:String,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(form,errors,formType)(flash,messages,request)

  def f:((Form[UserForm],Array[String],String) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (form,errors,formType) => (flash,messages,request) => apply(form,errors,formType)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/users/form.scala.html
                  HASH: 529a260d5b565855ca43c808e3fe98f6d8431a0f
                  MATRIX: 833->1|1071->143|1099->146|1128->167|1167->169|1195->171|1265->214|1293->215|1329->225|1417->287|1430->292|1464->306|1518->333|1546->334|1587->348|1768->502|1797->503|1834->513|1866->518|1880->523|1915->537|1971->565|2000->566|2042->580|2254->765|2283->766|2316->772|2344->773|2438->839|2467->840|2504->850|2551->869|2580->870|2622->884|2873->1108|2902->1109|2935->1115|2963->1116|3084->1210|3113->1218|3277->1355|3292->1361|3330->1378|3435->1456|3454->1466|3481->1472|3627->1591|3652->1607|3679->1613|3792->1699|3832->1730|3871->1731|3900->1732|3942->1743|4076->1850|4101->1866|4128->1872|4273->1990|4309->2017|4348->2018|4377->2019|4419->2030|4540->2124|4561->2136|4588->2142|4721->2248|4762->2280|4801->2281|4830->2282|4872->2293|5008->2402|5034->2419|5061->2425|5194->2531|5240->2568|5279->2569|5308->2570|5350->2581|5501->2705|5532->2727|5560->2733|5693->2839|5732->2869|5771->2870|5800->2871|5842->2882|5972->2985|5996->3000|6023->3006|6156->3112|6193->3140|6232->3141|6261->3142|6303->3153|6427->3250|6449->3263|6476->3269|6717->3483|6763->3520|6802->3521|6831->3522|6872->3532|6901->3533|6987->3592|7032->3628|7071->3629|7100->3630|7141->3640|7170->3641|7354->3798|7383->3806|7448->3841
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|34->7|34->7|34->7|34->7|34->7|35->8|37->10|37->10|38->11|38->11|38->11|38->11|38->11|38->11|39->12|41->14|41->14|42->15|42->15|44->17|44->17|45->18|45->18|45->18|46->19|51->24|51->24|52->25|52->25|56->29|56->29|61->34|61->34|61->34|62->35|62->35|62->35|63->36|63->36|63->36|65->38|65->38|65->38|65->38|65->38|67->40|67->40|67->40|70->43|70->43|70->43|70->43|70->43|72->45|72->45|72->45|75->48|75->48|75->48|75->48|75->48|77->50|77->50|77->50|80->53|80->53|80->53|80->53|80->53|82->55|82->55|82->55|85->58|85->58|85->58|85->58|85->58|87->60|87->60|87->60|90->63|90->63|90->63|90->63|90->63|92->65|92->65|92->65|98->71|98->71|98->71|98->71|98->71|98->71|99->72|99->72|99->72|99->72|99->72|99->72|103->76|103->76|106->79
                  -- GENERATED --
              */
          