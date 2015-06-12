
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Item],Seq[Item],Seq[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[Item],items: Seq[Item],categories : Seq[Category]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.68*/("""


"""),_display_(/*4.2*/main("My First Scala Tutorial")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""
"""),format.raw/*5.1*/("""<div class="container">
 <section class="" >
     <h2>Add New Item </h2>

     <div class="" >
     """),_display_(/*10.7*/helper/*10.13*/.form(action = routes.Application.addItem(),'role -> "form",'class -> "form-horizontal")/*10.101*/ {_display_(Seq[Any](format.raw/*10.103*/("""
     """),format.raw/*11.6*/("""<div class="control-group">
         <label Class="control-label" >Item Name</label>
         <div class="controls">
             <input required name="name" placeholder="Enter category name here" type="text" class="form-control"/>
         </div>
     </div>

     <div class="control-group">
         <label Class="control-label" >Category</label>
           <div class="controls">
              <select required name="categoryId" placeholder="" type="text" class="form-control">
                """),_display_(/*22.18*/if(categories.isEmpty)/*22.40*/ {_display_(Seq[Any](format.raw/*22.42*/("""
                  """),format.raw/*23.19*/("""<option value="">Add a category first</option>

                """)))}/*25.19*/else/*25.24*/{_display_(Seq[Any](format.raw/*25.25*/("""

                  """),_display_(/*27.20*/for(c <- categories) yield /*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""
                  """),format.raw/*28.19*/("""<option value="""),_display_(/*28.34*/c/*28.35*/.id),format.raw/*28.38*/(""" """),format.raw/*28.39*/(""">"""),_display_(/*28.41*/c/*28.42*/.name),format.raw/*28.47*/("""</option>
                  """)))}),format.raw/*29.20*/("""

                """)))}),format.raw/*31.18*/("""
              """),format.raw/*32.15*/("""</select>
           </div>
     </div>

     <div class="control-group">
         <label Class="control-label" >Price</label>
         <div class="controls">
             <input required name="price" placeholder="" type="text" class="form-control"/>
         </div>
     </div>

         <div class="control-group">
             <label Class="control-label" >Quantity</label>
             <div class="controls">
                 <input required name="quantity" placeholder="" type="text" class="form-control"/>
             </div>
         </div>

         <div class="control-group">
             <label Class="control-label" >Condition</label>
             <div class="controls">
                 <select required name="condition" placeholder="" type="text" class="form-control">
                     <option>New</option>
                     <option>Used</option>
                 </select>
             </div>
         </div>
         <div class="control-group">
             <label Class="control-label" >Color</label>
             <div class="controls">
                 <select required name="color" placeholder="" type="text" class="form-control">
                     <option>Cyan</option>
                     <option>Blue</option>
                     <option>Black</option>
                     <option>Green</option>
                     <option>Red</option>
                     <option>Pink</option>
                     <option>Violet</option>
                     <option>Purple</option>
                     <option>White</option>
                 </select>
             </div>
         </div>

     <input type="submit" class="btn btn-primary" style="margin-top: 10px;margin-left: 280px;margin-bottom:10px;"/><br/>
 """)))}),format.raw/*77.3*/("""
 """),format.raw/*78.2*/("""</div>
 </section>



 <section class="">

     """),_display_(/*85.7*/if(items.isEmpty)/*85.24*/ {_display_(Seq[Any](format.raw/*85.26*/("""
     """),format.raw/*86.6*/("""<h1>No items at the moment</h1>
     """)))}/*87.8*/else/*87.13*/{_display_(Seq[Any](format.raw/*87.14*/("""
     """),format.raw/*88.6*/("""<table class="table table-bordered table-striped">
         <thead>
         <tr>
             <td>Item Name</td>
             <td>Price</td>
             <td>Quantity</td>
             <td>Condition</td>
             <td>Color</td>
             <td>Action</td>
         </tr>
         </thead>
     <tbody>
     """),_display_(/*100.7*/for(i <- items) yield /*100.22*/ {_display_(Seq[Any](format.raw/*100.24*/("""
     """),format.raw/*101.6*/("""<tr>
     <td>"""),_display_(/*102.11*/i/*102.12*/.name),format.raw/*102.17*/("""</td>
     <td>$  """),_display_(/*103.14*/i/*103.15*/.price),format.raw/*103.21*/("""</td>
     <td>"""),_display_(/*104.11*/i/*104.12*/.quantity),format.raw/*104.21*/("""</td>
     <td>"""),_display_(/*105.11*/i/*105.12*/.condition),format.raw/*105.22*/("""</td>
     <td>"""),_display_(/*106.11*/i/*106.12*/.color),format.raw/*106.18*/("""</td>
     <td><a type="button" class="btn btn-sm btn-danger" href="/item/remove/"""),_display_(/*107.77*/i/*107.78*/.name),format.raw/*107.83*/(""""/>Delete</a></td>
     </tr>
     """)))}),format.raw/*109.7*/("""
     """),format.raw/*110.6*/("""</tbody>
     </table>

     """)))}),format.raw/*113.7*/("""
 """),format.raw/*114.2*/("""</section>
</div>
""")))}),format.raw/*116.2*/("""
"""))}
  }

  def render(itemForm:Form[Item],items:Seq[Item],categories:Seq[Category]): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,items,categories)

  def f:((Form[Item],Seq[Item],Seq[Category]) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,items,categories) => apply(itemForm,items,categories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 12 12:11:56 WAT 2015
                  SOURCE: /home/dreamadmin/IdeaProjects/play-scala-tutorial/app/views/index.scala.html
                  HASH: ee1f6af9886ea67b0ef203687d0ce4925902a693
                  MATRIX: 533->1|687->67|716->71|755->102|794->104|821->105|948->206|963->212|1061->300|1102->302|1135->308|1661->807|1692->829|1732->831|1779->850|1863->916|1876->921|1915->922|1963->943|1999->963|2039->965|2086->984|2128->999|2138->1000|2162->1003|2191->1004|2220->1006|2230->1007|2256->1012|2316->1041|2366->1060|2409->1075|4176->2812|4205->2814|4280->2863|4306->2880|4346->2882|4379->2888|4435->2927|4448->2932|4487->2933|4520->2939|4861->3253|4893->3268|4934->3270|4968->3276|5011->3291|5022->3292|5049->3297|5096->3316|5107->3317|5135->3323|5179->3339|5190->3340|5221->3349|5265->3365|5276->3366|5308->3376|5352->3392|5363->3393|5391->3399|5501->3481|5512->3482|5539->3487|5606->3523|5640->3529|5701->3559|5731->3561|5781->3580
                  LINES: 19->1|22->1|25->4|25->4|25->4|26->5|31->10|31->10|31->10|31->10|32->11|43->22|43->22|43->22|44->23|46->25|46->25|46->25|48->27|48->27|48->27|49->28|49->28|49->28|49->28|49->28|49->28|49->28|49->28|50->29|52->31|53->32|98->77|99->78|106->85|106->85|106->85|107->86|108->87|108->87|108->87|109->88|121->100|121->100|121->100|122->101|123->102|123->102|123->102|124->103|124->103|124->103|125->104|125->104|125->104|126->105|126->105|126->105|127->106|127->106|127->106|128->107|128->107|128->107|130->109|131->110|134->113|135->114|137->116
                  -- GENERATED --
              */
          