package com.codeinvestor.demoscalajson.spacestation

import org.springframework.web.bind.annotation.{GetMapping, RequestParam, RestController}

import scala.jdk.CollectionConverters

@RestController
class SpaceStationController(val spaceStation: SpaceStation) {

  @GetMapping(value=Array("/destination"))
  def destination(@RequestParam name : String) : String ={
    "Dear %s, please proceed to the Moon for further instruction"
      .format(name)
  }

  @GetMapping(value=Array("/ships"))
  def dockedspaceships : List[String] ={
    List("RoundShip", "SquareShip", "VeryBigShip")
  }

  @GetMapping(value=Array("/orbit"))
  def orbit : String ={
    "The Spacestation: "+ spaceStation +" is in orbit around Jupiter"
  }


  @GetMapping(value=Array("/ships2"))
  def dockedspaceships2 : java.util.List[String] ={
    CollectionConverters.BufferHasAsJava(
    List("RoundShip2", "SquareShip2", "VeryBigShip2").toBuffer
    ).asJava
  }





}
