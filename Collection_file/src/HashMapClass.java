import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		Map <String,Integer> m= new HashMap<>();
	/*for(int i=0; i< 3; i++) {
		String a = sc.next();
		int j = sc.nextInt();
		m.put(a, j);
	}	*/	
//			m.put("one", 1);
//		m.put("Two",2);
//		m.put(null, null);
//		m.put("Four", 4);
//		m.put(null, 5);
		m.put("five", null);
//		m.put("five", 9);
		m.putIfAbsent("five", 5);
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
	}

}
