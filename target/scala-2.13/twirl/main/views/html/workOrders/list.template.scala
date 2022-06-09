
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
                """),format.raw/*11.17*/("""{"""),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""data: 'maintenance_name',
                    "render": function(data, type, full, meta)"""),format.raw/*12.63*/("""{"""),format.raw/*12.64*/("""
                        """),format.raw/*13.25*/("""return '<a href="detail/' + full.id + '" class="link">' + data + '</a>';
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""",
                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/(""" """),format.raw/*16.19*/("""data: 'person_in_charge'"""),format.raw/*16.43*/("""}"""),format.raw/*16.44*/(""",
                """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/(""" """),format.raw/*17.19*/("""data: 'maintenance_date',
                    "render": function(data, type, full, meta)"""),format.raw/*18.63*/("""{"""),format.raw/*18.64*/("""
                            """),format.raw/*19.29*/("""return moment(data).format('YYYY-MM-DD');
                    """),format.raw/*20.21*/("""}"""),format.raw/*20.22*/("""
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/(""",
                """),format.raw/*22.17*/("""{"""),format.raw/*22.18*/(""" """),format.raw/*22.19*/("""data: 'status'"""),format.raw/*22.33*/("""}"""),format.raw/*22.34*/("""
            """),format.raw/*23.13*/("""],
            responsive: true
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""");
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/(""");

      $(document).ready(function() """),format.raw/*28.36*/("""{"""),format.raw/*28.37*/("""
      """),format.raw/*29.7*/("""var message = $('#msg')
          message.hide()
          if(""""),_display_(/*31.16*/flash/*31.21*/.get("success")),format.raw/*31.36*/("""" == "successfullyDeleted")"""),format.raw/*31.63*/("""{"""),format.raw/*31.64*/("""
              """),format.raw/*32.15*/("""message.css('display', 'block').addClass('form-group has-success')
              message.find('.control-label').html('User has been deleted.')
          """),format.raw/*34.11*/("""}"""),format.raw/*34.12*/("""
      """),format.raw/*35.7*/("""}"""),format.raw/*35.8*/(""");
    </script>

<div class="col-lg-12">
    <h1 class="page-header">
        Work Orders
        <a href=""""),_display_(/*41.19*/routes/*41.25*/.WorkOrders.create),format.raw/*41.43*/("""">
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
            <th width="25%">Date</th>
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
                  HASH: 519e2230abb7727e6fde4dc910c048b66986af32
                  MATRIX: 802->1|978->82|1008->87|1037->108|1076->110|1104->112|1174->155|1202->156|1238->166|1292->193|1320->194|1361->208|1529->348|1558->349|1587->350|1704->439|1733->440|1787->466|1909->560|1938->561|1984->579|2013->580|2060->599|2089->600|2118->601|2170->625|2199->626|2246->645|2275->646|2304->647|2421->736|2450->737|2508->767|2599->830|2628->831|2674->849|2703->850|2750->869|2779->870|2808->871|2850->885|2879->886|2921->900|2990->942|3019->943|3054->951|3082->952|3151->993|3180->994|3215->1002|3308->1068|3322->1073|3358->1088|3413->1115|3442->1116|3486->1132|3669->1287|3698->1288|3733->1296|3761->1297|3903->1412|3918->1418|3957->1436
                  LINES: 23->1|28->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|33->6|33->6|34->7|38->11|38->11|38->11|39->12|39->12|40->13|41->14|41->14|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|46->19|47->20|47->20|48->21|48->21|49->22|49->22|49->22|49->22|49->22|50->23|52->25|52->25|53->26|53->26|55->28|55->28|56->29|58->31|58->31|58->31|58->31|58->31|59->32|61->34|61->34|62->35|62->35|68->41|68->41|68->41
                  -- GENERATED --
              */
          