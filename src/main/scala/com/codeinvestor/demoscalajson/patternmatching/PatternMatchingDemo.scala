package com.codeinvestor.demoscalajson.patternmatching

case class Asteroid(name: String, size: Int)

object PatternMatchingDemo {
  def main(args: Array[String]): Unit = {
    val myasteroid = Asteroid("Huge asteroid", 8888)

    def matchAsteroid(x: Any): Any = x match{
      case 100 => "The number 100"
      case "One hundred" => 100
      case Asteroid("Huge asteroid", 8888) => "Hurraaaay we got a match"
      case _ => "Wildcard match... hmmm lets add more cases"
    }

    println("result from pattern matching: " + matchAsteroid(myasteroid))
    println("result from pattern matching: " + matchAsteroid(100))
    println("result from pattern matching: " + matchAsteroid("bla bla bla"))


  }
}
