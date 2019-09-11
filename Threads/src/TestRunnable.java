
class threadRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
		System.out.println("inside child thread: "+ Thread.currentThread().getName());
		Thread.currentThread().setName("Java Thread");
		System.out.println("Child class priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread());
	}
}



public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadRunnable tr = new threadRunnable();
		Thread t1 = new Thread(tr);
		t1.start();

		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		System.out.println(t1.getName());
		Thread.currentThread().setName("My name");
		System.out.println("Parent class priority: "+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		System.out.println("Parent class priority: "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());

	}

}
