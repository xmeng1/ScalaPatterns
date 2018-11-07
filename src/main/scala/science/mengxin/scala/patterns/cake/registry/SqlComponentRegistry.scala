package science.mengxin.scala.patterns.cake.registry

import science.mengxin.scala.patterns.cake.OrderService
import science.mengxin.scala.patterns.cake.componets.{ItemRepoComponent, OrderServiceComponent, UserRepoComponent}
import science.mengxin.scala.patterns.cake.dao.item.{ItemRepository, ItemRepositoryImpl}
import science.mengxin.scala.patterns.cake.dao.user.{SqlUserRepositoryImp, UserRepository}

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
trait SqlComponentRegistry extends OrderServiceComponent  with ItemRepoComponent with UserRepoComponent {
  override val itemRepository: ItemRepository = new ItemRepositoryImpl
  override val userRepository: UserRepository = new SqlUserRepositoryImp
  override val orderService: OrderService = new OrderService(userRepository, itemRepository)
}
