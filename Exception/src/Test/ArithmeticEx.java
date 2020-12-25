package Test;

public class ArithmeticEx extends Throwable {

	public void divideNumbers(int number1, int number2) throws ArithmeticException {
		System.out.println("Dividing Numbers");
		int division = number1 / number2;
		System.out.println(division);

	}
}
