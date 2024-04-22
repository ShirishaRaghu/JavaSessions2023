package javasessions;

public class Customer {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name = "Taruna";
		c1.age=43;
		c1.city="Bangalore";
		
		
		Customer c2 = new Customer();
		c2.name = "Varsha";
		c2.age=76;
		c2.city="Pune";

		
		Customer c3 = new Customer();
		c3.name = "Harsha";
		c3.age=23;
		c3.city="Mysore";
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);
		System.out.println(c2.name + " "+c2.age+" "+c2.city);
		System.out.println(c3.name + " "+c3.age+" "+c3.city);

		System.out.println("---------");
		c1=c2;
		System.out.println("c1=c2");//One object is having multiple reference names
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);
		System.out.println(c2.name + " "+c2.age+" "+c2.city);
		System.out.println(c3.name + " "+c3.age+" "+c3.city);

		System.out.println("---------");
		c2=c3;
		System.out.println("c2=c3");
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);
		System.out.println(c2.name + " "+c2.age+" "+c2.city);
		System.out.println(c3.name + " "+c3.age+" "+c3.city);

		System.out.println("---------");
		c3=c1;
		System.out.println("c3=c1");
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);
		System.out.println(c2.name + " "+c2.age+" "+c2.city);
		System.out.println(c3.name + " "+c3.age+" "+c3.city);

	
	}

}
