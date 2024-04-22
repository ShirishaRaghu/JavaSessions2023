package builderPackage;

public class Registration {

	String name;
	String tel;
	String pwd;
	
	public void userReg(String name,String pwd, String tel) {
	System.out.println("enter username :" + name);
	System.out.println("enter phone :"+ tel);
	System.out.println("enter pwd :"+ pwd);
	
	//this.global = local;
	//Initialize the values using this keyword
	this.name=name;
	this.tel=tel;
	this.pwd=pwd;
	}
	
	public void getUserInfo() {
		System.out.println(name+" "+tel+" "+pwd);
	}
	
	public static void main(String[] args) {
		Registration reg = new Registration();
		reg.userReg("Sana", "sana@123", "1342452");
		
		reg.getUserInfo();
		
		
		//this keyword -- Interview
		//1. const + this
		//2.  const.. calling
		//3. method + this
		//4. builder pattern --> return this
	}

}
