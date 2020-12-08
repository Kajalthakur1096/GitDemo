package com.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub0
		System.out.println("---Reverse numbers---");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		double num = Integer.parseInt(reader.readLine());
		System.out.println("Reversing the number");
		TestReverseNum rev= new TestReverseNum(num);
		rev.reverseNum();
}

}
