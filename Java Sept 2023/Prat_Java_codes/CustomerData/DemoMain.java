package CustomerData;

import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer c1=null;
		System.out.println("Enter e-mail id");
		String email= sc.nextLine();
		System.out.println("Enter address: ");
		String address= sc.nextLine();
		int n,cnt=1;
		do {
			System.out.println("Enter type of Customer :\n1 FOR Customer\n2 for Reg customer\n0 for exit");
			 n=sc.nextInt();
			
			
			switch(n)
			{
			case 1:
				{c1 = new Customer(email, address);
				break;}
			case 2:
			{
				System.out.println("enter registration number: ");
				int rno=sc.nextInt();
				c1= new RegCustomer(email, address, rno);
				break;
			}
			//cnt=1;
			}
		}while(cnt!=1);
		System.out.println("enter price: ");
		double price= sc.nextDouble();
		c1.getDiscount(price);
		c1.display();
		System.out.println("final discount price= "+c1.getDiscount(price));
		
		
		
		
		}

}
