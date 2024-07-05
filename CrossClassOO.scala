class MyC(a:Int) {
  val x = a
  def +(myc1: MyC1) = x + myc1.y
}

class MyC1(b:Int) {
  val y:Int = b
  def -(myc: MyC) = y - myc.x
}

object CrossClassOO extends App {
  var myc = new MyC(10)
  var myc1 = new MyC1(200)
  
  
  val sum = myc + myc1
  println(sum)
  
//  val sum1 = myc1 + myc    // Error
  
  val sub = myc1 - myc
  println(sub)
}