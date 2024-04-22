package interfaceAssignment;

public class NEET_College extends University implements USCollege, UKCollege, IndianCollege{

	//USCollege
	@Override
	public void physicsReasearch() {
			System.out.println("US -- physicsReasearch");	
	}

	@Override
	public void diplomaScience() {
		System.out.println("US -- diplomaScience");			
	}

	//UKCollege
	@Override
	public void homeScience() {
		System.out.println("UK -- homeScience");	
	}

	@Override
	public void ayurveda() {
		System.out.println("UK -- ayurveda");
		
	}

	@Override
	public void chemistryReaserch() {
		System.out.println("Indian -- chemistryReaserch");
		
	}

	@Override
	public void maths() {
		System.out.println("Indian -- maths");
		
	}

	//Data hidding
	public static void hindi() {
		System.out.println("hindi -- IndianCollege --NEET");
	}
	
	public void sanskrit() {
		System.out.println("sanskrit -- IndaianCollege --NEET");
	}
	
	@Override
	public void college() {
		System.out.println("college -- subjects");
	}

}
