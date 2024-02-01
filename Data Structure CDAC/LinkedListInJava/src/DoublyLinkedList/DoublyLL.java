package DoublyLinkedList;

import java.util.Scanner;

public class DoublyLL {
	Node headNode;
	public DoublyLL() 
	{
		headNode = null;
	}
	
	public void addNodeEnd(int data) {
		Node n1 = new Node(data);
		if(headNode==null) {
			headNode=n1;
		}
		else {
			Node moveNode = headNode;
			while(moveNode.nextNode!=null) {
				moveNode = moveNode.nextNode;
			}
			moveNode.nextNode = n1;
			n1.prevNode = moveNode;
		}
	}
	
	public void addNodeBeg(int data) {
		Node n1 = new Node(data);
		if(headNode==null) {
			headNode=n1;
		}
		else {
			n1.nextNode = headNode;
			headNode.nextNode.prevNode = n1;
			headNode = n1;
		}
	}
	
	public void modify_data(int data)
	{
		Node move = headNode;
		
		while(move.data != data) {
			move = move.nextNode;			
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter data to replace "+data+" :");
		int newdata = scanner.nextInt();
		move.data = newdata;
	}
	public int size() {
		Node moveNode = headNode;
		int count=0;
		while(moveNode!=null) {
			count++;
			
		}
		return count;
	}
	
	public void modify_pos(int pos,int data) {
		
	}
	
	public void printReverse() {
		Node moveNode = headNode;
		System.out.println(("__________Reverse Linked List_____________"));
		while(moveNode.nextNode!=null) {
			moveNode = moveNode.nextNode;
		}
		while(moveNode!=headNode) {
			System.out.println(moveNode.data);
			moveNode = moveNode.prevNode;
		}
		if(moveNode==headNode) {
			System.out.println(moveNode.data);
		}
		
	}
		
	
	
	public void display() {
		Node moveNode = headNode;
		while(moveNode!=null) {
			System.out.println(moveNode.data);
			moveNode = moveNode.nextNode;
		}
	}

}
