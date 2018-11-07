package science.mengxin.scala.patterns.cake.componets

import science.mengxin.scala.patterns.cake.OrderService

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
trait OrderServiceComponent { this: UserRepoComponent with ItemRepoComponent =>
  val orderService: OrderService
}
