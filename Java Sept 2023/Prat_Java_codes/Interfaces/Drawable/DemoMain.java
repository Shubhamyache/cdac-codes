package Interfaces.Drawable;

import Interfaces.Drawable.Class.Circle;
import Interfaces.Drawable.Class.Triangle;

public class DemoMain {

	public static void main(String[] args) {
		Drawable[] d=new Drawable[2];
		d[0]= new  Circle(20.5);
		d[1]=new Triangle(20.3,30.2);
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
			d[i].drawShape();
		}

}
}
