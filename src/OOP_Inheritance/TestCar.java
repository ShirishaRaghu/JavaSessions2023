package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// overridden -- calls latest implemented method
		b.stop();// Inherited
		b.refuel();// Inherited
		b.autoParking();// Individual
		b.engine();// inherited -- GP
		b.billing();//Overridden -- GP
		b.backupCamera();//Overridden
	    b.showCar();
	    b.spareEngine();
	    

		System.out.println(b.maxSpeed);
		
		System.out.println(Car.price);
		System.out.println(BMW.price);
		
		//final var and method
		b.RunFourWheels();
		Car.loadCar();
		BMW.loadCar();
		
		
		
		
		
		Car.carDisplay();
		BMW.carDisplay();
		
		System.out.println("-------");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();// Inherited -- p

		System.out.println(c.maxSpeed);
		
	
		
		System.out.println("-------");

		Audi au = new Audi();
		au.theftSafety();// Individual
		au.start();// Inherited
		au.stop();// Inherited
		au.refuel();// Inherited
		au.engine();// Overridden
		au.billing();
		au.setDimension();

		System.out.println("-------");
		
		Truck t = new Truck();
		t.heavyLoading();//Individual
		t.engine();//Inherited -- vehicle

		
		System.out.println("------");
		
		Automobile at = new Automobile();
		at.backupCamera();
		
		System.out.println("------");
		
		Honda h = new Honda();
		h.start();
		h.start();
		h.fuelEff();
		h.refuel();
		h.parking();
		
		System.out.println("------");
		
		Car c1 = new Car();
		c1.start();
		
		System.out.println("------");
		
		//child class object can be referred by parent class 
		//Top/Up Casting
		Car cr;
		cr = new Honda();
		cr.start();//overridden
		cr.start();//inherited
		cr.refuel();//inherited
		//ReferenceType Check Failed
		//Individual methods can not be used
		//cr.fuelEff();
		
		cr = new BMW();
		
		cr = new Audi();
		
		Vehicle vc =new Honda();
		vc.backupCamera();
		
		//can top casting be called polymorphism -- yes
		//one object is having multiple references
		
		
		//parent class object can be referred by child ref var name
		//down casting
		//Honda hr = (Honda) new Car();//classcastexception
		
	}

}
