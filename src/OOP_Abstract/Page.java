package OOP_Abstract;

public abstract class Page  implements USMedical{

	public Page() {
		this(20);
		System.out.println("page -- const ----");
	}
	
	public Page(int i) {
		System.out.println("page -- const" +" "+ i);
	}
	
	//cannot create object
	//No default methods allowed
	//Abstrct class can have only non abs method alse
	//can we create the constructor of the abs .. class -- yes
	//preference of cons parent -- child (calls both)
	
	
	//no abs -- methods - 0% abstraction
	//only abs -- methods -- 100% abst
	//abs + non abs methods -- partial abstraction
	//0 to 100% abstraction
	
	public abstract void title();
	
	public abstract void url();
	

	
	
	public void pageLoadingTime() {
		System.out.println("page -- loading time out");
	}
	
	
	
	public static void displayLogo() {
		System.out.println("page -- display Logo");
	}
	
	//Everyone will get individual footer but cannot override -- final
	public final void footers() {
		System.out.println("page -- footers");
	}
	
	//default void billing() {}
}
