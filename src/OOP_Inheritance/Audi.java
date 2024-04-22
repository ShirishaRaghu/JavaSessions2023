package OOP_Inheritance;

public class Audi extends Car {
	
	
	public void theftSafety() {
		System.out.println("audi-----theft safety");
	}

	@Override
	public void engine() {
		System.out.println("Audi -- engine");
	}
	
	@Override
	public void setDimension() {
		System.out.println("dimensions-----Audi");
	}
	
}
