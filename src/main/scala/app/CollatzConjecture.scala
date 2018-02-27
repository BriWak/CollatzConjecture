package app

object CollatzConjecture extends App {

  def apply(number: Int): Int = collatz(number).length

  def collatz(number: Int): List[Int] = {
    number match {
      case n if n == 1 => List(1)
      case n if n % 2 == 0 => number :: collatz(number / 2)
      case _ => number :: collatz(number * 3 + 1)
    }
  }
}
