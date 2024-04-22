package OOP_Inheritance;

public class BMW extends Car{

	//Method Overriding: poly+morphism--Many forms same name
	//Run time polymorphism -- dynamic binding
	//when you have a method in parent class and the same method in child also
	//with the same name
	//with the same number of parameters
	//same sequence of parameters
	//same return type
	//only public methods be overridden  without static final private
	
	int maxSpeed = 20;
	
	static int price = 5000;
	
	final int minSpeed = 20;
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	@Override
	public void backupCamera() {
	      System.out.println("BMW ---- backupCamera");
		}

	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	@Override
	public void billing() {
		System.out.println("BMW -- billing");
	}
	
	//static method cannot be overridden -- but can inherit
	//method hiding 
	public static void carDisplay() {
		System.out.println("BMW -- display");
	}
	
	//private method can not be overridden -- but can inherit
	private void show() {
		System.out.println("car -- show");
	}
	
	public void showCar() {
		System.out.println("car -- show");
	}
	
	
	

	
	//final keyword can not be overridden
//	public final void RunFourWheels() {
//		System.out.println("car -- run four wheels");
//	}
	//If class is final that class cannot be inherited
	//final methods -- ca not be overridden but can be inherited
	//final var: constant value
	
}
