package javasessions;

public class FinalKeyword {

	int num1=20;
	//static is only for global variables
	static int i = 10;//class variable
	static int num = 10;
	
	public static void main(String[] args) {
		
		final int i = 20;
		
		//If both the names are same then preference will be given tolocal variables 
		System.out.println(i);
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println(FinalKeyword.i);
		System.out.println(num);
		System.out.println(obj.num1);
		
		//constant vars -- variables with underscore -- Uppercase
		final int DAYS_IN_WEEK = 7;
		
		int salary = 100 * DAYS_IN_WEEK;
		System.out.println(salary);
		
	}

}
