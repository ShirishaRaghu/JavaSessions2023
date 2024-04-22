package InheritanceAssignment;

public class Apollo extends Hospital {

	
	public void xRay(){
		System.out.println("--------apollo");
	}
	
	public void teslaMRI(){
		System.out.println("--------apollo");
	}
	
	@Override
	public void pediatric() {
		System.out.println("pediatric-----apollo");
	}
	
	@Override
	public void surgeonSpecalist() {
		System.out.println("surgeonSpecalist-----apollo");
	}
	
}
