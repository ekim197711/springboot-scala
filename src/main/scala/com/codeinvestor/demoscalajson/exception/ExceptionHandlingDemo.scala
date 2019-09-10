package com.codeinvestor.demoscalajson.exception

import java.io.{FileNotFoundException, FileReader}

object ExceptionHandlingDemo {
  def main(args: Array[String]): Unit = {
    try{
      val myfile = new FileReader("list_of_spacecrafts_to_import.json")
    }
    catch {
      case myexception: FileNotFoundException => {
        println("We got a filenot found exception " + myexception)
      }
      case myioexception: IndexOutOfBoundsException =>{
        println("index exception: " + myioexception.getMessage)
      }
    }
    finally {
      println("Finally block")
    }
  }
}
