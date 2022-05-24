
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[LoginForm],Array[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[LoginForm], errors: Array[String])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>E-Maintenance</title>
    <!-- BOOTSTRAP STYLES-->
    <link href='"""),_display_(/*10.18*/routes/*10.24*/.Assets.versioned("css/bootstrap.css")),format.raw/*10.62*/("""' rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href='"""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("css/font-awesome.css")),format.raw/*12.65*/("""' rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href='"""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("css/custom.css")),format.raw/*14.59*/("""' rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrapper">
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
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
                            """),_display_(/*40.30*/if(errors.contains("post-forgot-password-data-success"))/*40.86*/{_display_(Seq[Any](format.raw/*40.87*/("""
                            """),format.raw/*41.29*/("""<div class="form-group has-success">
                                <label class="control-label">Reset Password Requested. Please Check Your Email</label>
                            </div>
                            """)))}),format.raw/*44.30*/("""
                            """),_display_(/*45.30*/if(errors.contains("successfully reset"))/*45.71*/{_display_(Seq[Any](format.raw/*45.72*/("""
                            """),format.raw/*46.29*/("""<div class="form-group has-success">
                                <label class="control-label">Password Reset Successfully</label>
                            </div>
                            """)))}),format.raw/*49.30*/("""
                            """),format.raw/*50.29*/("""<div class="form-group" """),_display_(/*50.54*/if(errors.contains("username"))/*50.85*/{_display_(Seq[Any](format.raw/*50.86*/(""" """),format.raw/*50.87*/("""has-error """)))}),format.raw/*50.98*/("""">
                            <input type="text" class="form-control" placeholder="Username" name="username" value=""""),_display_(/*51.116*/form("username")/*51.132*/.value),format.raw/*51.138*/("""" autofocus>
                </div>
                <div class="form-group" """),_display_(/*53.42*/if(errors.contains("password"))/*53.73*/{_display_(Seq[Any](format.raw/*53.74*/(""" """),format.raw/*53.75*/("""has-error """)))}),format.raw/*53.86*/("""">
                <input type="password" class="form-control" placeholder="Password" id="password" name="password" value=""""),_display_(/*54.122*/form("password")/*54.138*/.value),format.raw/*54.144*/("""" autofocus>
            </div>
            <button type="submit" class="btn btn-lg btn-success btn-block">Login</button>
            </fieldset>
            </form>
        </div>
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

  def render(form:Form[LoginForm],errors:Array[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form,errors)(messages)

  def f:((Form[LoginForm],Array[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (form,errors) => (messages) => apply(form,errors)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 83854ad1cad67f079b1f6257b5706c7d87f9a366
                  MATRIX: 761->1|931->76|961->80|1247->339|1262->345|1321->383|1420->455|1435->461|1497->502|1591->569|1606->575|1662->610|2235->1156|2250->1162|2300->1191|2410->1274|2469->1324|2508->1325|2566->1355|2799->1557|2857->1588|2901->1623|2940->1624|2998->1654|3215->1840|3273->1871|3338->1927|3377->1928|3435->1958|3689->2181|3747->2212|3797->2253|3836->2254|3894->2284|4126->2485|4184->2515|4236->2540|4276->2571|4315->2572|4344->2573|4386->2584|4533->2703|4559->2719|4587->2725|4693->2804|4733->2835|4772->2836|4801->2837|4843->2848|4996->2973|5022->2989|5050->2995
                  LINES: 21->1|26->1|28->3|35->10|35->10|35->10|37->12|37->12|37->12|39->14|39->14|39->14|53->28|53->28|53->28|55->30|55->30|55->30|56->31|59->34|60->35|60->35|60->35|61->36|64->39|65->40|65->40|65->40|66->41|69->44|70->45|70->45|70->45|71->46|74->49|75->50|75->50|75->50|75->50|75->50|75->50|76->51|76->51|76->51|78->53|78->53|78->53|78->53|78->53|79->54|79->54|79->54
                  -- GENERATED --
              */
          