package OOP_Abstract;

public class LoginPage extends Page{

	public LoginPage() {
		//super(20);
		System.out.println("Loginpage ---- cons");
	}
	
	public LoginPage(int i) {
		System.out.println("Loginpage ---- cons"+" "+i);
	}
	
	@Override
	public void title() {
		System.out.println("loginpage ----- title");		
	}

	@Override
	public void url() {
			System.out.println("loginpage ---- url");	
	}

	@Override
	public void pageLoadingTime() {
		System.out.println("loginpage -- loading time out");
	}

	
	public void doLogin(String un, String pwd) {
		System.out.println("login with: "+un +" "+pwd);
	}

	
	public static void displayLogo() {
		System.out.println("loginpage -- display Logo");
	}

	//Interface to abstract class
	//But implemented in ground level
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
