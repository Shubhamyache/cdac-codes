package Book.TypeOfBook;

import Book.Book;

public class PaperBook extends Book{
	private float finalPrice;

	public PaperBook() {
		super();
	}

	public PaperBook(int bookid, String title, float p) {
		super(bookid,title, p);
	}

	@Override
	public String toString() {
		return super.toString()+"\ntotal price= "+calCost(price);
	}
	public float calCost(float price)
	{
		if(price<=500)
		{
			finalPrice= price+(price*7/100);
		}
		else if(price>500 && price<=1000)
		{
			finalPrice= price+(price*5/100);
		}
		else if(price>1000 && price<=5000)
		{
			finalPrice= price+(price*2/100);
		}
		return finalPrice;
		
		}
	
	
	
	

}
