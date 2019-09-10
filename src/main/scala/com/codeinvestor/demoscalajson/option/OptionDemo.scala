package com.codeinvestor.demoscalajson.option

import java.time.LocalDate

object OptionDemo {
  def main(args: Array[String]): Unit = {

    val weatherforecast = (date: LocalDate) => {
      if (date.isEqual(LocalDate.now())){
        None
      }
      else
        Some("Sunny")
    }

    val myemptyoption: Option[String] = weatherforecast(LocalDate.now())
    println("Option: " + myemptyoption)
    println("Weather for today: " + myemptyoption.getOrElse("Unknown"))

    val mySomeOption = weatherforecast(LocalDate.now().plusDays(4))
    println("Weather in 4 days: " + mySomeOption.getOrElse("Unknown"))
  }
}
