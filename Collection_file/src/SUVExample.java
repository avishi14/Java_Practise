import java.util.Arrays;
import java.util.List;

public class SUVExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(45,0,2,3);

		printSuperClass(list1);
		List<? extends Number> list2 = Arrays.asList(4.3,5,6,7);
		printSuperClass(list2);


	}

	public static void printSuperClass(List<? extends Number> list2) {
		System.out.println(list2);
	}
}
