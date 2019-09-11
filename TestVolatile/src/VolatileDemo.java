import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();

		ExecutorService e = Executors.newFixedThreadPool(5);
		e.execute(new MyTask(d));
		e.execute(new MyTask(d));
		e.execute(new MyTask(d));
		e.execute(new MyTask(d));
		e.execute(new MyTask(d));
		e.shutdown();
	}

}
