package javaassignments;

public class AndOrOperators {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
         if(x>0 && y>0 && x<y && x*2<=y) {
        	 System.out.println("Hi");
         }
         if(x>0 & y>0 & x<y & x*2<=y) {
        	 System.out.println("Hello");
         }
	
         System.out.println("-----------");
	
         int x1 = 5;
 		int y1 = 10;
          if(x1>0 || y1>0 || x1<y1 || x1*2<y1) {
         	 System.out.println("Hi");
          }
          if(x1>0 | y1>0 | x1<y1 | x1*2<y1) {
         	 System.out.println("Hello");
          }
 	}
	
	}
	


