
public class Start {
	static void method() {
		System.out.println("this is static method");
	}
	public Start() {	
		System.out.println(" This is Start constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start s = new Start();
		Start.method();
		

	}

}
