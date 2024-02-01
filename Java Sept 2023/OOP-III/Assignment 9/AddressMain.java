public class AddressMain
{
	public static void main(String[] args){
		Address a1 = new Address();
		a1.display();
		
		Address a2 = new Address("Karve","pune",12345);
		a2.display();
		
		Address a3 = new Address("deccan", "hyderabad",54321);
		a3.display();
		
		Customer c1 = new Customer();
		c1.display();
		
		Customer c2 = new Customer("yacheshubham100@gmail.com","Pune");
		c2.display();
		
	}
}