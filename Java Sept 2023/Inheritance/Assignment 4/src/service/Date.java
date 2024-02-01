package service;
public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {}
	public Date(int d,int m, int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	public void display() {
		System.out.println("Date display");
		System.out.println(dd+"/"+mm+"/"+yy);
	}

}

