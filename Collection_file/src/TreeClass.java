import java.util.Comparator;
import java.util.TreeSet;

public class TreeClass implements Comparator{
	public int compare(Object o1,Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else 
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet(new TreeClass());
		ts.add(4);
		ts.add(3);
		ts.add(0);
		ts.add(12);
		ts.add(-1);
		ts.add(6);
		//	ts.add(3.0);
		System.out.println(ts);
	}


}
