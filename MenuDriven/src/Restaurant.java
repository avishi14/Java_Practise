import java.util.Scanner;
//import java.io.*;

public class Restaurant extends Amount {

	public static void main(String[] args) {
		System.out.println("Welcome to restaurant");
		String f;
		Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("Choose an option: \n 1. Snacks\n 2. Meal \n 3. Chaat \n 4. juices");
			
			int a = sc.nextInt(); 

			switch(a) {
			case 1: //System.out.println("\nFor snack items.");
				Snacks snack = new Snacks();
				snack.Disp_snack();
				break;

			case 2:// System.out.println("for meal");
				Meal meal = new Meal();
				meal.Disp_meal();
				break;

			case 3: ///System.out.println("for chaat");
				Chaat chaat = new Chaat();
				chaat.Disp_chat();
				break;

			case 4: //System.out.println("for juice");
				Juices juices = new Juices();
				juices.Disp_juices();
				break;

			default: System.out.println("wrong input");
			}

			Amount amount = new Amount();
			amount.total();

			System.out.println("Would you like to continue ");
			f = sc.next();
			System.out.println("Would you like to continue1 ");


		}while(f.equalsIgnoreCase("Y")); 
	}
}


