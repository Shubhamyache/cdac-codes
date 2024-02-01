package CustomerData.utility;

import java.io.Serializable;

public class Date implements Serializable  {
	
	 private int dd,mm,yy;

	public Date() {
		dd=mm=1;
		yy=2001;
	}

	public Date(int dd, int mm, int yy) {
		//super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dd+"/"+mm+"/"+yy ;
	}
	
	 
	}


