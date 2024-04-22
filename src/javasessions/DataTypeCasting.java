package javasessions;

public class DataTypeCasting {

	public static void main(String[] args) {
	
		//byte-short-int-long-float-double
		//Left-right==Widening (Prefer)
		//Right-left==Narrowing
		byte t =10;
		int k=t;
		System.out.println(k);
		
        int p= 150;
        byte q = (byte) p;
        System.out.println(q);
        //Never store hiher data type to lower --we loose data
        
        long l= p;
        System.out.println(p);
        
        long l1 =1000;
        float f1 = l1;
        System.out.println(f1);
        
        float f2 =12.33f;
        float f3 =67.55f;
        long l2= (long) f3;
        System.out.println(l2);
        
        int i1= (int)f2;
        System.out.println(i1);
        
        float f4=800.83f;
        byte b4=(byte) f4;
        System.out.println(b4);
        //Always go for widening
        int i4 =(byte)f4;
        System.out.println(i4);
        
        
        int ch ='a';
        System.out.println(ch);
        
        char c1='b';
        int f11 = c1;//b->98
        System.out.println(f11);
        System.out.println(c1);
        
        int v=97;
        char v1 = (char)v;//97-->a
        System.out.println((int)v1+3);
       
        
        
        
        
        
        
	}

}
