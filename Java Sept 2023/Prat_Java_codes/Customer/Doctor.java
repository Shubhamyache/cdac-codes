package Customer;

import CustomerData.staff.Person;

public class Doctor extends Person {
	private String degree;
	private int  regno;
	double salary;
	public Doctor() {
		super();
		degree="";
		regno=0;
		salary=0;
	}
	public Doctor(String name, int dd, int mm, int yy, String deg, int rno, double sal) {
		super(name, dd, mm, yy);
		degree=deg;
		regno=rno;
		salary=sal;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Degree= "+degree+"\nregno= "+regno+"\nsalary= "+salary);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Degree= "+degree+"\nregno= "+regno+"\nsalary= "+salary +super.toString();
	}
	
    
	

}
