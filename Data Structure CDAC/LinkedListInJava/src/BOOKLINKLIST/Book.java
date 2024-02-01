package BOOKLINKLIST;

public class Book {
	int bid;
	String bname;
	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
	

}
