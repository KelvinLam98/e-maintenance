
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[LoginForm],Array[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[LoginForm], errors: Array[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>E-Maintenance</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Login</h3>
                </div>
                <div class="panel-body">
                    <form action=""""),_display_(/*28.36*/routes/*28.42*/.HomeController.postLoginData),format.raw/*28.71*/("""" method="post">
                        <fieldset>
                            """),_display_(/*30.30*/if(errors.contains("incorrectPasswordOrUsername"))/*30.80*/{_display_(Seq[Any](format.raw/*30.81*/("""
                            """),format.raw/*31.29*/("""<div class="form-group has-error">
                                <label class="control-label">Incorrect Password Or Username</label>
                            </div>
                            """)))}),format.raw/*34.30*/("""
                            """),_display_(/*35.30*/if(errors.contains("userNotFound"))/*35.65*/{_display_(Seq[Any](format.raw/*35.66*/("""
                            """),format.raw/*36.29*/("""<div class="form-group has-error">
                                <label class="control-label">User Not Found</label>
                            </div>
                            """)))}),format.raw/*39.30*/("""
                            """),_display_(/*40.30*/if(errors.contains("accountDisabledPleaseContactAdmin"))/*40.86*/{_display_(Seq[Any](format.raw/*40.87*/("""
                            """),format.raw/*41.29*/("""<div class="form-group has-error">
                                <label class="control-label">Account Disabled. Please Contact Admin</label>
                            </div>
                            """)))}),format.raw/*44.30*/("""
                            """),_display_(/*45.30*/if(errors.contains("post-forgot-password-data-success"))/*45.86*/{_display_(Seq[Any](format.raw/*45.87*/("""
                            """),format.raw/*46.29*/("""<div class="form-group has-success">
                                <label class="control-label">Reset Password Requested. Please Check Your Email</label>
                            </div>
                            """)))}),format.raw/*49.30*/("""
                            """),_display_(/*50.30*/if(errors.contains("successfully reset"))/*50.71*/{_display_(Seq[Any](format.raw/*50.72*/("""
                            """),format.raw/*51.29*/("""<div class="form-group has-success">
                                <label class="control-label">Password Reset Successfully</label>
                            </div>
                            """)))}),format.raw/*54.30*/("""
                            """),format.raw/*55.29*/("""<div class="form-group" """),_display_(/*55.54*/if(errors.contains("username"))/*55.85*/{_display_(Seq[Any](format.raw/*55.86*/(""" """),format.raw/*55.87*/("""has-error """)))}),format.raw/*55.98*/("""">
                            <input type="text" class="form-control" placeholder="Username" name="username" value=""""),_display_(/*56.116*/form("username")/*56.132*/.value),format.raw/*56.138*/("""" autofocus>
                </div>
                <div class="form-group" """),_display_(/*58.42*/if(errors.contains("password"))/*58.73*/{_display_(Seq[Any](format.raw/*58.74*/(""" """),format.raw/*58.75*/("""has-error """)))}),format.raw/*58.86*/("""">
                <input type="password" class="form-control" placeholder="Password" id="password" name="password" value=""""),_display_(/*59.122*/form("password")/*59.138*/.value),format.raw/*59.144*/("""" autofocus>
            </div>
            <button type="submit" class="btn btn-lg btn-success btn-block">Login</button>
            </fieldset>
            </form>
        </div>
    </div>
</div>
</div>
</div>

</body>

</html>
"""))
      }
    }
  }

  def render(form:Form[LoginForm],errors:Array[String]): play.twirl.api.HtmlFormat.Appendable = apply(form,errors)

  def f:((Form[LoginForm],Array[String]) => play.twirl.api.HtmlFormat.Appendable) = (form,errors) => apply(form,errors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 03f1e29a4083dda052b3ba5c5d4ba5f2ec40e4a4
                  MATRIX: 752->1|893->47|923->51|1945->1046|1960->1052|2010->1081|2120->1164|2179->1214|2218->1215|2276->1245|2509->1447|2567->1478|2611->1513|2650->1514|2708->1544|2925->1730|2983->1761|3048->1817|3087->1818|3145->1848|3386->2058|3444->2089|3509->2145|3548->2146|3606->2176|3860->2399|3918->2430|3968->2471|4007->2472|4065->2502|4297->2703|4355->2733|4407->2758|4447->2789|4486->2790|4515->2791|4557->2802|4704->2921|4730->2937|4758->2943|4864->3022|4904->3053|4943->3054|4972->3055|5014->3066|5167->3191|5193->3207|5221->3213
                  LINES: 21->1|26->1|28->3|53->28|53->28|53->28|55->30|55->30|55->30|56->31|59->34|60->35|60->35|60->35|61->36|64->39|65->40|65->40|65->40|66->41|69->44|70->45|70->45|70->45|71->46|74->49|75->50|75->50|75->50|76->51|79->54|80->55|80->55|80->55|80->55|80->55|80->55|81->56|81->56|81->56|83->58|83->58|83->58|83->58|83->58|84->59|84->59|84->59
                  -- GENERATED --
              */
          