package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {

	// cannot create a function/method inside a function
	// functions are parallel to each other
	// but can call a function from another function
	// Non static functions -- data members of the class

	// 1st: function: no input and no return
	// input: no input
	// return: void -- can not return anything
	public void test() {
		System.out.println("test method");
	}

	// 2nd: function: some input and no return
	// return type: void
	public void getBill(int days) { // 1 parameter
		System.out.println("getting billing info");
		int finalAmount = days * 100;
		System.out.println(finalAmount);
		System.out.println("------");
	}

	// 3rd: function with some input and return
	// return type: int
	public int sum(int a, int b) {
		System.out.println("adding two numbers");
		int s = a + b;
		return s;
		// return and void can not be together
	}

	// 4th: function no input some return:
	// return type: String
	public String getInfo() {
		System.out.println("getting information");
		String s = "Hello World";
		return s;
	}

	// return type: boolean
	public boolean isAppExist() {
		return false;
	}

	//
	public int calculateMarks(int marks, int extraMarks, int discMarks) {
		int finalMarks = marks + extraMarks - discMarks;
		return finalMarks;
	}
	
	//
	public Object[] calculateNumbers(int marks, float extraMarks, int discMarks) {
		float finalMarks = marks + extraMarks - discMarks;
		String school = "IBM";
		boolean flag = true;
		Object finalInfo[] = {school, finalMarks, flag};
		return finalInfo;
	}

	// function can not have multiple returns
	// return should be the last statement in the function
	public int testing() {
		System.out.println("testing is done");
		return 100;
	}

	public ArrayList<Object> empDetails(String name, int age, float salary, boolean isActive) {
		System.out.println("Employee Details");
		ArrayList<Object> detailsOf = new ArrayList<Object>();
		detailsOf.add(name);
		detailsOf.add(age);
		detailsOf.add(salary);
		detailsOf.add(isActive);
		return detailsOf;

	}

	//
	public void printName() {
		System.out.println("Naveen");
		return;// blank return -- void
	}

	public void launchURL(String url) {
		System.out.println(url);
	}

	public String[] getDevices() {
		System.out.println("getting devices");
		String devices[] = { "Macbook pro", "ipad", "iphone14" };
		return devices;
	}

	public ArrayList<String> getUsersList() {
		System.out.println("getting all users");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Fuhi");
		userList.add("Huna");

		return userList;
	}

	public static void main(String[] args) {

		// call a function: create a object for non static functions
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		obj.getBill(10);// calling function by passing value: call by value - 10 -- arguement
		obj.getBill(20);
		obj.getBill(30);

		// System.out.println(obj.sum(12, 14));
		int m = obj.sum(12, 14);
		System.out.println(m);
		System.out.println(m - 6);

		int m1 = obj.sum(-10, 4);
		System.out.println(m1);
		System.out.println(m1 + 9);

		int n = obj.sum(2, 4);
		System.out.println(n);

		System.out.println(obj.sum(2, 4));

		String mesg = obj.getInfo();
		System.out.println(mesg + " India " + 54);

		System.out.println("-----boolean------");
		if (obj.isAppExist()) {
			System.out.println("login to app");
		} else {
			System.out.println("logout the app");
		}

		int f = obj.calculateMarks(30, 40, 5);
		System.out.println(f);

		obj.testing();

		obj.launchURL("https://www.google.com");

		String myDevices[] = obj.getDevices();
		System.out.println(Arrays.toString(myDevices));
		System.out.println(myDevices.length);

		ArrayList<String> myList = obj.getUsersList();
		System.out.println(myList);
		System.out.println(myList.size());
		
		ArrayList<Object> myEmpDetails = obj.empDetails("Guna", 24, 32.54f, false);
		System.out.println(myEmpDetails);
		System.out.println(myEmpDetails.size());
//		myEmpDetails.add("ghhkj");
//		System.out.println(myEmpDetails);
		
		
		Object[] myInfo = obj.calculateNumbers(12, 2.4f, 3);
		System.out.println(Arrays.toString(myInfo));
	
	}

}
