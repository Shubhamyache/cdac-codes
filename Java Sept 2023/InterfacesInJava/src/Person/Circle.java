package Person;

public class Circle implements Drawable {
	private int radius;
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void drawshape() {
		System.out.println("In circle draw shape method..");

	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

}
