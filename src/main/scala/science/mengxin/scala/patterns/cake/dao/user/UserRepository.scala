package science.mengxin.scala.patterns.cake.dao.user

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
case class User(name:String)

trait UserRepository {
  def create(user: User)
  def find(name: String)
}
