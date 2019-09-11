import java.util.Scanner;

public class Meal extends Amount{
	public void Disp_meal() {
		Scanner sc = new Scanner(System.in);
		Amount amount = new Amount();

		System.out.println("\nMeals are:");
		System.out.println("Name    Price\n"
				+ "Combo1    50\n"
				+ "Combo2    60");
		System.out.println("\nChoose your item");
		String s = sc.nextLine();
		System.out.println("You choosed "+s);

		if(s.equalsIgnoreCase("combo1") )
		{	//System.out.println(s);
			amount.paisa(50);}

		else if (s.equalsIgnoreCase("combo2"))
			amount.paisa(60);

		sc.close();


	}
}
