package exercises.part2oop

object Exercise2Counter extends App {

    val c1 = new Counter(1)
    println(c1.intVal)
    val c2 = c1.increment()
    println(c2.intVal)
    val c3 = c2.decrement(2)
    println(c3.intVal)

    val c4 = c3.increment(2)
    println(c4.intVal)
}

class Counter(val intVal: Int) {

  def current(): Int = {
    intVal
  }

  def increment(): Counter = {
    new Counter(this.intVal + 1)
  }

  def decrement(): Counter = {
    new Counter(this.intVal - 1)
  }

  def increment(amt: Int): Counter = {
    new Counter(this.intVal + amt)
  }

  def decrement(amt: Int): Counter = {
    new Counter(this.intVal - amt)
  }
}