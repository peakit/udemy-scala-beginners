package exercises.part1basics

object Exercise2Factorial extends App {

  def factorial(n: Int): Int = {
    if(n == 1) 1
    else n * factorial(n - 1)
  }
  println(factorial(6))

}
