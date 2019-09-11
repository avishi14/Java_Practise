import java.util.Scanner;

public class cross_mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows and column of first matrix");
		int r1= sc.nextInt();
		int c1= sc.nextInt();
		int[][] a= new int[r1][c1];

		System.out.println("Enter the elements of first matrix");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j] = sc.nextInt(); 

			}
		}

		System.out.println("Enter rows and column of second matrix");
		int r2= sc.nextInt();
		int c2= sc.nextInt();
		int[][] b= new int[r2][c2];
		

		if(c1!=r2)
			System.out.println("Can not do matrix multiplication");
		else
		{
			System.out.println("Enter the elements of second matrix");
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					b[i][j] = sc.nextInt(); 

				}
			}
			int[][] multiply= new int[r1][c2];
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;i<r2;i++) {
						sum = sum + a[i][k] * b[k][j] ;
					}
					multiply[i][j] = sum;
					sum = 0;
				}
			}
			System.out.println("Product of matrices");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					System.out.println(multiply[i][j]);
					System.out.println(" ");
				}
			}
		}
	}
}
