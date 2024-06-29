package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction: Int = 42

  println(aParameterLessFunction)

  // Use RECURSION WHENEVER you need Loops
  def aRepeatedFunction(str: String, times: Int): String = {
    if (times == 1) str
    else str + aRepeatedFunction(str, times - 1)
  }
  println(aRepeatedFunction("hello", 3))

  // Compiler can INFER the RETURN TYPES of Functions
  // But for RECURSIVE functions the RETURN TYPES is MANDATORY

}
