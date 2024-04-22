package MapConcept;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		
		TreeMap<String, String> empData = new TreeMap<String, String>(Collections.reverseOrder());

		empData.put("Tom", "SDET1");//k-v pair --> entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put("Amit", "SDET5");
//		empData.put("arpit", "SDET6");
//		empData.put("ravi", "SDET7");
//		empData.put("1", "SDET8");
//		empData.put("$", "SDET4");
		
//		empData.put(null, "SDET4");//null key is not allowed
		empData.put("Selenium", null);
		
		System.out.println(empData);
		
		System.out.println("----------");
		
		for(Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry.getKey() + ":"+entry.getValue());
		}

		System.out.println("--------");
		
		empData.forEach((k,v) -> System.out.println(k+":"+v));
	}

}
