package service;

public class Doctor extends Person {
	
	private String degree;
	private int regNo;
	private int salary;
	public String toString() {
		return "Degree: "+degree+"\nReg No: "+regNo+"\nSalary: "+salary;
		
	}
	
	
	
	public Doctor() {
		super();
	}



	public Doctor(String name, int dd, int mm, int yy, String degree, int regNo, int salary) {
		super(name, dd, mm, yy);
		this.degree = degree;
		this.regNo = regNo;
		this.salary = salary;
	}


	public Doctor(String degree, int regNo, int salary) {
		super();
		this.degree = degree;
		this.regNo = regNo;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Degree: "+degree);
		System.out.println("Register no: "+regNo);
		System.out.println("Salary: "+salary);
	}

}
