package com.codeinvestor.demoscalajson.function

object RecursiveFunctionDemo {


  def main(args: Array[String]): Unit = {
    //    Recursive function
    def myrecursiveFunction (x: Int) : Int ={
      var variable = x * 2
      println("variable resursive: " + variable)
      if (variable < 1000)
        myrecursiveFunction((variable))
      else
        variable
    }
    println("recursive result: " + myrecursiveFunction(2));

  }
}
