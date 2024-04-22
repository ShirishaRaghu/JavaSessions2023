package StringPrograms;

public class ConvertFirstLetterToUppercase {

	public static String toUppercase(String str) {

		
		if(str == null) {
			System.out.println("null value");
		}
		
		//If str is one character
		if(str.length() == 1) {
			return str.toUpperCase();
		}
		
		String words[] = str.split("\\s");
		String result = "";

		for (String e : words) {
			String first = e.substring(0, 1).toUpperCase();// substring returns end value-1--N
			String restString = e.substring(1);//aveen
			result = result+first+restString+" ";
		}
		//System.out.println(result1);
		return result.trim();
	}

	public static void main(String[] args) {
		String g=ConvertFirstLetterToUppercase.toUppercase("naveen automation labs");
		System.out.println(g);
		
		String h = ConvertFirstLetterToUppercase.toUppercase("naveen");
		System.out.println(h);
		
		System.out.println(ConvertFirstLetterToUppercase.toUppercase("n"));
	}

}
