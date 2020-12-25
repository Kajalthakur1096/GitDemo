package com.Interface;

import java.util.List;

public class Validation {

	public  boolean validateShapes(List<String> inputList, int inputCount, Shapes shapes) throws MyCustomException {
		int size = inputList.size();
		if (size == inputCount) {
			for (int i = 0; i < size; i++) {
				String x = inputList.get(i);

				Double inputAsDouble = Double.parseDouble(x);
				System.out.println(inputAsDouble + " is a valid input.\n");

				return true;
			}

		} else {
			throw new MyCustomException("The number of input entered is incorrect for shape " + shapes);
		}

		return false;
	}
}
