package DynamicQueue;

import java.util.Scanner;

public class DynQuDemo {

	public static void main(String[] args) {
		int ch;
		DynamicQ dq = new DynamicQ();
	
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1. Enqueue ");
		System.out.println("Enter 2. Dequeue ");
		System.out.println("Enter 3. Display ");
		System.out.println("Enter 4. Exit ");
		System.out.println("Enter 0. Exit ");
		
		do 
		{
			System.out.println("Enter your choice : ");
			ch = scanner.nextInt();
			switch (ch)
			{
			
			case 1:
				System.out.println("Enter data: ");
				int data = scanner.nextInt();
				dq.enQueue(data);
				break;
				
			case 2:
				int res = dq.deQueue();
				System.out.println("deleted element is "+res);
				break;
			case 3:
				System.out.println(dq);
				
			}
				
				
		}while(ch!=0);

	}

}
