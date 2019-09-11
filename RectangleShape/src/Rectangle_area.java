import java.util.Scanner;

public class Rectangle_area {
	public double area(){
		double a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length: ");
		a = in.nextDouble();
		
		System.out.println("Enter breath: ");
		b = in.nextDouble();

		double Area = a * b;
		 return Area;
	}
}
