package science.mengxin.scala.patterns.cake.componets

import science.mengxin.scala.patterns.cake.dao.user.UserRepository

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
trait UserRepoComponent {
  val userRepository: UserRepository

}
