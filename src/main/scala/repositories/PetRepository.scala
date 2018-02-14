package repositories

import models.{Cat, Dog, Pet}

import scala.collection.mutable.ArrayBuffer

object PetRepository {

  private val _pets : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all : List[Pet] = {
    val p = _pets.toList
    println(s"returning all your pets $p")
    p
  }
  def dogs : List[Dog] = Nil

  def cats : List[Cat] = Nil

  def other : List[Pet] = Nil

  def findByName(name: String) : Option[Pet] = None

  def update(pet: Pet) : List[Pet] = Nil

  def add(pet: Pet*) = {
    // take my list of pets called _pets
    // add on pets to the list
    // and return the new list of pets
//    _pets.+:(pet: _*)

    // take my list of pets called _pets
    // add on pets to the list
    // and return and re-assign to _pets
    _pets.++=:(pet)
  }

  def removeByName(name : String) : List[Pet] = Nil

}
