package kamoun.kata.fizzbuzz

/**
  * @author KAMOUN Ahmed
  */
object FizzBuzz  {
  def getResult(input: Int): String = {

    input match {
      case _ if multiplyOf3(input) && multiplyOf5(input) => "fizzbuzz"
      case _ if multiplyOf3(input) => "fizz"
      case _ if multiplyOf5(input) => "buzz"
      case _ => input.toString
    }

  }

   def multiplyOf3(number: Int): Boolean = number % 3 == 0

   def multiplyOf5(number: Int): Boolean = number % 5 == 0

}
