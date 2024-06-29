package exercises.part1basics

import scala.annotation.tailrec

object Exercise6FibonacciTailRec extends App {

  def fibonacciTailRec(term: Int): Int = {

    @tailrec
    def fibonacci(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= term) last
      else fibonacci(i + 1, last + nextToLast, last)
    }
    if (term <= 2) 1
    else fibonacci(2, 1, 1)
  }

  println(fibonacciTailRec(8))

}
