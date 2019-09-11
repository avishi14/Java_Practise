import java.io.Serializable;

public class Book implements Serializable{
private int bookid;
private String title;
private String author;
private transient double price=500.0;

public Book(int bid, String t, String a, double p) {
	this.bookid=bid;
	this.author=a;
	this.price=p;
	this.title=t;
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

public String toString() {
	return "Book{" + "book_id: " + bookid + "title: " + title  + "Author: " + author + "price: " + price + "}";
}
}
