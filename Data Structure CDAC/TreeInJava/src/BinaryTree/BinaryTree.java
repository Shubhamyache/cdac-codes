package BinaryTree;

import java.util.Scanner;

public class BinaryTree
{
	Node rootNode;
	Scanner scanner = new Scanner(System.in);
	
	public BinaryTree() {
		rootNode = null;
	}
	public void addNode(int data)
	{
		Node n1 = new Node(data);
		if(rootNode==null)
		{
			rootNode = n1;
			System.out.println("Root is created!!!");
			return;
		}
		int ch;
		Node moveNode = rootNode;

		while(true)
		{
			System.out.println("where to insert this element 1.left 0.right: ");
			ch = scanner.nextInt();
		
		
			if(ch==1) {
				
					if(moveNode.leftNode==null) {
						moveNode.leftNode = n1;
						System.out.println("Node is added to left side of "+moveNode.data);
						return;
					}
					else {
						moveNode = moveNode.leftNode;
					}
				
			}
		
			else if(ch==0) {
				
					if(moveNode.rightNode==null) {
						moveNode.rightNode = n1;
						System.out.println("Node is added to right side of "+moveNode.data);
						
						return;
					}
					else {
						moveNode = moveNode.rightNode;
					}
				
			}
			else {
				System.out.println("Invalid input");
				return;
			}	
		
		}
		
}
	
	public void preOrder(Node move) {
		if(move!=null) {
			System.out.println(move.data);
			preOrder(move.leftNode);
			preOrder(move.rightNode);
		}
	}
	
	public void inOrder(Node move) {
		if(move!=null) {
			
			inOrder(move.leftNode);
			System.out.println(move.data);
			inOrder(move.rightNode);
		}
	}
	
	public void postOrder(Node move) {
		if(move!=null) {			
			postOrder(move.leftNode);
			postOrder(move.rightNode);
			System.out.println(move.data);
		}
	}
	
	public void display() {
		System.out.println("__________preOrder____________");
		preOrder(rootNode);
		
		System.out.println("__________inOrder____________");
		inOrder(rootNode);
		
		System.out.println("__________postOrder____________");
		postOrder(rootNode);
		
		
	}

}






