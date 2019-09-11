package java_file;

public class TestColon {

	static void disp() {
		System.out.println("This is disp method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable run=()-> System.out.println("Hello from lambda");
		run.run();

		Runnable run2= TestColon :: disp;
		run2.run();
	}

}
