package science.mengxin.scala.patterns.cake.componets

import science.mengxin.scala.patterns.cake.dao.item.ItemRepository

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
trait ItemRepoComponent {
  val itemRepository: ItemRepository
}
