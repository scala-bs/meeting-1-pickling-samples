package de.scala_bs.wille.pickling.sample


import scala.pickling._
import json._


object SimpleSample extends App {
  
  val pckl = List(1, 2, 3, 4).pickle
  println(pckl)
  val list = pckl.unpickle[List[Int]]
  
}


object ExtendedSample extends App {
  
  case class Cloud(shape: String)
  case class Sky(clouds: Set[Cloud])
  val pckl = Sky(Set(Cloud("Dog"), Cloud("Banana"))).pickle
  println(pckl)
  val sky = pckl.unpickle[Sky]
  
}