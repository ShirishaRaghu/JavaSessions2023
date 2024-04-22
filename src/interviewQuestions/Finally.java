package interviewQuestions;

public class Finally {



		public static int getMarks(String studentName) {

System.out.println("getting marks for : "+studentName);
		
		if(studentName.equals("rahul")) {
			
			try {
				int i = 9/3;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming");
			}
			finally {
				System.out.println("finally block");
				return 60;
			}
		}
		
		
		else if(studentName.equals("om")) {
			
			try {
				int p = 9/0;
			}
			catch(ArithmeticException e) {
				return 5;
			}
			finally {
				return 8;
			}
			
			
		}
		else if(studentName.equals("naveen")) {
			return 10;
		}
		else  {
			System.out.println("plz pass the right student name.....");
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		
		int m = getMarks("om");
		System.out.println(m);
	}

	

	

}
