package com.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub0
		// int[] arr = new int[20];
		System.out.println("---Reverse numbers---");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size:");
		int size = Integer.parseInt(reader.readLine());

		TestReverse rev = new TestReverse(size);
		int[] xr = rev.getArrayInput(reader);

		System.out.println("Reversed array is: ");
		rev.reverseArray(xr);
	}

}
