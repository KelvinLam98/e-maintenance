
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

object listUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""

"""),_display_(/*3.2*/main("E-Maintenance")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<script>
    $(document).ready(function() """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""
        """),format.raw/*6.9*/("""$('#dataTables').DataTable("""),format.raw/*6.36*/("""{"""),format.raw/*6.37*/("""
            """),format.raw/*7.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/user/list.json",
            columns: [
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'username',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'name' """),format.raw/*16.32*/("""}"""),format.raw/*16.33*/(""",
                """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/(""" """),format.raw/*17.19*/("""data: 'ic_number' """),format.raw/*17.37*/("""}"""),format.raw/*17.38*/(""",
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/(""" """),format.raw/*18.19*/("""data: 'role' """),format.raw/*18.32*/("""}"""),format.raw/*18.33*/(""",
            ],
            responsive: true
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/(""");
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");

      $(document).ready(function() """),format.raw/*24.36*/("""{"""),format.raw/*24.37*/("""
      """),format.raw/*25.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*27.16*/flash/*27.21*/.get("success")),format.raw/*27.36*/("""" == "successfullyDeleted")"""),format.raw/*27.63*/("""{"""),format.raw/*27.64*/("""
              """),format.raw/*28.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('User has been deleted.')
          """),format.raw/*30.11*/("""}"""),format.raw/*30.12*/("""
      """),format.raw/*31.7*/("""}"""),format.raw/*31.8*/(""");
    </script>

        <div class="col-lg-12">
            <h1 class="page-header">
                Users
                <a href=""""),_display_(/*37.27*/routes/*37.33*/.Users.create),format.raw/*37.46*/("""">
                    <button type="button" class="btn btn-primary badge">
                    Create
                    </button>
                </a>
            </h1>
        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
            <thead>
            <tr>
                <th>Username</th>
                <th>Name</th>
                <th>IC</th>
                <th>Role</th>
            </tr>
            </thead>
        </table>
        </div>

""")))}))
      }
    }
  }

  def render(flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply()(flash,messages,request)

  def f:(() => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = () => (flash,messages,request) => apply()(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/users/listUser.scala.html
                  HASH: 0b187c7c23524248c4593128e0044e58db9bbc1d
                  MATRIX: 801->1|977->82|1007->87|1036->108|1075->110|1107->116|1177->159|1205->160|1241->170|1295->197|1323->198|1364->212|1526->346|1555->347|1584->348|1693->429|1722->430|1776->456|1898->550|1927->551|1973->569|2002->570|2049->589|2078->590|2107->591|2148->604|2177->605|2224->624|2253->625|2282->626|2328->644|2357->645|2404->664|2433->665|2462->666|2503->679|2532->680|2616->737|2645->738|2680->746|2708->747|2777->788|2806->789|2841->797|2934->863|2948->868|2984->883|3039->910|3068->911|3112->927|3295->1082|3324->1083|3359->1091|3387->1092|3555->1233|3570->1239|3604->1252
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|45->18|45->18|45->18|45->18|45->18|48->21|48->21|49->22|49->22|51->24|51->24|52->25|54->27|54->27|54->27|54->27|54->27|55->28|57->30|57->30|58->31|58->31|64->37|64->37|64->37
                  -- GENERATED --
              */
          