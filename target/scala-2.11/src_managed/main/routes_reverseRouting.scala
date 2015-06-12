// @SOURCE:/home/dreamadmin/IdeaProjects/play-scala-tutorial/conf/routes
// @HASH:bd7644c716bfe83cf517d91b945eb0b097f3f2b1
// @DATE:Tue Jun 09 14:07:49 WAT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {


// @LINE:15
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:12
def listCategories(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "category/all")
}
                        

// @LINE:8
def delete(name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "item/remove/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:10
def addItem(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "item/add")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:15
class ReverseAssets {


// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:12
def listCategories : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listCategories",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/all"})
      }
   """
)
                        

// @LINE:8
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "item/remove/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:10
def addItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addItem",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "item/add"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {


// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:12
def listCategories(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.listCategories(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "listCategories", Seq(), "GET", """""", _prefix + """category/all""")
)
                      

// @LINE:8
def delete(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "delete", Seq(classOf[String]), "GET", """""", _prefix + """item/remove/$name<[^/]+>""")
)
                      

// @LINE:10
def addItem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addItem(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addItem", Seq(), "POST", """""", _prefix + """item/add""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    