
public class Student {

	int stid;
	String name;
	
	Student(){
		System.out.println("first constructor");
	}
	Student(int st, String n){
		this.stid=st;
		this.name=n;
		System.out.println(st);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student(1,"avishi");
		System.out.println(s1.stid);
		System.out.println(s2.name);

	}
}
