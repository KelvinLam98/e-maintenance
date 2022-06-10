
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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Technician,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(technician: Technician)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.105*/("""
"""),_display_(/*2.2*/main("E-Maintenance")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Technicians</h1>
        <div id="msg">
            <label class="control-label"></label>
        </div>
    </div>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a id="updateUser" href=""""),_display_(/*13.43*/routes/*13.49*/.Technicians.update(technician.id.get)),format.raw/*13.87*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Update
                    </button>
                </a>
                <a id="deleteUser" href=""""),_display_(/*18.43*/routes/*18.49*/.Technicians.delete(technician.id.get)),format.raw/*18.87*/("""">
                    <button type="button" class="btn btn-danger badge" onclick="">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*23.37*/routes/*23.43*/.Technicians.list),format.raw/*23.60*/("""">
                    <button type="button" class="btn btn-primary badge" onclick="">
                        Back
                    </button>
                </a>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                        <tr>
                            <th style="width:20%">Name</th>
                            <td>"""),_display_(/*35.34*/technician/*35.44*/.name),format.raw/*35.49*/("""</td>
                        </tr>
                        <tr>
                            <th>Contact_Number</th>
                            <td>"""),_display_(/*39.34*/technician/*39.44*/.contact_number),format.raw/*39.59*/("""</td>
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

  def render(technician:Technician,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(technician)(flash,messages,request)

  def f:((Technician) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (technician) => (flash,messages,request) => apply(technician)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/technicians/detail.scala.html
                  HASH: b25e451c27087d64edd16d7b090fe26772902bb3
                  MATRIX: 816->1|1015->104|1043->107|1072->128|1111->130|1139->132|1522->488|1537->494|1596->532|1828->737|1843->743|1902->781|2138->990|2153->996|2191->1013|2725->1520|2744->1530|2770->1535|2951->1689|2970->1699|3006->1714
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|45->18|45->18|45->18|50->23|50->23|50->23|62->35|62->35|62->35|66->39|66->39|66->39
                  -- GENERATED --
              */
          