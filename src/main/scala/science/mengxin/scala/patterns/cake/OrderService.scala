package science.mengxin.scala.patterns.cake

import java.sql.DriverManager.println

import science.mengxin.scala.patterns.cake.dao.item.ItemRepository
import science.mengxin.scala.patterns.cake.dao.user.UserRepository

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
class OrderService(userRepository: UserRepository, itemRepository: ItemRepository) {
  def create(userName: String, itemName: String):String = {
    itemRepository.find(itemName)
    userRepository.find(userName)
    println(s"create order for user: $userName with item $itemName")
    s"Order: $userName with item $itemName"
  }
}
