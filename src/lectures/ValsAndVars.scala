package lectures

object ValsAndVars extends App  {
  val x: Int = 42
  println(x);

  val aString: String = "hello world"
  val aDouble: Double = 20.4
  val aLong: Long = 250000000000000L
  val aInt: Int = x
  val aShort: Short = 4613

  //VALS are immutable

  var variable = 2144213
  variable = 231231 //side effects
  variable += aInt

  println(variable)
}
