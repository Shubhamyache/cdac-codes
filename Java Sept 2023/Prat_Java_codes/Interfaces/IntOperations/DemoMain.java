package Interfaces.IntOperations;

import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();	
		IntOperations i=new MyNumber(n);
		System.out.println(i);

	}

}
