package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {
		System.out.println("A");

		try {
			Thread.sleep(20000);// Compile time -- checked Exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream file = new FileInputStream("/users/test.xml");//CE
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {

			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "Naveen";// NPE -- unchecked exception - runtime

			System.out.println("Start");
			int i = 9 / 0;// AE
			// int i1 = 9/3;
			System.out.println("hello");

		} catch (ArithmeticException e) {
			//reporting/custom log
			System.out.println("AE is coming....");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
//		catch (Exception e) {
//			System.out.println("NPE is coming....");
//			e.printStackTrace();
//		}

		//First child exceptions -- then parent
		
		System.out.println("bye");
	}

}
