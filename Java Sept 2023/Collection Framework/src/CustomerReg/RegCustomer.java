package CustomerReg;

public class RegCustomer extends Customer {
	int regNo;

	public RegCustomer(String name, String email, int contactNo, int regNo) {
		super(name, email, contactNo);
		this.regNo = regNo;
	}
	public RegCustomer() {
		super();
	}

	@Override
	public String toString() {
		return super.toString()+" [regNo=" + regNo + "]";
	}
	
	

}
