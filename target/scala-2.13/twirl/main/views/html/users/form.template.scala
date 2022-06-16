
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
            message.find('.control-label').html('There is existing user, change another name')
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
        """),format.raw/*11.9*/("""if(""""),_display_(/*11.14*/flash/*11.19*/.get("errors")),format.raw/*11.33*/("""" == "emailIsAlreadyExists")"""),format.raw/*11.61*/("""{"""),format.raw/*11.62*/("""
            """),format.raw/*12.13*/("""message.css('display', 'block').addClass('form-group has-error')
            message.find('.control-label').html('There is existing email, change another one')
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
                  HASH: a6bfb1ab0b71dabd5f7b46f939352f0a1120cf7f
                  MATRIX: 833->1|1071->143|1099->146|1128->167|1167->169|1195->171|1265->214|1293->215|1329->225|1417->287|1430->292|1464->306|1518->333|1546->334|1587->348|1784->518|1813->519|1850->529|1882->534|1896->539|1931->553|1987->581|2016->582|2058->596|2255->766|2284->767|2317->773|2345->774|2412->813|2441->814|2478->824|2569->888|2606->916|2645->917|2687->931|2873->1086|2906->1092|2934->1093|3028->1159|3057->1160|3094->1170|3141->1189|3170->1190|3212->1204|3463->1428|3492->1429|3525->1435|3553->1436|3674->1530|3703->1538|3867->1675|3882->1681|3920->1698|4025->1776|4044->1786|4071->1792|4217->1911|4242->1927|4269->1933|4415->2052|4440->2068|4467->2074|4580->2160|4616->2187|4655->2188|4684->2189|4726->2200|4847->2294|4868->2306|4895->2312|5003->2393|5039->2420|5078->2421|5120->2435|5308->2592|5352->2608|5403->2632|5444->2664|5483->2665|5512->2666|5554->2677|5690->2786|5716->2803|5743->2809|5851->2890|5892->2922|5931->2923|5973->2937|6166->3099|6210->3115|6261->3139|6307->3176|6346->3177|6375->3178|6417->3189|6568->3313|6599->3335|6627->3341|6735->3422|6781->3459|6820->3460|6862->3474|7060->3641|7104->3657|7155->3681|7194->3711|7233->3712|7262->3713|7304->3724|7434->3827|7458->3842|7485->3848|7593->3929|7632->3959|7671->3960|7713->3974|7904->4134|7948->4150|7999->4174|8036->4202|8075->4203|8104->4204|8146->4215|8270->4312|8292->4325|8319->4331|8669->4654|8715->4691|8754->4692|8783->4693|8824->4703|8853->4704|8940->4763|8986->4799|9026->4800|9056->4801|9098->4811|9128->4812|9313->4969|9343->4977|9409->5012
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|34->7|34->7|34->7|34->7|34->7|35->8|37->10|37->10|38->11|38->11|38->11|38->11|38->11|38->11|39->12|41->14|41->14|42->15|42->15|44->17|44->17|45->18|47->20|47->20|47->20|48->21|50->23|51->24|51->24|53->26|53->26|54->27|54->27|54->27|55->28|60->33|60->33|61->34|61->34|65->38|65->38|70->43|70->43|70->43|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|73->46|75->48|75->48|75->48|75->48|75->48|77->50|77->50|77->50|79->52|79->52|79->52|80->53|83->56|85->58|85->58|85->58|85->58|85->58|85->58|87->60|87->60|87->60|89->62|89->62|89->62|90->63|93->66|95->68|95->68|95->68|95->68|95->68|95->68|97->70|97->70|97->70|99->72|99->72|99->72|100->73|103->76|105->78|105->78|105->78|105->78|105->78|105->78|107->80|107->80|107->80|109->82|109->82|109->82|110->83|113->86|115->88|115->88|115->88|115->88|115->88|115->88|117->90|117->90|117->90|126->99|126->99|126->99|126->99|126->99|126->99|127->100|127->100|127->100|127->100|127->100|127->100|131->104|131->104|134->107
                  -- GENERATED --
              */
          