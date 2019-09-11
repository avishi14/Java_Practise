import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorServiceExa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is inside : "+Thread.currentThread().getName());
		System.out.println("Creating Executor service with thread pool of size 2");
		ExecutorService e=Executors.newFixedThreadPool(2);
		Runnable r=new Runnable()
		{
			public void run()
			{
				System.out.println("Executing task 1 inside"+Thread.currentThread().getName());
				try{
					try
					{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				catch(IllegalStateException e)
				{
					e.printStackTrace();
				}

			}
		};
		Runnable r2=new Runnable()
		{
			public void run()
			{
				System.out.println("Executing task 2 inside"+Thread.currentThread().getName());
				try
				{
					try
					{
						Thread.sleep(10);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				catch(IllegalStateException e)
				{
					e.printStackTrace();
				}

			}
		};
		e.submit(r);
		e.submit(r2);
		//e.submit();

	}

}
