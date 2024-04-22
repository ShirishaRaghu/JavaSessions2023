package javaassignments;

import java.util.Arrays;

public class StringAssignment2 {

	public static void main(String[] args) {

		// 9. Write a program that breaks a whole string into small strings, and prints
		// out its all values . (Hint: split, loop) .

		String str = "Hello to this world";
		String[] splitStr = str.split(" ");
		System.out.println(Arrays.toString(splitStr));
		for (int i = 0; i <= splitStr.length - 1; i++) {
			System.out.println(i + " " + splitStr[i]);
		}

		// 11.get only numeric part from this String:
		String s = "Your Transaction ID is: 12345 and reference ID is 34567";
		// String transactionID=s.replaceAll("\\D+", "");
		String transactionID = s.replaceAll("[^0-9]", "");
		System.out.println(transactionID);
		
		
		//3.Write a program that will  print out the last character and first character of a word.

		String c = "Welcome";
		System.out.println(c.charAt(0));
		System.out.println(c.charAt(c.length()-1));
		
		//Converting String to char array
		char[] ch = c.toCharArray();
		System.out.println(ch[0]);
		System.out.println(ch[ch.length-1]);
		
		
		String d = "this is to convert first letter of word to uppercase";
		String[] sp=d.split("\\s");
		String result = "";
		
		for(int i=0;i<=sp.length-1;i++) {
		
		}
//		System.out.println(Arrays.toString(sp));
//		System.out.println(sp.length);
	    
		
		
		


		// 10.Assume that a string consists of 3 words, print out the middle one.
//		String h = "Hello Selenium Testing";
//       for(int i=0;i<=h.length()-1;i++) {
//    	 char  spiltWords =h.charAt(i);
//    	 System.out.println(spiltWords.t)
//       }
      
	}

}
