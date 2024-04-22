package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String -class in java(non primitive)
		
		String s= "hello world";
		String s1= "100";
		String s2= "a";
		
		String x= "Hello";
		String y= "Selenium";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(x+a);//Helo100-cocatenation operator(starts from left to right)
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
		System.out.println(s1+s2);
		System.out.println(x+y+a+b+x+y);
		
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		
		
		double d1 = 12.33;
		double d2 = 32.44;
		System.out.println(x+y+d1+d2);
		System.out.println(x+y+(d1+d2));
		
		System.out.println(a+b+d1+d2+x+y+a+b);
		
		char c = 'a';
		String t = "Hello";
		
		System.out.println(c+t);//aHello
		System.out.println(t+c);//Helloa
		//character can be used without declaration
		System.out.println(t+c+'b');
		System.out.println('a'+'b'+t);//195Hello
		
		System.out.println('a'+'b'+100+t);
		
		int p=100;
		int q=200;
		
		System.out.println("The value of p:"+p);
		System.out.println("The value of p:"+q);
		System.out.println("sum of p and q is:"+ (p+q));
		
		System.out.println('0'+'a'+'A'+p);
		System.out.println("Hello"+'0'+'a'+'A');
		System.out.println('0'+'a'+'A'+"Hello");
		System.out.println('0'+'a'+'A'+"Hello"+'g');
	
		System.out.println(1*1*10/2+"Hello");
		
		String s21 ="Hello";
		char c1 = 't';
		System.out.println(s21+(byte)c1);
		System.out.println('0'+'h'+s21+'0'+'c');

	}
}