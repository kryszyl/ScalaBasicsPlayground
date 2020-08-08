package lectures

import scala.annotation.tailrec

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def parameterlessFunc(): Int = 42

  println(parameterlessFunc())
  println(parameterlessFunc)

  def aRepeatedFunc(aString: String, n: Int): String = {
    if (n == 1) aString else
      aString + aRepeatedFunc(aString, n - 1)
  }

  //USE Recursion instead of while loops

  println(aRepeatedFunc("Recursive Hello \n", 5))

  def functionWithSideEffects(aString: String): Unit = println(aString)

  functionWithSideEffects("Side Effect Func")

  def bigFunc(n: Int): Int = {
    def smallFunc(a: Int, b: Int) = a + b

    smallFunc(n, n - 1)
  }

  println(bigFunc(5))

  //excersises

  //1. greeting func

  def greeting(name: String, age: Int): String = s"Hi my name is $name and my age is $age"

  println(greeting("David", 28))

  //2. factorial
  def factorial(n: Int): Int = {
    if (n == 1) 1 else n * factorial(n - 1)
  }

  println(factorial(6))

  //3. fibonacci

  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)

  }

  println(fibonacci(3))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(6))
  println(isPrime(2003))
  println(isPrime(2))
}
