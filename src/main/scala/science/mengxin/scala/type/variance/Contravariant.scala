package science.mengxin.scala.`type`.variance

/**
  *
  * <p>Date:    09/11/18
  *
  * @author mengxin
  * @version 1.0
  */

class Animal {}
class Mammal extends Animal{}
class Bird extends Animal{}
class Dog extends Mammal{}

/*Box1 is covariant in T
Box[Dog] can be used for Box[Mammal] not Box[Animal]
Only subtypes of Mammal are ok*/
class Box1[+T]{}

/*Box2 is contravariant in T
Box[Animal] can be used for Box[Mammal] not Box[Dog]
Only supertypes of Mammal are ok*/
class Box2[-T]{}

/*Box3 is invariant in T
Only Mammal is ok*/
class Box3[T]{}


trait test {
  def f1(x: Bird): Unit // instance of Function1[Bird, Unit]
  def f2(x: Animal): Unit // instance of Function1[Animal, Unit]

}

object Contravariant extends App{
  def method1(box:Box1[Mammal]){}
  def method2(box:Box2[Mammal]){}
  def method3(box:Box3[Mammal]){}

  /*covariance*/
//  method1(new Box1[Animal]) //compile fails
  method1(new Box1[Mammal])
  method1(new Box1[Dog])

  /*contravariance*/
  method2(new Box2[Animal])
  method2(new Box2[Mammal])
//  method2(new Box2[Dog]) //compile fails

  /*invariance*/
//  method3(new Box3[Animal]) //compile fails
  method3(new Box3[Mammal])
//  method3(new Box3[Dog]) //compile fails
}
