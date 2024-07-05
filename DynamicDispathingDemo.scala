
class Parent11 {
  def meth1(name: String) = println("[In Parent] -> Hello Dear : "+name)
  def meth2(age: Int) = println("[In Parent] -> Age Is : "+age)
}

class Child11 extends Parent11 {
  override def meth1(name: String) = println("[In Child] -> Hello Dear : "+name)
}

object DynamicDispathingDemo extends App {
  val parent: Parent11 = new Child11
  parent.meth1("Anup")
  parent.meth2(30)
  
//  val child: Child11 = new Parent11.asInstanceOf[Child11] // You can't keep the parent class reference to Child class object
}