
package views.html.workOrderSamples

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
            "ajax": "/workOrderSamples/list.json",
            columns: [
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'item_name',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'user_name'"""),format.raw/*16.36*/("""}"""),format.raw/*16.37*/(""",
                """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/(""" """),format.raw/*17.19*/("""data: 'technician_name'"""),format.raw/*17.42*/("""}"""),format.raw/*17.43*/(""",
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/(""" """),format.raw/*18.19*/("""data: 'status'"""),format.raw/*18.33*/("""}"""),format.raw/*18.34*/("""
            """),format.raw/*19.13*/("""],
            responsive: true
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/(""");
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");

      $(document).ready(function() """),format.raw/*24.36*/("""{"""),format.raw/*24.37*/("""
      """),format.raw/*25.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*27.16*/flash/*27.21*/.get("success")),format.raw/*27.36*/("""" == "successfullyDeleted")"""),format.raw/*27.63*/("""{"""),format.raw/*27.64*/("""
              """),format.raw/*28.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('Work Order Sample has been deleted.')
          """),format.raw/*30.11*/("""}"""),format.raw/*30.12*/("""
      """),format.raw/*31.7*/("""}"""),format.raw/*31.8*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Work Order Samples
        <a href=""""),_display_(/*37.19*/routes/*37.25*/.WorkOrderSamples.create),format.raw/*37.49*/("""">
            <button type="button" class="btn btn-primary badge">
                Create
            </button>
        </a>
    </h1>
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
        <thead>
        <tr>
            <th width="25%">Maintenance Item</th>
            <th width="25%">Staff In Charge</th>
            <th width="25%">Technician</th>
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
                  SOURCE: app/views/workOrderSamples/list.scala.html
                  HASH: 2de162fda9e601b153b330b37757452b7ceea6df
                  MATRIX: 808->1|984->82|1014->87|1043->108|1082->110|1110->112|1180->155|1208->156|1244->166|1298->193|1326->194|1367->208|1541->354|1570->355|1599->356|1709->438|1738->439|1792->465|1914->559|1943->560|1989->578|2018->579|2065->598|2094->599|2123->600|2168->617|2197->618|2244->637|2273->638|2302->639|2353->662|2382->663|2429->682|2458->683|2487->684|2529->698|2558->699|2600->713|2669->755|2698->756|2733->764|2761->765|2830->806|2859->807|2894->815|2987->881|3001->886|3037->901|3092->928|3121->929|3165->945|3361->1113|3390->1114|3425->1122|3453->1123|3602->1245|3617->1251|3662->1275
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|45->18|45->18|45->18|45->18|45->18|46->19|48->21|48->21|49->22|49->22|51->24|51->24|52->25|54->27|54->27|54->27|54->27|54->27|55->28|57->30|57->30|58->31|58->31|64->37|64->37|64->37
                  -- GENERATED --
              */
          