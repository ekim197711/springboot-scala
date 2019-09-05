package com.codeinvestor.demoscalajson.config

import com.codeinvestor.demoscalajson.spacestation.SpaceStation
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
class JsonConfiguration {

  @Bean
  def myJsonMapper : ObjectMapper ={
    val mapper = new ObjectMapper
    mapper.registerModule(DefaultScalaModule)
    mapper
  }

  @Bean
  def myspaceStation: SpaceStation ={
    SpaceStation("International Space station", 45)
  }

}
