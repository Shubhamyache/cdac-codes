package Shapes;

public class Point {
	 private int x,y;
	  public Point(){}
	  public Point(int x,int y)
	  {
	    this.x=x;
	    this.y=y;
	  }
	  public void Display()
	  {
	    System.out.println("x= "+x+" y= "+y);
	  }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x= "+x+" y= "+y ;
	}
	  

}
