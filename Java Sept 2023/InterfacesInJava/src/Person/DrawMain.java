package Person;

public class DrawMain {

	public static void main(String[] args) {
		Drawable [] d = new Drawable[3];
		d[0] = new Circle(7);
		d[1] = new Rectangle(10,20);
		d[2]=new Triangle(20,40);
		
		for(int i = 0;i<3;i++) {
				System.out.println(d[i].calArea());
				d[i].drawshape();

		}
		
		
		// TODO Auto-generated method stub
		

	}

}
