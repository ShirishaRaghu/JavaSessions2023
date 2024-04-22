package Casting;

public class UpCasting {

	
	

	public static void main(String[] args) {

//		ClassA obj = new ClassA();
//		obj.show();
//		
		ClassA obj = new ClassB();
		obj.show();
		obj.Testing();
		
		obj = new ClassC();
		obj.show();
		obj.Testing();
		
		System.out.println("-------");
		
		//Down Casting
		ClassB obj1 =  (ClassB) obj;
		obj1.show1();
		
		
		
	}

}
