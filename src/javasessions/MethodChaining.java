package javasessions;

public class MethodChaining {

	// method overloading
//	public static void test() {
//
//	}
//
//	public static void test(int i) {
//
//	}
//
//	public static void test(String b, int i) {
//
//	}

	public static void t1() {
		System.out.println("t1 method");
		// class name
		MethodChaining.t2();
		System.out.println("Hi");
	}

	public static void t2() {
		System.out.println("t2 method");
		// directly
		t3();
		System.out.println("Hello");
	}

	public static void t3() {
		System.out.println("t3 method");
		System.out.println("World");
		// create object:
		MethodChaining obj1 = new MethodChaining();
		obj1.m1();
	}

	public void m1() {
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
	}

	public static void main(String[] args) {
//class name:
		MethodChaining.t1();
		// directly
		// t2();

		// s - s --> classname.method/directly
		// NS - NS --> directly
		// s - NS --> create the object
		// NS -- s --> class name.method name /directly

		// main -- s -->class name.method name /directly
		// main -- NS -->create the object
	}

}
