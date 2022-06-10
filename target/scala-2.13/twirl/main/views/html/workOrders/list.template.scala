
package views.html.workOrders

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
            "ajax": "/workOrders/list.json",
            columns: [
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'item_name',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'user_name'"""),format.raw/*16.36*/("""}"""),format.raw/*16.37*/(""",
                """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/(""" """),format.raw/*17.19*/("""data: 'technician_name'"""),format.raw/*17.42*/("""}"""),format.raw/*17.43*/(""",
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/(""" """),format.raw/*18.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*19.63*/("""{"""),format.raw/*19.64*/("""
                            """),format.raw/*20.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*21.21*/("""}"""),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/(""",
                """),format.raw/*23.17*/("""{"""),format.raw/*23.18*/(""" """),format.raw/*23.19*/("""data: 'status'"""),format.raw/*23.33*/("""}"""),format.raw/*23.34*/("""
            """),format.raw/*24.13*/("""],
            responsive: true
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""");
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/(""");

      $(document).ready(function() """),format.raw/*29.36*/("""{"""),format.raw/*29.37*/("""
      """),format.raw/*30.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*32.16*/flash/*32.21*/.get("success")),format.raw/*32.36*/("""" == "successfullyDeleted")"""),format.raw/*32.63*/("""{"""),format.raw/*32.64*/("""
              """),format.raw/*33.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('User has been deleted.')
          """),format.raw/*35.11*/("""}"""),format.raw/*35.12*/("""
      """),format.raw/*36.7*/("""}"""),format.raw/*36.8*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Work Orders
        <a href=""""),_display_(/*42.19*/routes/*42.25*/.WorkOrders.create),format.raw/*42.43*/("""">
            <button type="button" class="btn btn-primary badge">
                Create
            </button>
        </a>
        <a href=""""),_display_(/*47.19*/routes/*47.25*/.WorkOrders.historyList),format.raw/*47.48*/("""">
            <button type="button" class="btn btn-primary badge">
                History
            </button>
        </a>
    </h1>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
        <thead>
        <tr>
            <th width="20%">Maintenance Item</th>
            <th width="20%">Staff In Charge</th>
            <th width="20%">Technician</th>
            <th width="20%">Date</th>
            <th>Status</th>
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
                  SOURCE: app/views/workOrders/list.scala.html
                  HASH: 914d03d81a5c8259c4baacaf3184718204e96e99
                  MATRIX: 802->1|978->82|1008->87|1037->108|1076->110|1104->112|1174->155|1202->156|1238->166|1292->193|1320->194|1361->208|1529->348|1558->349|1587->350|1697->432|1726->433|1780->459|1902->553|1931->554|1977->572|2006->573|2053->592|2082->593|2111->594|2156->611|2185->612|2232->631|2261->632|2290->633|2341->656|2370->657|2417->676|2446->677|2475->678|2592->767|2621->768|2679->798|2770->861|2799->862|2845->880|2874->881|2921->900|2950->901|2979->902|3021->916|3050->917|3092->931|3161->973|3190->974|3225->982|3253->983|3322->1024|3351->1025|3386->1033|3479->1099|3493->1104|3529->1119|3584->1146|3613->1147|3657->1163|3840->1318|3869->1319|3904->1327|3932->1328|4074->1443|4089->1449|4128->1467|4304->1616|4319->1622|4363->1645
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|47->20|48->21|48->21|49->22|49->22|50->23|50->23|50->23|50->23|50->23|51->24|53->26|53->26|54->27|54->27|56->29|56->29|57->30|59->32|59->32|59->32|59->32|59->32|60->33|62->35|62->35|63->36|63->36|69->42|69->42|69->42|74->47|74->47|74->47
                  -- GENERATED --
              */
          