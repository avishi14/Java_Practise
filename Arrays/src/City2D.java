import java.util.Scanner;

public class City2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//String[][] city_name = {{"A","B"},{"C","D"}};
		String[][] city_name = new String[2][2];
		System.out.println("Enter city name");

		for(int i=0;i<city_name.length;i++) {
			//System.out.println("");
			for(int j=0;j<city_name.length;j++) {
				city_name[i][j] = sc.nextLine(); 

			}
		}
		for(int i=0;i<city_name.length;i++) {
			System.out.println("");

			for(int j=0;j<city_name.length;j++) {
				System.out.print(city_name[i][j]+" ");
			}

		}
	}

}
