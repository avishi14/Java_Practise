import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Book book = new Book(1,"LIFE","avishi",5000);
		try {
			FileOutputStream fos = new FileOutputStream("Book.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(book);
			System.out.println("Book is successfully serialize");
			
			FileInputStream fis = new FileInputStream("Book.ser");
			ObjectInputStream ois = new	ObjectInputStream(fis);
			Book mybook = (Book) ois.readObject();
			System.out.println("retrieved!!");
			System.out.println("After serialization: " + mybook);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
