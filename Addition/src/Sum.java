
import java.util.Scanner;

public class Sum {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {

		int sum = 0, a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = in.nextInt();

		System.out.println("Enter second number: ");
		b = in.nextInt();
		Display display = new Display();

		//sum = a + b;

		System.out.println("The sum of two number is: "+ display.disp(a, b));

	}
}

