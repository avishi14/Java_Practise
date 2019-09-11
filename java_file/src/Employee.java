
public class Employee {

	public int id = 101;
	private double salary = 45000;
	protected String name = "Tisha";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println(e1.id);
		System.out.println(e1.salary);
		System.out.println(e1.name);
		Secretary s = new Secretary();
		s.display();
		Manager man = new Manager();
		man.managermethod();
	}

}

class Secretary extends Employee{
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		
	}
}