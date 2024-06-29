package exercises.part1basics

object Exercise1Greeting extends App {

  def greetings(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greetings("David", 12))

}
