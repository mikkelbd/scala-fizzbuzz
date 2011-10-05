import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit

class FizzBuzzJUnitTest extends JUnitSuite with ShouldMatchersForJUnit {

  @Test
  def should_return_Fizz_for_divisible_of_3() {
    FizzBuzz.fizzBuzz(3) should be("Fizz")
  }

  @Test
  def should_return_Buzz_for_divisible_of_5() {
    FizzBuzz.fizzBuzz(5) should be("Buzz")
  }

  @Test
  def should_return_FizzBuzz_for_divisible_of_3_and_5() {
    FizzBuzz.fizzBuzz(15) should be("FizzBuzz")
  }

  @Test
  def should_return_input_number_if_not_divisible_by_3_or_5() {
    FizzBuzz.fizzBuzz(4) should be(4)
  }

}