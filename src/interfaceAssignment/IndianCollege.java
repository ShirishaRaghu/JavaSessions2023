package interfaceAssignment;

public interface IndianCollege {

	
	public void chemistryReaserch();
	
	public void maths();
	
	
	public static void hindi() {
		System.out.println("hindi -- IndianCollege");
	}
	
	default void sanskrit() {
		System.out.println("sanskrit -- IndaianCollege");
	}
	
}
