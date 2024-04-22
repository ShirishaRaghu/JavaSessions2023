package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringConcept {

	public static void main(String[] args) {

		String str = "This is my java code and i am so happy i am expert";

		System.out.println(str.length());
		// li=0
		// hi=37
		// len= hi+1
		// hi=len-1
		
		for(int i=0;i<=str.length()-1;i++) {
			String c = (str.charAt(i)+" "+i);
			if(c.contains("i")) {
				System.out.println(c);
				//i++;
			}
			
		}

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
		// System.out.println(str.charAt(38));//SIOB
		// System.out.println(str.charAt(-1));//SIOB
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("expert"));

		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("i"));// 1st occurrence of i

		System.out.println(str.indexOf("i", str.indexOf("i") + 1));// 2nd occurrence of i

		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i") + 1) + 1));// 3rd occurrence

     	System.out.println(str.indexOf("i",
     			str.indexOf("i", 
     					str.indexOf("i", 
     							str.indexOf("i") + 1) + 1)+1));//4th occurrence

		String mesg = "this is my java code";
		
		System.out.println(mesg.indexOf("java"));
		System.out.println(mesg.indexOf("python"));//If something is not there  gives -1
		System.out.println(mesg.indexOf("Java"));//case sensitive - -1
		
		
		String m = "Welcome null";
		if(m.indexOf("admin") == 8) {
			System.out.println("correct mesg");
		}
		else {
			System.out.println("incorrect mesg");
		}
		
		if(m.indexOf("admin") == -1) {
			System.out.println("incorrect mesg - FAIL");
		}
		
		//trim -- remove corner spaces
		String test = "     hello world    ";
		System.out.println(test.trim());

		
		//
		String dob = "01-01-1990";//01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		
		String top = "    hello    world    ";//helloworld
		//System.out.println(top.replace(" ", ""));//replacing one by one space with nothing
		System.out.println(top.replaceAll(" ", ""));
		
		String mg = "Java Python Ruby";
		//System.out.println(mg.replace(" ", "||"));
		System.out.println(mg.replaceAll(" ", "||"));
		
		System.out.println(mg.replace("Java", "JS"));
		
		
		//split -- Always return an String Array
		String pop = "javascript;python;java;ruby";
		String[] p=pop.split(";");
		System.out.println(p[0]);
		System.out.println(Arrays.toString(p));
		
		String rest = "xXHelloSeleniumxxXPythonXxXAutomationXxXLabs";
		
		String[] rs =rest.split("xX");
		System.out.println(rs[0].length());
		System.out.println(rs[1]);
		System.out.println(Arrays.toString(rs));
		
		//
//		for(int i=0;i<=rest.length()-1;i++) {
//			System.out.println(rs[i]);
//				}
//		System.out.println(rs.length);
		
		
		String empData = "pallavi||sharma||30||pune||India";
		System.out.println(empData.replace("||", "."));//pallavi.sharma.30.pune.India
		
		
		
//		String[] rs1 = empData.split("\\.");//Add two \\
//		System.out.println(rs1[1]);
		
		
		String name = "Test Automation Labs";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		
		String domain = "    hello     selenium   ";
		String dom = domain.replaceAll("\\s+", "");//Regular expression -- //s+ -- s--space, + -- More than one space
		System.out.println(dom);
		
		String t1 = "your order id is 12345";
		String orderId = t1.replaceAll("\\D+", "");//D -- Numeric value
		System.out.println(orderId);
		
		String t2 = "your user id is 9090 and order id is 12345";
//		String newStr = t2.replaceAll("\\D+", "");
//		System.out.println(newStr);
		
		Pattern pattern = Pattern.compile("\\D+");
		Matcher matcher = pattern.matcher(t2);
		
		while(matcher.find()) {
			

			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList());
			for(int i=0;i<=list.size()-1;i++) {
			System.out.println("List"+list.get(i));
			}
					}
		
		String userId = null;
		String oId = null;
		if(matcher.find()) {
			 userId = matcher.group();
			System.out.println(userId);
		}
		
		if(matcher.find()) {
			 oId = matcher.group();
			System.out.println(oId);
		}
		
		System.out.println(userId);
		System.out.println(oId);
		
		
		//
		String tr = "Hello!! this is my value .$123333*";
		String finalValue = tr.replaceAll("[^a-zA-Z0-9\\s.]", "");
		System.out.println(finalValue);
		
		
	}

}
