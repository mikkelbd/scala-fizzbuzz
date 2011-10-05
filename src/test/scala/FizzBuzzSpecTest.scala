import org.scalatest.matchers._
import org.scalatest.Spec

class FizzBuzzSpecTest extends Spec with ShouldMatchers {
  
  describe("FizzBuzz") {
    it("should return Fizz for 3") {
      FizzBuzz.fizzBuzz(3) should be ("Fizz")
    }
    
    it("should return Buzz for 5") {
      FizzBuzz.fizzBuzz(5) should be ("Buzz")
    }
    
    it("should return FizzBuzz for 15") {
      FizzBuzz.fizzBuzz(15) should be ("FizzBuzz")
    }
    
    it("should return 2 for 2") {
      FizzBuzz.fizzBuzz(2) should be (2)
    }
  } 
  
}

