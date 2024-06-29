package exercises.part1basics

import scala.annotation.tailrec

object Exercise5RepeatedStringTailRec extends App {

  def repeatedStringTailRec(text: String, times: Int): String = {
    
    @tailrec
    def repeatString(text: String, times: Int, accumulator: String): String = {
      if (times <= 1) accumulator
      else {
        repeatString(text, times - 1, accumulator + text)
      }
    }
    repeatString(text, times, "")
  }

  println(repeatedStringTailRec("hello", 50))

}
