package com.codeinvestor.demoscalajson.function

object CurriedFunctionDemo {
  def main(args: Array[String]): Unit = {
    val addFunction = (x: Int, y: Int, z:Int) => x + y + z
    val curriedFunction = addFunction.curried
    println("curried result: " + curriedFunction(10)(20)(30))

    val addFunctionManuallyCurried =
      (x: Int) => (y: Int) => (z: Int) => x+y+z
    println("manually curried result: "
      + addFunctionManuallyCurried(30)(40)(50))

  }
}
