package com.codeinvestor.demoscalajson.loop

object WhileDemo {
  def main(args: Array[String]): Unit = {
    var i : Int = 0;
    do {
      println("i value: " + i)
      i = i+1
    } while(i < 10)

  }
}
