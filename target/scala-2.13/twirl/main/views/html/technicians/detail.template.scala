
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
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                        <tr>
                            <th style="width:20%">Name</th>
                            <td>"""),_display_(/*30.34*/technician/*30.44*/.name),format.raw/*30.49*/("""</td>
                        </tr>
                        <tr>
                            <th>Contact_Number</th>
                            <td>"""),_display_(/*34.34*/technician/*34.44*/.contact_number),format.raw/*34.59*/("""</td>
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
                  HASH: b98950125ed5f75cbfdc7fb3d805c579de5f4fc1
                  MATRIX: 816->1|1015->104|1043->107|1072->128|1111->130|1139->132|1522->488|1537->494|1596->532|1828->737|1843->743|1902->781|2437->1289|2456->1299|2482->1304|2663->1458|2682->1468|2718->1483
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|40->13|40->13|40->13|45->18|45->18|45->18|57->30|57->30|57->30|61->34|61->34|61->34
                  -- GENERATED --
              */
          