public class mainPoint
{
	public static void main(String[] args)
	{
		Point p1 = new Point();
		p1.display();
		
		Point p2 = new Point(10,20);
		p2.display();
		
		Point p3 = p2;
		p3.display();
		
	}
}