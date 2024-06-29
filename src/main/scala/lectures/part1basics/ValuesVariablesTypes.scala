package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // x = 2
  // VALS are immutable and hence cannot be reassigned

  // COMPILER can infer types
  val aString = "hello"
  println(aString)

  var y: Int = 10
  y = 20
  // VARIABLES can be re-assigned; side-effects

  val testValue: Boolean = true
  val charVar: Char = 'a'
  val shortNumber: Short = 4216
  val longNumber: Long = 2141434L
  val floatNumber: Float = 3.14f
  val doubleNumber: Double = 3.14567

}
