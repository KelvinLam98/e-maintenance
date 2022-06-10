
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

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Long,Form[ResetPassword],Array[String],Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, form : Form[ResetPassword], errors: Array[String])(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.142*/("""
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
            <input type="hidden" id="id" name="id" value='"""),_display_(/*23.60*/form("id")/*23.70*/.value),format.raw/*23.76*/("""'>
            <div class='form-group """),_display_(/*24.37*/if(errors.contains("newPassword"))/*24.71*/{_display_(Seq[Any](format.raw/*24.72*/(""" """),format.raw/*24.73*/("""has-error """)))}),format.raw/*24.84*/("""  """),format.raw/*24.86*/("""'>
                <label>New Password</label>
                <input type="password" id="newPassword" name="newPassword" value='"""),_display_(/*26.84*/form("newPassword")/*26.103*/.value),format.raw/*26.109*/("""' class="form-control des_align" placeholder="Required">
            </div>
            <div class='form-group """),_display_(/*28.37*/if(errors.contains("confirmPassword"))/*28.75*/{_display_(Seq[Any](format.raw/*28.76*/(""" """),format.raw/*28.77*/("""has-error """)))}),format.raw/*28.88*/(""" """),format.raw/*28.89*/("""'>
                <label>Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" value='"""),_display_(/*30.92*/form("confirmPassword")/*30.115*/.value),format.raw/*30.121*/("""' class="form-control des_align" placeholder="Required">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>

        </form>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(id:Long,form:Form[ResetPassword],errors:Array[String],flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(id,form,errors)(flash,messages,request)

  def f:((Long,Form[ResetPassword],Array[String]) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (id,form,errors) => (flash,messages,request) => apply(id,form,errors)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/resetPassword.scala.html
                  HASH: 600df9615bc701d03eb52f79e5e1afeabb7020e4
                  MATRIX: 839->1|1075->141|1103->144|1132->165|1171->167|1199->169|1269->212|1297->213|1333->223|1391->254|1419->255|1485->294|1513->295|1547->303|1574->304|1753->456|1818->512|1857->513|1899->527|2080->677|2122->692|2174->735|2213->736|2255->750|2441->905|2478->915|2520->930|2535->936|2589->969|2693->1046|2712->1056|2739->1062|2806->1102|2849->1136|2888->1137|2917->1138|2959->1149|2989->1151|3148->1283|3177->1302|3205->1308|3346->1422|3393->1460|3432->1461|3461->1462|3503->1473|3532->1474|3703->1618|3736->1641|3764->1647
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|32->5|32->5|32->5|32->5|32->5|33->6|33->6|39->12|39->12|39->12|40->13|43->16|44->17|44->17|44->17|45->18|48->21|49->22|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|51->24|51->24|51->24|53->26|53->26|53->26|55->28|55->28|55->28|55->28|55->28|55->28|57->30|57->30|57->30
                  -- GENERATED --
              */
          