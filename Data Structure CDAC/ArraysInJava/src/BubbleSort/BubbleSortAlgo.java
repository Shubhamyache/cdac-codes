package BubbleSort;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		int []arr1 = {89,87,56,43,12,32};
		int size = arr1.length;
		int temp;
		int cntPass = 1;
		int swapCount = 0;
		
		for(int i=0;i<size-1;i++) //number of passes
		{
			for(int j=0;j<size-1-i;j++) 
			{
				if(arr1[j]>arr1[j+1]) 
				{
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1]= temp;
					swapCount++;
					
				}
				
			}
			System.out.println("Array after "+cntPass+" is: ");
			
			for(int i1=0;i1<arr1.length;i1++) 
				System.out.print("\t"+arr1[i1]);	
				cntPass++;
			System.out.println();
					
		}
		System.out.println("Sorted array is: ");
		for(int i1=0;i1<arr1.length;i1++)			
			System.out.print("\t"+arr1[i1]);
		System.out.println("The number of swaps are: "+swapCount);
		
	}
	
}
