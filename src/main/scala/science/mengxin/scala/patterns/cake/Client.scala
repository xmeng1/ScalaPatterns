package science.mengxin.scala.patterns.cake

import science.mengxin.scala.patterns.cake.dao.item.Item
import science.mengxin.scala.patterns.cake.dao.user.User
import science.mengxin.scala.patterns.cake.registry.SqlComponentRegistry

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
object Client extends App with SqlComponentRegistry {
  val user = User("user")
  val item = Item("item")
  orderService.create(user.name, item.name)
}
