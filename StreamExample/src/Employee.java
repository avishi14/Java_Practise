
public class Employee {
	private final String name;
	private final Gender gender;
	private final int age;

	public Employee(String n, Gender g, int a) {
		name =n;
		gender = g;
		age = a;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return String.format("%s -- %s -- %d",name,gender,age);
	}

}
