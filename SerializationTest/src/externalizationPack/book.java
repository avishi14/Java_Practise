package externalizationPack;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class book implements Externalizable{
	private int bookid;
	private String title;
	private String author;
	private transient double price=1000;
	
	public book() {
		
		// TODO Auto-generated constructor stub
	}

	public book(int bookid, String title, String author, double price) {
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", title=" + title + ", author=" + author + ",price="+ price + "]";
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		this.bookid=in.readInt();
		this.title=(String) in.readObject();
		this.author=(String) in.readObject();
		this.price=in.readDouble();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(bookid);
		out.writeObject(title);
		out.writeObject(author);
		out.writeDouble(price);
	}
}