// scala trait

trait ParentTrait {
  // public String method1(String name, Integer age);
  def method1(name: String, age:Int) : String // Method signature. It means, method name with parameter and return type
  
  def method2(add: String, mob: Long) = {// Concrete method( A method having body or implementation)
    println(add+"  :  "+mob) 
  }
}

trait MyTraits {
  def meth1 = println("Hello, Inside MyTraits")
}

abstract class MyChild extends ParentTrait {
  // We also can't crate the object of abstract class
  def m1(name: String): String
  def m2(age:Int) = println("Age Is :"+age)
}

class Child2 extends MyChild {
  override def m1(name: String) = name
  override def method1(name: String, age:Int) = name+" : "+age
}

class Child1 extends ParentTrait with MyTraits {
  // Implemented the ParentTrait method
  override def method1(name: String, age:Int): String = {
    println("Child Method")
    name+"  "+age
  }
}

object TraitDemo extends App {
  val c1: Child1 = new Child1
  println(c1.method1("Raja", 30))
  c1.method2("Marathalli", 234343233)
  c1.meth1
  /*val pt: ParentTrait = new ParentTrait {
        override def method1(name: String, age:Int): String = {
        println("Child Method")
        name+"  "+age
      }
  }
  println(pt.method1("Sourabh", 31))*/
  val c2: Child2 = new Child2
  println(c2.m1("Ashutosh"))
  println(c2.method1("XYZ", 40))
  c2.m2(35)
  
  /*val mc: MyChild = new MyChild {
    override def m1(name: String) = name
    override def method1(name: String, age:Int) = name+" : "+age
  }*/
}