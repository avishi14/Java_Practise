import java.util.Scanner;

public class City_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns");
		int r= sc.nextInt();
		int c= sc.nextInt();

		String[][] city_name = new String[r][c];
		System.out.println("Enter city name");

		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				city_name[i][j] = sc.next(); 

			}
		}
		for(int i=0;i<r;i++) {
			System.out.println("");

			for(int j=0;j<c;j++) {
				System.out.print(city_name[i][j]+" ");
			}

		}
	}

}
