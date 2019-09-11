
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User{
		private String name;
		private int age;
		
		public User (String name, int age) {
			this.age=age;
			this.name=name;
		}
		
		public String getName(){
			return name;
		}
		
		public void setName(String name) {
			this.name= name;
		}
		
		public int getAge(){
			return age;
		}
		
		public void setAge(int age) {
			this.age= age;
		}
		
		
	}
	public class eproduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
	String name;
	int age;
		
		List<User> users= new ArrayList<>();
		for(int i=0;i<3;i++) {
		name= sc.next();
		age= sc.nextInt();
		users.add(new User(name,age));
		}
	//	users.add(new User("avishi",22));
	//	users.add(new User("aggarwal",24));
		users.forEach(a-> {
			System.out.println("Name: "+a.getName()+ " Age: "+a.getAge());
		});
		
	}

}
