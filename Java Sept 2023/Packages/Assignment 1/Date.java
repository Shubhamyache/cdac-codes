package office.utility;
public class Date{
	private int dd;
	private int mm;
	private int yy;
	
	public Date(int d, int m, int y){
		dd = d;
		mm = m;
		yy = y;		
	}
	
	public Date(){
		dd = 1;
		mm=1;
		yy=1970;
		
	}
	
	public void display(){
		System.out.println("Date: "+dd);
		System.out.println("Month: "+mm);
		System.out.println("Year: "+yy);
	}
}