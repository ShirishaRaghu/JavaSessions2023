package OOP_Inheritance;

public class Honda extends Car{

	
	public void start() {
		System.out.println("Honda -- start");
	}
	
	public void fuelEff() {
		System.out.println("Fuel -- efficiency");
	}
		
		public void parking() {
			BMW b = new BMW();
			b.autoParking();//composition -- Accessing the sibblings property by creating object in sibbling class
		}
		
	
}
