package javaassignments;

public class IfElseSwitchAssignment {

	public static void main(String[] args) {

		// 1.Greatest number out of three numbers
		int a = 25, b = 88, c = 87;
		// Comparing first number with second & third--T(prints a)--F(go to else if)
		if (a >b && a >c) {
			System.out.println("The largest:a");
		}
		// Comparing second number with third --T(prints b)--F(go to else)
		else if (b >c) {
			System.out.println("The largest:b");
		} else {
			System.out.println("The greatest:c");
		}

		// 2.Greatest number out of four different numbers
		int w = 76, x = 108, y = 108, z = 97;
		// Comparing first number with second & third & fourth
		if (w >= x && w >= y && w >= z) {
			System.out.println("The largest:w");
		}
		// Comparing second number with second & third
		else if (x >= y  && x >= z) {
			System.out.println("The largest:x");
		} else if ( y >= z)//Comparing third number with fourth
			{
			System.out.println("The greatest:y");
		} else {
			System.out.println("The greatest:z");
		}

		// 3.Program to test number is positive or negative or zero
		byte i = 35;
		byte j = -11;
		if (i > 0) {
			System.out.println("Number is positive");
		} else if (i < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}
		
		//Number is positive or negative using nested if
		byte i1 = 35;
		byte j1 = -11;
		if(i1>0) {
			if(j1>0) {
				System.out.println("i1 and j1 are positive");
			}
			else {
				System.out.println("j1 is not  positive");
			}
			}else {
				System.out.println("x1 is not positive");
			}

		// 4.Vowel or Consonant using switch case
		char ch = 'A';
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'A':
			System.out.println("A is vowel");
			break;
		case 'E':
			System.out.println("E is vowel");
			break;
		case 'I':
			System.out.println("I is vowel");
			break;
		case 'O':
			System.out.println("O is vowel");
			break;
		case 'U':
			System.out.println("U is vowel");
			break;
		default:
			System.out.println("It is a Consonant");
			break;
		}

		// 5.WAP to run your test cases in specific environment like:AQ, Stage, Dev,UAT,
		// prod using switch case
		String environment = "QA";
		switch (environment) {
		case "QA":
			System.out.println("QA");
			break;
		case "Stage":
			System.out.println("Stage");
			break;
		case "Dev":
			System.out.println("Dev");
			break;
		case "UAT":
			System.out.println("UAT");
			break;

		default:
			System.out.println("Not an environment");
			break;
		}

		// 6.WAP to book the specific car type from the uber app using switch case
		// Car type:Mini, Sedan, SUV, Premium
		// If user passes wrong car type, print please select the right car type
		String CarType = "Mini";
		switch (CarType) {
		case "Mini":
			System.out.println("CarType is Mini");
			break;
		case "Sedan":
			System.out.println("CarType is Sedan");
			break;
		case "SUV":
			System.out.println("CarType is SUV");
			break;
		case "Premium":
			System.out.println("CarType is Premium");
			break;
		default:
			System.out.println("please select the right car type");
			break;
		}

		// 7.WAP to launch browsers using If-ElseIf and Switch Case.
		// Browser: Chrome/Firefox/IE/Safari
		// If user passes wrong browser, print please pass the right browser name
		String Browser = "Chrome";
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch chrome browser");
			break;
		case "firefox":
			System.out.println("Launch Firefox browser");
			break;

		case "ie":
			System.out.println("Launch IE browser");
			break;

		case "safari":
			System.out.println("Launch Safari browser");
			break;
		default:
			System.out.println("please pass the right beowser");
			break;
		}

		// 8.WAP to check number is odd or even using If - Else
		int num = 10;
		if (num % 2 == 0) {
			System.out.println(num + "is even number");
		} else {
			System.out.println(num + "is odd number");
		}
	}

}
