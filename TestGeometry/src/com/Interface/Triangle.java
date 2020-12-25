package com.Interface;

public class Triangle implements Shape {
	Double base, height, hypotenuse;
	final double constant = 0.5;

	Triangle(String base, String height, String hypotenuse) {
		this.base = Double.parseDouble(base);
		this.height = Double.parseDouble(height);
		this.hypotenuse = Double.parseDouble(hypotenuse);
	}

	public void area() {
		double areaOfTriangle = constant * base * height;
		System.out.println("Area of a Triangle is :" + areaOfTriangle);
	}

	public void perimeter() {
		double perimeterOfTriangle = base + height + hypotenuse;
		System.out.println("Perimeter of a Triangle is :" + perimeterOfTriangle);
	}
}
