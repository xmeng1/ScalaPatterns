package science.mengxin.scala.patterns.cake
import org.scalatest.mockito.MockitoSugar
import org.mockito.Matchers._
import org.mockito.Mockito._
import science.mengxin.scala.patterns.cake.componets.{ItemRepoComponent, OrderServiceComponent, UserRepoComponent}
import science.mengxin.scala.patterns.cake.dao.item.{Item, ItemRepository}
import science.mengxin.scala.patterns.cake.dao.user.{User, UserRepository}
/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */

trait TestEnvironment extends OrderServiceComponent with UserRepoComponent with ItemRepoComponent{
  val userRepository: UserRepository = MockitoSugar.mock[UserRepository]
  val itemRepository: ItemRepository = MockitoSugar.mock[ItemRepository]
  val orderService = new OrderService(userRepository, itemRepository)
}
object OrderServiceTest extends App with TestEnvironment{
  val user = User("user mock")
  val item = Item("item mock")
  orderService.create(user.name, item.name)
  verify(userRepository, times(2)).find(_)
}