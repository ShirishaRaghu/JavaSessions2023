package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(10/2);
	System.out.println(9/2);//4
	//to get any float value as output we have to declre f
	System.out.println(9/2.0);
	//we can declare any one value as floating number
	System.out.println(9/2f);
	
	System.out.println(9.0/2);//4.5
	System.out.println(12.33/4);
	
	//System.out.println(9/0);//exception
	//number divided by zero--exception
	System.out.println(0/9);//0
	System.out.println(0/6.7);//0.0
	//System.out.println(0/0);//exception
	
	//If floating number divided by zero --Infinity
	System.out.println(9.0/0);//Infinity
    System.out.println(9/0.0);//Infinity
	System.out.println(9.0/0.0);//Infinity
	
	System.out.println(0.0/0.0);//NaN(Not a Number)
	System.out.println(0/0.0);//NaN
	System.out.println(0.0/0);//NaN
	
	//System.out.println(0/0);//Exception
	
	System.out.println('a'+'a');
    System.out.println('a'+0);//97/0--Exception
    
    System.out.println(0/'a');//0
    
    System.out.println(10%2);
    System.out.println(9%2);
    System.out.println(100%3);
    
    System.out.println(15%2);
    System.out.println(9.2%2);
    
    System.out.println(0%2);
   //System.out.println(2%0);//exception
    
    System.out.println(2%10);//2
    System.out.println(5%9);//5
    System.out.println(8%10);//8
    
    System.out.println("Hi I love Java coding");
    //Hi I love "Java" coding
    
    System.out.println("Hi I love \"Java\" coding");
    //escaping java code--adding forward slash
    
	
	
	
	
	}

}
