package models

case class Dog(override val name: String) extends Pet(name)