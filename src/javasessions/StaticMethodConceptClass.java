package javasessions;

public class StaticMethodConceptClass {
	public static   String name = "Cherry";
	public  int age = 4;

	public static void getInfo() {
		System.out.println("get info");
	}

	public void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {
		// call static var and methods:
		// 1. by using class name:
		StaticMethodConceptClass.name = "Tom";
		System.out.println(StaticMethodConceptClass.name);
		//System.out.println(name);
		
		StaticMethodConceptClass.getInfo();
		
		//call non static method: create the object
		StaticMethodConceptClass obj = new StaticMethodConceptClass();
        obj.age=10; 
		obj.sendMail();
		
		//2. can access static variables and methods using obj ref name, but not recommended
		System.out.println(obj.name);
		obj.getInfo();
		
		//3.can I access static var and method directly? - without class name
		System.out.println(name);
		getInfo();
		
	}

}
