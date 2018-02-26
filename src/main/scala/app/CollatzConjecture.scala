package app

object CollatzConjecture extends App {

  def apply(number: Int): Int = Collatz(number).length

  def Collatz(number: Int): List[Int] = {
    number match {
      case n if n == 1 => List(1)
      case n if n % 2 == 0 => number :: Collatz(number / 2)
      case _ => number :: Collatz(number * 3 + 1)
    }

  }
}
