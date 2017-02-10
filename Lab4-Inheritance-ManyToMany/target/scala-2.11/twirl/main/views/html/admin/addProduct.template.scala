
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object addProduct_Scope1 {
import helper._
import models.products.Product
import models.products.Category

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(addProductForm: play.data.Form[Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.95*/("""

"""),format.raw/*8.102*/("""

"""),_display_(/*10.2*/admin/*10.7*/.adminMain("Add Product", user)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	"""),format.raw/*11.2*/("""<h3>Add a new Product</h3>
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal",
		'role->"form", 'enctype -> "multipart/form-data")/*14.52*/ {_display_(Seq[Any](format.raw/*14.54*/("""
		
		"""),format.raw/*16.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*18.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*18.81*/("""
		"""),_display_(/*19.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*19.95*/("""

		"""),_display_(/*21.4*/for((value, name) <- Category.options) yield /*21.42*/ {_display_(Seq[Any](format.raw/*21.44*/("""
			"""),format.raw/*22.4*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*22.54*/value),format.raw/*22.59*/("""">
			"""),_display_(/*23.5*/if(addProductForm("id").value() != null)/*23.45*/ {_display_(Seq[Any](format.raw/*23.47*/("""
				"""),_display_(/*24.6*/if(Category.inCategory(value.toLong, addProductForm("id").value().toLong))/*24.80*/{_display_(Seq[Any](format.raw/*24.81*/("""
				"""),format.raw/*25.5*/("""checked
				""")))}),format.raw/*26.6*/("""
			""")))}),format.raw/*27.5*/("""
			"""),_display_(/*28.5*/name),format.raw/*28.9*/("""<br>
		""")))}),format.raw/*29.4*/("""




		"""),_display_(/*34.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*34.83*/("""
		"""),_display_(/*35.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*35.83*/("""

		"""),format.raw/*37.3*/("""<!-- Image upload input -->
		<div class="container-fluid">
			<div class="row">
				<label>Image</label>
			</div>
			<div class="row">
				"""),_display_(/*43.6*/if(env.resource("public/images/productImages/thumbnails/" + addProductForm("id").value() + ".jpg").isDefined)/*43.115*/ {_display_(Seq[Any](format.raw/*43.117*/("""
					"""),format.raw/*44.6*/("""<p><img src="/assets/images/productImages/thumbnails/"""),_display_(/*44.60*/(addProductForm("id").value() + ".jpg")),format.raw/*44.99*/(""""/></p>
				""")))}/*45.7*/else/*45.12*/{_display_(Seq[Any](format.raw/*45.13*/("""
					"""),format.raw/*46.6*/("""<p><img src="/assets/images/productImages/thumbnails/noImage.png"/></p>
				""")))}),format.raw/*47.6*/("""
			"""),format.raw/*48.4*/("""</div>
			<div class="row">
				<input class="btn-sm btn-default" type="file" name="upload">
			</div>
		</div>

		<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*55.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*55.71*/("""

	"""),format.raw/*57.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*60.14*/routes/*60.20*/.AdminController.products()),format.raw/*60.47*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*63.3*/(""" """),format.raw/*63.4*/("""<!-- End Form definition -->

""")))}),format.raw/*65.2*/(""" """),format.raw/*65.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,env)

  def f:((play.data.Form[Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,env) => apply(addProductForm,user,env)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Thu Feb 09 17:56:16 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab4-Inheritance-ManyToMany/app/views/admin/addProduct.scala.html
                  HASH: 68d3dc6c3d38bdcd48587a0fa807941a990a6f26
                  MATRIX: 929->174|1117->267|1147->370|1176->373|1189->378|1229->409|1269->411|1298->413|1417->506|1563->643|1603->645|1636->651|1757->746|1855->823|1885->827|1997->918|2028->923|2082->961|2122->963|2153->967|2230->1017|2256->1022|2289->1029|2338->1069|2378->1071|2410->1077|2493->1151|2532->1152|2564->1157|2607->1170|2642->1175|2673->1180|2697->1184|2735->1192|2769->1200|2869->1279|2899->1283|2999->1362|3030->1366|3198->1508|3317->1617|3358->1619|3391->1625|3472->1679|3532->1718|3563->1732|3576->1737|3615->1738|3648->1744|3755->1821|3786->1825|3986->1999|4074->2066|4104->2069|4262->2200|4277->2206|4325->2233|4426->2304|4454->2305|4515->2336|4543->2337
                  LINES: 32->6|37->6|39->8|41->10|41->10|41->10|41->10|42->11|44->13|45->14|45->14|47->16|49->18|49->18|50->19|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|57->26|58->27|59->28|59->28|60->29|65->34|65->34|66->35|66->35|68->37|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|78->47|79->48|86->55|86->55|88->57|91->60|91->60|91->60|94->63|94->63|96->65|96->65
                  -- GENERATED --
              */
          