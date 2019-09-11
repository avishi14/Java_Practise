import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Arrayfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> al = new ArrayList<>();
				
		for(int i=0;i<5;i++)
		{
			al.add(sc.nextInt());
		}
	System.out.println(al);
			
	}

}
