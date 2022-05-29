
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
                        <button type="button" class="btn btn-danger badge" onclick="">
                            Delete
                        </button>
                    </a>
                    <a id="adminResetUser" href=#>
                        <button type="button" class="btn btn-primary badge">
                            Reset Password
                        </button>
                    </a>
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-bordered table-striped">
                            <tbody>
                            <tr>
                                <th style="width:20%">Username</th>
                                <td>"""),_display_(/*56.38*/user/*56.42*/.username),format.raw/*56.51*/("""</td>
                            </tr>
                            <tr>
                                <th>Name</th>
                                <td>"""),_display_(/*60.38*/user/*60.42*/.name),format.raw/*60.47*/("""</td>
                            </tr>
                            <tr>
                                <th>IC Number</th>
                                <td>"""),_display_(/*64.38*/user/*64.42*/.ic_number),format.raw/*64.52*/("""</td>
                            </tr>
                            <tr>
                                <th>Contact Number</th>
                                <td>"""),_display_(/*68.38*/user/*68.42*/.contact_number),format.raw/*68.57*/("""</td>
                            </tr>
                            <tr>
                                <th>Address</th>
                                <td>"""),_display_(/*72.38*/user/*72.42*/.address),format.raw/*72.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Email</th>
                                <td>"""),_display_(/*76.38*/user/*76.42*/.email),format.raw/*76.48*/("""</td>
                            </tr>
                            <tr>
                                <th>Role</th>
                                <td>"""),_display_(/*80.38*/user/*80.42*/.role),format.raw/*80.47*/("""</td>
                            </tr>
                            <tr>
                                <th>Created Date</th>
                                <td>"""),_display_(/*84.38*/user/*84.42*/.created),format.raw/*84.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Modified Date</th>
                                <td>"""),_display_(/*88.38*/user/*88.42*/.modified),format.raw/*88.51*/("""</td>
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
                  HASH: 7fa31afdc66f5f927bd4e99b33e98ff7831bfccd
                  MATRIX: 804->1|990->92|1018->95|1047->116|1086->118|1114->120|1184->163|1212->164|1248->174|1340->240|1353->245|1388->260|1442->287|1470->288|1513->304|1713->476|1742->477|1782->489|1814->494|1828->499|1864->514|1919->541|1948->542|1992->558|2192->730|2221->731|2262->744|2294->749|2308->754|2344->769|2409->806|2438->807|2482->823|2689->1002|2718->1003|2753->1011|2781->1012|3224->1428|3239->1434|3286->1460|3538->1685|3553->1691|3600->1717|4422->2512|4435->2516|4465->2525|4652->2685|4665->2689|4691->2694|4883->2859|4896->2863|4927->2873|5124->3043|5137->3047|5173->3062|5363->3225|5376->3229|5405->3237|5593->3398|5606->3402|5633->3408|5820->3568|5833->3572|5859->3577|6054->3745|6067->3749|6096->3757|6292->3926|6305->3930|6335->3939
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|33->6|35->8|35->8|35->8|35->8|35->8|36->9|38->11|38->11|39->12|39->12|39->12|39->12|39->12|39->12|40->13|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|44->17|46->19|46->19|47->20|47->20|61->34|61->34|61->34|66->39|66->39|66->39|83->56|83->56|83->56|87->60|87->60|87->60|91->64|91->64|91->64|95->68|95->68|95->68|99->72|99->72|99->72|103->76|103->76|103->76|107->80|107->80|107->80|111->84|111->84|111->84|115->88|115->88|115->88
                  -- GENERATED --
              */
          