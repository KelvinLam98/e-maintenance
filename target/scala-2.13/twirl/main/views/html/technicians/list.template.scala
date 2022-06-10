
package views.html.technicians

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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""

"""),_display_(/*3.2*/main("E-Maintenance")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<script>
    $(document).ready(function() """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""
        """),format.raw/*6.9*/("""$('#dataTables').DataTable("""),format.raw/*6.36*/("""{"""),format.raw/*6.37*/("""
            """),format.raw/*7.13*/(""""processing": true,
            "serverSide": true,
            "ajax": "/technicians/list.json",
            columns: [
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'name',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'contact_number' """),format.raw/*16.42*/("""}"""),format.raw/*16.43*/(""",
            ],
            responsive: true
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/(""");
    """),format.raw/*20.5*/("""}"""),format.raw/*20.6*/(""");

      $(document).ready(function() """),format.raw/*22.36*/("""{"""),format.raw/*22.37*/("""
      """),format.raw/*23.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*25.16*/flash/*25.21*/.get("success")),format.raw/*25.36*/("""" == "successfullyDeleted")"""),format.raw/*25.63*/("""{"""),format.raw/*25.64*/("""
              """),format.raw/*26.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('User has been deleted.')
          """),format.raw/*28.11*/("""}"""),format.raw/*28.12*/("""
      """),format.raw/*29.7*/("""}"""),format.raw/*29.8*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Technicians
        <a href=""""),_display_(/*35.19*/routes/*35.25*/.Technicians.create),format.raw/*35.44*/("""">
            <button type="button" class="btn btn-primary badge">
                Create
            </button>
        </a>
    </h1>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
        <thead>
        <tr>
            <th>Name</th>
            <th>Contact Number</th>
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
                  SOURCE: app/views/technicians/list.scala.html
                  HASH: 3985a34b67688a408231ddf7495071bbc24eb0da
                  MATRIX: 803->1|979->82|1009->87|1038->108|1077->110|1105->112|1175->155|1203->156|1239->166|1293->193|1321->194|1362->208|1531->349|1560->350|1589->351|1694->428|1723->429|1777->455|1899->549|1928->550|1974->568|2003->569|2050->588|2079->589|2108->590|2159->613|2188->614|2272->671|2301->672|2336->680|2364->681|2433->722|2462->723|2497->731|2590->797|2604->802|2640->817|2695->844|2724->845|2768->861|2951->1016|2980->1017|3015->1025|3043->1026|3185->1141|3200->1147|3240->1166
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|46->19|46->19|47->20|47->20|49->22|49->22|50->23|52->25|52->25|52->25|52->25|52->25|53->26|55->28|55->28|56->29|56->29|62->35|62->35|62->35
                  -- GENERATED --
              */
          