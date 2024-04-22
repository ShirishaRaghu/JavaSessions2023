package javaassignments;

public class MethodsAssignments {

	static final float pi = 3.14f;

	// 1.Write a program to print the addition/subtraction/division/multiplication
	// of two numbers entered by user by defining your own method
	public int add(int a, int b) {
		System.out.println("Addition of two numbers");
		int c = a + b;
		return c;
	}

	// 2.Define a method that returns the product of two double numbers entered by
	// user
	public double product(double a, double b) {
		System.out.println("Product of two double numbers");
		double c = a + b;
		return c;
	}

	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method
	// circumference of circle = 2*pi*r
	// Area of circle = pi*r*r
	public float area(int r) {
		System.out.println("Area of the circle");
		// final float p = 3.14f;
		float areaOfCircle = pi * r * r;
		return areaOfCircle;

	}

	public float circum(int r) {
		System.out.println("Circumference of the circle");
		float circumference = 2 * pi * r;
		return circumference;
	}

	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers entered by user
	public void max(int x, int u, int v) {
		System.out.println("Maximum of three numbers");
		System.out.println("Numbers are " + x + "," + u + "," + v);
		if (x > u && x > v) {
			System.out.println(x + " is greatest");
		} else if (u > v) {
			System.out.println(u + " is greatest");

		} else {

			System.out.println(v + " is greatest");
		}

	}

	// Minimum of three numbers
	public void min(int x1, int u1, int v1) {
		System.out.println("Minimum of three numbers");
		System.out.println("Numbers are " + x1 + "," + u1 + "," + v1);
		if (x1 < u1 && x1 < v1) {
			System.out.println(x1 + " is smallest");
		} else if (u1 < v1) {
			System.out.println(u1 + " is smallest");

		} else {

			System.out.println(v1 + " is smallest");
		}

	}

	// 5.Def﻿ine a program to find out whether a given number is even or odd -
	// return true/false
	public boolean evenOrOdd(int num) {
		System.out.println("Number is even or odd");
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	// 6.. A person is eligible to vote if his/her age is greater than or equal to
	// 18.
	// Define a method to find out if he/she is eligible to﻿ vote. - return
	// true/false

	public boolean voteEligibility(int age) {
		System.out.println("Eligibility for vote");
		if (age >= 18) {
			System.out.println("Eligible for vote");
			return true;
		} else {
			System.out.println("Not eligible for vote");
			return false;
		}
	}

	// 7. Write a program which will ask the user to enter his/her marks (out of
	// 100). Define a method that will display grades according to the marks entered
	// as below:
	// Marks ---- 91-100 --GradeAA
	// 81-90 --GradeAB
	// 71-80 --GradeBB
	// 61-70 --GradeBC
	// 51-60 --GradeCD
	// 41-50 --GradeDD
	// <=40 --Fail
	public void getMarks(int marks) {
		// int totalMarks = 100;
		if (marks >= 91 && marks <= 100) {
			System.out.println("Grade AA");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("Grade AB");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Grade BB");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Grade BC");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("Grade CD");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("Grade DD");
		} else if (marks <= 40) {
			System.out.println("Fail");
		} else {
			System.out.println("Please enter a valid marks");
		}
	}

	// 9. Write a program to print the factorial of a number by defining a method
	// named 'Factorial'.

	public static void factorial(int num) {
		System.out.println("Factorial of a number");
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of" + num + " is " + fact);
	}

	public static int factorial1(int num) {
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {

		MethodsAssignments obj = new MethodsAssignments();
		// calling method 1
		int b = obj.add(12, 21);
		System.out.println(b);
		System.out.println(b - 2);
		System.out.println(b / 2);
		System.out.println(b * 2);

		System.out.println("-------product of two double numbers-----");// doubt
		double g = obj.product(23.4465, 45.6786);
		System.out.println(g);

		System.out.println("------Area of the circle-------");
		float f = obj.area(3);
		System.out.println(f);

		System.out.println("------Cirumfernce of the circle-------");
		float g1 = obj.circum(5);
		System.out.println(g1);

		System.out.println("------Maximum of three numbers-------");
		obj.max(23, 56, 14);
		obj.max(100, 46, 74);
		obj.max(23, 48, 54);

		System.out.println("------Minimum of three numbers-------");
		obj.min(23, 45, 14);

		System.out.println("--------Even or Odd------");
		boolean flag = obj.evenOrOdd(6);
		System.out.println(flag);

		System.out.println("------Vote eligibility-----");

		boolean flag2 = obj.voteEligibility(14);
		System.out.println(flag2);

		System.out.println("------Marks------");
		obj.getMarks(150);
		obj.getMarks(23);
		obj.getMarks(100);
		obj.getMarks(64);

		MethodsAssignments.factorial(0);
		int g4 = MethodsAssignments.factorial1(3);
		System.out.println(g4);
	}

}
