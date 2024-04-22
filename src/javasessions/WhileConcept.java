package javasessions;

public class WhileConcept {

	public static void main(String[] args) {

		// 1 to 10;
		// 1. while

		int i = 1;// start--initialization
		while (i <= 10) {// condition
			System.out.println(i);// statement
			// i++;
			++i;
			// i = i+1;
			break;
		}
		System.out.println(i);

		while (true) {
			System.out.println("welcome to Hotel Taj");
			break;
		}

		System.out.println("---------");

		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			if (p % 5 == 0) {
				System.out.println("Hi");
				// break;
				++p;
			}
			p++;
			// break;
		}

		//
		boolean flag = true;
		while (!flag) {
			System.out.println("Hello");
		}

		int total = 60;
		while (total >= 50 && total <= 100) {
			System.out.println("Testing");
			total--;
			System.out.println(total);
			// break;

		}

		// use cases of while:When the iterations are not fixed
		// 1.lazy loading: LinkedIn, Swiggy, FB
		// 2.pagination: 1 2 3 4 5 ..20....100
		// 3.page loading:10,20,40,100
		// 4.element is getting displayed on the page:10,20.....100
		// 5.carousel:
		// 6.calendar:
		 

	}
}
