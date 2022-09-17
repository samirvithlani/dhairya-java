package oops.inheritance;

import java.util.Scanner;

class Vehicle {

	int makeYear;
	String vehName;
}

//car class can use prop of vehicle....
class Bike extends Vehicle {


	public void getBikeData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter bike Name");
		vehName = sc.next();
		System.out.println("pls enter make year");
		makeYear = sc.nextInt();

	}

	public void printBikeData() {

		System.out.println("bike name = " + vehName);
		System.out.println("bike make year = " + makeYear);
	}

	
}

class Car extends Vehicle {

	public void getCarData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter car Name");
		vehName = sc.next();
		System.out.println("pls enter make year");
		makeYear = sc.nextInt();

	}

	public void printCarData() {

		System.out.println("car name = " + vehName);
		System.out.println("car make year = " + makeYear);
	}

}

public class VehicleDemo {

	public static void main(String[] args) {

		Car c = new Car();
		c.getCarData();
		c.printCarData();
		
		Bike bike = new Bike();
		bike.getBikeData();
		bike.printBikeData();
				
	}
}
