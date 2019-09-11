import java.util.Scanner;

public class Cal_Area {

	public void area(int l, int b) {
		System.out.println("the area of rectangle is "+ (l*b));
	}

	public void area(double h, double b) {
		System.out.println("the area of triangle is "+ (0.5*h*b));
	}

	public void area(double r) {
		System.out.println("the area of circle is " + (3.14*r*r));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cal_Area c = new Cal_Area();
		c.area(4.0, 5.0);
		c.area(2);
		c.area(1, 5);
	}

}
