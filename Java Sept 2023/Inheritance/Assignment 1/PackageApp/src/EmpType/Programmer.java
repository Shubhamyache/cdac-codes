package EmpType;

import Traveller.ITraveller;
import office.utility.Emp;

public class Programmer extends Emp implements ITraveller {
	int extraHour;
	int chargesPerHour;
	int Days;
	

	@Override
	public String toString() {
		return super.toString()+"\nextraHour=" + extraHour + ", chargesPerHour=" + chargesPerHour ;
	}

	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		return salary+extraHour*chargesPerHour;
	}

	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programmer(String name, int dd, int mm, int yy, int id, double sal,int extraHour, int chargesPerHour) {
		super(name, dd, mm, yy, id, sal);
		this.extraHour = extraHour;
		this.chargesPerHour = chargesPerHour;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTA() {
		// TODO Auto-generated method stub
		return salary+extraHour*chargesPerHour+Days*salary*DA/100;
	}

}
