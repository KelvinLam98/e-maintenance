
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
            <input type="hidden" id="username" name="username" value='"""),_display_(/*46.72*/form("username")/*46.88*/.value),format.raw/*46.94*/("""' class="form-control" placeholder="Required">

            <div class='form-group """),_display_(/*48.37*/if(errors.contains("name"))/*48.64*/{_display_(Seq[Any](format.raw/*48.65*/(""" """),format.raw/*48.66*/("""has-error """)))}),format.raw/*48.77*/("""'>
                <label>Name</label>
                <input id="name" name="name" value='"""),_display_(/*50.54*/form("name")/*50.66*/.value),format.raw/*50.72*/("""' class="form-control" placeholder="Required">
            </div>
            """),_display_(/*52.14*/if(errors.contains("name"))/*52.41*/{_display_(Seq[Any](format.raw/*52.42*/("""
            """),format.raw/*53.13*/("""<div class="form-group has-error">
                <label class="control-label">Please enter valid data for name.</label>
            </div>
            """)))}),format.raw/*56.14*/("""

            """),format.raw/*58.13*/("""<div class='form-group """),_display_(/*58.37*/if(errors.contains("ic_number"))/*58.69*/{_display_(Seq[Any](format.raw/*58.70*/(""" """),format.raw/*58.71*/("""has-error """)))}),format.raw/*58.82*/("""'>
                <label>IC Number</label>
                <input id="ic_number" name="ic_number" value='"""),_display_(/*60.64*/form("ic_number")/*60.81*/.value),format.raw/*60.87*/("""' class="form-control" placeholder="Required">
            </div>
            """),_display_(/*62.14*/if(errors.contains("ic_number"))/*62.46*/{_display_(Seq[Any](format.raw/*62.47*/("""
            """),format.raw/*63.13*/("""<div class="form-group has-error">
                <label class="control-label">Please enter valid data for IC number.</label>
            </div>
            """)))}),format.raw/*66.14*/("""

            """),format.raw/*68.13*/("""<div class='form-group """),_display_(/*68.37*/if(errors.contains("contact_number"))/*68.74*/{_display_(Seq[Any](format.raw/*68.75*/(""" """),format.raw/*68.76*/("""has-error """)))}),format.raw/*68.87*/("""'>
                <label>Contact Number</label>
                <input id="contact_number" name="contact_number" value='"""),_display_(/*70.74*/form("contact_number")/*70.96*/.value),format.raw/*70.102*/("""' class="form-control" placeholder="Required">
            </div>
            """),_display_(/*72.14*/if(errors.contains("contact_number"))/*72.51*/{_display_(Seq[Any](format.raw/*72.52*/("""
            """),format.raw/*73.13*/("""<div class="form-group has-error">
                <label class="control-label">Please enter valid data for contact number.</label>
            </div>
            """)))}),format.raw/*76.14*/("""

            """),format.raw/*78.13*/("""<div class='form-group """),_display_(/*78.37*/if(errors.contains("address"))/*78.67*/{_display_(Seq[Any](format.raw/*78.68*/(""" """),format.raw/*78.69*/("""has-error """)))}),format.raw/*78.80*/("""'>
                <label>Address</label>
                <input id="address" name="address" value='"""),_display_(/*80.60*/form("address")/*80.75*/.value),format.raw/*80.81*/("""' class="form-control" placeholder="Required">
            </div>
            """),_display_(/*82.14*/if(errors.contains("address"))/*82.44*/{_display_(Seq[Any](format.raw/*82.45*/("""
            """),format.raw/*83.13*/("""<div class="form-group has-error">
                <label class="control-label">Please enter valid data for address.</label>
            </div>
            """)))}),format.raw/*86.14*/("""

            """),format.raw/*88.13*/("""<div class='form-group """),_display_(/*88.37*/if(errors.contains("email"))/*88.65*/{_display_(Seq[Any](format.raw/*88.66*/(""" """),format.raw/*88.67*/("""has-error """)))}),format.raw/*88.78*/("""'>
                <label>Email</label>
                <input id="email" name="email" value='"""),_display_(/*90.56*/form("email")/*90.69*/.value),format.raw/*90.75*/("""' class="form-control" placeholder="Required">
            </div>
            <div id="email-msg">
                <label class="control-label"></label>
            </div>

            <div>
                <label>Role</label>
                <select name="role" class="form-control">
                    <option """),_display_(/*99.30*/if(form("role").value.get == "admin")/*99.67*/{_display_(Seq[Any](format.raw/*99.68*/(""" """),format.raw/*99.69*/("""selected """)))}),format.raw/*99.79*/(""" """),format.raw/*99.80*/("""value="admin">Admin</option>
                    <option """),_display_(/*100.30*/if(form("role").value.get == "user")/*100.66*/{_display_(Seq[Any](format.raw/*100.67*/(""" """),format.raw/*100.68*/("""selected """)))}),format.raw/*100.78*/(""" """),format.raw/*100.79*/("""value="user">User</option>
                </select>
            </div>
            <br>
                <button type="submit" class="btn btn-primary ">"""),_display_(/*104.65*/formType),format.raw/*104.73*/("""</button>
            </form>

""")))}),format.raw/*107.2*/("""
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
                  HASH: 56d8b6aaf0b491aa6a4f6af0475d60999caf19d6
                  MATRIX: 833->1|1071->143|1099->146|1128->167|1167->169|1195->171|1265->214|1293->215|1329->225|1417->287|1430->292|1464->306|1518->333|1546->334|1587->348|1768->502|1797->503|1834->513|1866->518|1880->523|1915->537|1971->565|2000->566|2042->580|2254->765|2283->766|2316->772|2344->773|2411->812|2440->813|2477->823|2568->887|2605->915|2644->916|2686->930|2872->1085|2905->1091|2933->1092|3027->1158|3056->1159|3093->1169|3140->1188|3169->1189|3211->1203|3462->1427|3491->1428|3524->1434|3552->1435|3673->1529|3702->1537|3866->1674|3881->1680|3919->1697|4024->1775|4043->1785|4070->1791|4216->1910|4241->1926|4268->1932|4414->2051|4439->2067|4466->2073|4579->2159|4615->2186|4654->2187|4683->2188|4725->2199|4846->2293|4867->2305|4894->2311|5002->2392|5038->2419|5077->2420|5119->2434|5307->2591|5351->2607|5402->2631|5443->2663|5482->2664|5511->2665|5553->2676|5689->2785|5715->2802|5742->2808|5850->2889|5891->2921|5930->2922|5972->2936|6165->3098|6209->3114|6260->3138|6306->3175|6345->3176|6374->3177|6416->3188|6567->3312|6598->3334|6626->3340|6734->3421|6780->3458|6819->3459|6861->3473|7059->3640|7103->3656|7154->3680|7193->3710|7232->3711|7261->3712|7303->3723|7433->3826|7457->3841|7484->3847|7592->3928|7631->3958|7670->3959|7712->3973|7903->4133|7947->4149|7998->4173|8035->4201|8074->4202|8103->4203|8145->4214|8269->4311|8291->4324|8318->4330|8668->4653|8714->4690|8753->4691|8782->4692|8823->4702|8852->4703|8939->4762|8985->4798|9025->4799|9055->4800|9097->4810|9127->4811|9312->4968|9342->4976|9408->5011
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|34->7|34->7|34->7|34->7|34->7|35->8|37->10|37->10|38->11|38->11|38->11|38->11|38->11|38->11|39->12|41->14|41->14|42->15|42->15|44->17|44->17|45->18|47->20|47->20|47->20|48->21|50->23|51->24|51->24|53->26|53->26|54->27|54->27|54->27|55->28|60->33|60->33|61->34|61->34|65->38|65->38|70->43|70->43|70->43|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|73->46|75->48|75->48|75->48|75->48|75->48|77->50|77->50|77->50|79->52|79->52|79->52|80->53|83->56|85->58|85->58|85->58|85->58|85->58|85->58|87->60|87->60|87->60|89->62|89->62|89->62|90->63|93->66|95->68|95->68|95->68|95->68|95->68|95->68|97->70|97->70|97->70|99->72|99->72|99->72|100->73|103->76|105->78|105->78|105->78|105->78|105->78|105->78|107->80|107->80|107->80|109->82|109->82|109->82|110->83|113->86|115->88|115->88|115->88|115->88|115->88|115->88|117->90|117->90|117->90|126->99|126->99|126->99|126->99|126->99|126->99|127->100|127->100|127->100|127->100|127->100|127->100|131->104|131->104|134->107
                  -- GENERATED --
              */
          