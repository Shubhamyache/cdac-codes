package SinglyLinked;

import java.util.Scanner;



public class LinkedList {
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	private void addNode(int data) {
	
		Node move;
		
		Node newnode = new Node(data); // creating directly using Node class.
		if(head==null)
			head=newnode;
		else 
		{
			move = head;
			while(move.getLink() != null) 
				move = move.link;
			move.setLink(newnode);	
			//move.link = newnode;
			
		}	
		
	}
	public void createLinkList(int size) 
	{
		int i;
		Scanner sc = new Scanner(System.in);
		int data;
		for(i=1;i<=size;i++) {
			System.out.println("Enter Data ");
			data = sc.nextInt();
			addNode(data);
			}
	}
	
	public void display(Node head) {
		Node move = head;
		System.out.println("\n--------Linked List-----------");
		
		while(move!= null) {
			System.out.println("\t"+move.data);
			move = move.link;
		}
//		if(move.link==null) {
//			System.out.println("\t"+move.data);
//		}
	}
	
	public void sortedLL(Node head) 
	{
		Node tempNode = head;
		
		while(tempNode.link != null) {
			Node tagNode = tempNode.link;
			
			while(tagNode!=null)
			{
				if(tempNode.data>tagNode.data)
				{
					int t;
					t=tempNode.data;
					tempNode.data = tagNode.data;
					tagNode.data=t;
					
				}
				tagNode = tagNode.link;			
			}
			tempNode = tempNode.link;
		}
	}
	
	public int size(Node head) {
		Node moveNode = head;
		int count=0;
		while(moveNode!=null) {
			count++;
		}
		return count;
		
	}
	
	public void splitLL(Node head) 
	{
		
		Node moveNode = head;
		LinkedList evenLinkedList= new LinkedList();
		LinkedList oddLinkedList = new LinkedList();
		while(moveNode!=null)
		{
			if(moveNode.data%2==0)
			{
				evenLinkedList.addNode(moveNode.data);
			}
			else {
				oddLinkedList.addNode(moveNode.data);
			}
			moveNode=moveNode.link;
					
		}
		System.out.println("Even Link List: ");
		evenLinkedList.display(evenLinkedList.head);
		System.out.println("Odd Link List: ");
		oddLinkedList.display(oddLinkedList.head);
				
	}
	
	public void mergeLL(LinkedList secondLL) {
		Node moveNode = head;
		while(moveNode.link!=null) {
			moveNode=moveNode.link;			
		}
		moveNode.link=secondLL.head;
		
	}
	
	public Node reverseLL(Node head) {
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current!=null) {
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
			
		}
		return prev; // if function returns head of the linked list
	
	}
	
	public void evenOddsort(Node headNode) {
		Node move1 = headNode;
		
		
		while(move1!=null)
		{
			
			if(move1.data%2==0) {
				move1 = move1.link;
			}
			else 
			{
				Node move2 = move1.link;
				while(move2!=null)
				{
					if(move2.data%2==0) 
					{
						int temp = move1.data;
						move1.data = move2.data;
						move2.data = temp;
					}
					move2 = move2.link;
							
				}
				move1 = move1.link;		
			}
		}
		
	}
	
	public void split(int pos,int end) {
		Node moveNode = head;
		Node eNode = head;
		for(int i=1;i<pos;i++) {
			moveNode = moveNode.link;
		}
		
		for(int i=1;i<end;i++) {
			eNode = eNode.link;
		}
		
		
		
	}
	
	
}









