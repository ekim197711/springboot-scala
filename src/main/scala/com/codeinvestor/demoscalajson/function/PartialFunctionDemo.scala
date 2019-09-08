package com.codeinvestor.demoscalajson.function

object PartialFunctionDemo {

  def functionWithDefaultValues(x: Int = 5, y: Int = 7) = x + y


  def main(args: Array[String]): Unit = {
    //    Anonomyous function
    val myfunction = (x: Int, y: Int) => x + y
    val result = myfunction(20, 30)
    println("result: " + result)

    //    Partial initialized function
    val partialfunction = myfunction(100, _)
    println("partial: " + partialfunction(300))

    //    Function with default values
    println("function with defaultvalues: " + functionWithDefaultValues(y = 20))



  }
}
