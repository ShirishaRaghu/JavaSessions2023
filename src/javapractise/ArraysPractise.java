package javapractise;

import java.util.Arrays;

public class ArraysPractise {

	public static void main(String[] args) {
		
		int[] a = new int[4];//first type 
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		System.out.println(a);
		System.out.println(a.length);
		
		int[] a1 = {1,2,3,4};//second type
		System.out.println(a1.length);
		
		
		byte count=0;
		byte p[] = {2,8,23,54};
		for(int e:p) {
			System.out.println("The value at"+count +"="+e);
			count++;
		}
		
		System.out.println("-----------");
		
		for(byte i=0;i<=p.length-1;i++) {
			System.out.println("The value at"+i +"="+p[i]);
		}
		
		
		//
		float f1[] = new float[] {1,2,3,4};//third type
		System.out.println(Arrays.toString(f1));
		
		float f2[] = new float[] {1.0f, 2.0f, 3.0f, 4.0F};
		float f3[]=new float[4];
		f3[0] = 1.0f;
		f3[1] = 2;
		f3[2] = 3.0F;
		f3[3] = 4.0f;
		
		System.out.println(Arrays.toString(f3));
		
		//object
		Object[] obj=new Object[] {"Huji", 22, 'y', true};
		System.out.println(Arrays.toString(obj));
		
		for(int i=0;i<=obj.length-1;i++) {
			System.out.println(obj[i]);
			if(obj[i].equals(22)) {
				System.out.println("Hi");
				break;
			}
		}
		
		System.out.println("------------");
		
		Object obj1[] = new Object[4];
		obj1[0] = "Yuhi";
		obj1[1] = 21;
		obj[2] = 'u';
		obj[3] = "876767565";
		
		System.out.println(Arrays.toString(obj));
		System.out.println("--------");
		
		
		for(Object e:obj) {
		System.out.println(e);
		if(e.equals('u')) {
			System.out.println("Hi");
			break;
		}
	}
		
		//Array literals
		Object studentInfo[] = {"Vijay", 56, "pune", 'm' , "India"};

}
}
