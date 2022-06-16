
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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[User,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.93*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<script>
    $(document).ready(function() """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""

      """),format.raw/*6.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*8.16*/flash/*8.21*/.get("success")),format.raw/*8.36*/("""" == "successfullyUpdated")"""),format.raw/*8.63*/("""{"""),format.raw/*8.64*/("""
              """),format.raw/*9.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('The User has been successfully updated.')
          """),format.raw/*11.11*/("""}"""),format.raw/*11.12*/("""
          """),format.raw/*12.11*/("""if(""""),_display_(/*12.16*/flash/*12.21*/.get("success")),format.raw/*12.36*/("""" == "successfullyCreated")"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
              """),format.raw/*13.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('The User has been successfully created.')
          """),format.raw/*15.11*/("""}"""),format.raw/*15.12*/("""
           """),format.raw/*16.12*/("""if(""""),_display_(/*16.17*/flash/*16.22*/.get("success")),format.raw/*16.37*/("""" == "accessmentSuccessfullyUpdated")"""),format.raw/*16.74*/("""{"""),format.raw/*16.75*/("""
              """),format.raw/*17.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('User accessment has been updated successfully.')
          """),format.raw/*19.11*/("""}"""),format.raw/*19.12*/("""
      """),format.raw/*20.7*/("""}"""),format.raw/*20.8*/(""");

    </script>

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">User</h1>
            <div id="msg">
                <label class="control-label"></label>
            </div>
        </div>
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <a id="updateUser" href=""""),_display_(/*34.47*/routes/*34.53*/.Users.update(user.id.get)),format.raw/*34.79*/("""">
                        <button type="button" class="btn btn-primary badge">
                            Update
                        </button>
                    </a>
                    <a id="deleteUser" href=""""),_display_(/*39.47*/routes/*39.53*/.Users.delete(user.id.get)),format.raw/*39.79*/("""">
                        <button type="button" class="btn btn-danger badge" onclick="return confirm('Are you sure you want to delete this item?');">
                            Delete
                        </button>
                    </a>
                    <a id="resetPassword" href=""""),_display_(/*44.50*/routes/*44.56*/.HomeController.resetPasswords(user.email)),format.raw/*44.98*/("""">
                        <button type="button" class="btn btn-primary badge">
                            Reset Password
                        </button>
                    </a>
                    <a id="back" href=""""),_display_(/*49.41*/routes/*49.47*/.Users.listUser),format.raw/*49.62*/("""">
                        <button type="button" class="btn btn-primary badge">
                            Back
                        </button>
                    </a>
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-bordered table-striped">
                            <tbody>
                            <tr>
                                <th style="width:20%">Username</th>
                                <td>"""),_display_(/*61.38*/user/*61.42*/.username),format.raw/*61.51*/("""</td>
                            </tr>
                            <tr>
                                <th>Name</th>
                                <td>"""),_display_(/*65.38*/user/*65.42*/.name),format.raw/*65.47*/("""</td>
                            </tr>
                            <tr>
                                <th>IC Number</th>
                                <td>"""),_display_(/*69.38*/user/*69.42*/.ic_number),format.raw/*69.52*/("""</td>
                            </tr>
                            <tr>
                                <th>Contact Number</th>
                                <td>"""),_display_(/*73.38*/user/*73.42*/.contact_number),format.raw/*73.57*/("""</td>
                            </tr>
                            <tr>
                                <th>Address</th>
                                <td>"""),_display_(/*77.38*/user/*77.42*/.address),format.raw/*77.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Email</th>
                                <td>"""),_display_(/*81.38*/user/*81.42*/.email),format.raw/*81.48*/("""</td>
                            </tr>
                            <tr>
                                <th>Role</th>
                                <td>"""),_display_(/*85.38*/user/*85.42*/.role),format.raw/*85.47*/("""</td>
                            </tr>
                            <tr>
                                <th>Created Date</th>
                                <td>"""),_display_(/*89.38*/user/*89.42*/.created),format.raw/*89.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Modified Date</th>
                                <td>"""),_display_(/*93.38*/user/*93.42*/.modified),format.raw/*93.51*/("""</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:User,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(user)(flash,messages,request)

  def f:((User) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (user) => (flash,messages,request) => apply(user)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/users/detail.scala.html
                  HASH: 9220ce7cd5e6b6a25f9bf3af027ae0d23041afe7
                  MATRIX: 804->1|990->92|1018->95|1047->116|1086->118|1114->120|1184->163|1212->164|1248->174|1340->240|1353->245|1388->260|1442->287|1470->288|1513->304|1713->476|1742->477|1782->489|1814->494|1828->499|1864->514|1919->541|1948->542|1992->558|2192->730|2221->731|2262->744|2294->749|2308->754|2344->769|2409->806|2438->807|2482->823|2689->1002|2718->1003|2753->1011|2781->1012|3224->1428|3239->1434|3286->1460|3538->1685|3553->1691|3600->1717|3926->2016|3941->2022|4004->2064|4258->2291|4273->2297|4309->2312|4884->2860|4897->2864|4927->2873|5114->3033|5127->3037|5153->3042|5345->3207|5358->3211|5389->3221|5586->3391|5599->3395|5635->3410|5825->3573|5838->3577|5867->3585|6055->3746|6068->3750|6095->3756|6282->3916|6295->3920|6321->3925|6516->4093|6529->4097|6558->4105|6754->4274|6767->4278|6797->4287
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|33->6|35->8|35->8|35->8|35->8|35->8|36->9|38->11|38->11|39->12|39->12|39->12|39->12|39->12|39->12|40->13|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|44->17|46->19|46->19|47->20|47->20|61->34|61->34|61->34|66->39|66->39|66->39|71->44|71->44|71->44|76->49|76->49|76->49|88->61|88->61|88->61|92->65|92->65|92->65|96->69|96->69|96->69|100->73|100->73|100->73|104->77|104->77|104->77|108->81|108->81|108->81|112->85|112->85|112->85|116->89|116->89|116->89|120->93|120->93|120->93
                  -- GENERATED --
              */
          