package kamoun.kata.fizzbuzz

import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}

/**
  * @author KAMOUN Ahmed
  */
class FizzBuzzTest extends FlatSpec with Matchers with BeforeAndAfter {


  "FizzBuzz" should "return fizz if the number is dividable by 3" in {

    FizzBuzz.getResult(3) should be("fizz")
    FizzBuzz.getResult(6) should be("fizz")
  }

  it should "return buzz if the number us dividable by 5" in {
    FizzBuzz.getResult(5) should be("buzz")
    FizzBuzz.getResult(25) should be("buzz")
  }

  it should "return FizzBuzz if the number us dividable by 5 and 3" in {
    FizzBuzz.getResult(45) should be("fizzbuzz")
  }

  it should "return the same value if not dividable by 3 nor 5" in {
    FizzBuzz.getResult(7) should be("7")
  }

}
