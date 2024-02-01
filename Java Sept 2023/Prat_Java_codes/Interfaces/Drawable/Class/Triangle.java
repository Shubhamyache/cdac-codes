package Interfaces.Drawable.Class;

import Interfaces.Drawable.Drawable;

public class Triangle implements Drawable {
	private double base;
	private double height;
	
	
	public Triangle() {
		super();
	}


	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}


	public void drawShape() {
		
		System.out.println("In draw class of triangle");
		

	}

	
	public double calArea() {
		
		return 0.5*base*height;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nBase= "+base+"\nHeight= "+height+"\nArea= "+calArea();
		}
	

}
