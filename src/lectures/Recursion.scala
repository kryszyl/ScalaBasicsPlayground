package lectures

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n == 1) 1 else {
      println("Computing factorial of " + n + " first I need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(10))
//  println(factorial(5000)) //StackOverflowError

  def anotherFactorial(n: BigInt): BigInt = {
    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x<= 1) accumulator
      else factorialHelper(x-1, x*accumulator)//TAIL RECURSION - recursive call is the last statement in the function

      factorialHelper(n, 1)

  }

  println(anotherFactorial(5000))

  //excersise
  // tailrec concat
  @tailrec
  def concatStrings(aString: String, n: Int, accumulator: String): String = {
    if (n==1) accumulator
    else concatStrings(aString, n-1, aString + accumulator)
  }

  println(concatStrings("hello", 20000, ""))

  //is Prime tailrec
  def isPrimeTail(n: Int) : Boolean = {
    @tailrec
    def isStillPrime(t:Int, accumulator: Boolean): Boolean =
      if (!accumulator) false
      else if (t <= 1) true
      else isStillPrime(t-1, n%t != 0 && accumulator)

    isStillPrime(n/2, true)

  }
  println(isPrimeTail(2003))
  println(isPrimeTail(6))


  //fibonacci tailrec
  def fibonacci(n:Int):Int = {
    @tailrec
    def fibonacciTail(t: Int, last: Int, secondLast: Int): Int =
      if (t >= n) last
      else fibonacciTail(t + 1, last + secondLast, last)

    if (n <= 2) 1
    else fibonacciTail(2, 1, 1)
  }
  println(fibonacci(8))

}
