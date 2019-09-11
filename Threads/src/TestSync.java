
public class TestSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		
		Thread t1 = new Thread(a);
		
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}

}
