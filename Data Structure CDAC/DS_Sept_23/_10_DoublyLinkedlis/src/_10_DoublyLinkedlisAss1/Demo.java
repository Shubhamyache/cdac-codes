package _10_DoublyLinkedlisAss1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int terms;
		LinkedList list1=new LinkedList();
		System.out.println(" Enter number Of Terms ");
		terms=sc.nextInt();
		list1.createLinkedList(terms);
		list1.display();
		int ch;
		do
		{
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Modify");
			System.out.println("5. Print Reverse");
			System.out.println("0. Exit");
			System.out.println("Enter Your Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			
			}
		}while(ch!=0);
	}

}
