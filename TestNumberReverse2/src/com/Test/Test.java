package com.Test;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		System.out.println("---Reverse numbers---");
		Scanner scanner = new Scanner(System.in);
		ReverseNumbers2 reverseObject = new ReverseNumbers2();
		reverseObject.findInputType(scanner);
	}

}