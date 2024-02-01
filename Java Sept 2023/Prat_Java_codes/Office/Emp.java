package Office;

import CustomerData.staff.Person;

public abstract class Emp extends Person {
	private int eid;
	protected double salary;
	public Emp() {
		super();
		eid=0;
		salary=0;
	}
	public Emp(String name, int dd, int mm, int yy, int eid, double salary) {
		super(name, dd, mm, yy);
		this.eid = eid;
		this.salary = salary;
	}
	
	public int getEid() {
		return eid;
	}
	public abstract double calSalary();
	@Override
	public String toString() {
	
		return super.toString()+"\neid= "+eid+"\nSalary= "+salary;
		
	}

}