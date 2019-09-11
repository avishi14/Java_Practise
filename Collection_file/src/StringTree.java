import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
/*		fruits.add("Apple");
		System.out.println("ignore same case"+fruits);
		
		fruits.add("banana");
		System.out.println("lower case"+fruits);*/
		
	}

}
