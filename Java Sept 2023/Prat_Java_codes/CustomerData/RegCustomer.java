package CustomerData;


public class RegCustomer extends Customer {
	private int regno;

	public RegCustomer() {
		super();
		regno=0;
	}

	public RegCustomer(String email, String address,int no) {
		super(email, address);
		regno=no;
	}
	public void display()
	{
		super.display();
		System.out.println("regno= "+regno);
	}
	public double getDiscount(double price)
	{
		return (price-(price*5/100));
	}

}
