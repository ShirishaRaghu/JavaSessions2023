package javasessions;

public class ForLoopDowhile {

	public static void main(String[] args) {

		// 1.for loop:If the number of iterations are fixed
		// 1 to 10;
		for (int a = 1; a <=10;) {
			System.out.println(a);
			 a++;
			//a = a + 1;
		}

		System.out.println("------------");

		// Infinite loop
//		for (; ;) {
//			System.out.println("Hi");
//			break;//Unreachable code
//		}

		System.out.println("------------");

		// even numbers
		for (int even = 0; even <= 10; even = even + 2) {
			System.out.println(even);

		}

		System.out.println("------------");

		// odd numbers
		for (int odd = 1; odd <= 10; odd++) {
			System.out.println(odd);
			odd++;
		}

		System.out.println("------------");
		// even numbers-----using % operator
		for (int even1 = 2; even1 <= 10; even1++) {
			if (even1 % 2 == 0) {
				System.out.println(even1 + "is even number");
			}
		}
		
		
		System.out.println("------------");
		// odd numbers-----using % operator
		for (int odd1 = 1; odd1 <= 10; odd1++) {
			if (odd1 % 2 != 0) {
				System.out.println(odd1 + "is odd number");
			}
		}
		

		System.out.println("--------");
		//
		for (byte b = 1; b <= 50; b++) {
			System.out.println(b);
		}

		System.out.println("-----------");

		//
		for (float h = 1.0f; h <= 5.5;) {
			System.out.println(h);
			h = h + 0.1f;
		}

		System.out.println("-----------");
		// a to z
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}

		System.out.println("-----------");

		// A to Z
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}

		System.out.println("-----------");

		// 0 to 1
		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}

		System.out.println("-----------");

		//
		for (char ch = 97; ch <= 122; ch++) {
			System.out.println(ch);
		}

		System.out.println("-----------");

		//
		for (char ch = 'z'; ch >= 'a'; ch--) {
			System.out.println(ch);
		}

		System.out.println("-----------");

		//
		for (char ch = 122; ch >= 97; ch--) {
			System.out.println(ch + "=" + (byte) ch);
		}

		// use cases for -- for loop
		// Ex:
		// static dropdown: month -1 to 12
		// Arrays -- fixed size
		// Footers -- static
		System.out.println("-----------");

		for (int d = 0; d <= 10; d++) {
			System.out.println("Hello world" + "= " + d);
		}

		System.out.println("-----------");

		// 10 to 1 -- for loop
		for (byte h = 10; h >= 1; h--) {
			System.out.println(h);
		}

		System.out.println("-----------");

		//10 to 1 -- while
		int u = 10;
		while (u >= 1) {
			System.out.println(u);
			u--;
		}
		
		System.out.println("-----------");

		//do-while:Statement is printed atleast once whtether condition is T or F
		//1 to 10:
		int d =1;
		do {
			//d++;
			System.out.println(d);
			d++;
			//break;
		}while(d<=10);
		
		//use cases:
		//element: is already present on the page -- click on it and come out
		
		
	}

}
