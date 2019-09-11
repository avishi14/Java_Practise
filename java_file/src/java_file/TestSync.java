package java_file;

public class TestSync {
	public static void method2() {
		System.out.println("Hello");
	}
	static	class A{
		public static void method() {
			System.out.println("inside method of inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSync a= new TestSync();
		//TestSync.A b= new TestSync().new A();
		A.method();
		method2();

	}

}
