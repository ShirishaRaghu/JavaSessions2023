package InterfaceConcept;

//child  -- parent class(1) -- parent interfaces(n)
public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical{
//Here FortisHospital extends Hospital
	// and implements interfaces USMedical, UKMedical, IndianMedical
	
	int speed;
	
	@Override
	public void phsioServices() {
		
		System.out.println("FH -- phsioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
		
	}

	@Override
	public void pediaServices() {
		
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void cardiServices() {
		System.out.println("FH -- cardiServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
		
	}

	@Override
	public void gynecServices() {
		System.out.println("FH -- gynecServices");		
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH -- radiologyServices");
		
	}
	
	//FH - individual
	public void OTPServices() {
		System.out.println("FH -- OTPServices");
	}

	public void pathologyServices() {
		System.out.println("FH -- pathologyServices");
	}

	//If all the interface having same method last implemented interface method is called
	//Here we have to write switch case to handle multiple countries
	@Override
	public void emergencyServices() {
				
	}

    //Data hiding -- static method overloading
	public static void billing() {
		System.out.println("Fortis - billing");
	}
	
	//default method can be overridden -- change default to public
	@Override
	public void medicalInsurace() {
		System.out.println("USM -- medicalInsurance");
	}

	//WHO
	@Override
	public void covidVaccines() {
				
	}
	

}
