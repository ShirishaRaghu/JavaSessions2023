package MapConcept;

import java.util.HashMap;

import ExceptionHandling.MyException;

public class UserRole {

	public void doLogin(String un, String pwd) {
		System.out.println("user log in with : "+ un +" - " + pwd);
	}
	
	public void doLogin(String role) {
		String creds = getUserCreds(role);
		String un = creds.split(":")[0].trim();
		String pwd = creds.split(":")[1].trim();
		doLogin(un, pwd);
	
	}
	
	
	private HashMap<String,String> getUserMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:@123");
		userMap.put("seller", "seller:@123");
		userMap.put("vendor", "vendor:@1234");
		userMap.put("partner", "partner:@12390");
		userMap.put("user", "naveen:@1909");
		
		return userMap;
	}
	
	
	private String getUserCreds(String role) {
	
		if(getUserMap().containsKey(role)) {
		return getUserMap().get(role);
		}

		else {
			throw new MyException("ROLE NOT FOUND");
		}
	
		}
		
			

	
	
	
	
	
	public static void main(String[] args) {
		
		
		//Amazon - RBAC - Role based access control
		//UM - IAM
		
		String role = "user";
		UserRole app = new UserRole();
		
		app.doLogin(role);
		
		app.doLogin("sekhar@gmail.com", "skh@123");
		System.out.println("-----");
	    
	}

}
