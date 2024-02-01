package Shape;

public class Point {
	private int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}
	

	@Override
	public String toString() {
		return "\nPoint [x=" + x + ", y=" + y + "]";
	}
	

}
