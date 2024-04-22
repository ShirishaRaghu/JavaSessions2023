package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
	
		String browser = " CHrome ";
		switch (browser.toLowerCase().trim()) {
		case "chrome"://name
			System.out.println("launch chrome browser");
			//break;
		case "firefox"://name
			System.out.println("launch firefox browser");
			//break;
		case "safari"://name
			System.out.println("launch safari browser");
			break;
		case "edge"://name
			System.out.println("launch edge browser");
			break;

		default://default is not madatory--if no case matches then it ll come to default
			System.out.println("plz pass the right browser");
			break;//if we not write break then it may go to next condition
			
		}
		
		//
		int marks = 100;
		switch (marks) {
		case 100:
			
			break;

		default:
			break;
		}
		
		//Double is not allowed in switch case
//		double d =12.33;
//		switch (d) {
//		case 12.33:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//Boolean is not allowed
//		Boolean flag = true;
//		switch (flag) {
//		case true:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//long is not allowed
//		long num = 1222222;
//		switch (num) {
//		case 1222222:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//float is not allowed
//		float f1 = 20.2f;
//		switch (f1) {
//		case 20:
//			
//			break;
//
//		default:
//			break;
//		}

		
		byte b = 20;
		switch (b) {
		case 20:
			
			break;

		default:
			break;
		}
		
		short s = 20;
		switch (s) {
		case 20:
			
			break;

		default:
			break;
		}

		//on character we cannot convert to upper or lower case
		char ch = 'A';
		switch (ch) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;
		case 'A':
			System.out.println("A is a vowel");
			break;
		case 'E':
			System.out.println("E is a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'O':
			System.out.println("O is a vowel");
			break;
		case 'U':
			System.out.println("U is a vowel");
			break;


		default:
		System.out.println(ch + " is consonant");
			break;
		}

		//real time examples
		//cross browser testing
		//multi env setup: dev , qa, stage, prod
		//RBAC: user roles: admin, customer, partner, manager, vendor
		//Element Locator: id, name, xpath, css, linktext
		//OS:windows , Mac, Linux
		
		char c = 'A';
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println("Is vowel");
			
		}else
		{
			System.out.println("Is consonant");
		}
	}

}
