package Office.persons;

public class RegCustomer extends Customer {
	int regNo;
	
	
	
	public RegCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegCustomer(String email, String address,int regNo) {
		super(email, address);
		this.regNo = regNo;
		// TODO Auto-generated constructor stub
	}


	public int giveDiscount(int price) {
		price = price - (price*5)/100;
		return price;
		
	}

	@Override
	public String toString() {
		return super.toString()+"\n regNo=" + regNo ;
	}
	
	
//	public void display() {
//		System.out.println("Reg NO: "+regNo);
//		
//		
//	}

}
