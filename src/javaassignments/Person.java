package javaassignments;

public class Person {

	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age, char gender, double height) {
		System.out.println("Personal details");
		this.name=name;
		this.age=2;
		this.gender=gender;
		this.height=height;
		
	}
	
	public static void main(String[] args) {
		
		Person details = new Person("Guna", 23, 'm', 5.4);
		System.out.println(details.name+" "+details.age+" "+details.gender+" "+details.height);
	
		
		
	  Person details1 = new Person("Juta", 45, 'f', 6.8);
	  System.out.println(details1.name+" "+details1.age+" "+details1.gender+" "+details1.height);

	  
	  
	
	  //1.What is the purpose of a constructor in Java?
	  //*Restrict the un necessary object creation
	  //*Used to initialize the class variables
	  
	  
	  //2.How does a constructor differ from a regular method in Java?
	  //*Constructor is called when you object
	  //*Methods are called by using the reference of the object
	  //*Constructor are named as class name
	  //*Methods can have any name
	  //*Constructor is just for initialization
	  //*Methods are used for business logic
	  
	  //3.Can a Java class have multiple constructors? If so, how are they differentiated?
	  //Yes they can have
	  //By creating new object
	  
	  
	  
	  //4.What happens if a constructor is not defined in a Java class?
	  //*Default constructor is created during compile time
	  //*JVM creates  
	  //purpose -- used to initialize attributes of the objects using default values
	  
	  
	  
	  //5.Can a constructor call other methods or constructors within the same class?
	  //*Constructor can call other methods
	  //*Calls other constructor using this -- should be the first statement
	  


	}

}
