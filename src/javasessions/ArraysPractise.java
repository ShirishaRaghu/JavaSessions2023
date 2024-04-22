package javasessions;

import java.util.Arrays;

public class ArraysPractise {

	public static void main(String[] args) {

		// Array:non primitive
		// It is a collection of similar kind of data types
		// default value of integer family -- 0
		//character -- space
		//String -- null
		//Boolean -- false
		//ObjectArray -- null

		//two major limitations:
		//1.size is fixed: Static Array
		//2.it can store only similar type of data:
		
		// 1. using new keyword:
		int i[] = new int[4];
		// Highest Index - 3
		// Lowest Index - 0
		// Length = HI + 1
		// HI = length - 1

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4]=50;//AIOB

		System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[3]);
		// Interview
		// System.out.println(i[4]);//ArrayIndexOutOfBoundException[AIOB]

		// System.out.println(i[-1]);//AIOB

		System.out.println(i);// Address of the array -- random string
		System.out.println(Arrays.toString(i));

		// print the value from the array: for loop
		for (int k = 0; k <= 3; k++) {
			System.out.println(i[k]);
			if (i[k] == 20) {
				System.out.println("Hi");
				break;
			}
			System.out.println("Bye");
		}

		//
		short sh[] = new short[3];
		System.out.println("length =" + sh.length);
		System.out.println("Li =" + 0);
		System.out.println("Hi =" + (sh.length - 1));

		System.out.println(Arrays.toString(sh));
		sh[0] = 10;
		System.out.println(Arrays.toString(sh));
		sh[2] = 20;
		System.out.println(Arrays.toString(sh));
		sh[1] = 30;
		System.out.println(Arrays.toString(sh));

		for (int p = 0; p <= sh.length - 1; p++) {
			System.out.println(sh[p]);
		}

		// char array:
		// Default value of character -- space
		char ch[] = new char[5];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 98;
		System.out.println(ch);
		System.out.println(ch[0]);
		System.out.println(Arrays.toString(ch));

		// float array:
		float fg[] = new float[2];
		fg[0] = 100;
		fg[1] = 12.4f;
		System.out.println(Arrays.toString(fg));

		// double array:
		double db[] = new double[3];
		db[0] = 12;
		db[1] = 30.6767678786987859;
		System.out.println(Arrays.toString(db));

		// emp data: name(String), age(int), salary(double), gender(char)
		// Object Array: it can store any kind of data types
		// Default value of object -- null
		Object empData[] = new Object[5];
		empData[0] = "Shilpa";
		empData[1] = 30;
		empData[2] = 25.55;
		empData[3] = 'y';
		// empData[4] = true;

		System.out.println(Arrays.toString(empData));
		System.out.println(empData.length);
		System.out.println(empData[4]);// null

		for (int p = 0; p <= empData.length - 1; p++) {
			System.out.println(empData[p]);
		}

		Object empData1[] = new Object[5];
		empData1[0] = "Tinku";
		empData1[1] = 30;
		empData1[2] = 25.55;
		empData1[3] = 'y';
		// empData1[4] = true;

		// String Array:
		String product[] = new String[3];
		product[0] = "Macbook Air";
		product[1] = "Macbook Pro";
		product[2] = "ipad";

		for (int x = 0; x <= product.length - 1; x++) {
			System.out.println(product[x]);
			if (product[x].equals("Macbook Air")) {
				System.out.println(product[0] + " is " + "Out of stock");
				// break;
			}
		}

		System.out.println("-----------");
		// Reverse
		for (int y = product.length - 1; y >= 0; y--) {
          System.out.println(product[y]);
		}
		
		//Dynamic Array use cases:
		//booking uber:100 cab[100]
		//ecommerce -- users reg --> new customers 
		//emp data array
		
		//Static Array use cases:
		//bookmyshow.com --> 200 seats
		//flight booking --> 300 seats
		//month array --> 0 to 11 
		
	}

}
