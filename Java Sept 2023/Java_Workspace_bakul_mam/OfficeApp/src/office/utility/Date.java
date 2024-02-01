package office.utility;

import java.io.Serializable;

public class Date implements Serializable 
{
	private int dd;
	private int mm;
	private int yy;	
	
	public Date() {
		//super();
		// TODO Auto-generated constructor stub
		this.dd = 1;
		this.mm = 1;
		this.yy = 1970;	
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	@Override
	public String toString() {
		//System.out.println(dd+"/"+mm+"/"+yy);
		return dd+"/"+mm+"/"+yy; 
	}
	
	

}
