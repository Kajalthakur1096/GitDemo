package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test  {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter input1: ");
		int number1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter input2: ");
		int number2 = Integer.parseInt(reader.readLine());
		ArithmeticEx arithException = new ArithmeticEx();
		NullPointerEx nullpointer = new NullPointerEx();

		try {
			arithException.divideNumbers(number1, number2);
			nullpointer.string();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("String cannot be null " + e);
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Denominator cannot be zero " + e);
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}

}
