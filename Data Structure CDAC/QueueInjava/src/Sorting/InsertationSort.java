package Sorting;

import java.util.Scanner;

public class InsertationSort {
	public static void insertationSort(int arr[]) {
		int size = arr.length;
		int key,i,j;
		for( i=1;i<size-1;i++) {
			key= arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j = j-1;							
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[];
		
		
			System.out.println("Enter size of array");
			
			int size = scanner.nextInt();
			array = new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("Enter Element: ");
				int data = scanner.nextInt();
				array[i]=data;
				
			}
			insertationSort(array);
			System.out.println("Sorted array is: ");
			for(int i=0;i<size;i++)
				System.out.print(" "+array[i]);
		
				
				
		

	}

}
