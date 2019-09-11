import java.util.Scanner;

public class Snacks extends Amount {

	public void Disp_snack() {
		Scanner sc = new Scanner(System.in);
		Amount amount = new Amount();
		System.out.println("\nSnacks are:");
		System.out.println("Name          Price\n"
				+ "Samosa           10\n"
				+ "Bread Pakora     20");

		System.out.println("\nChoose your item");
		String s = sc.nextLine();
		System.out.println("You choosed "+s);
		if(s.equalsIgnoreCase("samosa") )
		{	//System.out.println(s);
			amount.paisa(10);}

		else if (s.equalsIgnoreCase("Bread Pakora"))
			amount.paisa(20);

			sc.close();

	}
}