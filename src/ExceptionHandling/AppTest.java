package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		
		
		String browser = "ie";
		
		if(browser.equals("chrome")) {
			System.out.println("open chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("open firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("open safari");
		}
		else {
			System.out.println("plz pass the right browser.....");
		       throw new RuntimeException("WRONGBROWSEREXCEPTION");
		}
		
		System.out.println("launch URL");
	}

}
