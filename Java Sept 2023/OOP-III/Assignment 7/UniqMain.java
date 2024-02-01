public class UniqMain{
	public static void main(String[] args)
	{
	int [] arr={1,2,3,3,4,5};
	
	boolean res = true;
	Uniq q1 = new Uniq();
	
	res = q1.isUnique(arr);
	
	if(res)
	{
		System.out.println("Array has Uniq elements.");
	}
	else{
				System.out.println("Array not have Uniq elements.");	
	}
	}
}