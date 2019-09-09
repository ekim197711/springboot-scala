package com.codeinvestor.demoscalajson.collection

import scala.collection.mutable

object ListDemo {
  def main(args: Array[String]): Unit = {
    val grocerylist = List("milk", "milk", "butter", "grapes")
    val candylist = "chocolate" :: ("winegums" :: ("lollypop" :: Nil))

    println("grocerylist: " + grocerylist)
    println("candylist: " + candylist)
    println("first element: " + grocerylist.head)
    println("except first element: " + grocerylist.tail)

    val candyAndGrocery = grocerylist ::: candylist
    println("concatenated: " + candyAndGrocery)

    val pastils = List.fill(10)("mint pastil")
    println("pastils: " + pastils)

    val numberlist = List.tabulate(6)(n => n*10)
    println("numberlist: " + numberlist)
    val filteredList  = numberlist.filter(n => n < 30)
    println("filtered List: " + filteredList)
    filteredList.foreach(e => println("element: " + e))


    val reversedNumberList = numberlist.reverse
    println("Reversed list: " + reversedNumberList)
    val reversedNumberListAddition = 25 :: numberlist.reverse
    for (i <- reversedNumberListAddition){
      println("Element from for loop: " + i)
    }

    val droppedElements = reversedNumberListAddition.dropWhile(p => p > 30)
    println("dropped elements list: " + droppedElements)

    val numberlist1 = List(1,2,3)
    val numberlist2 = List(0,2,3,4)
    val intersectedlist = numberlist1.intersect(numberlist2)
    println("intersected list: " + intersectedlist)

    val mappedlist = numberlist2.map(i => "element" + i*10)
    println("mappedlist" + mappedlist)

  }
}
