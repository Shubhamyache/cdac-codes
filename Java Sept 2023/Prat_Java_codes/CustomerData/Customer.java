package CustomerData;


public class Customer {
	private String cust_email;
	private String address;
	public Customer() {
		super();
		cust_email="";
		address="";
		//price=0;
	}
	public Customer(String email, String address) {
		cust_email=email;
		this.address=address;
		
	}
	public double getDiscount(double pr)
	{
		return pr;
		
		//System.out.println("shopping price= "+price);
	}
	public void display()
	{
		System.out.println("Cust-mailid= "+cust_email);
		System.out.println("address"+address);
		//System.out.println("price= "+price);
	}

}
