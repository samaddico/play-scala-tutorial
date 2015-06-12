
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css")),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/hello.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*14.10*/content),format.raw/*14.17*/("""
    """),format.raw/*15.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 01 12:25:09 WAT 2015
                  SOURCE: /home/dreamadmin/IdeaProjects/play-scala-tutorial/app/views/main.scala.html
                  HASH: 5078f8cf652e6a5ff32f3e1fca54619a50ae762c
                  MATRIX: 509->1|627->31|655->33|732->84|757->89|954->260|968->266|1022->300|1110->361|1125->367|1178->399|1230->424|1245->430|1300->464|1394->531|1422->538|1454->543
                  LINES: 19->1|22->1|24->3|28->7|28->7|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|35->14|35->14|36->15
                  -- GENERATED --
              */
          