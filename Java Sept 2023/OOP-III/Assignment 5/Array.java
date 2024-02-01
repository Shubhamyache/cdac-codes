public class Array{
	public static void main(String[] args){
		int[] arr={1,2,3,5,4};
		int min = arr[0];
		for(int i = 0;i<5;i++){
			if(arr[i]<min)
			{
				min= arr[i];
			}	
		}
		
		int max = arr[0];
		for(int i = 0;i<5;i++){
			if(arr[i]>max)
			{
				max= arr[i];
			}	
		}
		
		int sum = 0;
		int avg;
		for(int i = 0;i<5;i++){
			sum = sum + arr[i];
			
		}
		avg = sum/5;
		
		System.out.println("The max element in array is : "+max);
		System.out.println("The min element in array is : "+min);
		System.out.println("The avg of array is : "+avg);	
	}
}