package javapractise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise {

	public static void main(String[] args) {
		ArrayList<String> browserList = new ArrayList<>(Arrays.asList("chrome", "forefox", "edge"));
		System.out.println(browserList);
		System.out.println(browserList.size());
		
		browserList.add("IE");
		System.out.println(browserList);
		
		String f = browserList.get(2);
		System.out.println(f);
		
		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("windows", "linux", "mac"));
		browserList.addAll(osList);
		
		System.out.println(browserList);
		
		osList.remove(1);
		System.out.println(osList);
		
		System.out.println(browserList);
		
		osList.add("uf");
		System.out.println(osList);
		
		System.out.println(browserList);

	}

}
