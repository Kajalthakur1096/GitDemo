package com.Test;

import java.util.Scanner;

public class ReverseNumbers2 {
	Float number;

	// This method is used to identify if the input is Integer or Float
	public void findInputType(Scanner scanner) {

		number = Float.parseFloat(scanner.nextLine());

		int x = Math.round(number);
		if (x == number) {
			System.out.println("---Reversing Integer numbers---");
			int rev2 = reverseNumber(x);
			System.out.println("The reversed num is:" + rev2);
		} else {
			System.out.println("---Reversing Float numbers---");
			float rev4 = divideFloatNumberAndReverse(number);
			System.out.println("The reversed num is:" + rev4);
		}
		scanner.close();

	}

	// This method is used to convert float into Integers and again convert back to
	// Float
	public float divideFloatNumberAndReverse(float number) {
		float temp = number;
		String s = String.valueOf(temp);
		String[] str = s.split("\\.");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		String s1 = String.valueOf(reverseNumber(a));
		String s2 = String.valueOf(reverseNumber(b));
		String s3 = s2.concat(".").concat(s1);
		float rev3 = Float.parseFloat(s3);
		return rev3;
	}

	// This method is used to reverse numbers
	public int reverseNumber(int num1) {
		int num = num1;
		int y, rev = 0;
		while (num != 0) {
			y = num % 10;
			rev = rev * 10 + y;
			num = num / 10;
		}
		num1 = rev;
		return num1;
	}
}
