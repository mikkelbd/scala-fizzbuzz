import org.scalatest.matchers._
import org.scalatest.Spec
import FizzBuzz.fizzBuzz

class FizzBuzzSpecTest extends Spec with ShouldMatchers {

  describe("FizzBuzz") {

    it("should return Fizz for 3") {
      fizzBuzz(3) should be("Fizz")
    }

    it("should return Buzz for 5") {
      fizzBuzz(5) should be("Buzz")
    }

    it("should return FizzBuzz for 15") {
      fizzBuzz(15) should be("FizzBuzz")
    }

    it("should return 2 for 2") {
      fizzBuzz(2) should be(2)
    }
  }

}

