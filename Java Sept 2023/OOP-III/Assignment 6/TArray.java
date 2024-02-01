public class TArray{
	public static void main(String[] args){
		int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		int []arrRsum;
		int []arrCsum;
		
		 arrRsum = new int[3];
		 arrCsum = new int[3];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arrRsum[i] = arrRsum[i]+arr[i][j];				
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arrCsum[i] = arrCsum[i]+arr[j][i];				
			}
		}
		System.out.println("The row sum is: ");
		for(int i =0;i<3;i++){
					System.out.println(arrRsum[i]);						
		}
		System.out.println("The Column sum is: ");
		for(int i = 0;i<3;i++){
					System.out.println(arrCsum[i]);
		}
		
	}
	
	
}