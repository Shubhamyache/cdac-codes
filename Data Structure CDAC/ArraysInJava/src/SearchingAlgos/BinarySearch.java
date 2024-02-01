package SearchingAlgos;

public class BinarySearch {
	public static int binarySearch(int arr[], int key) {
		int mid,lower,upper;
		lower = 0;
		upper = arr.length - 1;
		while(lower<=upper) {
			
			mid = (lower+upper)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]>key) {
				upper = mid-1;
			}
			else {
				lower = mid+1;
			}
		
		}
		return 0;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int keyIndex = binarySearch(arr, 8);
		if(keyIndex==0) {
			System.out.println("Element is not found!!");
		}
		else {
			System.out.println("Element is found at index: "+keyIndex);
			
		}
		
	}

}
