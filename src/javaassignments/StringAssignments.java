package javaassignments;

public class StringAssignments {

	// 3. Write a program that will  print out the last character and first
	// character of a word.
	public static void firstLastCharacter(String j) {

		// First character
		char c = j.charAt(0);

		// Last Character
		char c1 = j.charAt(j.length() - 1);
		System.out.println("Character at first " + c);
		System.out.println("Character at last " + c1);

	}

	public void reverseName(String name) {
		String rev = "";
		System.out.println("Actual String " + name);
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reversing a string " + rev);
		// return rev;
	}

	public static void main(String[] args) {

		// 1.Write a program to check two different strings equality.

		String a = "Hello world";
		String a1 = "Selenium testing";
		System.out.println(a.equals(a1));

		String s = "Sachin";
		String s1 = "SACHIN";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));

		System.out.println("----------");
		// 2.Remove all  spaces in a String
		String hell = "    Hello    Everyone    ";
		System.out.println(hell.replaceAll(" ", ""));
		String k = "     Everyone     Hello     ";
		System.out.println(k.replaceAll("\\s+", ""));

		System.out.println("----------");
		// 3
		String j = "Walnut And Almond";
		firstLastCharacter(j);

		System.out.println("----------");
		// 4.Write a program to verify a word or a character contained in the sentence.

		String k1 = "Welcome to my Testing";
		char c2 = 'w';
		String str = "Welcome";

		boolean charFound = false;
		for (int i = 0; i <= k1.length() - 1; i++) {
			if (k1.charAt(i) == c2) {
				charFound = true;
				break;
			}

		}
		if (charFound) {
			System.out.println("Character " + c2 + " is present");
		} else {
			System.out.println("Character is not present");
		}

		if (k1.indexOf('e') == -1) {
			System.out.println("Word is not present");
		} else {
			System.out.println("Word is present");
		}

		System.out.println("-----------");
//5.Write a function/ method to reverse your own name.

		String g = "Sirisha";
		String result = "";
		for (int i = g.length() - 1; i >= 0; i--) {
			result = result + g.charAt(i);
		}
		System.out.println(result);

		System.out.println("-------By calling a method--------");

		// By calling a method
		StringAssignments obj = new StringAssignments();
		obj.reverseName("Sirisha");
		System.out.println("------------By StringBuffer Class reverse-----------");

		// using Stringbuffer class
		StringBuffer sc = new StringBuffer(g);
		System.out.println(sc.reverse());

		System.out.println("------Using array------");
		// using array
		char a2[] = g.toCharArray();
		String rev = "";
		for (int i = g.length() - 1; i >= 0; i--) {
			rev = rev + a2[i];
		}
		System.out.println(rev);

		System.out.println("-----------3rd position of  e----------");

		// 7.Write a program to get the 3rd  “ e “ of the string .

		String position = "Welcome to NaveenAutomation Labs";

		System.out.println(position.indexOf("e")); // first occurrence
		System.out.println(position.indexOf("e", position.indexOf("e") + 1));// second occurrence
		System.out.println(position.indexOf("e", position.indexOf("e", position.indexOf("e") + 1) + 1));// third
																										// occurrence
		System.out.println(
				position.indexOf("e", 
						position.indexOf("e", 
								position.indexOf("e", 
										position.indexOf("e") + 1) + 1) + 1));//fourth occurrence
		
		//We can store in int variable everytime and we can print
		//But unneccessary taking 4 bytes
		
		

	}

}
