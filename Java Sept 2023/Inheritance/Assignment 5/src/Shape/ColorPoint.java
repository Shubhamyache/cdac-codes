package Shape;

public class ColorPoint extends Point{
	private String color;
	static String [] colors;
	
	static {
		colors = new String[3];
		colors[0] = "red";
		colors[1] = "green";
		colors[2] = "blue";
	}
	

	public ColorPoint() {
		super();
	}


	public ColorPoint(int x, int y, String color) {
		super(x, y);
		boolean flag = false;
		for(int i=0; i<colors.length; i++) {
			if(colors[i].equals(color)) {
				this.color = color;
				flag = true;
				break;
				
			}
			flag = false;
		}
		if(flag==false) {
			this.color = "White";
		}
	}


	public String toString() {
		return "\ncolor=" + color +super.toString();
	}
		
	
	

}
