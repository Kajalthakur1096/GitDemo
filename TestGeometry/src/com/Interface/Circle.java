package com.Interface;

public class Circle implements Shape {
	double radius;
	final double pi = 3.142;

	Circle(String radius) {
		this.radius = Double.parseDouble(radius);
	}

	public void area() {
		double areaOfCircle = pi * radius * radius;
		System.out.println("Area of a circle is :" + areaOfCircle);
	}

	public void perimeter() {
		double perimeterOfCircle = 2 * pi * radius;
		System.out.println("Perimeter of a circle is :" + perimeterOfCircle);
	}
}
