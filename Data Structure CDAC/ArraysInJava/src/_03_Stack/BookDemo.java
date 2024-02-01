package _03_Stack;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  MyStack bstack = new MyStack(5);
	  Book []b = new Book[5];
	 
	  Scanner sc = new Scanner(System.in);
	  
	  int choice;
	do 
		{
			System.out.println("Enter 1.push 2.pop 3.display 0.exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter book no push: ");
				int bid = sc.nextInt();
				System.out.println("Enter book name to push: ");
				String bname = sc.next();
				Book data = new Book(bid,bname);
				bstack.push(data);
				break;
			case 2:
				System.out.println("Popped element is"+bstack.pop());
				break;
			case 3: 
				bstack.display();
				break;
			}
				
				
			
		}while(choice!=0);
				
	}
	  

	}


