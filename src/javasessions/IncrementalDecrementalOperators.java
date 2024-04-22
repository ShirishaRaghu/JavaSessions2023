package javasessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {
		
		//++and--
		
		//1. Post increment
		int a=1;
		int b=a++;
		//first assign value a to b then increment by 1
		System.out.println(a);
		System.out.println(b);
		
		int g = -98;
		int h= g++;
		System.out.println(g);
		System.out.println(h);
		
		int k = -999;
		System.out.println(k++);
		System.out.println(k);
		
		//2.pre increment
		int x= 1;
		int y = ++x;
		System.out.println(x);//2
		System.out.println(y);//2
		
		int p = -99;
		int q = ++p;
		System.out.println(p);//-98
		System.out.println(q);//-98
		
		int total =10;
		System.out.println(++total);//11
		System.out.println(total);//11
		
		//3. post decrement
		int u = 2;
		int r = u--;
		System.out.println(u);
		System.out.println(r);
		
		int s1 = 10;
		System.out.println(s1--);
		System.out.println(s1);
		
		//4. pre decrement--both are decreased
		int m = 2;
		int n = --m;
		System.out.println(m);
		System.out.println(n);
		
		int t1 = -999;
		int t2 = --t1;
		System.out.println(t1);
		System.out.println(t2);

		int m1 = 5;
		int k1 = m1++ + ++m1;
		System.out.println(m1);
		System.out.println(k1);
		
		
	}

}
