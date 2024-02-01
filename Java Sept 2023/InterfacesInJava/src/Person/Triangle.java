package Person;

public class Triangle implements Drawable {
	private int base;
	private int height;
	
	
	

	public Triangle() {
		super();
	}

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void drawshape() {
		System.out.println("In Triangle drawshape method..");
		// TODO Auto-generated method stub

	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return (0.5*(base*height));
	}

}
