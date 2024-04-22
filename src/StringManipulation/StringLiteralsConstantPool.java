package StringManipulation;

public class StringLiteralsConstantPool {

	public static void main(String[] args) {

		String tr = "Hello";// immutable - can not changed
		tr.concat("selenium");
		System.out.println(tr);

		int i = 10;// mutable
		i = i + 20;
		System.out.println(i);

		// String literals
		String s1 = "Hello";// 1 - object - SCP
		String s2 = "Hello";// 0 - duplicate values are not allowed in SCP

		//
		String s3 = new String("world");// 1-heap, 1-SCP(with no reference)

		// One entry for common literals(SCP) - duplicate not allowed
		String s4 = "world";
		String q1 = "World";
		System.out.println(s4.equals(q1));//false
		System.out.println(s4.equalsIgnoreCase(q1));//true
		String s5 = "Hello";

		String s6 = new String("Selenium");// 1 -heap, 1 -SCP
		// GC may applicable for those strings with no reference in SCP

		String s7 = "Selenium";// 0 - object - just assign reference to s6(Selenium)
		String s8 = new String("Selenium");// 1 heap

		System.out.println(s1 == s2);// scp==scp -- true
		System.out.println(s1 == s4);// false -- different values
		System.out.println(s4 == s3);// scp==heap (Compare references) -- false

		System.out.println(s6 == s8);// heap == heap -- false

		System.out.println(s6.equals(s8));// true -- comparing values
		System.out.println("------");
    	System.out.println(s6.equals(s7));
    	System.out.println(s6==s7);
		System.out.println(s4.equals(s3));// true

		//
		String obj = new String("testing");// 1-heap, 1-SCP
		String ob = new String("testing");// 1-heap, SCP-0
		System.out.println(obj == ob);// false -- compare references
		System.out.println(obj.equals(ob));// true -- compare values

		String o = "Testing";
		String p = "testing";
		String q = "testing";
		System.out.println(obj == o);// false
		System.out.println(obj.equals(o));// false
		System.out.println(o == p);
		System.out.println(o.equals(p));// false
		System.out.println(p == q);// true
		System.out.println(obj.equals(p));// true
		System.out.println(obj.equals(o));// false
		System.out.println(obj.equalsIgnoreCase(o));// true

		// After JDK 1.8 SCP is in stack
	}

}
