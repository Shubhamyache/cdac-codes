package LinkedList;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println(" Enter Number of Element  ");
		no=sc.nextInt();
		list1.createLinkesList(no);
		list1.display();
		list1.split();
		System.out.println();
		list1.reverse(list1.head);
		System.out.println();
	}

}
