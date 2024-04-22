package javasessions;

public class AndOrOPerators {

	public static void main(String[] args) {
	
		int marks = 95;
		if(marks<=100) {
			if(marks>=80 && marks<=90) {
				System.out.println("Grade A");
			if(marks>=95) {
				System.out.println("Grade A++");
			}
			}
			else {
				System.out.println("Grade B");
			}
			
		}
		
		//If we want to check between certain range then we use && operator
		int salary = 60;
		if(salary<=100 || salary>=200) {
			System.out.println("PASS");
		}
		
		//&&  || --When we are checking two conditions
		// |
		//Button on the page
		//1. isVisible
		//2. isEnabled
		//3. isClickable
		
		//if(isVisible & isEnabled & isClickable)
		//if(isVisible | isEnabled | isClickable)

	}

}
