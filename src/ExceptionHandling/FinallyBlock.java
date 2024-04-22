package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("World");
		
		try {
			int i = 9/0;
			System.out.println("selenium");
		}
		catch(ArithmeticException e)
		{
			System.out.println("some exception is coming");
			//e.printStackTrace();
		}
		finally {
			System.out.println("i am in finally block");
		}
		
		System.out.println("Hello");
		
		
		//Finally is mandatory for try
		//Exception is coming or not Finally block will execute

		
		
		//when to use finally block?
		//Close the browser
		
		//make the connection with DB(SQL): username/pwd
		//hit the SQL: select * from Employee;
		
		//try-catch
		//String result=get the results from DB/table
		
		
		//finally{}
		//close the data base connection
		
		
		//use the results in script
		
		//continue code
		//logout
		
		//In case of any exception, if we dint use Finally connection is yhere internally
		
		
	}

}
