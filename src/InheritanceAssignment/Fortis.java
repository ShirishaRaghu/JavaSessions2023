package InheritanceAssignment;

public class Fortis extends Hospital{

	
	public void bloodTest() {
		System.out.println("bloodtest-----fortis");
	}

	public void gynec() {
		System.out.println("gynec-----fortis");
	}
	
	@Override
	public void surgeonSpecalist() {
		System.out.println("surgeonSpecalist-----fortis");
	}
	
	@Override
	public void pharmacyManagement() {
		System.out.println("pharmacyManagement-----fortis");
	}

}
