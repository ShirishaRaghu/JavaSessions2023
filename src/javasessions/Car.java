package javasessions;

public class Car {

	//Non static properties
	String name;
	String licenseNumber;
	double price;
	String color;
	//Static properties(Common value for all objects)
	static final int wheels=4;
	//Now wheels will take only 4 bytes
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name="BMW";
		c1.licenseNumber="68676";
		c1.price=54.76;
		c1.color="Green";
		
				
		Car c2 = new Car();
		c2.name="Audi";
		c2.licenseNumber="67768";
		c2.price=44.76;
		c2.color="Blue";
		
		
		
		Car c3 = new Car();
		c3.name="Honda";
		c3.licenseNumber="76552";
		c3.price=84.76;
		c3.color="White";
		System.out.println(c1.name+" "+c1.licenseNumber+" "+c1.price+" "+c1.color);
		
		System.out.println(c2.name+" "+c2.licenseNumber+" "+c2.price+" "+c2.color);

		//how to access static var:
		//1. using class name:
		System.out.println(Car.wheels);
	
		//2.directly:
		System.out.println(wheels);
		
		//3.can i access static var using object ref name?
		//System.out.println(c1.wheels);
		
		
		//final --> constant value -- no one can change
		
	}

}
