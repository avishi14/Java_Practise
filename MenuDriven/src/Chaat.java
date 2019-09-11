import java.util.Scanner;

public class Chaat extends Amount {
	public void Disp_chat() {
		Scanner sc = new Scanner(System.in);
		Amount amount = new Amount();

		System.out.println("\nChaats are:");
		System.out.println("Name       Price\n"
				+ "Bhel puri     30\n"
				+ "Kachori       40");

		System.out.println("\nChoose your item");
		String s = sc.nextLine();
		System.out.println("You choosed "+s);

		if(s.equalsIgnoreCase("Bhel puri") )
		{	//System.out.println(s);
			amount.paisa(30);}

		else if (s.equalsIgnoreCase("Kachori"))
			amount.paisa(40);

		sc.close();

	}
}
