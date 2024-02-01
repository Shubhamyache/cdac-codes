package Office.persons;

public class Customer {
	String email;
	String address;
	
	
	public Customer(String email, String address) {
		super();
		this.email = email;
		this.address = address;
		
	}
	
	public Customer() {
		email="";
		address="";
	}
	public int giveDiscount(int price) {
		return price;
		
	}

	@Override
	public String toString() {
		return "\nEmail=" + email + ", Address=" + address ;
	}
	
//	public void display() {
//		System.out.println("Email: "+email);
//		System.out.println("Address: "+address);
//		
//	}

	

}
