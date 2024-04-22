package InterfaceConcept;

public interface USMedical extends WHO{

	int min_fee = 10;
	//Interface variables are static and final by default 
	
	//no method body is allowed -- abstract method -- by default all the methods are abstract
	//only method declaration
	//only method prototype
	//cannot create object
	//cannot be private method -- we cannot override
	//cannot have buss logic
	//100% abstraction -- no method body
	
	public void phsioServices();
	
	public void oncologyServices();
	
	public void pediaServices();
	
	public void emergencyServices();
	
	//after JDK 1.8, two major changes:
	
	//1.we can have static method with method body
	
	public static void billing() {
		System.out.println("USM - billing");
	}
	
	
	//2. we can have a default method with method body:
	
	default void medicalInsurace() {
		System.out.println("USM -- medicalInsurance");
	}
	
}
