 package javasessions;

public class CallByRefConcept {

	String name;
	int age;
	public static void getInfo(CallByRefConcept t1) {
		//CallByRefConcept t1 = new CallByRefConcept();
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
		//t1 will be updated to new values
		t1.name = "Tom";
		t1.age = 24;
		
		System.out.println(t1.name);
		System.out.println(t1.age);

		

	}
	
	
	public static void main(String[] args) {
		
		CallByRefConcept obj =  new CallByRefConcept();
		obj.name = "Prateek";
		obj.age = 30;
		
		getInfo(obj);//call by object reference
		//here obj is pointing towards t1 -- values of obj is given to t1
		
		//t1 is pointing towards obj
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		

		
//		CallByRefConcept app = new CallByRefConcept();
//		app.name = "Fuhi";
//		app.age = 23;
		
		//getInfo(app);
		//here app is pointing towards t1 -- no values are assigned to app so it is null
		
		
	}

}
