import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<>();
		s1.push(12);
		s1.push(13);
		s1.push(15);
		
		System.out.println("before");
		System.out.println(s1);
		s1.pop();
		System.out.println("after removing" +s1);
		s1.pop();
		System.out.println("after removing" + s1);
	}

}
