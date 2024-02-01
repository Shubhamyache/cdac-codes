package _11_DymanicStack;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int ch;
		int data;
		cStack s1=new cStack();
		Scanner sc=new Scanner(System.in);
		do
		{
			
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			System.out.println("Enter your Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println( "Enter Data");
				data=sc.nextInt();
				s1.push(data);
				break;
			case 2:
				try
				{
					data=s1.pop();
					System.out.println(" Delete Data Is "+data);
					
				}
				catch(StackEmptyException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				s1.display();
				break;
			}
			
		}while(ch!=0);
	}

}
