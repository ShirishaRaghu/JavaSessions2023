package javasessions;

public class MainMethodOverloading {

	//PSVM(String[]) -- JVM
	//main method is only for calling -- logic to be written in functions
	public static void main(String[] args) {

		System.out.println("Hi");
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "Selenium");
		MainMethodOverloading.main("cypress", "Selenium");
	}

	public static void main(int i) {

		System.out.println("Hello" + i);
	}
	
	public static void main(int i, String j) {

		System.out.println("Hello" + i + j);
	}


	public static void main(String i, String j) {

		System.out.println("Hello" + i + j);
	}

}
