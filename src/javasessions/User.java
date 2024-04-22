package javasessions;

public class User {

	// category - blueprint -- class -- protorype
	// instance -- object
	// human(class) - bodyparts(object)
	// Laptop -- class: name,size,color,price
	// employee(class) - no of employess(object)

	// Blueprint of User[Template]
	// class varaibles : data member
	String name;
	int age;
	String city;
	String telephone;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
	
		int i; //loacal variable
		
		//create the object of the class: using new keyword
		User u1 = new User();
		
		//User: class
		//u1 --> object reference name
		//new User(); --> Object
		
		u1.name="Gunnel";
		u1.age=30;
		u1.city="Bangalore";
		u1.salary=12.33;
		u1.isActive=true;
		
		System.out.println(u1.name);
		System.out.println(u1.isActive);
		
		User u2 = new User();
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.isActive);
		System.out.println(u2.salary);
		
		User u3 = new User();
		
		//One more object is created without object reference
		//no refernce objects
		new User();
		//One more object
		//Object is created without reference
		new User().name="Tom";
		System.out.println(new User());
		
		
		//null pointer object
		User u4 = new User();
		u4 = null;
		//u4.name="Naveen";//null.name -- NullPointerException -- NPE
		
		u4 = new User();//Creates new object -- reference name -- u4
		u4.name="Tom";
		System.out.println(u4.name);
		
		
		System.gc();//This method call gc -- ther is no gurantee -- depends on JVM
		
		
	}

}
