package BookStack;

public class Book {
	int bno;
	String bname;
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + "]";
	}
	public Book(int bno, String bname) {
		super();
		this.bno = bno;
		this.bname = bname;
	}
	public Book() {
		
	}
	

}
