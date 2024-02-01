package Array_operations;

public class DisplayArray {
	public static void display(int arr1[],int arr2[]) {
		System.out.println("First Array: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("Second Array: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		display(arr1,arr2);
		// TODO Auto-generated method stub

	}

}
