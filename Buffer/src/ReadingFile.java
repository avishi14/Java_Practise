import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
		

		 String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st);
		}
		catch(Exception e) {
			System.out.println("Error reading to file: " + "temp.txt");
		}
	}

}
