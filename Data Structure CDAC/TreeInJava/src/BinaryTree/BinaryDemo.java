package BinaryTree;

import java.util.Scanner;

public class BinaryDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryTree bTree = new BinaryTree() ;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter node data to insert in tree");
			int ch = scanner.nextInt();
			bTree.addNode(ch);
		}
		bTree.display();
		

	}

}
