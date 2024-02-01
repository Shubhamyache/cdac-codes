package Book.TypeOfBook;

import Book.Book;

public class Ebook extends Book {
	private float finalPrice;

	public Ebook() {
		super();
		
	}

	public Ebook(int bookid, String title, float p) {
		super(bookid,title, p);
		
	}
	public float calCost(float price)
	{
		
		
		if(price<=500)
		{
			finalPrice= price-(price*2/100);
		}
		else if(price>500 && price<=1000)
		{
			finalPrice= price-(price*5/100);
		}
		else if(price>1000 && price<=5000)
		{
			finalPrice= price-(price*7/100);
		}
		return finalPrice;
		
		}

	@Override
	public String toString() {
		return super.toString()+"\nFinal price= "+calCost(price);
	}
	
	
	
	
	

}
