
class GenericTest<T>
{
	T obj;
	GenericTest(T ob){
		this.obj=ob;
	}
	
	public GenericTest() {
		
	}
	
	public void display() {
		System.out.println(" This type of object is: "+ obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}
}

public class GenericClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTest t1 =  new GenericTest();
		GenericTest<GenericTest> gt = new GenericTest(t1);
		gt.display();
		System.out.println(gt.getObj());
		GenericTest<String> gt1 = new GenericTest<String>("Hello");
		gt1.display();
		System.out.println(gt1.getObj());
		
		GenericTest<Integer> gt2 = new GenericTest<Integer>(12);
		gt2.display();
		System.out.println(gt2.getObj());

		GenericTest<Double> gt3 = new GenericTest<Double>(3.2);
		gt3.display();
		System.out.println(gt3.getObj());

	}

}
