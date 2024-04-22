package javaassignments;


public class Customer {

	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		Customer c1 =new Customer();
		c1.name="Guna";
		c1.age=24;
		c1.city="Bangalore";
		
		Customer c2 = new Customer();
		c2.name = "Varsha";
		c2.age=76;
		c2.city="Pune";

		Customer c3 = new Customer();
		c3.name = "Harsha";
		c3.age=23;
		c3.city="Mysore";

		Customer c4 = new Customer();
		c4.name = "Taruna";
		c4.age=43;
		c4.city="Bangalore";

		Customer c5 = new Customer();
		c5.name = "Karuna";
		c5.age=43;
		c5.city="Bangalore";
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);
		System.out.println(c2.name + " "+c2.age+" "+c2.city);
		System.out.println(c3.name + " "+c3.age+" "+c3.city);
		System.out.println(c4.name + " "+c4.age+" "+c4.city);
		System.out.println(c5.name + " "+c5.age+" "+c5.city);

		System.out.println("---------");
		c1=c2;
		System.out.println("c1=c2");
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);//Varsha
		System.out.println(c2.name + " "+c2.age+" "+c2.city);//Varsha
		System.out.println(c3.name + " "+c3.age+" "+c3.city);//Harsha
		System.out.println(c4.name + " "+c4.age+" "+c4.city);//Taruna
		System.out.println(c5.name + " "+c5.age+" "+c5.city);//Karuna

		System.out.println("---------");
		c2=c3;
		System.out.println("c2=c3");
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);//Varsha
		System.out.println(c2.name + " "+c2.age+" "+c2.city);//Harsha
		System.out.println(c3.name + " "+c3.age+" "+c3.city);//Harsha
		System.out.println(c4.name + " "+c4.age+" "+c4.city);//Taruna
		System.out.println(c5.name + " "+c5.age+" "+c5.city);//Karuna

		System.out.println("---------");
		c3=c4;
		System.out.println("c3=c4");
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);//Varsha
		System.out.println(c2.name + " "+c2.age+" "+c2.city);//Harsha
		System.out.println(c3.name + " "+c3.age+" "+c3.city);//Taruna
		System.out.println(c4.name + " "+c4.age+" "+c4.city);//Taruna
		System.out.println(c5.name + " "+c5.age+" "+c5.city);//Karuna

		System.out.println("---------");
		c4=c5;
		System.out.println("c4=c5");
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);//Varsha
		System.out.println(c2.name + " "+c2.age+" "+c2.city);//Harsha
		System.out.println(c3.name + " "+c3.age+" "+c3.city);//Taruna
		System.out.println(c4.name + " "+c4.age+" "+c4.city);//Karuna
		System.out.println(c5.name + " "+c5.age+" "+c5.city);//Karuna

		System.out.println("---------");
		c5=c1;
		System.out.println("c5=c1");
		
		System.out.println(c1.name + " "+c1.age+" "+c1.city);//Varsha
		System.out.println(c2.name + " "+c2.age+" "+c2.city);//Harsha
		System.out.println(c3.name + " "+c3.age+" "+c3.city);//Taruna
		System.out.println(c4.name + " "+c4.age+" "+c4.city);//Karuna
		System.out.println(c5.name + " "+c5.age+" "+c5.city);//Varsha
		

	}

}
