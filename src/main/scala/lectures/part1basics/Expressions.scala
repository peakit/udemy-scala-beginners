package lectures.part1basics

object Expressions extends App {

    var someValue = 3
    someValue = someValue + 2 // INSTRUCTIONS (which talk about DOing something)
    println(someValue)

    // EXPRESSION (If expression returns a value in Scala)
    val someOtherValue = if someValue == 5 then "hello" else "try again!"
    println(someOtherValue)

    // Everything in Scala is an EXPRESSION
    val aWeirdValue: Unit = (someValue = 10)
    println(aWeirdValue)
    println(someValue)

    // Code Blocks in Scala are Expressions
    // the value of the block is the value of the LAST expression in it
    val aCodeBlock = {
      val y = 2
      val z = y + 1

      if (z > 2) "hello" else "goodbye"
    }

    val anotherCodeBlock = {
      if someValue == 10 then 239 else 986
      42
    }
    println(anotherCodeBlock)
}
