package LinkedList;

import java.util.List;
import java.util.Scanner;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}
	public void addNode(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
			head=newnode;
		else
		{
			Node move=head;
			while(move.next!=null)
				move=move.next;
			move.next=newnode;
		}
	}
	public void display()
	{
		Node move=head;
		System.out.println();
		while(move!=null)
		{
			System.out.print(move.data+" ");
			move=move.next;
		}
		System.out.println();
		
	}
	  
	

	public void reverse(Node move)
	{
		if(move!=null)
		{
			reverse(move.next);
			System.out.print(move.data+" ");
		}
		
	}
	public void split()
	{
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		Node move=head;
		while(move!=null)
		{
			if(move.data%2==0)
				l1.addNode(move.data);
			else
				l2.addNode(move.data);
			move=move.next;
		}
		l1.display();
		l2.display();
		
	}
	public void createLinkesList(int no)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=no;i++)
		{
			System.out.println(" Enter Value ");
			int data=sc.nextInt();
			addNode(data);
			
		}
	}

}














