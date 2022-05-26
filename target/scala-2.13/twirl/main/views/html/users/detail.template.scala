
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
          """),format.raw/*19.11*/("""}"""),format.raw/*19.12*/("""}"""),format.raw/*19.13*/("""
    """),format.raw/*20.5*/("""</script>

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
                    <a id="updateUser" href=""""),_display_(/*32.47*/routes/*32.53*/.Users.update(user.id.get)),format.raw/*32.79*/("""">
                        <button type="button" class="btn btn-primary badge">
                            Update
                        </button>
                    </a>
                    <a id="changePassword" href=#>
                        <button type="button" class="btn btn-primary badge">
                            Change Password
                        </button>
                    </a>
                    <a id="deleteUser" href=#>
                        <button type="button" class="btn btn-danger badge">
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
                                <td>"""),_display_(/*59.38*/user/*59.42*/.username),format.raw/*59.51*/("""</td>
                            </tr>
                            <tr>
                                <th>Name</th>
                                <td>"""),_display_(/*63.38*/user/*63.42*/.name),format.raw/*63.47*/("""</td>
                            </tr>
                            <tr>
                                <th>IC Number</th>
                                <td>"""),_display_(/*67.38*/user/*67.42*/.ic_number),format.raw/*67.52*/("""</td>
                            </tr>
                            <tr>
                                <th>Contact Number</th>
                                <td>"""),_display_(/*71.38*/user/*71.42*/.contact_number),format.raw/*71.57*/("""</td>
                            </tr>
                            <tr>
                                <th>Address</th>
                                <td>"""),_display_(/*75.38*/user/*75.42*/.address),format.raw/*75.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Email</th>
                                <td>"""),_display_(/*79.38*/user/*79.42*/.email),format.raw/*79.48*/("""</td>
                            </tr>
                            <tr>
                                <th>Role</th>
                                <td>"""),_display_(/*83.38*/user/*83.42*/.role),format.raw/*83.47*/("""</td>
                            </tr>
                            <tr>
                                <th>Created Date</th>
                                <td>"""),_display_(/*87.38*/user/*87.42*/.created),format.raw/*87.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Modified Date</th>
                                <td>"""),_display_(/*91.38*/user/*91.42*/.modified),format.raw/*91.51*/("""</td>
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
                  HASH: 346b7f62e94dabdb10c77beb517c84bea634fc0e
                  MATRIX: 804->1|990->92|1018->95|1047->116|1086->118|1114->120|1184->163|1212->164|1248->174|1340->240|1353->245|1388->260|1442->287|1470->288|1513->304|1713->476|1742->477|1782->489|1814->494|1828->499|1864->514|1919->541|1948->542|1992->558|2192->730|2221->731|2262->744|2294->749|2308->754|2344->769|2409->806|2438->807|2482->823|2689->1002|2718->1003|2747->1004|2780->1010|3213->1416|3228->1422|3275->1448|4545->2691|4558->2695|4588->2704|4775->2864|4788->2868|4814->2873|5006->3038|5019->3042|5050->3052|5247->3222|5260->3226|5296->3241|5486->3404|5499->3408|5528->3416|5716->3577|5729->3581|5756->3587|5943->3747|5956->3751|5982->3756|6177->3924|6190->3928|6219->3936|6415->4105|6428->4109|6458->4118
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|33->6|35->8|35->8|35->8|35->8|35->8|36->9|38->11|38->11|39->12|39->12|39->12|39->12|39->12|39->12|40->13|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|44->17|46->19|46->19|46->19|47->20|59->32|59->32|59->32|86->59|86->59|86->59|90->63|90->63|90->63|94->67|94->67|94->67|98->71|98->71|98->71|102->75|102->75|102->75|106->79|106->79|106->79|110->83|110->83|110->83|114->87|114->87|114->87|118->91|118->91|118->91
                  -- GENERATED --
              */
          