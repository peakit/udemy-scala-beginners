package lectures.part2oop

object OOBasics extends App {
  val p1 = new Person("John", 20)
  println(p1.age)
  p1.greet("Daniel")

  val p2 = new Person()
  p2.greet()
}

// constructor
// Class parameters are not equivalent to field
// But we can make them as fields by adding val or var keyword before it
class Person(name: String, val age: Int) {
  // body
  var x = 2
  x = x + 1
  println(x)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
