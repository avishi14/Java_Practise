import java.util.Scanner;

public class Student {

	String name;
	int age;
	String address;

	public Student(String name, int age, String address){
		super();
		name="unknown";
		age=0;
		address= "not available";
	}

	public void setInfo(String n,int a) {
		name = n;
		age = a;
	}

	public void setInfo(String n,int a, String add) {
		this.name = n;
		this.age = a;
		this.address = add;
	}
	
	public String toString()
	{
		return name+" "+age+" "+address;
		
	}

	public static void main(String[] args) {
	
		String name, address; int age;
		Scanner sc = new Scanner(System.in);
		Student s[]=new Student[3];
		System.out.println("Enter input");
		for(int i=0;i<2;i++) {
			System.out.println("Enter name: ");
			name=sc.next();
			System.out.println("Enter age: ");
			age=sc.nextInt();
			System.out.println("Enter address");
			address=sc.next();
			s[i]=new Student(name, age, address);
			s[i].setInfo(name,age,address);
		}

		for(int i=0;i<2;i++) {
			System.out.println(s[i]);
			
		}
	}

}