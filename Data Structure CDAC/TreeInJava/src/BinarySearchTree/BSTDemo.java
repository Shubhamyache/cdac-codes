package BinarySearchTree;

import java.util.Scanner;

public class BSTDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinarySearch bSearch = new BinarySearch();
		System.out.println("Enter 5 elemets for bst: ");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter data: ");
			int in = scanner.nextInt();
			bSearch.addNode(in);
		}
		System.out.println();
		//System.out.println("Enter data to found in BST");
		//int data = scanner.nextInt();
//		if(bSearch.searchNode(data)) {
//			System.out.println("Data found in BST. :)");
//		}
//		else {
//			System.out.println("data not found in BST. :(");
//		}
//		System.out.println();
//		bSearch.display();
		
//		System.out.println("Enter data to delete from BST");
//		int del = scanner.nextInt();
//		System.out.println("__________After deletion________");
//		
//		bSearch.deleteNode(del);
//		bSearch.display();
		
//		System.out.println("The largest element in BST is: "+bSearch.findLargest());
//		System.err.println("The smallest element in BST is: "+bSearch.findSmallest());
//		System.out.println("Height of a BST is: "+bSearch.heightTree(bSearch.rootNode));
//		
		System.out.println("Level order traversal");
		bSearch.levelOrderTraversal(bSearch.rootNode);
		
		
		
		
		
	}

}
