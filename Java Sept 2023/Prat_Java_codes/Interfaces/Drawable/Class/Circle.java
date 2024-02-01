package Interfaces.Drawable.Class;

import Interfaces.Drawable.Drawable;

public class Circle implements Drawable {
    private double radius;
    
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void drawShape() {
	System.out.println("In draw of circle");

	}
	public double calArea() {
		
		return PI*radius*radius;
	}

	@Override
	public String toString() {
		
		return "\nRadius"+radius+"\nArea= "+calArea();
	}
	

}
