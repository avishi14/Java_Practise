
public class DeadLockEx {

	String obj1= "Lock1";
	String obj2= "Lock2";
	
	Thread t1 = (new Thread("Thread 1") {
		public void run() {
			while(true) {
				synchronized(obj1) {
					synchronized(obj2) {
						System.out.println("Both are synchronised" + obj1 + obj2);
					}
				}
			}
		}
	});
	
	Thread t2 = (new Thread("Thread 2") {
		public void run() {
			while(true) {
				synchronized(obj2) {
					synchronized(obj1) {
						System.out.println("Both are synchronised" + obj1 + obj2);
					}
				}
			}
		}
	});
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLockEx dt1 = new DeadLockEx();
		dt1.t1.start();
		dt1.t2.start();
	}
}
