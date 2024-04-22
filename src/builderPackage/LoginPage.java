package builderPackage;

public class LoginPage {

	//NS -- should not initialize at beginning -- un-necessary all objects will have these values
	String userName;
	String password;
	
	public LoginPage() {
		//this keyword can also be written
		//but we are not comparing anything
		userName="admin";
		password="advi@123";
	}
	
	public LoginPage(String userName, String password) {
	
		this.userName= userName;
		this.password = password;
	}

	//NS --> NS
	public void doLogin() {
		System.out.println("enter username "+ userName);
		System.out.println("enter password "+ password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}
}
