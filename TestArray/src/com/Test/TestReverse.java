package com.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReverse {
	// int[] arr;
	// int[] rev;
	int j = 0;
	int size = 0;

	public TestReverse(int size) {
		// TODO Auto-generated constructor stub0
		this.size = size;
		// this.arr = new int[size];
		// this.rev = new int[size];

	}

	/*
	 * public void getArrayInput(BufferedReader reader) throws
	 * NumberFormatException, IOException {
	 * 
	 * System.out.println("Enter number:"); for (int i = 0; i < size; i++) { arr[i]
	 * = Integer.parseInt(reader.readLine()); }
	 * System.out.println("Entered array input is as follows:"); for (int i = 0; i <
	 * size; i++) { System.out.println(arr[i] + " "); }
	 * 
	 * }
	 */
	public int[] getArrayInput(BufferedReader reader) throws NumberFormatException, IOException {
		int[] arr = new int[size];
		System.out.println("Enter number:");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}
		System.out.println("Entered array input is as follows:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
		return arr;
	}

	public void reverseArray(int[] arr) {
		int[] rev = new int[size];
		for (int i = (size - 1); i >= 0; i--) {
			rev[j] = arr[i];
			j++;
		}
		for (int i = 0; i < size; i++) {
			System.out.println(rev[i] + " ");
		}
	}
}
