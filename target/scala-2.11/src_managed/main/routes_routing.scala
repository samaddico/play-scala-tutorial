// @SOURCE:/home/dreamadmin/IdeaProjects/play-scala-tutorial/conf/routes
// @HASH:bd7644c716bfe83cf517d91b945eb0b097f3f2b1
// @DATE:Tue Jun 09 14:07:49 WAT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_delete1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("item/remove/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_Application_delete1_invoker = createInvoker(
controllers.Application.delete(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "delete", Seq(classOf[String]),"GET", """""", Routes.prefix + """item/remove/$name<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_Application_addItem2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("item/add"))))
private[this] lazy val controllers_Application_addItem2_invoker = createInvoker(
controllers.Application.addItem(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addItem", Nil,"POST", """""", Routes.prefix + """item/add"""))
        

// @LINE:12
private[this] lazy val controllers_Application_listCategories3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/all"))))
private[this] lazy val controllers_Application_listCategories3_invoker = createInvoker(
controllers.Application.listCategories,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "listCategories", Nil,"GET", """""", Routes.prefix + """category/all"""))
        

// @LINE:15
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """item/remove/$name<[^/]+>""","""controllers.Application.delete(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """item/add""","""controllers.Application.addItem()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/all""","""controllers.Application.listCategories"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:8
case controllers_Application_delete1_route(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_delete1_invoker.call(controllers.Application.delete(name))
   }
}
        

// @LINE:10
case controllers_Application_addItem2_route(params) => {
   call { 
        controllers_Application_addItem2_invoker.call(controllers.Application.addItem())
   }
}
        

// @LINE:12
case controllers_Application_listCategories3_route(params) => {
   call { 
        controllers_Application_listCategories3_invoker.call(controllers.Application.listCategories)
   }
}
        

// @LINE:15
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     