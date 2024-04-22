package OOP_Encapsulation;

public class Employee {

	//private class variables can be accessed within class
	//cannot accessed outside the class
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	//private--used for security,user friendly
	
	//public String dob;
	
	
	
	//public String dob;
	//setter
	//Here the use of constructor is to avoid un necessary object creation
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
     //setter
	public Employee(String name, int age, double salary, boolean isActive) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive= isActive;
	}


	
	
	//public getter/setter:
     public String getName() {
		return name;
	}
	
     //Setters -- In this we can write some checks
     //Not any Business logic
     public void setName(String name) {
		if(name!=null) {
    	 this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
		
	
	
	
}
