package Practice;

public class ArrayMain {

	public static void main(String[] args) {
		int []newarr=new int[args.length];
		System.out.println("before swap= ");
		for (int i=0;i<args.length;i++)
		{
		System.out.print(args[i]+" ");
		newarr[i]=Integer.parseInt(args[i]);
		//System.out.print(newarr[i]+" ");
		
		}
		sort(newarr);
		
		
		//System.out.println(args[0]); 
		
		
		
		}
		public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
				}
			}
		}
		System.out.println("\nafter Sort= ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	

}
