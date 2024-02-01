package _03_Stack;

public class Book {
	private int bno;
	private String bname;
	
	public Book(int bno, String bname) {
		super();
		this.bno = bno;
		this.bname = bname;
	}
	
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + "]";
	}
	
	
	
	

}
