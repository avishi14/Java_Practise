import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		LinkedHashMap <String,Integer> m= new LinkedHashMap<>();
	/*	for(int i=0; i< 3; i++) {
			String a = sc.next();
			int j = sc.nextInt();
			m.put(a, j);
		}
		*/
			m.put("one", 1);
			m.put("Two",2);
			m.put("Three", 3);
			m.put("Four", 4);
			m.put("five", 5);
			m.putIfAbsent("Six", 6);
			System.out.println(m);
	}
}
