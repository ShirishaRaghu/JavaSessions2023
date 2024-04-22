package OOP_Encapsulation;

public class AppLoginTest {

	public static void main(String[] args) {
		
		//reg page:
		LoginPage lp = new LoginPage("sameer" , "sameer@123");
		
		lp.doLogin(lp.getUserName());
		
		System.out.println("-------");
		lp.setPassword("sameer@458");
		lp.doLogin(lp.getUserName());

		System.out.println("------calling");
		Utility.checkBrowserVersion();
		
		//Interview
		//Private cons
		System.out.println();
		//System - class
		//out - static variable
		//println()
		//method
		
		//System s1 = new System();
		
	}

}
