
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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[MaintenanceItem,Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(maintenanceItem: MaintenanceItem)(implicit flash: Flash, messages: Messages, request: models.RequestWithUser[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.115*/("""
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
        <h1 class="page-header">Maintenance Items</h1>
        <div id="msg">
            <label class="control-label"></label>
        </div>
    </div>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a id="update" href=""""),_display_(/*32.39*/routes/*32.45*/.MaintenanceItems.update(maintenanceItem.id.get)),format.raw/*32.93*/("""">
                    <button type="button" class="btn btn-primary badge">
                        Update
                    </button>
                </a>
                <a id="delete" href=""""),_display_(/*37.39*/routes/*37.45*/.MaintenanceItems.delete(maintenanceItem.id.get)),format.raw/*37.93*/("""" onclick="return confirm('Are you sure you want to delete this item?');">
                    <button type="button" class="btn btn-danger badge" onclick="">
                        Delete
                    </button>
                </a>
                <a id="back" href=""""),_display_(/*42.37*/routes/*42.43*/.MaintenanceItems.list),format.raw/*42.65*/("""">
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
                            <th style="width:20%">Code</th>
                            <td>"""),_display_(/*54.34*/maintenanceItem/*54.49*/.item_code),format.raw/*54.59*/("""</td>
                        </tr>
                        <tr>
                            <th>Name</th>
                            <td>"""),_display_(/*58.34*/maintenanceItem/*58.49*/.item_name),format.raw/*58.59*/("""</td>
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

  def render(maintenanceItem:MaintenanceItem,flash:Flash,messages:Messages,request:models.RequestWithUser[_$1] forSome { 
   type _$1
}): play.twirl.api.HtmlFormat.Appendable = apply(maintenanceItem)(flash,messages,request)

  def f:((MaintenanceItem) => (Flash,Messages,models.RequestWithUser[_$1] forSome { 
   type _$1
}) => play.twirl.api.HtmlFormat.Appendable) = (maintenanceItem) => (flash,messages,request) => apply(maintenanceItem)(flash,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/maintenanceItems/detail.scala.html
                  HASH: 6f0941660e063c7d14199e9bd172ffce3280a39b
                  MATRIX: 826->1|1035->114|1063->117|1092->138|1131->140|1159->142|1229->185|1257->186|1293->196|1385->262|1398->267|1433->282|1487->309|1515->310|1558->326|1758->498|1787->499|1827->511|1859->516|1873->521|1909->536|1964->563|1993->564|2037->580|2237->752|2266->753|2307->766|2339->771|2353->776|2389->791|2454->828|2483->829|2527->845|2734->1024|2763->1025|2792->1026|2825->1032|3223->1403|3238->1409|3307->1457|3535->1658|3550->1664|3619->1712|3927->1993|3942->1999|3985->2021|4519->2528|4543->2543|4574->2553|4745->2697|4769->2712|4800->2722
                  LINES: 23->1|28->1|29->2|29->2|29->2|30->3|31->4|31->4|33->6|35->8|35->8|35->8|35->8|35->8|36->9|38->11|38->11|39->12|39->12|39->12|39->12|39->12|39->12|40->13|42->15|42->15|43->16|43->16|43->16|43->16|43->16|43->16|44->17|46->19|46->19|46->19|47->20|59->32|59->32|59->32|64->37|64->37|64->37|69->42|69->42|69->42|81->54|81->54|81->54|85->58|85->58|85->58
                  -- GENERATED --
              */
          