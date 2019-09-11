
public class A extends Thread {
	public synchronized void run() {
		int count = 0; 

		for(int i=1; i<=10;i++) {
			System.out.println("Method A: Hi");
		}
	}
}


 class B  extends Thread{
	public synchronized void run() {
		int count = 0; 

		for(int i=1; i<=10;i++) {
			System.out.println("Method B: Hello");
		}
	}
}
