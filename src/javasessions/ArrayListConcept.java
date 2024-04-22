package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList -- class: default : Dynamic Array

		// Create the object of ArrayList: new keyword

		ArrayList ar = new ArrayList();// pc=0, vc=10
		ar.add(100);// 0 vc=9, pc=1
		ar.add(200);// 1

		System.out.println(ar);

		System.out.println(ar.size());

		ar.add(300);// 2
		ar.add(400);// 3

		System.out.println(ar.size());

		ar.add(500);// 4
		ar.add(600);// 5

		ar.remove(2);
		System.out.println(ar.size());
		// duplicate values are allowed

		ar.add(400);
		ar.remove(0);
		System.out.println(ar.size());

		System.out.println(ar);

		ar.add(12.22);
		ar.add(true);
		ar.add('c');
		ar.add("Naveen");

		System.out.println(ar.size());

		System.out.println(ar);

		// ArrayList is raw type -- can add any type of data
		// Generics cannot be primitive type : int -> Integer ,float -> Float only
		// wrapper classes are allowed

		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(1200);

		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Duptoi");
		empNamesList.add("Guptoi");
		empNamesList.add("Kuptoi");
		empNamesList.add("Tuptoi");
		empNamesList.add("wuptoi");

		System.out.println(empNamesList);
		System.out.println(empNamesList.size());

		empNamesList.add("fupti");
		System.out.println(empNamesList);

		empNamesList.remove(1);

		System.out.println(empNamesList);

		// emp info: name, age, salary, isactive, gender
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Rahul");
		empDataList.add("Rahul");
		empDataList.add(30);
		empDataList.add(50.33);
		empDataList.add(true);
		empDataList.add('e');
		empDataList.add(null);
		empDataList.add(null);

		System.out.println(empDataList);
		System.out.println(empDataList.size());

		ArrayList list = new ArrayList(5);
		// 0 1 2 3 4
		// vc=0, pc=5
		// pc/2=5 5/2=2
		// vc = 2

		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "forefox", "edge"));
		System.out.println(browserList.size());

		browserList.add("IE");
		browserList.add("NAVEEN");
		System.out.println(browserList.size());
		System.out.println(browserList);
		System.out.println(browserList.size());
		System.out.println(browserList.get(1));
		System.out.println(browserList.indexOf("forefox"));

		// indexOf -- Will give -1 if that string is not present in ArrayList
		System.out.println(browserList.indexOf("naveen"));// -1

		if (browserList.indexOf("naveen".toLowerCase()) == -1) {
			System.out.println("plz pass the right browser");
		}

		System.out.println(browserList);
		// browserList.removeAll(browserList);
		System.out.println(browserList);// empty list
		System.out.println(browserList.size());

		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("windows", "linux", "mac"));
		browserList.addAll(osList);
		System.out.println(browserList);
		System.out.println(osList);
		osList.remove(2);
//		System.out.println(osList);
		osList.set(0, "PC");
		
		System.out.println("----------");
		
		//browserList.removeAll(osList);
		System.out.println(browserList);
		
		osList.add(0, "unix");
		System.out.println(osList);//[unix, windows, linux, mac]
		
		osList.set(0, "naveen");
		System.out.println(osList);//[naveen, windows, linux, mac]

		osList.add("Testing");
		System.out.println(osList);
		
		if(osList.contains("mac")) {
			System.out.println("test PASSED");
		}
		else {
			System.out.println("FAILED");
		}
		
		
		ArrayList<String> subList = new ArrayList<String>(Arrays.asList("windows", "macos"));
	  System.out.println(osList.containsAll(subList)); 
	
	  
	  ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10,49,2,9,8));
	  System.out.println(numList);
	 
	  Collections.sort(numList);
	  System.out.println(numList);
	  
	  Collections.swap(numList, 0, 1);
	  System.out.println(numList);
	  
	  
	  List<String> testList = Collections.emptyList();//empty list ---> immutable(we cannot change)
	  System.out.println(testList.size());
	 //Interview
	  
//	  testList.add("Cypress");//UnsupportedOperationException
//	  System.out.println(testList.size());
	  
	  
	  //characters sorting
	  Collections.sort(osList);
	  System.out.println(osList);
	  
	  ArrayList<String> footerLinksList = new ArrayList<String>();//mutable list
	  footerLinksList.add("keep");
	  
	  
	  
	
	}

}
