import models.{Cat, Dog}
import repositories.PetRepository

object PetRepositoryApp extends App {

  // create instances of Dog
  // create instances of Cat

  // call PetRepository.all() to get the list of pets

  val d = Dog("Jessie")
  val c = Cat("Purrsey")

  PetRepository.add(d, c)

  PetRepository.all

}
