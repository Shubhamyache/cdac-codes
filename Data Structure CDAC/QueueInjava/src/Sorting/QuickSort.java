package Sorting;

import java.util.Scanner;

public class QuickSort {
	public static void quickSort(int arr[], int low, int high)
	{
		int pivot = partition(arr, low, high);//pivot element is decided by partition method.
		quickSort(arr, low, pivot-1);//sort elements less than pivot
		quickSort(arr, pivot+1, high);//sort elements more then pivot
		
	}
	public static int partition(int arr[],int low,int high) {
		int pivot = arr[high];
		int temp;
		int i = low-1;
		
		for(int j=low;j<=high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				temp = arr[j];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int arr[] = new int[5];
		System.out.println("Enter 5 elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(" "+arr[i]);			
		}
		
		quickSort(arr, 0, arr.length - 1);
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(" "+arr[i]);			
		}
	}

}
