package ExceptionHandling;

public class Employee {

	// amazon -- cart()
	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	// amazon -- payment
	public void m2() {
		System.out.println("m2 method");
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE is coming....");
		}
	}

	// HDFC bank server -- method
	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int i = 9 / 0;

	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		try {
			obj.m1();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("Bye!!");
	}

}
