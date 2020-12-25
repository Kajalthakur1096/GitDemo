package com.Interface;

public class Square implements Shape {
	double side;
	final double constant = 4;

	Square(String side) {
		this.side = Double.parseDouble(side);
	}

	public void area() {
		double areaOfSquare = side * side;
		System.out.println("Area of a Square is :" + areaOfSquare);
	}

	public void perimeter() {
		double perimeterOfSquare = constant * side;
		System.out.println("Perimeter of a Square is :" + perimeterOfSquare);
	}
}
