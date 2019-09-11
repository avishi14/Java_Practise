
public class Amount {

	public static int amount=0;
	public void paisa(int value) {
		//	System.out.println(value);
		amount = amount + value;
		System.out.println(amount);
	}

	public void total() {
		System.out.println("Your total amount is "+amount);
	}
}
