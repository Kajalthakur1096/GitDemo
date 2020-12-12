package com.CarsPackage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		System.out.println("--INHERITANCE--");
		Cars objectOfCar = new Cars();
		objectOfCar.carBreaks(); 
		objectOfCar.carEngine();
		Bmw objectOfBmw = new Bmw();
		objectOfBmw.carEngine();
		objectOfBmw.speedOfBmw();
		Tesla objectOfTesla = new Tesla();
		objectOfTesla.electricBattery();
		Cars objectOfCar1 = new Bmw();
		objectOfCar1.carEngine(); //Created an object of base class even though the base instantiated child class bmw.

	}

}
