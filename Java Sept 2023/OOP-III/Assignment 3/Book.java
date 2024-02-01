public class Book
{
	private int bid;
	private int price;
	private static int count;
	
	public void display()
	{
		System.out.println("BOOK ID: "+bid);
		System.out.println("BOOK price: "+price);

	}
	public Book()
	{
		count++;
		bid = count;
		price=100;
	}
	public Book(int p)
	{
		count++;
		bid = count;
		price = p;
	}
}