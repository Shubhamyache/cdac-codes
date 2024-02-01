public class SearchMain{
	public static void main(String[] args){
		int result;
		int[] arr = {1,2,3,4,5,2};
		Search s1 = new Search();
		result = s1.SearchKey(arr,2);
		if(result==-1){
		System.out.println("Not found");
	}
	else{
				System.out.println("index: "+result);		
	}
}
}