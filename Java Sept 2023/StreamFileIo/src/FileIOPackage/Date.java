package FileIOPackage;

import java.io.Serializable;

public class Date implements Serializable{
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {}
	public Date(int d,int m, int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	@Override
	public String toString() {
		return "dd=" + dd + ", mm=" + mm + ", yy=" + yy;
	}
	

}

