package javaassignments;

public class EncapsulationPerson {

	private String name;
	private int age;
	private String gender;

	
	public EncapsulationPerson(String name, int age, String gender) {
		this.name =name;
		this.age=age;
		this.gender=gender;
	}
	
	public void printInfo() {
		if(isValidName(name)) {
      System.out.println("Details of person:  name- "+name+" age- "+age+" gender- "+ gender);
		}
      	}

	private boolean isValidName(String name) {
		if(name.startsWith("P")) {
			//System.out.println("valid name");
			return true;
		}else {
			System.out.println("Not valid");
			return false;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0) {
		this.age = age;
		}else {
			System.out.println("Invalid age");
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}
