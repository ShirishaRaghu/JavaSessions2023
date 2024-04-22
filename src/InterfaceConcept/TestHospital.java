package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardiServices();
		fh.pathologyServices();
		fh.dentalServices();
		fh.gynecServices();
		fh.dentalServices();
		fh.emergencyServices();
		System.out.println(USMedical.min_fee);
		USMedical.billing();
		FortisHospital.billing();
		System.out.println(fh.speed);
		fh.speed=10;
		System.out.println(fh.speed);
		
		
		
		//cannot create object of interface
		//USMedical us = new USMedical();
		
		//top casting:
		//child class object can be reffered by parent interface
		//only those methods which are coming from interface class
		//Individual methods cannot be accessed
		USMedical us = new FortisHospital();
		us.pediaServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.cardiServices();
		uk.dentalServices();
		uk.emergencyServices();
		
		
		
		//down casting:
		//not allowed at compile time only
		//FortisHospital fh1 = new USMedical();
		
		//interface to interfacer - explicit casting:
		//I1 and I2
		
		UKMedical uk1 = (UKMedical)us;
		uk1.dentalServices();
		uk1.cardiServices();
		uk1.emergencyServices();
		
		
	}

}
