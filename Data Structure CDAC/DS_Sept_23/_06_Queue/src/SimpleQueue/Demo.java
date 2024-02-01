package SimpleQueue;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Customer data=null;
		int ch;
		cQueue queue=new cQueue(5);
		Scanner sc=new Scanner(System.in);
		int cid;
		String name;
		do
		{
			
			System.out.println(" 1. Insert ");
			System.out.println(" 2. Delete ");
			System.out.println(" 3. Display ");
			System.out.println(" 0. Exit ");
			System.out.println(" Enter Your Choice  ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 :
				System.out.println("Enter Cust Id And Name ");
				cid=sc.nextInt();
				name=sc.next();
				data=new Customer(cid,name);
				queue.enQueue(data);
				break;
			case 2:
				data=queue.deQueue();
				if(data==null)
					System.out.println("Queue Is Empty ");
				else
					System.out.println(data);
				break;
			case 3:
				queue.display();
				break;
			}
		}while(ch!=0);
	}

}






















