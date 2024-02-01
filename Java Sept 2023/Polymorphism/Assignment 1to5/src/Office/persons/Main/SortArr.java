package Office.persons.Main;

public class SortArr {
	public static void sortArray(int [] arr) {
		for(int i = 0;i<arr.length; i++) {
			for(int j=i+1;j<(arr.length-1);j++) {
				if(arr[i]<arr[j+1]) {
					int temp;
					temp = arr[i];
					arr[i]=arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		for(int i = 0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	
	public static void main(String[] args) 
	{
		int [] arr = {1,2,8,74,3,4,5};
		System.out.println("Result:");
		sortArray(arr);
		
		
	}

}
