package Casting;

public class ClassB extends ClassA{

	public void show1() {
		System.out.println("Classs B show....");
	}
	
	@Override
	public void show() {
		System.out.println("Classs B Overridden show....");
	}
}
