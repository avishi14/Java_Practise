package java_file;

public class Employee {

	String name;
	int id;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1= new Employee(1, "Anshuj");
		Employee e2 = new Employee(2, "Prithvi");
		replace(e1,e2);
		System.out.println(e1.name+ " " +e2.name);
		System.out.println(e1.id + " "+ e2.id);
	}
	public static void replace(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		/*Employee n;
		n=e1;
		e1=e2;
		e2=n;*/
		e1.name="Rajesh";             
	}

}
