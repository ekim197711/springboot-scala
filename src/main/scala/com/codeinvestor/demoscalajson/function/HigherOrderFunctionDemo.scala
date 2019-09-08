package com.codeinvestor.demoscalajson.function

object HigherOrderFunctionDemo {
  def main(args: Array[String]): Unit = {
    //    Higher order function
    val higherorderfunction = (f: Int => Int, y: Int) => {
      val resultfromfunction = f(10)
      resultfromfunction + y
    }
    val mathfunction = (x: Int) => x * 10
    val resultFromhigherOrderFunction = higherorderfunction(mathfunction, 1)
    println("resultFromhigherOrderFunction: " + resultFromhigherOrderFunction)


  }
}
