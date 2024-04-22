package MapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		

		// k,v
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();

		empMap.put("Tom", 101);
		empMap.put("Tom", 200);

		System.out.println(empMap.size());

		System.out.println(empMap.get("Tom"));

		empMap.put("lisa", 300);
		System.out.println(empMap.get("lisa"));

		// non order based collection
		HashMap<String, String> empData = new HashMap<String, String>();

		empData.put("Tom", "SDET1");//k-v pair --> entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");
		empData.put(null, "QA");
//		empData.put("Usha", null);
//		empData.put("Prateek", null);
//		 empData.put(null, null);
		
		empData.remove("Naveen");
		
		//empData.remove("Lisa", "SDET4");
		boolean flag =empData.containsKey("Naveen");
	
		System.out.println(flag);
		
		
		
				
//		System.out.println(empData.get("Naveen"));
//		System.out.println(empData.get(null));
//		System.out.println(empData.size());
		
		System.out.println(empData);

		// null keys = 1
		// null values = multiple

		// k=Tom
		// V -> ArrayList

//		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Pune");
//		list.add("India");
//		
//		map.put("Tom", list);
//		System.out.println(map.get("Tom"));

//	  for(Map.Entry<String, String> Guna : empData.entrySet() ) {
//	      System.out.println(Guna.getKey()+":"+Guna.getValue());
//	}
//
//	  System.out.println("------");
//	
//	//foreach method:
//	  //Here we cannot perform any operations
//	empData.forEach((k,v) -> System.out.println(k + ":" + v));
}
}
