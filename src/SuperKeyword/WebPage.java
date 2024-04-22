package SuperKeyword;

public class WebPage extends Page{

	//public int speed = 10;

	public WebPage() {
		super();//Its calling object class-- if you dont have parent
		System.out.println("WP -- defaulit condt....");
	}

	public WebPage(int i) {
		System.out.println("WP const.." + i);
	}

	public void calculateTimeOut() {
		System.out.println("webpage - calculateTimeOut 20");
	}

	@Override
	public  void logo1() {
		super.logo1();
		System.out.println("web----logo1");
	}

	public final void logo() {
		System.out.println("webpage -- logo");
		
	}
	
	public static void billing() {
		System.out.println("web -- billing");
	}
}
