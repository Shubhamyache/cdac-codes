package _05_Sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int a[])
	{
		int i,j,temp;
		int size=a.length;
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Size For Array ");
		no=sc.nextInt();
		int arr[]=new int[no];
		BasicArray.accept(arr);
		BasicArray.display(arr);
		bubbleSort(arr);
		BasicArray.display(arr);
		
		
	}

}