import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter filewriter = new FileWriter("temp.txt");
			BufferedWriter bw = new BufferedWriter(filewriter);

			bw.write("Hello, ");
			bw.write("here is some ");
			bw.newLine();
			bw.write("We are waiting ");
			bw.write(" some text to the file. ");
			bw.close();


		}
		catch(IOException e) {System.out.println("Error writing to file: " + "temp.txt" );
		}

	}
}

