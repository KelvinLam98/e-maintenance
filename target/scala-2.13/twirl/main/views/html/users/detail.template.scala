
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
                    <a id="deleteUser" href=""""),_display_(/*37.47*/routes/*37.53*/.Users.delete(user.id.get)),format.raw/*37.79*/("""">
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
                                <td>"""),_display_(/*54.38*/user/*54.42*/.username),format.raw/*54.51*/("""</td>
                            </tr>
                            <tr>
                                <th>Name</th>
                                <td>"""),_display_(/*58.38*/user/*58.42*/.name),format.raw/*58.47*/("""</td>
                            </tr>
                            <tr>
                                <th>IC Number</th>
                                <td>"""),_display_(/*62.38*/user/*62.42*/.ic_number),format.raw/*62.52*/("""</td>
                            </tr>
                            <tr>
                                <th>Contact Number</th>
                                <td>"""),_display_(/*66.38*/user/*66.42*/.contact_number),format.raw/*66.57*/("""</td>
                            </tr>
                            <tr>
                                <th>Address</th>
                                <td>"""),_display_(/*70.38*/user/*70.42*/.address),format.raw/*70.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Email</th>
                                <td>"""),_display_(/*74.38*/user/*74.42*/.email),format.raw/*74.48*/("""</td>
                            </tr>
                            <tr>
                                <th>Role</th>
                                <td>"""),_display_(/*78.38*/user/*78.42*/.role),format.raw/*78.47*/("""</td>
                            </tr>
                            <tr>
                                <th>Created Date</th>
                                <td>"""),_display_(/*82.38*/user/*82.42*/.created),format.raw/*82.50*/("""</td>
                            </tr>
                            <tr>
                                <th>Modified Date</th>
                                <td>"""),_display_(/*86.38*/user/*86.42*/.modified),format.raw/*86.51*/("""</td>
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
                  HASH: 5a59849a27625d137fe21c0a341fb7a2fd876e8b
                  MATRIX: 804->1|990->92|1018->95|1047->116|1086->118|1114->120|1184->163|1212->164|1248->174|1340->240|1353->245|1388->260|1442->287|1470->288|1513->304|1713->476|1742->477|1782->489|1814->494|1828->499|1864->514|1919->541|1948->542|1992->558|2192->730|2221->731|2262->744|2294->749|2308->754|2344->769|2409->806|2438->807|2482->823|2689->1002|2718->1003|2747->1004|2780->1010|3213->1416|3228->1422|3275->1448|3527->1673|3542->1679|3589->1705|4411->2500|4424->2504|4454->2513|4641->2673|4654->2677|4680->2682|4872->2847|4885->2851|4916->2861|5113->3031|5126->3035|5162->3050|5352->3213|5365->3217|5394->3225|5582->3386|5595->3390|5622->3396|5809->3556|5822->3560|5848->3565|6043->3733|6056->3737|6085->3745|6281->3914|6294->3918|6324->3927
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|33->6|35->8|35->8|35->8|35->8|35->8|36->9|38->11|38->11|39->12|39->12|39->12|39->12|39->12|39->12|40->13|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|44->17|46->19|46->19|46->19|47->20|59->32|59->32|59->32|64->37|64->37|64->37|81->54|81->54|81->54|85->58|85->58|85->58|89->62|89->62|89->62|93->66|93->66|93->66|97->70|97->70|97->70|101->74|101->74|101->74|105->78|105->78|105->78|109->82|109->82|109->82|113->86|113->86|113->86
                  -- GENERATED --
              */
          