package Office.persons;


public abstract class Emp extends Person {
	private int empId;
	protected double salary;

	public Emp() {
		// TODO Auto-generated constructor stub
		super();
		empId = 0;
		salary =  0.0;
		
	}

	public Emp(String name, int dd, int mm, int yy,int id, double sal) {
		super(name, dd, mm, yy);
		empId = id;
		salary = sal;
		// TODO Auto-generated constructor stub
	}
	public abstract double calSal();

	@Override
	public String toString() {
		return super.toString()+"\nEmpId=" + empId + ", salary=" + salary ;
	}
	
	
//	public void display() {
//		System.out.println("EMP display..");
//		super.display();
//		System.out.println("Emp Id: "+empId);
//		System.out.println("Emp Salary: "+salary);
//
//	}

}
