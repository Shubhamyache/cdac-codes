package office.staff;

import office.utility.Person;

public abstract class Emp extends Person {
	//complete state - name,bdate,empid,salary
	//extra state
	private int empid;
	protected double salary;
	//transient int daysWorked;
	
	public Emp() {
		//super();
		//empid=0;
		//salary = 0.0;
	}

	public Emp(String name, int dd, int mm, int yy, int empid, double salary) {
		super(name, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;		
	}

	//annotation - starts with @ symbol
	//@Override
	/*public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}*/
	
	
	//extra behavior
	public void show()
	{
		
	}

	public int getEmpid() {
		return empid;
	}

	@Override
	public String toString() {
		return  super.toString()+"\nEmpid : "+empid+"\nSalary : "+salary;
	}
	
	/*public double calSalary()
	{
		return salary;
	}*/
	
	public abstract double calSalary();
	
	
	
	

}
