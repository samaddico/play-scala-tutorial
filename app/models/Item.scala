package models

import play.api.libs.json._
import anorm._
import anorm.SqlParser._
import play.api.db.DB
import anorm.~
import org.joda.time.DateTime
import play.api.Play.current
import java.util.Date

/**
 * Created by dreamadmin on 5/11/15.
 */


case class Item (name:String,quantity:Int,price:BigDecimal,categoryId:Long,condition:String,color:String)

object Item {

  //maps class attribute resultset colummns
  val mapper = {
    get[String]("name")~
    get[Int]("quantity")~
    get[BigDecimal]("price")~
    get[Long]("category_id")~
    get[String]("item_condition")~
    get[String]("color") map {
      case name~quantity~price~categoryId~condition~color => Item(name,quantity,price,categoryId,condition,color)
    }
  }

  def findAll(): Seq[Item] = {
    DB.withConnection { implicit connection =>
      SQL("select * from item").as(Item.mapper *)
    }
  }

  //save or update
  def save(item: Item): Unit = {
    DB.withConnection { implicit connection =>
      SQL("insert into item(name,price,quantity,category_id,item_condition,color) values ({name},{price},{quantity},{category},{item_condition},{color})").on(
        'name -> item.name,
        'price -> item.price,
        'quantity -> item.quantity,
        'category -> item.categoryId,
        'item_condition -> item.condition,
        'color -> item.color
      ).executeUpdate()
    }
  }

  //remove from database
  def delete(name: String) {
    DB.withConnection { implicit connection =>
      SQL("delete from item where name = {name}").on(
        'name -> name
      ).executeUpdate()
    }
  }
}