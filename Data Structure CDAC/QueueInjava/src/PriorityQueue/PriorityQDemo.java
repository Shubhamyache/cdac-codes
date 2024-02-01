package PriorityQueue;

import java.util.Scanner;


public class PriorityQDemo {

	public static void main(String[] args) {
		int ch,data,prio;
		Scanner scanner = new Scanner(System.in);
		
		
		PriorityQ pQ = new PriorityQ(5);
		do {
			System.out.println("Enter 1. EnQueue 2. DeQueue 3.display 0.Exit");
			System.out.println("Enter your choice: ");
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter data: ");
				data =scanner.nextInt();
				System.out.println("Enter Priority: ");
				prio = scanner.nextInt();
				
				Element ele = new Element(data, prio);
				pQ.enQueue(ele);
				break;
				
			case 2:
				Element dElement = pQ.deQueue();
				System.out.println("deleted element is "+dElement);
				break;
				
			case 3:
				pQ.display();
				
			}
			
		}while(ch!=0);

	}

}
