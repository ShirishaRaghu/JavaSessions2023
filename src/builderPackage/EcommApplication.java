package builderPackage;

public class EcommApplication {

	//no default const.....is written --> java will add one default const
	//This default cons will be added, when we don't create our own cont
	//This is because to create obj in other class
	
	public EcommApplication login(String un, String pwd) {
		System.out.println("logged in with:" + un + pwd);
	    //Returning current class object
		return this;
	}
	
	public EcommApplication login(String un, String pwd, String role) {
		System.out.println("logged in with:" + un + pwd + role);
		 return this;
	}

	public EcommApplication search(String productName) {
		System.out.println("search : "+productName);
		 return this;
	}
	
	
	public EcommApplication search(String productName, String color) {
		System.out.println("search : "+productName+color);
		 return this;
	}
	
	public EcommApplication search(String productName, String color, int price) {
		System.out.println("search : "+productName+color+price);
		 return this;
	}
   public EcommApplication addToCart(String productName) {
	   System.out.println("add to cart: "+productName);
	   return this;
   }
   
   public EcommApplication payment(String upi) {
	   System.out.println("making payment via : "+upi);
	   return this;
   }
   public EcommApplication payment(String cc, int cvv) {
	   System.out.println("making payment via cc: "+cc+" "+cvv);
	   return this;
   }
   
   public EcommApplication getOrderId() {
	   System.out.println("order is done....order id is: "+124656);
	   return this;
   }
   
   public EcommApplication logout() {
	   System.out.println("logged out");
      return this;
   }
}
