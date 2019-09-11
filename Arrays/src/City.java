import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] city_name = new String[2];
		System.out.println("Enter city name");

		for(int i=0;i<city_name.length;i++) {
			city_name[i] = sc.nextLine(); 
		}
		for(int i=0;i<city_name.length;i++) {
			System.out.println(city_name[i]);
		}
	}
}
