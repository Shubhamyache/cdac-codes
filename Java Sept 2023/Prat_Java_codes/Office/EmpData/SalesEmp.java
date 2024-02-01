package Office.EmpData;

import Interfaces.ITraveler;
import Office.Emp;

public class SalesEmp extends Emp implements ITraveler  {
	private double target;
	private double insentive;
	private int daysTravelled;
	public SalesEmp(String name, int dd, int mm, int yy, int eid, double salary, double target, double insentive,
			int daysTravelled) {
		super(name, dd, mm, yy, eid, salary);
		this.target = target;
		this.insentive = insentive;
		this.daysTravelled = daysTravelled;
	}
	



	public int getDaysTravelled() {
		return daysTravelled;
	}




	public SalesEmp() {
		super();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTarget= "+target+"\ninsentive= "+insentive;
	}



	@Override
	public double calSalary() {

		return salary+(target*insentive/100);
	}



	@Override
	public double calTA() {
		return (calSalary()+(daysTravelled*DA));
	}

}
