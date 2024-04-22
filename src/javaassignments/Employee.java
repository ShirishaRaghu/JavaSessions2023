package javaassignments;

public class Employee {

	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
		//this.salary=salary;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		
		Employee ec= new Employee(12, "Fuda", 12.33);
		System.out.println(ec.name+" "+ec.id+" "+ec.salary);
	    ec.setSalary(12.33*10/100);
	    System.out.println(ec.name+" "+ec.id+" "+ec.salary);
		
		
		Employee et = new Employee(32, "Huna");
		System.out.println(et.name+" "+et.id);
		
		//1.What is the purpose of a getter method in Java?
		//Used to return the value
		
		//2.Can a getter method return void?
		//No it has to return some variable
		//They usually return one object instance variable
		
		//3.What is the access level of a getter method in Java?
		//can access public, private
		
		
		//4.What is the purpose of a setter method in Java?
		//Used set or update values
		
		//5.Can a setter method return a value other than void?
		//No always return void
	}

}
