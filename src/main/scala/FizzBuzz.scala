object FizzBuzz extends App {

  println("FizzBuzz in Scala")
  (0 to 100) foreach(x => println(fizzBuzz(x)))

  def fizzBuzz(num: Int) = (num % 3, num % 5) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case _ => num
  }
}