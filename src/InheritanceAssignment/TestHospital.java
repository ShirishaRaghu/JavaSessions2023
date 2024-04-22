package InheritanceAssignment;

public class TestHospital {

	public static void main(String[] args) {
		
		
		Fortis f = new Fortis();
		f.bloodTest();
		f.gynec();
		f.billing();
		f.surgeonSpecalist();
		
		System.out.println("-------");
		
		Hospital h = new Fortis();
		h.surgeonSpecalist();//overridden
		h.billing();
		h.pediatric();
		h.gynec();
		
	}

}
