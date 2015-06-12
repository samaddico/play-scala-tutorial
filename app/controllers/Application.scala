package controllers

import play.api._
import play.api.mvc._
import anorm.NotAssigned
import play.api.data._
import play.api.data.Forms._



import models.{Item, Category}
import play.api.libs.json._

object Application extends Controller {


  //home page
  def index = Action {
    val items = Item.findAll()
    val categories = Category.findAll()
    Ok(views.html.index(itemForm,items,categories))
  }

  //define a form to transform form data
  // into a bound instance of a case class Item.
  val itemForm = Form(
    mapping(
      "name" -> Forms.nonEmptyText(),
      "quantity" -> Forms.number,
      "price" -> Forms.bigDecimal(19,2),
      "categoryId" -> Forms.longNumber(),
      "condition" -> Forms.text(),
      "color" ->Forms.text()
    )(Item.apply)(Item.unapply)
  )

  //save a new Item
  def addItem() = Action { implicit request =>
    itemForm.bindFromRequest.fold(
    errors => BadRequest(views.html.index(errors,Item.findAll(),Category.findAll())),
    {
      case (itemForm) =>
        Item.save(Item(itemForm.name,itemForm.quantity,itemForm.price,itemForm.categoryId,itemForm.condition,itemForm.color))
        Redirect(routes.Application.index())
    }
    )
  }

  //delete an item
  def delete(name : String) = Action {
          Item.delete(name)
    Redirect(routes.Application.index())
  }

  //list all categories to json
   def listCategories() = Action {

     val categories = Category.findAll()
     val json = Json.toJson(categories)

     Ok(json).as("application/json")
   }
}