
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

    $(document).ready(function() """),format.raw/*17.34*/("""{"""),format.raw/*17.35*/("""
        """),format.raw/*18.9*/("""var message = $('#email-msg')
        message.hide()
        """),_display_(/*20.10*/if(errors.contains("email"))/*20.38*/{_display_(Seq[Any](format.raw/*20.39*/("""
            """),format.raw/*21.13*/("""message.css('display', 'block').addClass('form-group has-error')
            message.find('.control-label').html('Please enter a valid email.')
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""}"""),format.raw/*24.6*/(""");

    $(document).on('keypress', 'input,select', function (e) """),format.raw/*26.61*/("""{"""),format.raw/*26.62*/("""
        """),format.raw/*27.9*/("""if (e.which == 13) """),format.raw/*27.28*/("""{"""),format.raw/*27.29*/("""
            """),format.raw/*28.13*/("""e.preventDefault();
            var $canfocus = $(':focusable');
            var index = $canfocus.index(this) + 1;
            if (index >= $canfocus.length) index = 0;
            $canfocus.eq(index).focus();
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/(""");
</script>

        <div class="col-lg-12">
            <h1 class="page-header">User - """),_display_(/*38.45*/formType),format.raw/*38.53*/("""</h1>
        </div>
        <div id="msg">
            <label class="control-label"></label>
        </div>
        <form action=""""),_display_(/*43.24*/routes/*43.30*/.Users.postUserDb),format.raw/*43.47*/("""" method="post">
            <input type="hidden" id="id " name="id" value='"""),_display_(/*44.61*/form("id")/*44.71*/.value),format.raw/*44.77*/("""' class="form-control" placeholder="Required">
            <input type="hidden" id="password" name="password" value='"""),_display_(/*45.72*/form("password")/*45.88*/.value),format.raw/*45.94*/("""' class="form-control" placeholder="Required">

            <div class='form-group """),_display_(/*47.37*/if(errors.contains("username"))/*47.68*/{_display_(Seq[Any](format.raw/*47.69*/(""" """),format.raw/*47.70*/("""has-error """)))}),format.raw/*47.81*/("""'>
                <label>Username</label>
                <input id="username " name="username" value='"""),_display_(/*49.63*/form("username")/*49.79*/.value),format.raw/*49.85*/("""' class="form-control" placeholder="Required">
            </div>
            
            <div class='form-group """),_display_(/*52.37*/if(errors.contains("name"))/*52.64*/{_display_(Seq[Any](format.raw/*52.65*/(""" """),format.raw/*52.66*/("""has-error """)))}),format.raw/*52.77*/("""'>
                <label>Name</label>
                <input id="name" name="name" value='"""),_display_(/*54.54*/form("name")/*54.66*/.value),format.raw/*54.72*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*57.37*/if(errors.contains("ic_number"))/*57.69*/{_display_(Seq[Any](format.raw/*57.70*/(""" """),format.raw/*57.71*/("""has-error """)))}),format.raw/*57.82*/("""'>
                <label>IC Number</label>
                <input id="ic_number" name="ic_number" value='"""),_display_(/*59.64*/form("ic_number")/*59.81*/.value),format.raw/*59.87*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*62.37*/if(errors.contains("contact_number"))/*62.74*/{_display_(Seq[Any](format.raw/*62.75*/(""" """),format.raw/*62.76*/("""has-error """)))}),format.raw/*62.87*/("""'>
                <label>Contact Number</label>
                <input id="contact_number" name="contact_number" value='"""),_display_(/*64.74*/form("contact_number")/*64.96*/.value),format.raw/*64.102*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*67.37*/if(errors.contains("address"))/*67.67*/{_display_(Seq[Any](format.raw/*67.68*/(""" """),format.raw/*67.69*/("""has-error """)))}),format.raw/*67.80*/("""'>
                <label>Address</label>
                <input id="address" name="address" value='"""),_display_(/*69.60*/form("address")/*69.75*/.value),format.raw/*69.81*/("""' class="form-control" placeholder="Required">
            </div>

            <div class='form-group """),_display_(/*72.37*/if(errors.contains("email"))/*72.65*/{_display_(Seq[Any](format.raw/*72.66*/(""" """),format.raw/*72.67*/("""has-error """)))}),format.raw/*72.78*/("""'>
                <label>Email</label>
                <input id="email" name="email" value='"""),_display_(/*74.56*/form("email")/*74.69*/.value),format.raw/*74.75*/("""' class="form-control" placeholder="Required">
            </div>
            <div id="email-msg">
                <label class="control-label"></label>
            </div>

            <div>
                <label>Role</label>
                <select name="role" class="form-control">
                    <option """),_display_(/*83.30*/if(form("role").value.get == "admin")/*83.67*/{_display_(Seq[Any](format.raw/*83.68*/(""" """),format.raw/*83.69*/("""selected """)))}),format.raw/*83.79*/(""" """),format.raw/*83.80*/("""value="admin">Admin</option>
                    <option """),_display_(/*84.30*/if(form("role").value.get == "user")/*84.66*/{_display_(Seq[Any](format.raw/*84.67*/(""" """),format.raw/*84.68*/("""selected """)))}),format.raw/*84.78*/(""" """),format.raw/*84.79*/("""value="user">User</option>
                </select>
            </div>
            <br>
                <button type="submit" class="btn btn-primary ">"""),_display_(/*88.65*/formType),format.raw/*88.73*/("""</button>
            </form>

""")))}),format.raw/*91.2*/("""
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
                  HASH: bbd31d4ecc11c0ee9289927b31446490c5bc968a
                  MATRIX: 833->1|1071->143|1099->146|1128->167|1167->169|1195->171|1265->214|1293->215|1329->225|1417->287|1430->292|1464->306|1518->333|1546->334|1587->348|1768->502|1797->503|1834->513|1866->518|1880->523|1915->537|1971->565|2000->566|2042->580|2254->765|2283->766|2316->772|2344->773|2411->812|2440->813|2477->823|2568->887|2605->915|2644->916|2686->930|2872->1085|2905->1091|2933->1092|3027->1158|3056->1159|3093->1169|3140->1188|3169->1189|3211->1203|3462->1427|3491->1428|3524->1434|3552->1435|3673->1529|3702->1537|3866->1674|3881->1680|3919->1697|4024->1775|4043->1785|4070->1791|4216->1910|4241->1926|4268->1932|4381->2018|4421->2049|4460->2050|4489->2051|4531->2062|4665->2169|4690->2185|4717->2191|4862->2309|4898->2336|4937->2337|4966->2338|5008->2349|5129->2443|5150->2455|5177->2461|5310->2567|5351->2599|5390->2600|5419->2601|5461->2612|5597->2721|5623->2738|5650->2744|5783->2850|5829->2887|5868->2888|5897->2889|5939->2900|6090->3024|6121->3046|6149->3052|6282->3158|6321->3188|6360->3189|6389->3190|6431->3201|6561->3304|6585->3319|6612->3325|6745->3431|6782->3459|6821->3460|6850->3461|6892->3472|7016->3569|7038->3582|7065->3588|7415->3911|7461->3948|7500->3949|7529->3950|7570->3960|7599->3961|7685->4020|7730->4056|7769->4057|7798->4058|7839->4068|7868->4069|8052->4226|8081->4234|8146->4269
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|34->7|34->7|34->7|34->7|34->7|35->8|37->10|37->10|38->11|38->11|38->11|38->11|38->11|38->11|39->12|41->14|41->14|42->15|42->15|44->17|44->17|45->18|47->20|47->20|47->20|48->21|50->23|51->24|51->24|53->26|53->26|54->27|54->27|54->27|55->28|60->33|60->33|61->34|61->34|65->38|65->38|70->43|70->43|70->43|71->44|71->44|71->44|72->45|72->45|72->45|74->47|74->47|74->47|74->47|74->47|76->49|76->49|76->49|79->52|79->52|79->52|79->52|79->52|81->54|81->54|81->54|84->57|84->57|84->57|84->57|84->57|86->59|86->59|86->59|89->62|89->62|89->62|89->62|89->62|91->64|91->64|91->64|94->67|94->67|94->67|94->67|94->67|96->69|96->69|96->69|99->72|99->72|99->72|99->72|99->72|101->74|101->74|101->74|110->83|110->83|110->83|110->83|110->83|110->83|111->84|111->84|111->84|111->84|111->84|111->84|115->88|115->88|118->91
                  -- GENERATED --
              */
          