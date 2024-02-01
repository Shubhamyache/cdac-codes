public class mainBox{
	public static void main(String[] args){
	int res1;
	int res2;
	
	Box b1 = new Box();
	res1 = b1.volume();
	System.out.println("The volume of the box b1 is: "+res1);
	
	Box b2 =new Box(10,20,30);
	res2 = b2.volume();
	System.out.println("The volume of the box b2 is: "+res2);
	
	}
}