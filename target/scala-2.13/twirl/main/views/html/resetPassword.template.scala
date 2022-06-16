
package views.html

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

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,Form[ResetPassword],Array[String],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, form : Form[ResetPassword], errors: Array[String])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.147*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<script>
    $(document).ready(function() """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""
        """),format.raw/*5.9*/("""$(".numberInput").numericInput("""),format.raw/*5.40*/("""{"""),format.raw/*5.41*/("""min: 0, max: 9999999, allowFloat: false"""),format.raw/*5.80*/("""}"""),format.raw/*5.81*/(""");
    """),format.raw/*6.5*/("""}"""),format.raw/*6.6*/(""");
    </script>

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Reset User Password</h1>
            """),_display_(/*12.14*/if(errors.contains("new pass not same as confirm pass"))/*12.70*/{_display_(Seq[Any](format.raw/*12.71*/("""
            """),format.raw/*13.13*/("""<div class="form-group has-error">
                <label class="control-label">Incorrect Confirm Password</label>
            </div>
            """)))}),format.raw/*16.14*/("""
            """),_display_(/*17.14*/if(errors.contains("successfully changed"))/*17.57*/{_display_(Seq[Any](format.raw/*17.58*/("""
            """),format.raw/*18.13*/("""<div class="form-group has-success">
                <label class="control-label">Password successfully changed</label>
            </div>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""<form action=""""),_display_(/*22.24*/routes/*22.30*/.HomeController.postResetPassword),format.raw/*22.63*/("""" method="post">
            <input type="hidden" id="email" name="email" value='"""),_display_(/*23.66*/form("email")/*23.79*/.value),format.raw/*23.85*/("""'>
            <div class='form-group """),_display_(/*24.37*/if(errors.contains("newPassword"))/*24.71*/{_display_(Seq[Any](format.raw/*24.72*/(""" """),format.raw/*24.73*/("""has-error """)))}),format.raw/*24.84*/("""  """),format.raw/*24.86*/("""'>
                <label>New Password</label>
                <input type="password" id="newPassword" name="newPassword" value='"""),_display_(/*26.84*/form("newPassword")/*26.103*/.value),format.raw/*26.109*/("""' class="form-control des_align" placeholder="Required">
            </div>
            <div class='form-group """),_display_(/*28.37*/if(errors.contains("confirmPassword"))/*28.75*/{_display_(Seq[Any](format.raw/*28.76*/(""" """),format.raw/*28.77*/("""has-error """)))}),format.raw/*28.88*/(""" """),format.raw/*28.89*/("""'>
                <label>Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" value='"""),_display_(/*30.92*/form("confirmPassword")/*30.115*/.value),format.raw/*30.121*/("""' class="form-control des_align" placeholder="Required">
            </div>
            <button type="submit" class="btn btn-default primary onclick="return confirm('Confirm Reset Password?');">Submit</button>

        </form>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(email:String,form:Form[ResetPassword],errors:Array[String],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(email,form,errors)(flash,messages,request)

  def f:((String,Form[ResetPassword],Array[String]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (email,form,errors) => (flash,messages,request) => apply(email,form,errors)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/resetPassword.scala.html
                  HASH: 1df88e510281608cd4268adcbfb42a92ad837fa4
                  MATRIX: 841->1|1082->146|1110->149|1139->170|1178->172|1206->174|1276->217|1304->218|1340->228|1398->259|1426->260|1492->299|1520->300|1554->308|1581->309|1760->461|1825->517|1864->518|1906->532|2087->682|2129->697|2181->740|2220->741|2262->755|2448->910|2485->920|2527->935|2542->941|2596->974|2706->1057|2728->1070|2755->1076|2822->1116|2865->1150|2904->1151|2933->1152|2975->1163|3005->1165|3164->1297|3193->1316|3221->1322|3362->1436|3409->1474|3448->1475|3477->1476|3519->1487|3548->1488|3719->1632|3752->1655|3780->1661
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|32->5|32->5|32->5|32->5|33->6|33->6|39->12|39->12|39->12|40->13|43->16|44->17|44->17|44->17|45->18|48->21|49->22|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|51->24|51->24|51->24|53->26|53->26|53->26|55->28|55->28|55->28|55->28|55->28|55->28|57->30|57->30|57->30
                  -- GENERATED --
              */
          