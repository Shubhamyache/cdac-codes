package Office.persons.Main;

import Office.persons.Customer;
import Office.persons.RegCustomer;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("yacheshubham100","pune");
		System.out.println(c1);
		
		RegCustomer r1 = new RegCustomer("rohityache","latur",101);
		System.out.println("You will get 1000rs product for: "+r1.giveDiscount(1000));
		System.out.println(r1);
		
		
	}

}
