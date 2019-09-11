import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(4);
		System.out.println(v.size());
		v.remove(2);
		System.out.println(v.size());

		ArrayList al = new ArrayList();
		System.out.println(al.size());
		
		al.add(22);
		al.add(22);
		al.add(22);
		al.add(22);

		System.out.println(al.size());
		al.remove(2);
		System.out.println(al.size());

	}

}
