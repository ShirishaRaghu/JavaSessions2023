package InheritanceAssignment;

public class Max extends Hospital {

	public void pedia() {
		System.out.println("pedia----max");
	}
	
	public void neurology() {
		System.out.println("neurology-----max");
	}
	
	@Override
	public void billing() {
		System.out.println("billing-----hospital");
	}
	
	@Override
	public void dental() {
		System.out.println("dental-----hospital");
	}
}
