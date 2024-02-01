package EmpType;

import Traveller.ITraveller;
import office.utility.Emp;

public class SalesPerson extends Emp implements ITraveller {
	private int target;
	private float incentive;
	private int days;
	
	
	@Override
	public String toString() {
		return super.toString()+"\ntarget=" + target + ", incentive=" + incentive ;
	}


	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SalesPerson(String name, int dd, int mm, int yy, int id, double sal,int target, float incentive,int day) {
		super(name, dd, mm, yy, id, sal);
		this.target = target;
		this.incentive = incentive;
		this.days = day;
	}


	


	@Override
	public double calculateTA() {
		return salary + target*incentive/100 + salary*days*DA/100;
	}


	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
