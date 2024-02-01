package Person;

public class Rectangle implements Drawable {
	private int length;
	private int breadth;

	@Override
	public void drawshape() {
		System.out.println("In Rectangle drawshape method..");
		// TODO Auto-generated method stub

	}

	public Rectangle() {
		super();
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

}
