package LambdaInFun;

public class Employee2{
	int eid;
	String name;
	double salary;
	public Employee2(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public Employee2() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}
