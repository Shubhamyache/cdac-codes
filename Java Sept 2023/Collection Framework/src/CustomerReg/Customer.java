package CustomerReg;

public class Customer {
	String name;
	String email;
	int contactNo;
	public Customer(String name, String email, int contactNo) {
		super();
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[name=" + name + ", email=" + email + ", contactNo=" + contactNo + "]";
	}
	
	

}
