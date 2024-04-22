package StringManipulation;

public class SringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		//immutable
		String tr = "Hello";
		tr.concat("selenium");
		tr.concat("testing");
		System.out.println(tr);
		
		
		//mutable
		StringBuilder sb = new StringBuilder("Hello");//1 - heap , 0 - SCP No object creation with StringBuilder
		sb.append("selenium");
		sb.append("testing");
		System.out.println(sb);
	}

}
