package science.mengxin.scala.patterns.cake.dao.item

import java.sql.DriverManager.println

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
class ItemRepositoryImpl extends ItemRepository {
  override def create(item: Item): Unit = println("creating item: " + item)

  override def find(name: String): Unit = println("find item: " + name)
}
