package exercises.part1basics

object Exercise4Prime extends App {
  def isPrime(num: Int): Boolean = {
    var halfOfNum:Int = num/2

    def isPrimeUntil(aNum: Int, aDenom: Int, aLimit: Int): Boolean = {
      if(aDenom < aLimit) true
      else if (aNum % aDenom == 0) false
      else {
        isPrimeUntil(aNum, aDenom - 1, aLimit)
      }
    }
    isPrimeUntil(num, num/2, 2)
  }

  println(isPrime((3)))
  println(isPrime((37)))
  println(isPrime((4)))
  println (isPrime((15)))
  println (isPrime((40)))
}
