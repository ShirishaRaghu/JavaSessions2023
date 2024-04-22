package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		int x = 30;
		int y = 20;
		
		// == >= > <= < !=
		System.out.println(x>y);

		if(x>y)
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//
		if(true) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");//Dead or ureachable code
		}//ex--universal code
		
		//
		boolean flag = false;
		if(flag) {
			System.out.println("Hello");
		}
		else {
			System.out.println("world");
		}//Always maitain a variable instead of writing direct if
	
		
		//
	    int t1 = 100;
	    int t2 = 100;
	    
	    if(t1>=t2) {
	    	System.out.println("t1 and t2 are gr than or equal");
	   }//checks either one condition greater than or equal to
	    	
       //In this case its just 'not equal to' checks one condition 	
	    int p1 =100;
	int p2 =200;
	if(p1!=p2) {
		System.out.println("Selenium");
	}
	
	//else checks only last if condition
//	String browser = "safari";
//	if(browser.equals("chrome")) {
//		System.out.println("launch chrome browser");
//	}
//	if(browser.equals("firefox")) {
//		System.out.println("launch firefox browser");
//	}
//	if(browser.equals("edge")) {
//		System.out.println("launch edge browser");
//	}
//	if(browser.equals("safari")) {
//		System.out.println("launch safari browser");
//	}
//	else {
//	System.out.println("plz pass right browser");		
//	}
//	}Drawbach--checks each n every if condition
	
	String browser = "chrome";
	if(browser.equals("chrome")) {
		System.out.println("launch chrome browser");
	}
	else if (browser.equals("firefox")) {
	System.out.println("launch firefox browser");	
	}
	else if (browser.equals("edge")) {
		System.out.println("launch edge browser");	
		}
	else if (browser.equals("safari")) {
		System.out.println("launch safari browser");	
		}
	else   {
		System.out.println("plz pass the right browser");	
		}//
	
	
	}
	
	
	
	

	}
	
