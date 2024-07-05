// Example of operator Function or Operator Overloading in C++
class MyOO {
  var x: Int = 0
  def +(param: MyOO) = x + param.x
  def -(param: MyOO) = x - param.x
  def unary_~ = println("Hello") // It is saying to the compiler that, we want to implement unary operator
  
  def *(a: Int) = x * a
  def  ##(a:Int) =  a + 1 

}

object OperatorFunction extends App {
  // Object of same class type
  var a = new MyOO
  var b = new MyOO
  
  a.x = 10
  b.x = 30
  
  val sum = a + b // Addition of objects
  val sub = b - a // Subtraction of object
  println(sum)               
  println(sub)
  
  ~a
  
  val res = a * 100 // Object with primitive type
  println(res)
  
  val res1 = a ## 10  
  print(res1)
}