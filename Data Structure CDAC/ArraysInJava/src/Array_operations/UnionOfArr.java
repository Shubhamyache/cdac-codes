package Array_operations;

public class UnionOfArr {
	
	public static int dupCount(int arr1[], int arr2[]) {
		int count = 0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					count++;
				}
				
			}
		}
		return count;
	}
	public static int[] arrayUnion(int arr1[],int arr2[]) {
		int cSize = arr1.length + arr2.length - dupCount(arr1,arr2);
		int c[] = new int[cSize];
		int i=0,j=0,k=0;
		boolean flag = true;
		for(i=0;i<arr1.length;i++) {
			c[k++]=arr1[i];
		}
		for(i=0;i<arr1.length;i++) {
			flag = true;
			for(j=0;j<arr2.length;j++) 
			{
				if(arr1[i]==arr2[j]) 
				{
					flag = false;
					break;
				}
			}
			if(flag) 
			{
				for(i=0;i<arr2.length;i++) 
				{
					c[k++]=arr2[i];
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int []arr1 = {1,2,3,4,5};
		int []arr2 = {1,2,3,9,8};
		int []res = arrayUnion(arr1, arr2);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+"\t");
		}	

	}

}
