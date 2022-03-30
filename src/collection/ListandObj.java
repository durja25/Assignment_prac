package collection;
import java.util.ArrayList;
import java.util.List;


class book{
	int id;
	String name,auther,publisher;
	int quantity;

	public book(int id, String name, String auther, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class ListandObj {
public static void main(String[] args) {
	// Creating list of books
	List<book> list = new ArrayList<book>();
	// creating boooks
	book b1=new book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    book b2=new book(102,"Data Comm Networking","Forouzan","Mc Graw Hill",4);  
    book b3=new book(103,"Operating System","Galvin","Wiley",6);  
    // adding books to list
    list.add(b1);
    list.add(b2);
    list.add(b3);
    // Traversing list			
    for (book book : list) {
		System.out.println(book.id+" "+book.name+" "+book.auther+" "+book.publisher+" "+book.quantity);
	}

}
}
