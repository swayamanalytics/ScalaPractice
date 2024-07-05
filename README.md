Install IntelliJ Software. After that need to install plugin for Scala and SBT(Recommended)
Eclipse for Scala
JDK 1.8 (Set the JAVA HOME and PATH)

SPARK FRAMEWORK
    - SPARK CORE
    - SPARK SQL
    - SPARK STREAMING
    - SPARK MACHINE LEARNING
    - SPARK GRAPH
SPARK code can be write using SCALA, JAVA, PYTHON and SCALA pattern is recommended to write the SPARK jobs.

What is programming Language
----------------------------
- Machine Level Language (0,1)
    - Interpretor was not here because direct conversion was there.
    
- Assembly Level Language - Assembler was there which was converting Assembly language to Machine language.

- High level language came - Here we have Compiler or Interpreter
        - C
        - C++
        - JAVA
        - SCALA
        It depends upon Compiler. It reads all the code once and shows the list of errors and executes after resolving all the errors.
        
        - VB
        - VB.NET
        All Microsoft Products are supports Interpreter : It reads and executes the code line by line and stops if any error found and again executes after resolving that error.
    
    A new er which is called as Functional Programming.
    
    - Scala is a functional programming ans aas well as Object Oriented Programming language.
    - We can write very less lines of code to acheive the scenario.
    - It is having libraries with efficient immutable data structure.
            a = 10
            a = 20 // ERROR

CLASS
-----
- Suppose you want to build one house,
        - You should have approved desing, how you are going to build the house. Can we stay within the design?. NO since it is having no memory space allocated to the design. whcih is nothing but the class. It means it is the blue print of a object.

OBJECT
------
- Your construction is ready based on your blue print(class), can we stay inside it now, YES

COLOR(Class)
    - RED COlor (Object)

Animal(Class)
    - COW

Some more points on objects
----------------------------
Each and every Objects is having some Property and functionalities.
                    Property(Attributes)
                    --------------------
                        - Hands
                        - Legs
                        - Eyes
                        - Fingers
                        
                    Functionality
                    -------------
                        - You can Eat, Run, Kick

Human(Class)
    - MALE (Object)
    - FEMALE (OBject)
-----------------------------------------------------------------------------------------------------------
Date 27-02-2017
---------------
What is the property in the class
----------------------------------
- In a class, property is also called as attributes or fields.
- It is generallu holds the value and can be operate through the function.

How to create the fields
-------------------------
    Before we proceed on fileds, lets discuss about the data types.
    
Data type
---------
- It represents the type of data, or it represents the memory capacity.
- All the datat types will be associate with an memory name(space)

    I have a bucket of 5 lit.
        here 5lit. is the data type and memory name is bucket.
        
    
    Data types in scala
    -------------------
        Byte                Char
        Short               String
        Int
        Long
        Float
        Double
        
Variable
---------
- It is a memroy space.
- Variable value can be change by any other process.

How to declare a variable
--------------------------
- We have two ways to declar a variable
    1. var
    2. val
    
    var <varible_name>: type[optional, since scala supports automatic type converstion based on value assigned]
    
    var a = 10 // means a is of type Int.
    
    var a:Int = 10
        a = 20 // Correct, since var is mutable(can be change the value)
        
Note: If a variable declare as var type, then we can change its value.

Note : If a variable declared as val, we can't change its value since it is immutable(which doesn't changae)

val a = 10
    a = 20 // Compile time error
    
    
Byte Code
---------
- Byte code is an instruction set.
- Bytecode generate from the source code
- Scala or Java is called as machine indipendent language because of the intermidiate convertion of code is which is bytecode.
- JVM( Java Virtual Machine) is responsible to convert the source code to byte code.
- Scala runs on the top of JRE (Java RUntime Engine) whihc is the part of JDK( Java Development KIT)

A Sample Scala Code:
--------------------
First.scala
-----------
object First extends App {
	println("Welcome to the SCALA World")
}

How to compile
--------------
scalac <File_Name.scala>
e.g. scalac First.scala

Note: After compilation, the scala file generates the .class file which is nothing but the byte code and the execution happens from butecode not from the source scala code.

How to run the application
--------------------------
scala <File_Name>
scala First

When we compile the scala code, it intrnally converts the code as below.

public final class First {
  public static void main(java.lang.String[]);
  public static void delayedInit(scala.Function0<scala.runtime.BoxedUnit>);
  public static void delayedEndpoint$First$1();
  public static long executionStart();
}


Types of classes based on Execution
------------------------------------
We have two tyoes of classes based on execution.
    1. Dependent class
        This class can't execute it self. It needs help from some other independent class to exeucte
    2. Independent class
        This class can be self executable.
        
How to decide, which class is dependent and independent class ?
    If a class is having main() method, is called independent class and this is the entry point to start the execution of an application by the JVM.

How the main method looks like?
    The methid signature of the main methid is like below
        
        public static void main(String args[])
    
    We have below access specifiers.
        1. public (Can be access by all)
        2. protected( Can be access by relativrs or neighbour(if you there is a relation))
        3. private (Can access by you(Member from your house))

So here main() method is public because of, it can be accessed by the oute side world. 

What is the meaning of static
-----------------------------
NOTE: In Scala there is no static key word. static keyword has been replaced by the keyword "object". The main target, you no need to define each and every variable or method as static separately, rather put inside the object block. What ever is there inside the object block will be convert to static during runtime of your application.

Below is the example
--------------------
object MyObjectDemo {
	val age: Int = 30
	val name: String = "Neel"
	def printData = println("My Name is "+name+" and Age is "+age)
}

Converted to below after compilation.
    Compiled from "MyObjectDemo.scala"
    public final class MyObjectDemo {
      public static void printData();
      public static java.lang.String name();
      public static int age();
    }

Now lets check, how class is behaving.
class MyClassDemo {
	val age: Int = 30
	val name: String = "Neel"
	def printData = println("My Name is "+name+" and Age is "+age)
}

Converted to below format after compilation.
    Compiled from "MyClassDemo.scala"
    public class MyClassDemo {
      private final int age;
      private final java.lang.String name;
      public int age();
      public java.lang.String name();
      public void printData();
      public MyClassDemo();
    }

What is exactly static
----------------------

Static is a common shared memory across the application. If any operation is changing the value of the static variable, will be impact through out the application and the updated value will be visible to all.

    public static void printData(); // method in scala
    public static java.lang.String name(); // varible in scala
      
The memory for static is always created and initialize during class loading by the JVM(Java Virtual Machine). Whenever we are trying to excute the application(.scala code), first it creates the memory for static fileds(data members or variable or attributes or properties) and methods by the JVM. 

Since this object is already created by the JVM, so we can access the data members by its class name directly and we no need to create instance variable to access this memory space since this memory is already created.

That is why, it is called as Class Variable or Class Methods (SInce we can directly access this varible or methods by the class name)


We have three types of variables
--------------------------------
    1. Local Varible (Variable inside the method)
        It gets the memory, when a method starts execution.
        
    2. Instance Variable (Inside the class or object)
        It gets the memory, when the object is created for the perticular class.
        
    3. Class Variable(static methods or variable)
        Automatically created by the JVM, when class gets load by the classloader to the JVM.
        
main() method is static because of, it has to be instancetiate by the JVM to call other method. If it is not static, the application will not run, since the entry point is itself not active.


void
-----
As we have discussed, void is the return type of the method. Here in the scala there is no "void" type, rather we have "Unit", whihc is internally converts to void.

main
----
This is the entry point of any class. (In scala it has to be object). If a "object" is having main method, it can be execute independently otherwise not.

String args[]
-------------

in java:
public static void main(String args[])

in scala:

def main(args : Array[String])

Both are same. the scala main method internally converts to java main method. the "args: Array[String]" is called as parameter to the main method.

Argument
---------
The variable whcih we are passing to the method braces is called argument(s). By default all the argument in the method is "val" type. It means, we can't change the value of the variable.

Parameter
---------

Value to the argument is called as parameter.

args : Array[String]: It takes the value from the outside world and process it.

for e.g.
--------
object ArgsDemo {
  def main(args: Array[String]): Unit = {
    println("Welcome to main method")
    val sum = args(0).toInt + args(1).toInt // We are converting the string value to integer type
    // Because of addition operation
    
    val stringSum = args(0) + args(1)
    
    println("The Sum Is : "+sum)
    println("The String Sum Is : "+stringSum)
    
    println("End Of Execution")
  }
}

to compile : scalac ArgsDemo.scala
to run : scala ArgsDemo 100 200

output:
Welcome to main method
The Sum Is : 300
The String Sum Is : 100200
End Of Execution

Difference between val, var and def
------------------------------------
- we can use val and var to define the variables.
    - var : If a variable has defined with var type, it means it is mutable type memory.
    - mutable means, the value of that variable can be change during runtime of the application.
    - for e.g.
        var a = 10 // auto type inference. It means, whatever value has assigned to the variable, the type will automatically
                    // changed. Here we have asignied the integer type valaue, so the the type of "a" will be INT.
        or
        var a: Int = 10 // This is the best practice. It takes less time to execute, why because, compiler no need to execute                     // extra to decide the type
    - val: If a variable has defined with val type, it means it is immutable type memory. It means the value of that variable will not change. It menas it internally converts the variable of type final(part of java).
    
        val i = 10 or val i:Int = 10
    
- def is used for defining the methods or functions.

Constructor in Scala
--------------------

- Constructor is the special function in scala which is having same name as class name.
- Constructor is generally used for assigning the value to the object during creation time. It means, when we are creating any object of a perticular class, we can suplly the value to it as well.

- The constructor will automatically called, when object is created.
 In scala we have two types of constructor
    1. Primary Constructor
    2. Auxiliary Constructor.
    
- Constructor can be overloaded through auxilary constructor.
- Constructor can have parameters
- We can have multiple auxiliary constructors.
    
    
Syntax to create Primary Constructor
------------------------------------
class <Class_Name>(field1, field2, field3) // OK

case class<Class_Name>(field1, field2, field3) // OK [Will discuss later on]

object <Object_Name>(field1, field2, field3) // Compile time error [Will discuss later]

traits <trait_name>(field1, field2, field3) // Compile time error [Will discuss later]

Note: We can use the primary and auxiliary constructor in the case of class and "case class" but not in the case of "object" or "traits"(What is trait, we will discuss)

Note: 
-----
If we don't provide the constructor, then JVM will create a default constructor and supply to the class to initialize the data. If we supply any constructor, the JVM will not create any default constructor for that class to initialize.

Important points on scala constructor
-------------------------------------
- Auxiliary constructors are defined by creating method name 'this'.
- Each auxiliary constructor must begin with a call to previous defined constructor
- We have to follow the calling orders of the auxiliary constructor
- Each auxialiary constructor must have different arguments, it means two auxiliary constrctor having same method signature is not allowed.
- One construct will call to another constructor using 'this' operator.


Functions in Scala
------------------
- Functions is the mechanism to decompose a large program in to smaller pieces. Every smaller pieces has to be perform certain functionlaity witout side effect.

- Scala functions are heart of scala programming and that is the reason scala is assumed as functional programming language.

for e.g.
--------
I have written the below scala code
class ScalaFunDemo {
  val i: Int = 0
}

Which will convert to its corresponding intermidiate Java code like below

public class ScalaFunDemo {
  private final int i;
  public int i();
  public ScalaFunDemo();
}

Here we can observe, the variable 'i' has converted to the private final variable in java, since we have declared it as 'val' in scala. private means, can't be access outside the class. Since the class has given am method called as 'int i()' whihc is type public and can be access outside of the class, so indirectly we can say that we can access the variable 'i'

Below are some scala functions
------------------------------
1. Annonymous Function
2. Nested Function
3. Partial Applied Function
4. Currying Function
5. Higher Order Function
6. Recursion Function

Different way to prepare a function
------------------------------------
1. Function with no argument no return value
2. Function with Argument and no return value
3. Function with no argument and return value
4. Function with Argument and return value
5. Function with Argument and return more than one value
6. Function with no argument and return more than one value

1. Annonymous Function
-----------------------
- Scala provides a relatively lightweight syntax for defining anonymous function.
- It is also called as function literals.
- Function literals are instatiated o=into objects which is called Function values.
- Scala supports first-class functions, which means functions can be expressed in function literals & that function can be represented by objects which are called function values.

for e.g. I have written below code in scala

object FunDemo extends App {
  def myFun(x: Int) = x + 1
  
  val f = (x: Int, y: Int) => x + y
  println(f) // It will return function2(scala.Function2), since it is taking two argument
  println(f(10,20))
  println(myFun(10))
}

It internally converts to below.

public final class FunDemo {
  public static void main(java.lang.String[]);
  public static void delayedInit(scala.Function0<scala.runtime.BoxedUnit>);
  public static void delayedEndpoint$FunDemo$1();
  public static long executionStart();
  public static scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> f();
  public static int myFun(int);
}

public static scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> -> Here it is taking 3 argument, but from the three argument, two arguments are input parameter and one argument is output parameter.

Below is the example of taking argument, return value and no return value.

object FunDemo extends App {
  def myFun(x: Int) = x + 1
  
  val f = (x: Int, y: Int)  => x + y : Int // anonymous function. It is taking two argument of Int type and returning Int. Taking parameter and return value
  
  val f1 = (x: Int, y: Int)  => println(x + y) : Unit // Anonymous function, taking parameter an no return value
  
  println(f) // It will return function2, since it is taking two argument
  
  println(f(10,20))
  f1(20,30)
  println(myFun(10))
}

No argument, no return value and no argument return value
---------------------------------------------------------
object FunDemo extends App {
  def myFun(x: Int) = x + 1
  
  val f = ()  => 10 + 20 : Int // anonymous function. It is taking two argument of Int type and returning Int
  
  val f1 = ()  => println("The Summation Is : "+(10 + 20)) : Unit // Anonymous function
  
  println("----> "+f) // It will return function2, since it is taking two argument
  
  println(f.apply())
  f1.apply()
  println(myFun(10))
}

2. Nested Function
------------------
- Nested function means, function within a function.
- It is also called as local function to the function.


Below are the function calling mechanism
-----------------------------------------
1. Call by value
2. Call by name
3. Function with default parameter value 

Partial Applied Function
-------------------------
- It allows to apply a function partially.
- It means, when applying the function, do not pass in the argument for all the parameters defined by the function, but only for some of them and leaving the remaining as blank.
- It will return back a new function whose parameter list only contains those paramaeter from the original funtion that were left blank.

Some Points
-----------
- A function that takes zero argument(No argument) is called NILADIC function.
- A function takes one argument is called as MONADIC function.
- A function takes two arguments is called DYADIC function.
- A function takes three arguments is called TRIADIC function.
- A function takes multiple arguments is called POLYADIC function.

Operators
---------
- Arithmetic operator = +, -, * , / , %
- Logical Operator = && , ||, !
- Unary operator = ++, --
- Bitwse Operator = &, |, ^, !
- Conditional Operator = >, <, >=, <=, !=, ==
- Binary operator = +, -, *

a = b + c

Note: The precedency of = operator is lower than other operator.

Currying Function
-----------------

- Currying function is the decomposition of a POLYADIC function in to a chain of nested unary functions. 

for e.g. below is my currying function.
def calculate(id: Int) (name: String, plotNo: Int) (sal: Double) = println("ID :"+id+", Name :"+name+", Salary :"+sal)

Internally it will create a curring chain like below
Int => (String, Int) => Double => Unit = $$Lambda$1538/125776626@6047906e

Here the first Int is for first argument of the function calculate, second argumnet (String, Int) says the second argument of the function calculate and third one is Double type which says third argument of the function calculate.

In curring function the first and the thir argument will return scala.Function1 internally since it has only one arguent and in it will return scala.Function2 for second arugement since it has two argument of String, Int type in the function calculate.

Inheritance In Scala
--------------------
- Inheritance means, we can extend the pre-designed and pre-created property or method of a existing class or traits( we will discuss) without creating once again from the scratch, to my class and also can provide my own implementation by overriding the methods.

- Inheritance is Scala is quite similar with Java and there are some restriction added in Scala like below.
    - The "extends" keyword helps to extending the other class/abstract class(we will discuss) and also traits.
    - Overriding classes must use the "override" modifier.
    - A class can extends another class(one class at a time)
    - A class can extends more than one traits.
    - A trait can extends a class.

traits in Scala
---------------
- traits is a mechanism in scala which can encapsulate the method and field defination, and whcih can be reused bymixing them in to the class.
- It is similar to java interface only difference is, java interface only takes the method signature, where as scala traits can have method signature as well as concrete methods(A method having body or implementation is called concrete methods)
- it can be created by the keyword "traits" for e.g. traits <MyTraitName>
- If any of the class is extending the traits, that class has to implement the unimplemented method which are present in the trait.
- If we will not implemet the un-implemented method from the traits, it will compile time error saying to implement the un-implemeted methd=od or declare that class as a abstarct class(we will learn)

- We can't create the object of trait directly.
- A class can extends multiple traits using "with" operator
- A trait can extens another traits and class.

Abstract Class
--------------
- Traits provide the same flavour of abstract class, it means, in SCALA, the abstract class can have method signature or concrete methods like traits.
- If any of the class is trying to exetend abstract class, then that class has to implement the un-implementd method of that abstract class else, that class became abstract.


Dynamic Dispatching
-------------------
- This functionality, we only acheive in the case of inheritance.
- It says, at the runtime we can decide, which method should execute.
- A Parent class object can hold the reference of child class where as the vicevers is not possible and it will throw runtime exeception saying ClassCastException.
- Since, the parent class object is holding the child class reference, so it can execute the child class function.
- To achive this, we must have same method signature in Parent and Child. In otherway we can say that we are overriding the method of parent class and providing our own implementation.






























































































































































            