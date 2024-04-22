package ExceptionHandling;

public class FinallyBlockQuestion {

//try - finally -- yes
	// try -catch -- yes
	// try -- no
	// catch -- finally -- no
	// try -- catch -- finally -- yes
	// try -- try - catch - finally -- no
	// try - catch -- finally -- finally -- no
	//try - catch - catch - catch - catch - finally -- yes

	public static int getMarks(String studentName) {
		System.out.println("getting marks for : " + studentName);

		if (studentName.equals("rahul")) {

			try {
				int i = 9 / 0;
				// System.exit(1);//shut down the JVM
				return 80;
				
				
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 90;
			} finally {
				System.out.println("finally block");
				
				try {
				int i = 9/0;
				}
				catch (ArithmeticException e) {
					System.out.println("finally block exception");
					return 4;
				}
				finally {
					System.out.println("finally inside finally");
					//return 2;
				}
			}
		}

		else if (studentName.equals("om")) {

			try {
				int p = 9 / 0;
				return 60;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 50;
			} finally {
				return 80;
			}

		} else if (studentName.equals("naveen")) {
			return 10;
		} else {
			System.out.println("plz pass the right student name.....");
			return -1;
		}
	}

	public static void main(String[] args) {

		int m = getMarks("rahul");
		System.out.println(m);

		// Finally will always override the previous returns
		// First preference for Finally return
	}

}
