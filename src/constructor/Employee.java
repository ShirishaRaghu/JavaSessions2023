package constructor;

public class Employee {

   String name;
	int age;
	double salary;
	boolean isActive;
	char gender;

	// constr -- name will be same as class name
	// constr -- can not return anything/no void also/no return type
	// constr -- allways Non static
	// constr -- can be overloaded
	// constr -- will be called when you create the object of the class
//constr -- stored in class loader space -- auxiliary space
	//Auxiliary -- overall space taken by program
	
	
	//Right click - source - generate constructor field 
 
	//purpose of constr----s
	//Is used for initializing the class variables with constr.... local variables this keyword
	//Is used to retrict the objet creation - depends on use case
	//Is used for initialization purpose only not for business logic
	//But function is used for buss logic, which may or not return
	//Function can called be multiple time but but constructor
	//will be called only when object is created
	
	
//	public Employee() { // 0 param -default const
//		System.out.println("emp - default constr....");
//	}
//
//	public Employee(int i) { // 1 param
//		System.out.println(i);
//	}
//
//	public Employee(int i, String s) { // 2 params
//		System.out.println(i + s);
//	}

	public Employee(String name, int age) {
		//calling a constructor -- should be the first statement
		//It will just update the extra variables
		this("testing", 24,10);
		// this.global variable = local variable
		this.name = name;
		this.age = 2;
	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		
		getInfo();//no need to create object
		Employee.setInfo();//static method calling 
	}
	
	//NS
	public void getInfo(){
		System.out.println("Getting info");
		printInfo();//NS-NS----Directly
	}
	
	public  void printInfo(){
		System.out.println("print infoo");
		setInfo();//calling a static function -- NS -- Static
	}

	public static void setInfo(){
		System.out.println("set infoo");
		
	}

	public static void main(String[] args) {
//The movement you create the object constructor will be called
		// Employee e1 = new Employee();//default constr

		Employee e1 = new Employee("naveen", 10);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		e1.getInfo();


		Employee e2 = new Employee("Huna", 45, 12.33);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
	}

}
