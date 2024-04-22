package javaassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysListAssignments {

	public static void main(String[] args) {
		
		
		//1. Write a Java program to create a new array list, which contains all color names.
		//  --add some colors (string) 
		//---and print out the colorslist using loops.
		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Green", "Blue", "Red" , "White", "yellow" ,"Orange"));
		colors.add("Black");
		colors.add("Brown");
		colors.add("Green");
		colors.add("White");
		
		System.out.println(colors);
		System.out.println(colors.size());
		
		for(int i=0;i<=colors.size()-1;i++)
		{
			System.out.println(colors.get(i));
		}
		
		System.out.println("---------");
		
		//2. Write a Java program to retrieve an element at a specified index from a given array list.

		String vg = colors.get(2);
		System.out.println(vg);

		System.out.println("-------");
		
		//3. Write a Java program to update specific array element by given element.
		
		colors.set(3, "Pink");
		//set -->returns the previous element(Before updating)
		System.out.println(colors);
		
		System.out.println("-------");
		
		
		//4. Write a Java program to remove the third element from an array list. 
		colors.remove(2);
		System.out.println(colors);
		
		System.out.println("--------");
		
		//5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
        //String searchColor = "Orange";
		

        for(int i1=0;i1<=colors.size()-1;i1++){
        	 System.out.println(colors.get(i1));
        	
        	if(colors.get(i1).equals("Orange")) {
        	System.out.println("Found orange");
        	break;
        	}
        	
        }
        
        System.out.println("--------Reverse the Array List-------");
        //6.. Reverse this array List:
        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Naveen");
        studentNames.add("Mahi");
        studentNames.add("shiva");
        studentNames.add("Divya");
              
        
        Collections.reverse(studentNames);
        System.out.println(studentNames);
        for(int i=0;i<studentNames.size();i++) {
        	System.out.println(studentNames.get(i));
        }

        
        System.out.println("-------Extract a portion-------");
        //7.Write a Java program to extract a portion of an array list.
        ArrayList<Object> empDetails = new ArrayList<Object>(5);
        empDetails.add("Rahul");
        empDetails.add(23);
        empDetails.add("Pune");
        empDetails.add(34.555);
        empDetails.add("Male");
        empDetails.add(true);
        
        System.out.println(empDetails);
        ArrayList<Object> portion = new ArrayList<Object>(empDetails.subList(1, 4));
        System.out.println(portion);
        
        System.out.println("-------Empty an ArrayList------");
        
        //8. Write a Java program to empty an array list
        ArrayList<String> friends = new ArrayList<String>(Arrays.asList("Guna", "Fuda", "Hema", "Krupa"));
        System.out.println(friends);
        System.out.println(friends.size());
        
        friends.clear();
        System.out.println(friends);
        
        System.out.println("-------trim ");
        
        //9.Write a Java program to trim the virtual capacity of an array list to the current list size
        ArrayList<Integer> numbers = new ArrayList<>(10);
        numbers.add(23);
        numbers.add(34);
        numbers.add(65);
        numbers.add(78);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.trimToSize();
        System.out.println(numbers);
        
        
        System.out.println("--------Print all elements-------");
        //10. Write a Java program to print all the elements of an ArrayList using the position of the elements
        
        ArrayList<String> colors1 = new ArrayList<String>();
        colors1.add("Blue");
        colors1.add("Green");
        colors1.add("Purple");
        colors1.add("Yellow");
        
        for (int i = 0;i<=colors1.size()-1;i++) {
        	System.out.println("Element at index  "+ i +" is "+ colors1.get(i));
        }
	}

}
