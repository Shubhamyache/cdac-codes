package DoubleEndedQueue;

import java.util.Scanner;

public class DeqDemo {

	public static void main(String[] args) {
		Deque deque = new Deque();
		int ch;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter 1. enqueue from front");
			System.out.println("Enter 2. enqueue from rear");
			System.out.println("Enter 3. dequeue from front");
			System.out.println("Enter 4. dequeue from rear");
			System.out.println("Enter 5. display");
			System.out.println("Enter 0.Exit");

			System.out.println("Enter your choice: ");
			ch = scanner.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data to enqueue from front");
				int data = scanner.nextInt();
				deque.enqueueFront(data);
				break;
			case 2: 
				System.out.println("Enter data to enqueue from rear");
				int data2 = scanner.nextInt();
				deque.enqueueRear(data2);
				break;
			case 3:
				int data3 = deque.dequeueFront();
				if(data3==-1) 
				{
					System.out.println("Queue is Empty!!!");
					break;
				}
				else {
				System.out.println("Deleted element is: "+data3);
				break;
				}
			case 4: 
				int data4 = deque.dequeueRear();
				if(data4==-1) 
				{
					System.out.println("Queue is Empty!!!");
					break;
				}
				else {
				System.out.println("Deleted element is: "+data4);
				break;
				}
			case 5: 
				deque.display();
				break;
			}
			
		}while(ch!=0);

	}

}

