
public class MyThread extends Thread{
	
	public void run() {
		int ctr = 0;
		for(int i=1; i<=10;i++) {
			System.out.println(ctr++);}
			 System.out.println(Thread.currentThread());
	
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyThread mt = new MyThread();
		 Thread t1 = new Thread(mt);
		 Thread t2 = new Thread(mt);
		 t1.setName("Thread 1");
		 t1.start();
		 t2.setName("Thread 2");
		 t2.start();
		 
		 System.out.println(Thread.currentThread());
	}

}
