package _03_Stack;

import java.util.Scanner;

public class DemoCstack {

	public static void main(String[] args) 
	{
		Cstack stack = new Cstack(5);
		
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do 
		{
			System.out.println("Enter 1.push 2.pop 3.display 0.exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter character to push: ");
				char in = sc.next().charAt(0);
				stack.push(in);
				break;
			case 2:
				System.out.println("Popped element is"+stack.pop());
				break;
			case 3: 
				stack.display();
				break;
			}
				
				
			
		}while(choice!=0);
				
	}

}
