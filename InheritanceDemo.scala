
class Parent {
  val a:Int = 100
  val b:String = "Anup"
    
  def method1 = println("Parent Method 1")
  def method2 = println("Parent Method 2")
  def method3 = println("Parent Method 3")
}

// The child class extending Parent class
class Child extends Parent {
  def cMethod1 = println("Child Method 1")
}

object InheritanceDemo extends App{
  // in java: Child c = new Child()
  val c:Child = new Child // In Scala
  c.method1
  c.method2
  c.method3
  c.cMethod1
  println(c.a+"  :  "+c.b)
}



/**
   *Java
   *---
   * public void method1(Integer x) {
   * 	System.out.println("Parent Method 1"+x)
   * }
   * 
   * Scala
   * -----
   * def method1(x:Int) = println("Parent Method 1"+x)
   */