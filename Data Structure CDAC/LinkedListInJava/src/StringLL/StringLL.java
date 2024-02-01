package StringLL;

import java.util.Scanner;


public class StringLL {
	SNode headNode;
	public StringLL() {
		headNode = null;
	}
	public void addNodeEnd(String name) {
		SNode move, newnode;
		newnode = new SNode(name);
		
		if(headNode==null) {
			headNode=newnode;		
		}
		else 
		{
			move=headNode;
			while(move.next!=null)
			{
				move = move.getNext();
			}
			move.next=newnode;
		
		}
	}
	
	public void addNodeBeg(String name) {
		SNode move, newnode;
		newnode = new SNode(name);
		
		if(headNode==null) {
			headNode=newnode;		
		}
		else 
		{
			
			newnode.next=headNode.next;
			headNode = newnode;
		
		}
	}
	
	
	public void createLL(int size)
	{
		
		Scanner sc = new Scanner(System.in);
		String data;
		
		for(int i=0;i<size;i++) 
		{
			System.out.println("Enter data: ");
			
			data = sc.next();
			addNodeEnd(data);
			addNodeBeg("Shubham");
			
		}
	}
	public void printFirst() 
	{
		System.out.println(headNode.name);
	}
	
	public void printLast() 
	{
		SNode moveNode = headNode;
		while(moveNode.next != null) {
			moveNode = moveNode.next;
		}
		if(moveNode.next==null) {
			System.out.println(moveNode.name);
		}
		
	}
	
	
	public void modifyAccData(String data)
	{
		SNode moveNode = headNode;
		while(moveNode.next.name != data) {
			moveNode = moveNode.next;
			
		}
		if(moveNode.next.name==data) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter String data to be inserted in that position: ");
			String ddata = scanner.next();
			SNode newnodeNode = new SNode(ddata);
			
			newnodeNode.next = moveNode.next.next;
			moveNode.next = newnodeNode;
			
		}
	}
	
	public void modifyAccToPos(int pos, String name) {
		SNode move=headNode;
		SNode newnodeNode = new SNode(name);
		
		for(int i=1;i<pos-1;i++) {
			move = move.next;
		}
		
		newnodeNode.next = move.next;
		move.next=newnodeNode;
		
	}
	
	public void delete(String data) {
		SNode move = headNode;
		SNode holdNode = null;
	
		
		while(move.next.name!=data) {
			move = move.next;			
		}
		
		move.next=move.next.next;
					
	}
	public void reverse(SNode moveNode) {
		
		if(moveNode!=null) {
			reverse(moveNode.next);
			System.out.println(moveNode.name);
		}
	}
	
	public void insertAt(int pos,String data) {
		SNode maxNode = headNode;
		SNode newNode = new SNode(data); 
		for(int i=1;i<pos-1;i++) {
			maxNode = maxNode.next;			
		}
		newNode.next = maxNode.next;
		maxNode.next = newNode;
		
	}
	
	public SNode findMid() {
		SNode slowNode=headNode;
		SNode fastNode=headNode;
		
		while(fastNode!=null &&  fastNode.next!=null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		return slowNode;
		
	}
	
	
			
	public void display() {
		System.out.println("______LINKED LIST______");
		SNode move = headNode;
		while(move!=null) {
			System.out.println("\t"+move.name);
			move = move.next;
		}
		
	}
	
	
	
	

}
