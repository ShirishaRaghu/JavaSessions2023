package interfaceAssignment;

public class IIT_Kharagpur extends University implements USCollege, UKCollege, IndianCollege {

	@Override
	public void chemistryReaserch() {
		System.out.println("US -- chemistryReaserch");	
		}

	@Override
	public void maths() {
		System.out.println("US -- maths");		
	}

	@Override
	public void ayurveda() {
		System.out.println("UK -- ayurveda");
		
	}

	@Override
	public void physicsReasearch() {
		System.out.println("US -- physicsReasearch");
		
	}

	@Override
	public void diplomaScience() {
		System.out.println("US -- diplomaScience");
		
	}

	@Override
	public void homeScience() {
		System.out.println("UK -- homeScience");
		
	}

	
}
