
public class SyncBlockExample extends Thread{

	static String []message = {"This", "message", "will","be", "read", "from", "@", "Thread"};

	public SyncBlockExample(String id) {
		super(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncBlockExample th1 = new SyncBlockExample("Thread 1: ");
		SyncBlockExample th2 = new SyncBlockExample("Thread 2: ");

		th1.start();
		th2.start();

		boolean th1IsAlive = true;
		boolean th2IsAlive = true;

		do {
			if(th1IsAlive && ! th1.isAlive()) {
				th1IsAlive = false;
				System.out.println("Th1 is dead");
			}
			if(th2IsAlive && ! th2.isAlive()) {
				th2IsAlive = false;
				System.out.println("Th2 is dead");
			}
		}while(th1IsAlive || th2IsAlive);


	}

	void WAIT() {
		try {
			Thread.currentThread().sleep((long) (1000*Math.random()));
		}
		catch(InterruptedException e) {
			System.out.println("Thread is interrupted");
		}
	}

	public void run() {
	synchronized (System.out) {
		for(int i=0; i<message.length;i++) {
			WAIT();
			System.out.println(getName()+message[i]);
		}
	}
}
}
