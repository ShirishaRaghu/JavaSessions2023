package javasessions;

public class BrowserMethodChaining {

	
	public void m1() {
		int i =10;//local variable
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
		System.out.println("Bye m3");
	}

	public void m3() {
		System.out.println("m3 method");
		//m1();
	}

	//m1-m2-m3(going to back to previous calling method)-m2-m1-main()-obj
	//LIFO(Last in First out)-m3
	//stack memory is always easy to handle -- allocation -- deallocation 
	//local and method variables will participate in satck execution
	//NS class variables will just give  template to object
	//static class variables will participate in stack execution -- static int wheels = 4;
	
	
//	public static void t1() {
//		System.out.println("t1 method");
//		t2();
//	}
//	
//	public static void t2() {
//		System.out.println("t2 method");
//		t3();
//	}
//	
//	public static void t3() {
//		System.out.println("t3 method");
//		t1();
//	}
//	
	
	public static void main(String[] args) {
	
		//k is stored in stack during execution
		int k = 20;//local varible
		BrowserMethodChaining obj = new BrowserMethodChaining();
		obj.m1();//StackOverflowError
		
		//BrowserMethodChaining.t1();
	}

}
