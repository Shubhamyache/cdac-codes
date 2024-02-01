public class Address
{
	public String area;
	public String city;
	public int pincode;
	
	public Address(){
		area = "No Area";
		city = "No city";
		pincode = 111;
	}
	public Address(String area, String city, int pincode){
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	public void display(){
		System.out.println("Area: "+area);
		System.out.println("city: "+city);
		System.out.println("pincode: "+pincode);
	}
}

class Customer
{
	String Email;
	String address;
	
	public Customer(){
		Email = "NA";
		address = "NA";
	}
	public Customer(String Email, String address){
		this.Email = Email;
		this.address = address;	
	}
	
	public void display(){
		System.out.println("Email: "+Email);
		System.out.println("Address: "+address);

	}
}