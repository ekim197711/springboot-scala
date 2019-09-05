package com.codeinvestor.demoscalajson

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoScalaJsonApplication

object DemoScalaJsonApplication {

  def main(args: Array[String]): Unit = {
    val app : Array[Class[_]] = Array(classOf[DemoScalaJsonApplication])
    SpringApplication.run(app, args)
  }

}
