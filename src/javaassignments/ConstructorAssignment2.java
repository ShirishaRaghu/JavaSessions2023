package javaassignments;

public class ConstructorAssignment2 {

	double length;
	double width;
	String name;
	
	public ConstructorAssignment2() {
		System.out.println(length+width+name);
	}
	
	private ConstructorAssignment2(int length) {
		System.out.println(length+width+name);
		this.length=length;
	}
	
	
	public ConstructorAssignment2(int length, int width) {
		System.out.println("Length and width of Rectangle");
		this.length=length;
		this.width=width;
		
	}
	
	public double calculateArea(double a, double b) {
		System.out.println("Area of the Rectangle");
		double area = a*b;
		return area;
	}
	
	public static void main(String[] args) {
		
		ConstructorAssignment2 t = new ConstructorAssignment2();
		
		ConstructorAssignment2 t1= new ConstructorAssignment2(2, 4);
		System.out.println(t1.length+" "+t1.width);
		
		double d =t.calculateArea(5, 8);
		System.out.println(d);
		
		ConstructorAssignment2 t3 = new ConstructorAssignment2(4);
		System.out.println(t3.length);
		
		
		//Doubt
		//Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas
	
		//1.What is the purpose of a default constructor in Java?
		//*Used to initialize default values of attributes of object depending on type
		
		
		//2.How can you differentiate between a default constructor and a constructor that takes in parameters?
		//Default constructor gives default values
		//Constructors with parameters takes the arguments
		
		//3.What is the access level of a constructor in Java?
		//*Constructors can have any of the access modifiers: private , public, protected
		//*private constructors are called using some public layers
		
		
		
		//4.Can a constructor be private? If so, why would you want to make a constructor private?
		//yes
		//Private constructors allow us to restrict the instantiation of a class.
		//they prevent the creation of class instances in any place other than the class itself.
		
		
		//5.Can a constructor call a method from another class? 
		//*Within same class: It can be done using this() keyword for constructors in the same class.
		//*From base class: by using super() keyword to call the constructor from the base class.
		
	}

}
