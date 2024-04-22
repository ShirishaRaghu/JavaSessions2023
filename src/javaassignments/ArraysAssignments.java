package javaassignments;

import java.util.Arrays;

public class ArraysAssignments {

	public static void main(String[] args) {
		
		
		//1.WAP to delete a specific number from the given array
		int p[] = {1,4,5,2,3,22,31,2};
		   int[] a = new int[p.length-1];
		
		int j = 0;
		for(int i=0;i<=p.length-1;i++) {
			if(p[i]  !=   22) {
				a[j] = p[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(p));
		
		
		//2.Write a program to create a static Array, having following cricket data:
		//   --name, age, team name, DOB, gender, Strike Rate
		//      --Try to create multiple Object Arrays for different players 
		//   --Try to print all the values of each player on the console


		Object crickterData[] = new Object[6];
		//crickterData[0] = "Goel";//null
		crickterData[1] = 45;
		crickterData[2] = "Bangalore";
		crickterData[3] = 4/2/2000;
		crickterData[4] = "Male";
		crickterData[5] = 76;
		//crickterData[6] = 'y';//AIOB
		

		
		System.out.println(Arrays.toString(crickterData));//[Goel, 45, Bangalore, 0, Male, 76]
		System.out.println(crickterData.length);//6
		System.out.println(crickterData);//[Ljava.lang.Object;@379619aa

		Object crickterData1[] = {"Huol", 85, "mysore", "4/10/2000", "Female",  86};
//		crickterData1[0] = "Huol";
//		crickterData1[1] = 85;
//		crickterData1[2] = "mysore";
//		crickterData1[3] = "4/10/2000";
//		crickterData1[4] = "Female";
//		crickterData1[5] = 86;

		System.out.println(Arrays.toString(crickterData1));
		
		
		
				
	}

}
