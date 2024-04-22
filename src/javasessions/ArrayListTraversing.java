package javasessions;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {

		ArrayList<String> footerLinksList = new ArrayList<String>();
		footerLinksList.add("Login");
		footerLinksList.add("Register");
		footerLinksList.add("Forgot pwd");
		footerLinksList.add("Wish List");

		System.out.println(footerLinksList.size());
		System.out.println(footerLinksList);

		System.out.println(footerLinksList.get(0));
//		System.out.println(footerLinksList.get(4));//IndexOutOfBoundsExpection
//		System.out.println(footerLinksList.get(-1));//IOB

		// to print all the values of arraylist: for loop:

		
		// index loop:
		for (int i = 0; i <= footerLinksList.size() - 1; i++) {
			System.out.println(footerLinksList.get(i));
		}

		System.out.println("-------");
		
		//for each
		for(String e : footerLinksList) {
			System.out.println(e);
		}
		
		
		//
		ArrayList<String> pageList = new ArrayList<String>();
		//maitains order: order based AL
		//duplicate values are allowed
		pageList.add("Login");
		pageList.add("Register");
		pageList.add("Forgot pwd");
		pageList.add("Wish List");
		
		//Add -- Data is adding
		pageList.add(0, "contact us");
		System.out.println(pageList);
		
		pageList.add(5, "Details");
		pageList.add(6, "Details");

		//pageList.add(8, "Details");//IOB

		//Replacing data--
		pageList.set(1, "Forgot pwd");
		
		//Remove-- Shift the data upwards
		pageList.remove(2);
		
		System.out.println(pageList);


	}

}
