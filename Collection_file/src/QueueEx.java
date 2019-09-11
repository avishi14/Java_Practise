import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> q = new LinkedList<>();
		q.add("avishi");
		q.add("pri");
		q.add("ujj");
		
		System.out.println("Waiting queuee is :" + q);
		
		String name = q.remove();
		System.out.println("Removed frm queue: "+ name + " \n Waiting queue is : "+ q);
		
		name=q.poll();
		System.out.println("Removed from Waiting queue: "+name + "\n New Waiting queue"+ q);
	}

}
