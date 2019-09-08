package com.codeinvestor.demoscalajson.function

class SpaceWeapon(val name: String){

  def fireWeapon(): Unit = {
    println("Our: " + name + " says tjiiiuuuuu woppaawww")
  }

  def this( name: String, damage : Int){
    this(name)
    println("our weapon does: " + damage + " damage")
  }

}

object FunctionDemo {

  def main(args: Array[String]): Unit = {
    new SpaceWeapon("lazergun", 10).fireWeapon()
  }
}
