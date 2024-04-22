package javasessions;

public class IncrementalDecrementalPractice {

	public static void main(String[] args) {
	
		int a = 11, b= 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		
		int i = 0;
		int j = i++ - --i + ++i - i--;
		System.out.println(j);
		System.out.println(i);
		
		//we cant apply on boolean ++
		
		int p=19, q=29, r=0;
		int m = p-- - q-- - r--;
		System.out.println("p=" + p);
		System.out.println("q=" + q);
		System.out.println("r=" + r);
		System.out.println(m);
		
		float f1 = 1.1f;
		float f2 = f1++;
		System.out.println(f1);//2.1
		System.out.println(f2);//1.1
		
		char ch ='a';
		System.out.println(++ch);//b
		System.out.println((int)++ch);//99
		
		

	}

}
