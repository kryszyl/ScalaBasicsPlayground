package lectures

object Expressions extends App {
  var aVal = 32
  aVal += 20
  println(aVal)

  println(2 + 5 * 24)
  // + - * % | ^ & << >> >>> (right shift with zero extension)

  var aString = "hello it is a string"
  println(!aString.isEmpty)
  // ! == || && !=

  var aInt = 23
  aInt *= 4 // += -= *= etc. works only with sideeffects ...
  println(aInt)

  //Expressions(VALUE) vs Instructions(DO)

  //IF expression

  val condition = true
  val conditionVal = if (condition) 5 else 3
  println(conditionVal)
  println(if (condition) 6 else 3)

  //LOOPING

  var i = 1
  val aWhile: Unit = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER DO THIS AGAING. Loops in general is pecific for imperative programming (Java, Python, C++)
  // Everything in SCALA is an expression
  var aVariable = 4
  val aWierdValue: Unit = (aVariable = 3) // Unit === void
  println(aWierdValue)
  println(aWhile)

  // side effects are : println, while loops, reassinging of vars
  // side effects are like instructions (instructing to do something) but they are still expressions returning Unit

  //Code blocks
  val aCodeBlock = {
    val z = 2

    if (z + 1 > 2) "hello" else "world"
  }

  println(aCodeBlock)

}
