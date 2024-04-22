package javasessions;

public class ApplicationMethodOverloading {

	// duplicate methods are not allowed

	// method overloading:
	// when you have diffrent method names with:
	// 1. with the same name
	// 2. with diffrent number of parameters(diff number of params) with diiferent
	// type of params
	// 3. with the different sequence of the parameters in case of same number of
	// parames
	// 4. return type doesnt matter

	public void test() {// 0 param

	}

//	public int test() {// 0 param
//		return 100;
//	}

	public void test(int i) {// 1 param

	}
	
	public void test(int i[]) {// 1 param

	}
	
	//First preference will be given to int
	//If we want to print any other values -- type cast
	public void set(int i) {
		System.out.println("hii");
		System.out.println(i);
	}
	
	public void set(byte i) {
		System.out.println("hello");
		System.out.println(i);
	}


	// ecom app:
	public void login(String un) {

	}

	public void login(String un, String ps) {
		System.out.println("login succesfull");
	}

	public void login(String un, String ps, int j) {

	}

	// search
	public void doSearch(String name) {

	}

	public void doSearch(String name, String color) {

	}

	public void doSearch(String name, String color, int price) {

	}

	// payment:
	public void makePayement(String payementMethod) {

		switch (payementMethod) {
		case "upi":
			break;
		case "paypal":
			break;

		default:
			break;
		}

	}

	public void makePayement(String cc, int cvv, int otp) {

	}

	// uber:
	public void booking(String st, String end) {

	}

	public void booking(String st, String end, String carType) {

	}

	public void booking(String st, String end, String carType, String paymentMethod) {

	}

	public void test(int i, int j) {// 2 param
		System.out.println("Printing");
	}

	public void test(int i, String j) {// 2 param

	}

	public void test(String i, int j) {// 2 param

	}

	public static void main(String[] args) {

		ApplicationMethodOverloading obj = new ApplicationMethodOverloading();
		obj.test(2, 4);

		obj.login("admin", "admin");
		
		
		obj.set((byte)10);

	}

}
