package com.codeinvestor.demoscalajson.function

object NestedFunctionDemo {
  def main(args: Array[String]): Unit = {
    //    Nested function
    val nestedfunction = (x: Int) => {
      var variable = x

      def multiplyFunction(y: Int): Int = {
        y * 2
      }

      println("current value: " + variable)
      variable = multiplyFunction(variable)
      variable
    }
    println("nestedFunction result: " + nestedfunction(10))

  }
}
