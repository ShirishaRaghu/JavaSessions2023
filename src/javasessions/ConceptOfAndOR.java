package javasessions;

public class ConceptOfAndOR {

	public static void main(String[] args) {
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = false;
		boolean c4 = false;
		
		//&&(Short circuit operator)
		//short circuit reason :false
		if(c1 && c2 && c3 && c4)//It will check first condition if it is true then goes to second if it is false evaluation stops(short circuit) 
		//In && operator all conditions must be true
		{
			System.out.println("Selenium");
		}
		else {
			System.out.println("Bye");
		}
		
		System.out.println("------------");
		
		//& Operator(bitwise logical operator)
		if(c1 & c2 & c3 & c4 )//It will check all conditions eventhough second condition is false
			//But final result is false(since one false operand in series)
		{
			System.out.println("Selenium");
		}else {
			System.out.println("Bye");
		}
	
		System.out.println("------------");
		
		//|| OrOr operator
		//short circuit reason : true
		if(c1 || c2 || c3 || c4)//In this case it checks c1 if it is true then immediately it print if condition
			//It will not check any second condition(short circuit behaviour)
		{
			System.out.println("Selenium");
		}else {
			System.out.println("Bye");
		}
		
		System.out.println("------------");
		
		//
		if(c1 | c2 | c3 | c4)//In this case it checks c2,c3,c4 eventhoughc1  c1  is true it will not stop
			//useful for logging purpose
		{
			System.out.println("Selenium");
		}
		else {
			System.out.println("Bye");
		}
		
		//&&
		//T T --T
		//T F --F
		//F T --F
		//F F --F
		
		//||
		//T T --T
		//T F --T
		//F T --T
		//F F --F
	}

}
