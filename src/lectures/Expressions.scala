package lectures

object Expressions extends App {
  var aVal = 32
  aVal += 20
  println(aVal)

  println(2 + 5 * 24)
  // + - * % | ^ << >> >>> (right shift with zero extension)

  var aString = "hello it is a string"
  println(!aString.isEmpty)
  // ! == | &
}
