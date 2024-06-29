package lectures.part1basics

object CBVvsCBN extends App {

  def callByValue(i: Long): Unit = {
    println("Call by value: " + i)
    println("Call by value: " + i)
  }

  // In Call BY NAME, expression is passed and lazy evaluated
  def callByName(i: => Long): Unit = {
    println("Call by name: " + i)
    println("Call by name: " + i)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
