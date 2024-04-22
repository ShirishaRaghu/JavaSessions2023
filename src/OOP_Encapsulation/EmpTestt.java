
package OOP_Encapsulation;

public class EmpTestt {

	public static void main(String[] args) {
	
//		Employee e1 = new Employee();
//		e1.setName("Gaurav");
//		e1.setAge(26);
//		e1.setSalary(1000);
		//e1.dob="14-7-1993";
		System.out.println("-------");
		
		Employee e1=new Employee("Gaurav",26,1000);
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary());
		
		//update code
		e1.setAge(30);
		e1.setSalary(3000);
		
		
		
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary());

		Employee e2 = new Employee("shiva",23,8999,true);
		System.out.println(e2.getName()+" "+e2.getAge()+" "+e2.getSalary());
		e2.setSalary(2000000);
		System.out.println(e2.getName()+" "+e2.getAge()+" "+e2.getSalary());

		
		System.out.println("--------");
		//
		Browser br = new Browser();
		br.launchBrowser();
	}

}
