package SuperKeyword;

public class HomePage extends WebPage {

	public int speed = 50;

	public HomePage() {
		super(10);// super() be the first statement in const
		// this(10);//super and this cannot be toghter
		System.out.println("HP -- defaulit condt....");
		//can call methods in constructors
		super.calculateTimeOut();
		System.out.println(super.speed);
	}

	public HomePage(int i) {
		super(i + 10);
		System.out.println("HP const.." + i);
	}

	public static void billing() {
		System.out.println("home  -- billing");
	}
	
	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();
		System.out.println("homepage - calculateTimeOut 5");
		super.logo();// non - overridden method
		System.out.println(speed);
		super.speed = 20;//update parent variable
		System.out.println(super.speed);
		super.logo1();//calls immediate parent
		
		
		//child class static method
		HomePage.billing();
		billing();
		this.billing();//not recommended
				
		//parent class static method
		super.billing();
		WebPage.billing();
	}

	// super:
	// is used to call parent class cons -- first statement(in child class const)
	// super& this cannot be together
	// is used to call methods & variables of parent class

}
