package javasessions;

public class MethodOverloading {

	//MethoOverloading
	//Poly(many)+morphism(forms): compile time polymorphisim(static binding)
	
	public void search(int a) {
		System.out.println(a);

	}

	public void search(int price, String color) {

	}

	public void search(int price, String color, String name) {

	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		//compiler decision
		obj.search(10);//call by value/arguement
		obj.search(10, "Blue");
		
	}

}
