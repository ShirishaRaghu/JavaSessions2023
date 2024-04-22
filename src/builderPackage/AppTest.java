package builderPackage;

//caller class
public class AppTest {

	//called method/user
	public static void main(String[] args) {
	
		//Only one obj is created 
		//every current class is pointing towards same obj using this keyword
		EcommApplication app = new EcommApplication();
		//Here one object is created -- with all the methods
		//One by one all the methods are called within the object
		
		
		app.login("naveen", "naveen123")
		       .search("Apple Macbook Pro")
		          .addToCart("Apple Macbook Pro")
		                .payment("6456476578")
		                  .payment("576576476", 123)
		                    .getOrderId()
		                       .logout();

		System.out.println("---------");
		//
		app.login("naveen", "naveen123")
		      .search("tshirt")
		        .logout();
		
		System.out.println("---------");
         app.login("vendor", "vendor123")
               .search("samsung", "white", 1000)
                   .addToCart("samsung")
                      .payment("142543514358")
                         .getOrderId()
                            .logout();
         
         System.out.println("----------");
         app.login("naveen", "naveen123")
               .logout();
         
         System.out.println("----------");

         app.login("naveen", "naveen123");
         
         
         System.out.println("----------");

         app.logout();
         
         app.login("naveen", "naveen123")
                 .search("Apple Macbook Pro")
                     .search("Iphone 14")
                       .search("Hp")
                          .logout();
         
         //number of work flows are written to test
         //this is only for testers
         //users will not see
	}

}
