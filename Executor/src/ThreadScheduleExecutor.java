import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduleExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService s = Executors.newScheduledThreadPool(1);
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Thread.currentThread().setName("Avishi");
				System.out.println("Executing Task 1 at: " + System.nanoTime());
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		System.out.println("Submitting Task at: " + System.nanoTime() + " will execute after 5 seconds");
		s.schedule(r,5 , TimeUnit.SECONDS);
	
		System.out.println(Thread.currentThread().getName());
		s.shutdown();
		System.out.println("after shut down: " + Thread.currentThread());
	}

}
