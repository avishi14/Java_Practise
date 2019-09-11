import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class StreamEx {
	public static List<Employee> createEmployee(){
		return Arrays.asList(
				new Employee ("Avishi",Gender.FEMALE,18),
				new Employee ("Prithvi",Gender.MALE,26),
				new Employee ("Anshuj",Gender.MALE,22),
				new Employee ("Riya",Gender.FEMALE,25),
				new Employee ("Ujjawal",Gender.MALE,3),
				new Employee ("Surya",Gender.MALE,30),
				new Employee ("Anshika",Gender.FEMALE,26),
				new Employee ("Deepshikha",Gender.FEMALE,19),
				new Employee ("Vartika",Gender.FEMALE,35),
				new Employee ("Neha",Gender.FEMALE,40));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = createEmployee();
		System.out.println("Printing list before streams...");
		System.out.println(employee);

		List<String> empname1 = new ArrayList<>();

		for(Employee emp:employee) {
			if(emp.getAge()<20) {
				empname1.add(emp.getName().toUpperCase());
			}
		}
		System.out.println(empname1);
		//list name less than 20 age with upper case
		List<String> empname2 = employee.stream().filter(emp -> emp.getAge()<20).map(Employee:: getName).map(String:: toUpperCase)
				//.map(emp -> emp.getName())
				//.map(name -> name.toUpperCase())
				.collect(Collectors.toList());

		System.out.println("with using Stream");
		System.out.println(empname2);

		//list male employee with uppercase
		employee.stream().filter(emp -> emp.getGender()==Gender.MALE)
		.map(emp -> new Employee( emp.getName().toUpperCase(),emp.getGender(),emp.getAge())).forEach(System.out::println);	
		
		//sum of ages
		System.out.println("Printing sum of ages ");
		System.out.println(employee.stream().mapToInt(Employee:: getAge).sum());
		
		//oldest employee
		System.out.println(
				employee.stream().max((emp1,emp2)->emp1.getAge()>emp2.getAge()?1:-1));
		//youngest employee
		System.out.println(
				employee.stream().max((emp1,emp2)->emp1.getAge()<emp2.getAge()?1:-1));
		
		//only make empoyee
		Set<Employee> males= employee.stream().filter(emp->emp.getGender()==Gender.MALE).collect(Collectors.toSet());
		System.out.println(males);
		
		
	}

}
