package com.codeinvestor.demoscalajson.`case`

case class Planet(name: String = "Mars", size: Int = 120) extends BasicSpaceObject("Rock")
class PlanetNormal(name: String, size: Int) extends BasicSpaceObject("Ice")
class BasicSpaceObject (matter: String){
  def calc(x: Int, y:Int)= x + y
}

object PlanetDemo {
  def main(args: Array[String]): Unit = {
    println("Hello")
    val planet1 = Planet("Jupiter", 1000)
    val planet2 :Planet = Planet("Jupiter", 1000)
    println("Are the planets alike: " + (planet1 == planet2))
    println("Calc 2 numbers with planet1: " + planet1.calc(10,20))
    val planetNormal1 :PlanetNormal = new PlanetNormal("Jupiter", 1000)
    val planetNormal2 :PlanetNormal = new PlanetNormal("Jupiter", 1000)
    println("Are the Normal planets alike: " + (planetNormal1 == planetNormal2))
    println("Calc 2 numbers with planetNormal1: " + planetNormal1.calc(50,60))

    println("planetNormal2: " + planetNormal2)
    val planet3 = Planet(size=2000)
    println("Planet3: " + planet3)

  }
}
