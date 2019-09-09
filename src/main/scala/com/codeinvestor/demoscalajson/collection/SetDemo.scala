package com.codeinvestor.demoscalajson.collection

object SetDemo {
  def main(args: Array[String]): Unit = {
      val myset1 = Set(1,1,3,5,6,8)
      val myset2 = Set(10,1,30,50,60,80)
      val concatenated =  (myset2 ++ myset1) + 110
      println("Concatenated: " + concatenated)

      val mapped = concatenated.map(v => "blabla" + v +"blablabla")
      println("mapped set: " + mapped)

      val intersected = myset1 & myset2
      println("intersected: " + intersected)
  }
}
