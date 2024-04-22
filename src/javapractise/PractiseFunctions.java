package javapractise;

import java.util.ArrayList;
import java.util.Arrays;

public class PractiseFunctions {

	
	
	
	public ArrayList<Object> empDetails1(String name, int age, float salary, boolean isActive) {
	System.out.println("Employee Details");
	ArrayList<Object> empList = new ArrayList<Object>();
	empList.add(name);
	empList.add(age);
	empList.add(salary);
	empList.add(isActive);
	return empList;
	}
	
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("Getting devices list for"+empName);
		ArrayList<String> list = new ArrayList<String>();
		
		switch (empName.trim().toLowerCase()) {
		case "arun":
			list.add("Macbook");
			list.add("Book");
			return list;
			//break;
		case "karun":
			list.add("Macbook1");
			list.add("Book1");
			return list;
			//break;

		case "barun":
			list.add("Macbook2");
			list.add("Book2");
			return list;
			//break;

		case "harun":
			list.add("Macbook3");
			list.add("Book3");
			return list;
			//break;


		default:
			System.out.println("Please enter the right emp name");
			//break;
		}
		return list;	
	}
	
	public int sum (int a, int b) {
		System.out.println("Adding two numbers");
		int d = a+b;
		return d;
	}
	
	public static void main(String[] args) {
	
		
		
		PractiseFunctions obj1 = new PractiseFunctions();
		ArrayList<Object> detailsOf = obj1.empDetails1("Druv", 54, 43.77f, true);
		System.out.println(detailsOf);
		System.out.println(detailsOf.size());
		
		int n = obj1.sum(12, 23);
		System.out.println(n);
		
		ArrayList<String> listOf = obj1.getDevicesList("Harun");
		System.out.println(listOf);
	}

}
