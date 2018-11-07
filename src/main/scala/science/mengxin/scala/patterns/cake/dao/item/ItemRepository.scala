package science.mengxin.scala.patterns.cake.dao.item

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
case class Item(name:String)

trait ItemRepository {
  def create(item: Item)
  def find(name: String)
}
