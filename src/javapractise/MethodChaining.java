package javapractise;

public class MethodChaining {

	public void m1() {
		System.out.println("m1 method");
		m3();
		System.out.println("Hello");
		
	}
	
	public void m2() {
		System.out.println("m2 method");
		m1();
	}
	public void m3() {
		System.out.println("m3 method");
		//t1();
		
	}
	
	public static void t1() {
		System.out.println("t1 method");
		MethodChaining d2 = new MethodChaining();
		d2.m3();		
	}

	
	
	
	public static void main(String[] args) {
		MethodChaining d = new MethodChaining();
		d.m1();
		d.m2();
		d.m3();
		
		t1();
	}

}
