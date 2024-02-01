package Shapes;

public class Color extends Point {
	private String color;
	static String []colors;
	static {
		colors= new String [3];
		colors[0]="red";
		colors[1]="green";
		colors[2]="blue";
	}
	public Color() {
		super();
		colors= new String [3];}
	public Color(int x, int y, String color) {
		super(x, y);
		boolean flag=false;
		for(int i=0; i<colors.length;i++)
			{
				if(colors[i].equalsIgnoreCase(color))
				{
					this.color=color;
					flag=true;
					break;
				}
				if(flag==false)
				{
					this.color="white";
				}
				
					
					
			}h
	}
	
}	
	
	


