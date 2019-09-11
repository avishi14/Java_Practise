import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> first = new ArrayList<>();
		
		first.add(4);
		first.add(7);
		
		Set<Integer> firstfour = new HashSet<>(first);
		List<Integer> next = new ArrayList<>();
		next.add(2);
		next.add(5);
		next.add(2);
		
		firstfour.addAll(next);
		
		System.out.println(firstfour);
	}

}
