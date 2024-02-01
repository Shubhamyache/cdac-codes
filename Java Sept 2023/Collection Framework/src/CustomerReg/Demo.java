package CustomerReg;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> cust = new ArrayList();
		List<RegCustomer> reg = new ArrayList();
		
		List<Object> allObjects = new ArrayList();
		
		Customer c1 = new Customer("Shubham","yacheshubham100",9370);
		Customer c2 = new Customer("rohit","rohityache100",9923);
		Customer c3 = new Customer("pratik","pratik200",9876);
		RegCustomer r1 = new RegCustomer("shifa","shafaliverma150",1234,11);
		RegCustomer r2 = new RegCustomer("ajay","ajayshinde12",4321,12);
		RegCustomer r3 = new RegCustomer("shivani","shivaniproff55",7777,13);
		
		allObjects.add(c1);
		allObjects.add(c2);
		allObjects.add(c3);
		allObjects.add(r1);
		allObjects.add(r2);
		allObjects.add(r3);
		
		for(Object obj: allObjects)
		{
			if(obj instanceof RegCustomer) 
			{
					reg.add((RegCustomer) obj);
			}
			else if(obj instanceof Customer)
			{
				cust.add((Customer) obj);
			}
			
		}
		
		System.out.println("Customer data: ");
		for(Customer c: cust) {
			System.out.println(c);
		}
		
		System.out.println("\n Register Customer data: ");
		for(Customer r: reg) {
			System.out.println(r);
		}


	}

}
