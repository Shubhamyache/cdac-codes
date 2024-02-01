package CustomerQueue;

import java.util.Scanner;
import java.util.concurrent.DelayQueue;


public class CustomerDemo {

	public static void main(String[] args) {
		CustQueue qu = new CustQueue(10);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Enter 1.Enqueue 2.DeQueue 3.display 0.exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter customer id: ");
				int cid = sc.nextInt();
				System.out.println("Enter customer name: ");
				String cname = sc.next();
				Customer data = new Customer(cid,cname);
				qu.EnQueue(data);
				break;
			case 2:
				Customer res = qu.DeQueue();
				if(res!=null)
					System.out.println("deleted element is"+res);
				else {
					System.out.println("Queue is Empty!!!");
				}
				break;
			case 3: 
				qu.display();
				break;
			}
				
				
			
		}while(choice!=0);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
