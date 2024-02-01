public class mainBox{
	public static void main(String[] args)
	{
	
	Box [] arr = new Box[3];
	
	 arr[0] = new Box(11,22,33);
	
	 arr[1] = new Box(10,20,30);
	
	 arr[2] = new Box(44,55,66);
	
	
	for(int i=0;i<3;i++)
	{
		arr[i].volume();
	}
	
	}
}