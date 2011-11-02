import org.junit.{Assert, Test}
import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import FizzBuzz.fizzBuzz

class FizzBuzzJUnitTest extends JUnitSuite with ShouldMatchersForJUnit {

  @Test
  def should_return_Fizz_for_divisible_of_3() {
    // JUnit style assert
    Assert.assertEquals("Fizz", fizzBuzz(3))
  }

  @Test
  def should_return_Buzz_for_divisible_of_5() {
    // ScalaTest should matcher
    fizzBuzz(5) should be("Buzz")
  }

  @Test
  def should_return_FizzBuzz_for_divisible_of_3_and_5() {
    fizzBuzz(15) should be("FizzBuzz")
  }

  @Test
  def should_return_input_number_if_not_divisible_by_3_or_5() {
    fizzBuzz(4) should be(4)
  }

}