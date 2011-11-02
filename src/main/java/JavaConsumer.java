public class JavaConsumer {

	public static void main(String[] args) {

        System.out.println("FizzBuzz Java consumer");
        for (int i=0; i<=100; i++) {
			System.out.println(FizzBuzz.fizzBuzz(i));
		}
	}
}