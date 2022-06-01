
package views.html.maintenanceItems

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
            "ajax": "/maintenanceItems/list.json",
            columns: [
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'item_code',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'item_name' """),format.raw/*16.37*/("""}"""),format.raw/*16.38*/(""",
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
        Maintenance Items
        <a href=""""),_display_(/*35.19*/routes/*35.25*/.MaintenanceItems.create),format.raw/*35.49*/("""">
            <button type="button" class="btn btn-primary badge">
                Create
            </button>
        </a>
    </h1>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
        <thead>
        <tr>
            <th>Code</th>
            <th>Name</th>
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
                  SOURCE: app/views/maintenanceItems/list.scala.html
                  HASH: b2426a8771830da526f61b34707bb044d5d7b21b
                  MATRIX: 808->1|984->82|1014->87|1043->108|1082->110|1110->112|1180->155|1208->156|1244->166|1298->193|1326->194|1367->208|1541->354|1570->355|1599->356|1709->438|1738->439|1792->465|1914->559|1943->560|1989->578|2018->579|2065->598|2094->599|2123->600|2169->618|2198->619|2282->676|2311->677|2346->685|2374->686|2443->727|2472->728|2507->736|2600->802|2614->807|2650->822|2705->849|2734->850|2778->866|2961->1021|2990->1022|3025->1030|3053->1031|3201->1152|3216->1158|3261->1182
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|46->19|46->19|47->20|47->20|49->22|49->22|50->23|52->25|52->25|52->25|52->25|52->25|53->26|55->28|55->28|56->29|56->29|62->35|62->35|62->35
                  -- GENERATED --
              */
          