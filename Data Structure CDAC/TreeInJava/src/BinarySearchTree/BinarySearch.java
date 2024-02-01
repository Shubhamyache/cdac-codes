package BinarySearchTree;

import java.util.Scanner;

public class BinarySearch
{
	TNode rootNode;
	Scanner scanner = new Scanner(System.in);
	
	public BinarySearch() {
		rootNode = null;
	}
	public void addNode(int data)
	{
		TNode n1 = new TNode(data);
		if(rootNode==null)
		{
			rootNode = n1;
			System.out.println("Root is created!!!");
			return;
		}
		
		int ch;
		TNode moveNode = rootNode;
		while(true)
		{

			if(n1.data>moveNode.data) {    // data is greater than root so insert it on right side.
				if(moveNode.rightNode == null) {
			
				moveNode.rightNode = n1;
				System.out.println("Node added to right of"+moveNode.data);
				return;
				}
				else 
					moveNode = moveNode.rightNode;
				
				
			}
			if(n1.data<moveNode.data) {   // data is smaller than root so insert it on left side.
				if(moveNode.leftNode == null) {
			
				moveNode.leftNode = n1;
				System.out.println("Node added to right of"+moveNode.data);
				return;
				}
				else {
					moveNode = moveNode.leftNode;
				}
				
			}
		} //while end
		
	} // addnode end
	
	public void preOrder(TNode move) {
		if(move!=null) {
			System.out.println(move.data);
			preOrder(move.leftNode);
			preOrder(move.rightNode);
		}
	}
	
	public void inOrder(TNode move) {
		if(move!=null) {
			
			inOrder(move.leftNode);
			System.out.println(move.data);
			inOrder(move.rightNode);
		}
	}
	
	public void postOrder(TNode move) {
		if(move!=null) {			
			postOrder(move.leftNode);
			postOrder(move.rightNode);
			System.out.println(move.data);
		}
	}
	
	public boolean searchNode(int data) {
		TNode tempNode = rootNode;
		TNode tagNode = null;
		while(tempNode!=null && tempNode.data != data) {
			tagNode = tempNode;
			if(data>tempNode.data) 
				tempNode = tempNode.rightNode;
			else 
				tempNode = tempNode.leftNode;
		}
		
		if(tempNode!=null)
		{
			if(tempNode.data==data) 
				return true;			
			else 
				return false;
			
		}
		return false;
		
	}
	
	public void deleteNode(int data) 
	{
		TNode tempNode = rootNode;
		TNode tagNode = null;
		while(tempNode!=null && tempNode.data != data)
		{
			tagNode = tempNode;
			if(data>tempNode.data) 
				tempNode = tempNode.rightNode;
			else 
				tempNode = tempNode.leftNode;
		}
		if(tempNode!=null)
		{
			if(tempNode.leftNode==null)
			{
				if(tagNode.data<tempNode.data)
					tagNode.rightNode = tempNode.rightNode;
				else {
					tagNode.leftNode = tempNode.rightNode;
				}
			}
			
			if(tempNode.rightNode==null) {
				if(tagNode.data>tempNode.data)
					tagNode.leftNode=tempNode.leftNode;
				else {
					tagNode.rightNode=tempNode.leftNode;
				}
			}
			if(tempNode.leftNode!=null) 
			{
				if(tempNode.rightNode!=null)
				{
					TNode tr = tempNode.rightNode;
					while(tr.leftNode!=null)
						tr = tr.leftNode;
					tr.leftNode=tempNode.leftNode;
				}
				if(tagNode.data<tempNode.data)
					tagNode.rightNode = tempNode.rightNode;
				else 
					tagNode.leftNode = tempNode.rightNode;
			}
		}
		
	}
	
	public int findLargest() {
		TNode moveNode = rootNode;
		while(moveNode.rightNode!=null ) {
			moveNode = moveNode.rightNode;
			
		}
		return moveNode.data;
	}
	
	public int findSmallest() {
		TNode moveNode = rootNode;
		while(moveNode.leftNode!=null ) {
			moveNode = moveNode.leftNode;
			
		}
		return moveNode.data;
	}
	
	public int heightTree(TNode move) {
		if(move==null)
			return -1;
		int lh = heightTree(move.leftNode);
		int rh = heightTree(move.rightNode);
		return lh>rh?lh+1:rh+1;
		
	}
	
	public void levelOrderTraversal(TNode move) 
	{
		TNode moveNode = rootNode;
		QueueBST q = new QueueBST();
		q.enQueue(moveNode);
		while(!q.isEmpty()) 
		{
			moveNode = q.deQueue();
			System.out.println(moveNode.data);
			if(moveNode.leftNode!=null) {
				q.enQueue(moveNode);
				//moveNode = moveNode.leftNode;
			}
			if(moveNode.rightNode != null) {
				q.enQueue(moveNode);
				//moveNode = moveNode.rightNode;
			}
						
		}
	}
	
	
	public void display() {
//		System.out.println("__________preOrder____________");
//		preOrder(rootNode);
		
		System.out.println("__________inOrder____________");
		inOrder(rootNode);
		
//		System.out.println("__________postOrder____________");
//		postOrder(rootNode);
//		
		
	}

}






