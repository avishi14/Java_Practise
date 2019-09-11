import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("avishi");
		ll.add("pri");
		ll.add("ujj");
		
		System.out.println("Linked list" + ll);
		ll.add(2,"thvi");
		System.out.println("after add" + ll);
		ll.addFirst("main");
		System.out.println("After First"+ ll);
		ll.addLast("wal");
		System.out.println("After last add"+ ll);
		
		List<String> listl= new ArrayList<>();
		listl.add("Jese");
		listl.add("Walt");
		ll.addAll(listl);
		System.out.println("after all"+ll);
		ll.remove();
		System.out.println(ll);
		
	}

}
