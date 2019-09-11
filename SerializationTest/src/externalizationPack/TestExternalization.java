package externalizationPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestExternalization {
private String filename="Book.ser";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

//book b2=new book();
//Scanner sc=new  Scanner(System.in);
//String auth=sc.next();
//b2.setAuthor(auth);
//b2.setBookid(1111);
//b2.setTitle("C++");
book b2=new book(100, "java", "Anand", 400);
try {
	//serialize the object
	System.out.println("Before serialization"+ b2);
	FileOutputStream fos=new FileOutputStream("Book.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(b2);
	System.out.println("Book is successfully serialized..");
	
	//deserialize the book object
	FileInputStream fis=new FileInputStream("Book.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	book b3=(book) ois.readObject();
	System.out.println("Book is successfully retrieved from serialized object");
	System.out.println("After serialization .."+ b3);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

}
