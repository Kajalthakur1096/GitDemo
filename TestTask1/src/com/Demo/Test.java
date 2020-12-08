package com.Demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		double x = 0, y = 0, z = 0;
		System.out.println("===Addition===\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 numbers to be added \n\n");
		System.out.println("Enter 1st Number:\n");
		x = sc.nextDouble();
		System.out.println("Enter 2nd Number:\n");
		y = sc.nextDouble();
		System.out.println("Enter 3rd Number:\n");
		z = sc.nextDouble();
		System.out.println("The Addition of 3 numbers are:");

		TestAdd add = new TestAdd();
		add.addition(x, y, z);
		sc.close();
	}

}
