package WebDriver_Arch;

import ExceptionHandling.MyException;

public class AmazonTest {

	public static WebDriver driver;//class var -- no need to init
	
	public static void main(String[] args)  {

		//ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		String browser = "chrome";//user input
		
		//cross browser logic -- with top casting -- switch case/if else
		//init the driver only once
		//parallel run
		WebDriver driver=null;//local variable we need to initialize with null
		
				
		
		switch(browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

			default:
				System.out.println("plz pass right browser.....");
				throw new MyException("no browser found");
				//throw and break cannot be together
				//break;
		}
		
		
		
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title is " + title);

		if (title.equals("amazon")) {
			System.out.println("title is PASSED");
		} else {
			System.out.println("title is FAILED");
		}

		String url = driver.getURL();
		System.out.println(url);
		
		driver.finElement("logo");
		
		driver.sendKeys("Naveen", "Naveen@123");
		
		driver.sendKeys("password", "naveen@123");
		driver.click("loginbutton");
		
		driver.close();

	}

}
