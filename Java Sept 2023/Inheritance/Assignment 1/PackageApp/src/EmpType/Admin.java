package EmpType;

import office.utility.Emp;

public class Admin extends Emp {
	int bonus;
	
	
	@Override
	public String toString() {
		return super.toString()+"\nAdmin [bonus=" + bonus ;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int id, double sal,int bonus) {
		super(name, dd, mm, yy, id, sal);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		return salary+bonus;
	}

	

}
