package javaassignments;

public class IncrementDecrementAssignments {

	public static void main(String[] args) {
    
		//1.
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

		
		//2
       int a= 11, b=22, c;
       c = a + b + a++ + b++ + ++a + ++b;
       System.out.println(c);
       System.out.println(a);
       System.out.println(b);
       
       //3
       int i1 =0;
       i= i1++ - --i1 + ++i1 - i1--;
       System.out.println(i1);
       
       //4
//       boolean b2= true;
//       b2++;
//       System.out.println(b);
       //cannot posible to convert from boolean to int
       
       //5
       int m = 1, n= 2, p = 3;
       int q = m-- - n-- - p--;
       System.out.println("m=" +m);
       System.out.println("n=" +n);
       System.out.println("p=" +p);
       System.out.println(q);
       
       //6
       int g= 1, h =2;
       System.out.println(--h - ++g + ++h - --g);
       System.out.println(g);
       System.out.println(h);
       
       //7
       int i3 = 19, j = 29, k = 0;
       int m1 = i3-- - j-- - k--;
       System.out.println("i3="+i3);
       System.out.println("j="+j);
       System.out.println("k="+k);
       System.out.println(m1);
       
       //8
//       int x = 11;
//       int y = --(x++);
//       Invalid Arguement
       
       int x1 = 0 , y1 =0;
       int p1 = --x1* --y1*y1--*x1--;
       System.out.println(p1);
       System.out.println(x1);
       System.out.println(y1);
       
       
       //9
       int x2 = 1;
       int x3 = x2++ + ++x2 * --x2 - x2--;
       System.out.println(x3);
       System.out.println(x2);
       
       //10
//       int a5 = 11++;
//       System.out.println(a5);
//       Invalid Arguement
       
       //11
       int ch = 'A';
       System.out.println(ch);
       System.out.println(ch++);
       System.out.println(++ch);
       System.out.println((char)++ch);
       
       //12
       float d = 1.5f, D = 2.5f;
       System.out.println(d++ + ++D);
       
       //13
       int x = 5;
       System.out.println(x++ + ++x);
       System.out.println(x);
       
	}
	

}
