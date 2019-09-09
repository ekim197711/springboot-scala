package com.codeinvestor.demoscalajson.collection

object MapDemo {
  def main(args: Array[String]): Unit = {
    val cakemap: Map[String, Int] = Map("Mike" -> 3, "Jens" -> 4, "Jan" -> 0, "Susanne" -> 10)
    val torbenadded = cakemap + ("Torben" -> 5)
    val cakemapOtherdTeam = Map("Steffen" -> 1, "Jesper" -> 6, "Jens" -> 5)
    println("Torbenadded: " + torbenadded)

    val concatenated = cakemap ++ cakemapOtherdTeam
    println("concatenated map: " + concatenated)

    concatenated.foreach(entryset => {
      println("key: " + entryset._1)
      println("value: " + entryset._2)
    })

    println("Susanne has given cake " + concatenated("Susanne") + " times")

    val myfilter = (entryset: Tuple2[String, Int]) => entryset._2 > 4
    println("filtered 1st: " + concatenated.filter((entryset) => entryset._2 > 4))
    println("filtered 2nd: " + concatenated.filter(myfilter))

  }
}
