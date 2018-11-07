package science.mengxin.scala.patterns.cake.dao.user

import java.sql.DriverManager.println

/**
  *
  * <p>Date:    07/11/18
  *
  * @author mengxin
  * @version 1.0
  */
class NoSqlUserRepositoryImp extends UserRepository {
  override def create(user: User): Unit = println("NoSql creating user: " + user)

  override def find(name: String): Unit = println("NoSql finding user: " + name)
}
