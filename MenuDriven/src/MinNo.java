import java.math.*;
public class MinNo {

	public void MinNumber(int[] a) {

		int min = a[0];

		for(int i = 0; i < a.length ; i++) {
			if(a[i] < min)
				min = a[i];
		}

		System.out.println("\nMinimum number is "+ min); 
	}
	public void sorting(int[] a)
	{
		int temp;
		for(int i = 0; i < a.length ; i++) {
			for(int j=i+1;j< a.length;j++) {
				if(a[i]>a[j]) {
					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		System.out.println("sorted array is ");
		for(int i = 0; i < a.length ; i++) {

			System.out.print(a[i]+ " ");
		}
	}

	
	public void MaxNumber(int[] a) {

		int max = a[0];

		for(int i = 0; i < a.length ; i++) {
			if(a[i] > max)
				max = a[i];
		}

		System.out.println("\nMaximum number is "+ max); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,6,1,7};

		System.out.println("Array is ");
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");

		MinNo m = new MinNo();

		m.MinNumber(arr);
		m.MaxNumber(arr);
		m.sorting(arr);


	}

}
