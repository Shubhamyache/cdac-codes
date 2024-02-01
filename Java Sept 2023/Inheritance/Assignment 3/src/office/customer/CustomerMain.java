package office.customer;
import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Customer c1 = null;
	
	System.out.println("Enter Email: ");
	String email = sc.nextLine();
	
	System.out.println("Enter Address: ");
	String address = sc.nextLine();
	System.out.println("Enter Price: ");
	int price = sc.nextInt();
	
	
	
	System.out.println("Enter type of customer: 1. customer 2. Regular Customer");
	System.out.println("Enter choice: ");
	int choice = sc.nextInt();
	
	if(choice==1) {
		c1 = new Customer(email,address);
		c1.display();
		System.out.println("Discount Price: "+c1.giveDiscount(price));
	}
	if(choice==2) {
		System.out.println("Enter reg no: ");
		int regNo = sc.nextInt();
		
		c1 = new RegCustomer(email, address, regNo);
		
		c1.display();
		System.out.println("Discount price for regular customer: "+c1.giveDiscount(price));
	}
}
}
