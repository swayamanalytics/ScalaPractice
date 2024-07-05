/**
  * Created by neelamadhabmallick on 29/04/17.
  */
object ArrayDemo extends App {
  // Here, as many value will be kept in the array, the length of that arr will be fixed
    val arr = Array(1,2,3,4,5)
    println(arr) // [I@48140564

  val ar1 = Array("Hello","Dear","Friend")
  println(ar1)

  val ar2 = Array('H','D','F')
  println(ar2)  //[C@7c30a502

  val ar3 = Array(10.2,3.4,5.6)
  println(ar3)  //[D@49e4cb85

  val ar4 = Array(10,"Hello",5.6) // Collection of different objects
  println(ar4)  //[Ljava.lang.Object;@7e0ea639 // Type Inference

  val ar5 = Array(new A, new B, new C) // Collection of different objects
  println(ar5)  // Ljava.lang.Object;@3d24753a

  // Restrict the array to a bound type
  val ar6 = Array[Int](1,2,3,4,5) // We have defined one Array type with Boundary of Int
  println(ar6)
  println(ar6(2)+"  :  "+ar6.length+"  :  "+ar6.size)

  val arr1 = Array.ofDim[Int](7) // It will create single dimension array of 7 block(Memory Indexes)
  arr1(0) = 1
  arr1(1) = 2
  arr1(2) = 3
  arr1(3) = 4
  arr1(4) = 5
  arr1(5) = 6
  //arr1(7) = 7

  println("Length : "+arr1.length+"  :  "+arr1.size)
  println(arr1(4))

  arr1.foreach(x=> print(x+"     ")) // => operator is lambda operator

  val arr2 = Array.ofDim[Int](2,2)
  arr2(0)(0) = 100
  arr2(0)(1) = 20

  arr2(1)(0) = 30
  arr2(1)(1) = 40
}

/**
  * size : If we are specifying the dimension of array, then we have to define the type of bound to make use of size method
  * length : If type bound of an array is not defined.
  *
  */
class A
class B
class C
