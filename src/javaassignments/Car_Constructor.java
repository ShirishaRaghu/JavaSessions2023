package javaassignments;

public class Car_Constructor {

	String make;
	String model;
	int year;

	public Car_Constructor() {
		this.make = "Unknown";
		this.model = "Unknown";

	}

	public Car_Constructor(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public static void main(String[] args) {

		Car_Constructor car = new Car_Constructor();
		System.out.println(car.make + " " +car.model + " " + car.year);

		Car_Constructor car1 = new Car_Constructor("Fuda", "Guna", 67);
		System.out.println(car1.make + " " + car1.model + " " + car1.year);
	}

	// 1.What is the purpose of a default constructor in Java?
	//Used to initialize the attributes of the object with their default values.

	// 2.Can a default constructor take in parameters?
	//No it cannot takes parameters, if it have parameters then default values are given. 

	// 3.Can a constructor be overloaded in Java? If so, what does it mean to
	// overload a constructor?
	//Constructor can be overloaded, with distinct set of parameters.
	//It enables to select the appropriate constructor based on scenarios and input values.
	

	// 4.Can you create an object of a Java class without calling a constructor?
	//No , when you create object then default constructor is called implicitly.

	// 5.How are instance variables accessed and modified outside of the class they
	// are defined in?
	//Instance variables declared outside class can be accessed through getter
	//Modified through setter method

}
