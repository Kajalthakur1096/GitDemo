package com.Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws  IOException, MyCustomException {

		displayChoice();
	}

	// This method is going to get the user input of circle and validate the input
	// entered by user.
	public static void getCircleDetails(BufferedReader reader)
			throws NumberFormatException, IOException, MyCustomException {
		System.out.println("Enter radius value: ");
		String radius = reader.readLine();

		List<String> inputList = new ArrayList<String>();
		inputList.add(radius);
		int inputCount = 1;
		System.out.println("Hang in there, Validating the input.. ");
		Validation validateInput = new Validation();
		try {
			boolean flag = validateInput.validateShapes(inputList, inputCount, Shapes.CIRCLE);
			System.out.println("Validation flag returned :" + flag);
			if (flag) {
				System.out.println("Your data is ready.\n");
				Shape shape = new Circle(radius);
				shape.area();
				shape.perimeter();
			} else {
				System.out.println(" Fuck off!");
			}
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Input cannot be empty."+ e);
		}
	}

	// This method is going to get the user input of Rectangle and validate the
	// input entered by user.
	public static void getRectangleDetails(BufferedReader reader)
			throws NumberFormatException, IOException, MyCustomException {
		System.out.println("Enter length value: ");
		String length = reader.readLine();
		System.out.println("Enter breadth value: ");

		String breadth = reader.readLine();

		List<String> inputList = new ArrayList<String>();
		// List<String> inputList = Arrays.asList(length.split("\\s+"));

		inputList.add(length);
		inputList.add(breadth);
		int inputCount = 2;
		System.out.println("Hang in there, Validating the input.. ");
		Validation validateInput = new Validation();
		try {
			boolean flag = validateInput.validateShapes(inputList, inputCount, Shapes.RECTANGLE);
			System.out.println("Validation flag returned :" + flag);
			if (flag) {
				System.out.println("Your data is ready.\n");
				Shape shape = new Rectangle(length, breadth);
				shape.area();
				shape.perimeter();
			} else {
				System.out.println(" Fuck off!");
			}
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Input cannot be empty."+ e);
		}
	}

	// This method is going to get the user input of Triangle and validate the input
	// entered by user.
	public static void getTriangleDetails(BufferedReader reader)
			throws NumberFormatException, IOException, MyCustomException {
		System.out.println("Enter base value: ");
		String base = reader.readLine();
		System.out.println("Enter height value: ");
		String height = reader.readLine();
		System.out.println("Enter hypotenuse value: ");
		String hypotenuse = reader.readLine();
		List<String> inputList = new ArrayList<String>();
		inputList.add(base);
		inputList.add(height);
		inputList.add(hypotenuse);
		int inputCount = 3;
		System.out.println("Hang in there, Validating the input.. ");
		try {
			Validation validateInput = new Validation();
			boolean flag = validateInput.validateShapes(inputList, inputCount, Shapes.TRIANGLE);
			System.out.println("Validation flag returned :" + flag);
			if (flag) {
				System.out.println("Your data is ready.\n");
				Shape shape = new Triangle(base, height, hypotenuse);
				shape.area();
				shape.perimeter();
			} else {
				System.out.println(" Fuck off!");
			}
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Input cannot be empty."+ e);
		}
	}

	// This method is going to get the user input of Square and validate the input
	// entered by user.
	public static void getSquareDetails(BufferedReader reader)
			throws NumberFormatException, IOException, MyCustomException {
		System.out.println("Enter side value: ");
		String side = reader.readLine();
		List<String> inputList = new ArrayList<String>();
		inputList.add(side);
		int inputCount = 1;
		System.out.println("Hang in there, Validating the input.. ");
		Validation validateInput = new Validation();
		try {
			boolean flag = validateInput.validateShapes(inputList, inputCount, Shapes.SQUARE);
			System.out.println("Validation flag returned :" + flag);
			if (flag) {
				System.out.println("Your data is ready.\n");
				Shape shape = new Square(side);
				shape.area();
				shape.perimeter();
			} else {
				System.out.println(" Fuck off!");
			}
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Input cannot be empty."+ e);
		}
	}

	// This method is going to display the choice to the user.
	public static void displayChoice() throws NumberFormatException, IOException, MyCustomException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				" Enter 1 for CIRCLE \n Enter 2 for TRIANGLE \n Enter 3 for RECTANGLE \n Enter 4 for SQUARE \n Enter the input now, it's your turn :");
		selectUserChoice(reader);
	}

	// This method is going to take the input entered by user.
	public static void selectUserChoice(BufferedReader reader)
			throws NumberFormatException, IOException, MyCustomException {

		String choice = reader.readLine();
		Shapes shapes = Shapes.valueOf(choice);
		switch (shapes) {
		case CIRCLE: {
			getCircleDetails(reader);
			break;
		}
		case TRIANGLE: {
			getTriangleDetails(reader);
			break;
		}
		case RECTANGLE: {
			getRectangleDetails(reader);
			break;
		}
		case SQUARE: {
			getSquareDetails(reader);
			break;
		}
		default: {
			System.out.println("Invalid choice");
			break;
		}
		}
	}
}
