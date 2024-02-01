package _10_DoublyLinkedlisAss1;

import java.util.Scanner;

public class LinkedList {
	static class Node
	{
		int data;
		Node prev,next;
		public Node(int d)
		{
			data=d;
			prev=next=null;
		}
		public String toString()
		{
			return data+" ";
		}
		
   }
	Node head;
	public LinkedList()
	{
		head=null;
	}
	public void addNode(int data)
	{
		Node n1=new Node(data);
		if(head==null)
			head=n1;
		else
		{
			Node move=head;
			while(move.next!=null)
				move=move.next;
		   move.next=n1;
		   n1.prev=move;
		}
	}
	public void createLinkedList(int terms)
	{
		int data;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=terms;i++)
		{
			System.out.println(" Enter Data ");
			data=sc.nextInt();
			addNode(data);
		}
		
	}
	public void display()
	{
		Node move=head;
		System.out.println();
		while(move!=null)
		{
			System.out.print(move.data+"  ");
			move=move.next;
		}
		System.out.println();
	}

}













