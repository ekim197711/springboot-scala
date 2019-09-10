package com.codeinvestor.demoscalajson.collection

import java.time.LocalDate

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val weatherforecast = () => {
      val weatherreturn: Tuple3[String, LocalDate, Int] =
        Tuple3("Sunny", LocalDate.now().plusDays(1), 21)

      weatherreturn
    }

    val mytuple3 = weatherforecast()
    mytuple3.productIterator.foreach(v => println("The value: " + v))

    val mytupleSpaceShip = ("Square spacship", "Lazer", 100, LocalDate.now(),2000)
    println("mytuple4: 2nd value " + mytupleSpaceShip._2)

  }
}
