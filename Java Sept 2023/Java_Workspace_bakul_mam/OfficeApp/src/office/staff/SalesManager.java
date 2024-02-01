package office.staff;

import office.utility.ITraveller;

public class SalesManager extends Emp implements ITraveller {
	private double target;
	private double incentive;
	private int daysTravelled;
	
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double target,
			double incentive, int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		this.daysTravelled = daysTravelled;
	}
	
	

	public int getDaysTravelled() {
		return daysTravelled;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTarget : "+target+"\nIncentive : "+incentive;
	}

	
	public double calSalary() {
		//basic salary+incentive
		//double gr_sal = super.calSalary()+ (target*incentive/100);
		double gr_sal = salary + (target*incentive/100) + calculateTA();
		return gr_sal;
	}

	@Override
	public double calculateTA() {
		//days*DA(salary*DA/100)
		return daysTravelled*(salary*DA/100);
	}
	
	
	

}
