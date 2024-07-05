

object LoopDemo extends App {
  
  /*for(i<-1 to 10) // to means <=
    print(i+" ")
  
   for(i<-1 until 10) // until means <
    print(i+" ")*/
    
    // functional for loop with expression
    // yield
    val op = for( i <-1 to 10) yield i //  type of vector
    println(op)
    
    val op1 = for( i <-1 to 10) yield i % 2 == 0 //  type of vector
    println(op1)
    
    val op2 = for( i <-1 to 10) yield {
      val x = if(i % 2 == 0) i //  type of vector
      x
    }
    println(op2)
    
    val op3 = for( i <-1 to 10; if(i %2 ==0)) yield i
    
    println(op3)
    
    // Here we have to declare the variable on top which we have start the loop
    var index = 11
    while(index <= 10) { // It first checks the condition (Entry Control Loop)
      print("--->"+index+" ")
      index += 1
    }
    println("")
    
    
    var index1 = 11
     do{ // Here first executes the statement and then checks the conditions (Exit Control Loop)
      print("###>"+index1+" ")
      index1 += 1
    }while(index1 <= 10)
}