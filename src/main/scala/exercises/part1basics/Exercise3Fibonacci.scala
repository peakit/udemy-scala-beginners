package exercises.part1basics

object Exercise3Fibonacci extends App {

  def fibonacci(n: Int): Int = {
    if(n == 1 || n == 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(5))

}
