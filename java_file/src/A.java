abstract class B {
	abstract public void eat();
	
	public void sum() {
		System.out.println("in clas B");
	}
}

public class A extends B{
	
	public void sum() {
		int a=5,b=10;
		int sum1=a+b;
		System.out.println("Sum is:" +sum1);
	//	super.sum();
	}
	
	
	public void eat() {
		System.out.println("eat");
	}
	public static void main(String args[])
	{
		B b=new A();
		b.sum();
		//A ref;
		//ref.sum();
		A a= new A();
		//a.sum();
		a.eat();
	}
}

