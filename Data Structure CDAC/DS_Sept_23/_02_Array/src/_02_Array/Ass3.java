package _02_Array;

import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		// *********** Declare 2d Array ***********
		int a[][];
		int row,col,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Row and Col Size ");
		row=sc.nextInt();
		col=sc.nextInt();
		//---------  Create 2D Array ----------
		a=new int[row][col];
		//---------- Accept-------------
		for(i=0;i<row;i++)
		{
			System.out.println(" Enter "+col +" elements ");
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
			
		}
		//---------- Display------------
		System.out.println("-------- Array Is ---------");
		System.out.println();
		for(i=0;i<row;i++)
		{
			System.out.println();
			for(j=0;j<col;j++)
				System.out.print("\t"+a[i][j]);
		}
		System.out.println();
		
		
	}
}
