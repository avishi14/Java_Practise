import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> first = new ArrayList<>();
		
		first.add(2);
		first.add(4);
		
		List<Integer> firstfour = new ArrayList<>(first);
		List<Integer> next = new ArrayList<>();
		next.add(6);
		next.add(8);
		next.add(2);
		
		firstfour.addAll(next);
		//firstfour.set(3, 7);
		System.out.println(firstfour);
		System.out.println("size: "+firstfour.size());
		System.out.println("contains: "+firstfour.contains(3));
		System.out.println("first occurence: " +firstfour.indexOf(4));
		System.out.println("last occurence: " +firstfour.lastIndexOf(2));
		System.out.println("invalid value" +firstfour.indexOf(1));
		
	}
}
