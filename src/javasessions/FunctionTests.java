package javasessions;

import java.util.ArrayList;

public class FunctionTests {

	//requirements
	//WAF: function Name: getStudentMarks
	//return: marks (int)
	//student: not found --> return something
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student:"+ studentName);
		
		int marks = -1;
		
		if(studentName.trim().equalsIgnoreCase("devika")){
			//return 90;
			//return is behaving like break -- it will not go further
		    marks = 90;
		}
		else if(studentName.equalsIgnoreCase("ravi")) {
			//return 95;
			marks = 95;
		}
		else  if(studentName.equalsIgnoreCase("naveen")) {
			//return 10;
			marks = 10;
		}
		else {
			System.out.println("student name not found....plz pass the right student name" + studentName);
		    //return -1;
			//marks = -1;
		}
		
		return marks;
	}
	
	public int getMarks(String studentName) {
		System.out.println("getting marks for student: "+                 studentName);
		int marks = -1;
		
		switch(studentName.trim().toLowerCase()){
		case "devika": 
			//return 95;
			marks = 95;
			break;
		case "ravi": 
			//return 90;
			marks = 90;
			break;
		case "naveen": 
			//return 10;
		marks = 10;
		break;
			default:
				System.out.println("student name not found.... plz pass the right student name" + studentName);
			//return 95;

			
		}	
		return marks;
				
	}
	
	
	//WAF: launchBrowser (name)
	//input param: String browserName
	//return: true/false (boolean)
	
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name:"+ browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched succesfully");
			return true;
		case "firefox":
			System.out.println("firefox is launched succesfully");
			return true;
		case "edge":
			System.out.println("edge is launched succesfully");
			return true;

		default:
			System.out.println("plz pass the right browser....."+ browserName);
			return false;
			
		}
	}
	
	
	//WAF: 
	//function name: getDevicesList
	//input param: empName
	//return: ArrayList<>
	
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting devices list for emp:"+ empName);
		ArrayList<String> deviceList = new ArrayList<String>();
		
		
		switch (empName.toLowerCase().trim()) {
		case "pallavi":
			deviceList.add("Macbook Pro");
			deviceList.add("Macbook Air");
			deviceList.add("iphone");
			//break;
			return deviceList;
		case "sudheer":
			deviceList.add("windows Lenovo");
			deviceList.add("Samsung s10");
			//break;
			return deviceList;
		case "saida":
		deviceList.add("Airtel SIM");
		//break;
		return deviceList;

		default:
			System.out.println("please pass the right emp nane....emp name not found...."+ empName);
			//break;
		}
		
		return deviceList;
	}
	
	
	
	public static void main(String[] args) {
		
		FunctionTests obj = new FunctionTests();
		int m1 = obj.getMarks("Devika");
		System.out.println(m1);
		
		
		if(m1==-1) {
			System.out.println("no need to print the marks sheet");
			
		}
		else {
			System.out.println("print marksheet");
		}
		
		
		System.out.println("-----------");
		
		boolean isLaunced = obj.launchBrowser("chrome");
		System.out.println(isLaunced);
		
		if(isLaunced) {
			System.out.println("enter the url");
		}
		
		System.out.println("--------ArrayList--------");
		
		ArrayList<String> actDevList = obj.getDevicesList("pallavi");
		System.out.println(actDevList);
		System.out.println(actDevList.size());
		
				
	}

	
	
}
