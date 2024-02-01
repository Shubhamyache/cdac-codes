package Office.EmpData;

import Interfaces.ITraveler;
import Office.Emp;

public class Programmer extends Emp implements ITraveler {
	private int extraHour;
	private double chargePerHour;
	private int daysTravelled;
	public Programmer() {
		super();
		
	}
	
	public Programmer(String name, int dd, int mm, int yy, int eid, double salary, int extraHour, double chargePerHour,
			int daysTravelled) {
		super(name, dd, mm, yy, eid, salary);
		this.extraHour = extraHour;
		this.chargePerHour = chargePerHour;
		this.daysTravelled = daysTravelled;
	}
	

	public int getDaysTravelled() {
		return daysTravelled;
	}

	@Override
	public double calSalary() {

		return salary+(extraHour*chargePerHour);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nextra Hr= "+extraHour+"\ncharge per hr= "+chargePerHour;
	}

	@Override
	public double calTA() {

		return calSalary()+(daysTravelled*DA/100);
	}

}
