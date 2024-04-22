package javaassignments;

public class EncapsultionPersonTest {

	public static void main(String[] args) {
		
		EncapsulationPerson obj = new EncapsulationPerson("Huda", 24,"Male");
	    obj.printInfo();
	    obj.setName("Puna");
	    obj.printInfo();
	    obj.setAge(24);
	    obj.setGender("Female");
	    obj.printInfo();
	   
	    obj.setAge(-1);
	    System.out.println("---------");
	    obj.printInfo();
	    
		
	}

}
