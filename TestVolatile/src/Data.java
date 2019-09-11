
public class Data {

	public volatile
	int counter =0;
	
	public int getCounter() {
		return counter;
	}
	
synchronized public void countIncrement() {
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		++counter;
	}
}

class MyTask implements Runnable{
	private Data data;
	public MyTask(Data data) {
		this.data=data;
	}
	
	public void run() {
		System.out.println("Value for Thread " + Thread.currentThread().getName()+ " Before Increment\t" + data.getCounter());
		data.countIncrement();
		System.out.println("Value for Thread " + Thread.currentThread().getName()+ " After Increment\t" + data.getCounter());

	}
}