import java.util.Scanner;

public class Juices extends Amount{
	public void Disp_juices() {
		Scanner sc = new Scanner(System.in);
		Amount amount = new Amount();

		System.out.println("\nJuices are:");
		System.out.println("Name         Price\n"
				+ "Apple juice     30\n"
				+ "Mix Fruit       40");
		System.out.println("\nChoose your item");
		String s = sc.nextLine();
		System.out.println("You choosed "+s);

		if(s.equalsIgnoreCase("Apple juice") )
		{	//System.out.println(s);
			amount.paisa(30);}

		else if (s.equalsIgnoreCase("Mix fruit"))
			amount.paisa(40);

		sc.close();

	}
}
