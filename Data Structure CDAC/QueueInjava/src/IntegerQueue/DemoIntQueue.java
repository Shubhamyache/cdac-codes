package IntegerQueue;

import java.util.Scanner;

public class DemoIntQueue {

	public static void main(String[] args) {
		IntQueue i1 = new IntQueue(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println();
			System.out.println("Enter 1.EnQueue 2.DeQueue 3.display 0.exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter number to EnQueue: ");
				int no = sc.nextInt();
				i1.EnQueue(no);
				break;
				
				
			case 2:
				System.out.println("DeQueue element is: "+i1.DeQueue());
				break;
			case 3: 
				i1.display();
				break;
			}
				
				
			
		}while(choice!=0);

	}

}
