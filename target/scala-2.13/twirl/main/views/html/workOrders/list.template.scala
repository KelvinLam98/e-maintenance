
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
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'maintenance_id',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*17.63*/("""{"""),format.raw/*17.64*/("""
                            """),format.raw/*18.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*19.21*/("""}"""),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""}"""),format.raw/*20.18*/(""",
            ],
            responsive: true
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/(""");
    """),format.raw/*24.5*/("""}"""),format.raw/*24.6*/(""");

      $(document).ready(function() """),format.raw/*26.36*/("""{"""),format.raw/*26.37*/("""
      """),format.raw/*27.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*29.16*/flash/*29.21*/.get("success")),format.raw/*29.36*/("""" == "successfullyDeleted")"""),format.raw/*29.63*/("""{"""),format.raw/*29.64*/("""
              """),format.raw/*30.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('User has been deleted.')
          """),format.raw/*32.11*/("""}"""),format.raw/*32.12*/("""
      """),format.raw/*33.7*/("""}"""),format.raw/*33.8*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Work Orders
        <a href=""""),_display_(/*39.19*/routes/*39.25*/.WorkOrders.create),format.raw/*39.43*/("""">
            <button type="button" class="btn btn-primary badge">
                Create
            </button>
        </a>
    </h1>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
        <thead>
        <tr>
            <th width="20%">Maintenance Item</th>
            <th>Date</th>
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
                  HASH: df4cb26251d841e082617a477ea7c3eeb5e71e80
                  MATRIX: 802->1|978->82|1008->87|1037->108|1076->110|1104->112|1174->155|1202->156|1238->166|1292->193|1320->194|1361->208|1529->348|1558->349|1587->350|1702->437|1731->438|1785->464|1907->558|1936->559|1982->577|2011->578|2058->597|2087->598|2116->599|2233->688|2262->689|2320->719|2411->782|2440->783|2486->801|2515->802|2599->859|2628->860|2663->868|2691->869|2760->910|2789->911|2824->919|2917->985|2931->990|2967->1005|3022->1032|3051->1033|3095->1049|3278->1204|3307->1205|3342->1213|3370->1214|3512->1329|3527->1335|3566->1353
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|44->17|44->17|45->18|46->19|46->19|47->20|47->20|50->23|50->23|51->24|51->24|53->26|53->26|54->27|56->29|56->29|56->29|56->29|56->29|57->30|59->32|59->32|60->33|60->33|66->39|66->39|66->39
                  -- GENERATED --
              */
          