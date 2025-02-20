import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		al.add(new Student(104,"Ajay",21));

		System.out.println("Sorting by Name"); 
		Collections.sort(al, new NameComparator());

		for (Student st:al) {
			System.out.println(st.id +" "+st.name +" "+st.age);
		}

		System.out.println("\nSort by age");
		Collections.sort(al, new AgeComparator());

		for (Student st:al) {
			System.out.println(st.id +" "+st.name +" "+st.age);
		}

	}

}
