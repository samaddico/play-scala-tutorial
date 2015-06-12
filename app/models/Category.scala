package models

import play.api.db._
import anorm._
import anorm.SqlParser._
import play.api.libs.json._
import play.api.Play.current

/**
 * Created by dreamadmin on 4/30/15.
 */



case class Category(id:Long,name:String,description:String)


  object Category {

  implicit val anormLongPkFormat = new Format[Pk[Long]] {
    def writes(key: Pk[Long]): JsValue = Json.toJson(key.toString)
    def reads(jv: JsValue): JsResult[Pk[Long]] = JsError()
  }

  implicit val cateFormat = Json.format[Category]

  val simple = {
      get[Long]("id")~
      get[String]("name")~
      get[String]("description") map {
      case id~name~description => Category(id,name,description)
    }
  }

  def findAll(): Seq[Category] = {
    DB.withConnection { implicit connection =>
      SQL("select * from category").as(Category.simple *)
    }
  }

  def save(category: Category): Unit = {
      DB.withConnection { implicit connection =>
        SQL("insert into category(name,description) values ({name},{description})").on(
          'name -> category.name,
          'description -> category.description
        ).executeUpdate()
      }
  }
}

