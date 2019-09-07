package com.codeinvestor.demoscalajson.loop

object ForDemo{
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 10 if i%2 == 0 ){
      println("i is now: " + i)
    }

    val mylist = List(1,400,600,2134)
    for (lv <- mylist){
      println("list value: " + lv)
    }

    val newlist = for {lv <- mylist} yield {
      lv*1000
    }
    println("newlist: " + newlist)


    for (i <- 1 until 10; y <- 1 to 3; z <- 1 to 5 ){
        println("y is now: " + y + ", i is " + i + ", z: " + z)
    }




  }
}
