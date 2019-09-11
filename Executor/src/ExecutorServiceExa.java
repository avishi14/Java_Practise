import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executors;
public class ExecutorServiceExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService e=Executors.newSingleThreadExecutor();
		System.out.println("Creating a runnable...");
		Runnable r=new Runnable()
		{
					public void run()
					{
						Thread.currentThread().setName("avishi");
						System.out.println("This is inside Runnable..."+Thread.currentThread().getName());
					}
		};
				System.out.println("Now we are submitting the runnable object:");
				e.submit(r);
				e.shutdown();
				System.out.println("This is after shutdown.."+Thread.currentThread().getName());
	}

	/*private void submit(Runnable r) {
		// TODO Auto-generated method stub
*/		
	}
