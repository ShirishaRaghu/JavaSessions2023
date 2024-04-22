package javaassignments;

public class LoopsAssignments {

	public static void main(String[] args) {

		// 1.Print "I am Batman" for five times
		for (byte i = 0; i < 5; i++) {
			System.out.println("I am Batman");
		}

		System.out.println("---------");

		// 2.Print "I am Batman1" for Nine times
		for (int y = 1; y <= 9; y++) {
			System.out.println("I am Batman" + y);
		}

		System.out.println("---------");

		// 3.Print 10 to 1 using for, while and do-while loop
		for (int u = 10; u >= 1; u--) {
			System.out.println(u);
		}

		System.out.println("----------");

		// while
		int t = 10;
		while (t >= 1) {
			System.out.println(t);
			t--;
		}

		System.out.println("----------");

		// do while
		int t1 = 10;
		do {
			System.out.println(t1);
			t1--;
		} while (t1 >= 1);

		System.out.println("----------");

		// 4.Program to print "Hello World" ten times using while loop
		byte g = 0;
		while (g <= 10) {
			System.out.println("Hello World");
			g++;
		}

		System.out.println("----------");

		// 5. Print all the multiplication of 5 from 1 to 100 using while /for/do-while
		int j = 0;
		while (j <= 100) {
			if (j % 5 == 0) {
				System.out.println(j);

			}
			j++;
		}

		System.out.println("----------");

		// for
		for (int j1 = 0; j1 <= 100;) {
			if (j1 % 5 == 0) {
				System.out.println(j1);
			}
			j1++;
		}

		System.out.println("----------");

		// do while
		int j2 = 0;
		do {
			if (j2 % 5 == 0) {
				System.out.println(j2);
			}
			j2++;
		} while (j2 <= 100);

		System.out.println("----------");

		// 6.Print all odd and even numbers between 1 to 100
		for (int c = 1; c <= 100; c++) {
			if (c % 2 == 0) {
				System.out.println(c + " is even number");
			} else if (c % 2 != 0) {
				System.out.println(c + " is odd number");
			}
		}

		System.out.println("----------");

		// 7.Output of this program
//		int i =1;
//		while(i<=1) {
//			System.out.println("Hi Java");
//		}----Infinite "Hi Java"

		System.out.println("----------");

		// 8.Print A-Z, a-z, 0-9 with respective ASCII numbers the console one using
		// while and for loop
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.println((int) a + "is the value of" + a);
		}

		System.out.println("----------");

		// while
		char c2 = 'A';
		while (c2 <= 'Z') {
			System.out.println((int) c2 + " is the value of" + c2);
			c2++;
		}

		System.out.println("----------");

		// 9.9. Print the following series: 
		// 1.0 2.0 3.0  ...... 10.0 
		// 0 9 18 27 36 …99

		for (float k = 1; k <= 10; k++) {
			System.out.println(k);
		}

		System.out.println("----------");

		for (byte j1 = 0; j1 <= 99; j1++) {
			if (j1 % 9 == 0) {
				System.out.print(j1 + ",");
			}
		}

		System.out.println("----------");

		// 10.Print only vowels (aeiou) using for and while loop. Start the loop from
		// ‘a‘ to ‘z‘
		for (char g1 = 'a'; g1 <= 'z'; g1++) {
			if (g1 == 'a' || g1 == 'e' || g1 == 'i' || g1 == 'o' || g1 == 'u') {
				System.out.println(g1 + " is vowel");
			}

		}

		System.out.println("----------");

		//
		char j1 = 'a';
		while (j1 <= 'z') {
			if (j1 == 'a' || j1 == 'e' || j1 == 'i' || j1 == 'o' || j1 == 'u') {
				System.out.println(j1 + " is vowel");

			}
			j1++;
		}

		// Print 1 to 10 and break the loop once you find the multiplication of 7 with a
		// message "bye, see you tomorrow"
		for(int u1=1;u1<=10;u1++) {
			System.out.println(u1);
			if(u1%7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
		}
		
		int y=1;
		while(y<=10) {
			System.out.println(y);
		
		if(y%7 == 0) {
			System.out.println("bye, see you tomorrow");
		break;
		}
		y++;
		}
		
	}
}
