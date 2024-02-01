package TreeSet_Hashing;

public class Employee implements Comparable{
	int eid;
	String name;
	double salary;
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		Employee obj = (Employee)o;
		int c = 0;
		if(this.salary>obj.salary) {
			c = 1;			
		}
		else if(this.salary<obj.salary) {
			c=-1;
		}
		else if(this.salary==obj.salary) {
			c = this.name.compareTo(obj.name);
		}
		return c;
	}
	

}
