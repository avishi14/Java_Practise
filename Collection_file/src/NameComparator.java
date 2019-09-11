import java.util.Collections;
import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
	//	return o1.name.compareTo(o2.name);
		
		String i1 = o1.name;
		String i2 = o2.name;

		if(i1.equals(i2))
			new AgeComparator());
			
		

		
	}

}
