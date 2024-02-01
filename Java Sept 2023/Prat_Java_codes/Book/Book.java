package Book;

public class Book {
	private int bookid;
	private String title;
	  protected float price;
	  public Book()
	  {
	    //bookid++;
	  }
	  public Book(int bookid,String title, float p)
	  {
	    //bookid++;
		  this.bookid=bookid;
	    price=p;
	    this.title=title;
	  }
	  public void display()
	  {
	     System.out.println("Book= "+bookid+" Price= "+price);
	  }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nTitle= "+title+"\nBookid= "+bookid+"\nPrice= "+price ;
	}
	  
}
