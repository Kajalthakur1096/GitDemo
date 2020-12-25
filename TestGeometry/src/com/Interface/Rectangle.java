package com.Interface;

public class Rectangle implements Shape  {
	double length, breadth;
	final double constant = 2;

	Rectangle(String length, String breadth) {
		this.length = Double.parseDouble(length);
		this.breadth = Double.parseDouble(breadth);

	}

	public void area() {
		double areaOfRectangle = length * breadth;
		System.out.println("Area of a Rectangle is :" + areaOfRectangle);
	}

	public void perimeter() {
		double perimeterOfRectangle = constant * (length + breadth);
		System.out.println("Perimeter of a Rectangle is :" + perimeterOfRectangle);
	}
}
