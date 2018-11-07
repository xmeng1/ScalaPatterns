package science.mengxin.scala.patterns.cake.dao.user

import java.sql.DriverManager.println

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
class SqlUserRepositoryImp extends UserRepository {
  override def create(user: User): Unit = println("Sql creating user: " + user)

  override def find(name: String): Unit = println("Sql finding user: " + name)
}
