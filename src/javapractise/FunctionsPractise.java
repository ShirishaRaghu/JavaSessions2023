package javapractise;

public class FunctionsPractise {

	// no input - no return
	public void getMarks() {
		int a = 10;
		int b = 20;
		int total = a + b;
		System.out.println("toatal marks" + " " + total);
	}

	// no input some return
	public int getMarks1() {
		int a = 20;
		int b = 40;
		int total = a + b;
		System.out.println("total marks" + " " + total);
		return total;
	}

	// some input some return
	public int add(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of two numbers" +" "+ sum);
		return sum;
	}
	
	//some input no return
	public void add1(float q, float p) {
	 float g = q + p;
	 System.out.println("Addition of two numbers"+" "+ g);

		
	}

	public static void main(String[] args) {

		FunctionsPractise obj = new FunctionsPractise();
		obj.getMarks();

		int j = obj.getMarks1();
		System.out.println(j / 2);

		int k = obj.add(10, 10);
		System.out.println(k - 2);
		
		obj.add1(12, 14.2f);
	}

}
