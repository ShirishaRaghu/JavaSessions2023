package OOP_Abstract;

public class AppTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.doLogin("admin", "admin");
		Page.displayLogo();
		// Static methods can be called by child class name
		LoginPage.displayLogo();
		lp.footers();
		LoginPage.displayLogo();
		Page.displayLogo();

		// Page pg = new Page();

		System.out.println("-------");
		
		// top casting:
		Page pg1 = new LoginPage();
		pg1.title();
		pg1.url();
		pg1.pageLoadingTime();
		pg1.footers();
		Page.displayLogo();
		

		// down casting:NA
		

	}

}
