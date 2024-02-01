package TreeSet_Comparator;

import java.util.Comparator;

public class Employee1{
	int eid;
	String name;
	double salary;
	public Employee1(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public Employee1() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}

class salaryComp implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		int c =0;
		if(o1.salary>o2.salary)
			c=1;
		else if(o1.salary<o2.salary)
			c=-1;
		else if(o1.salary==o2.salary) { //if salary is same then compare based on name
			c = o1.name.compareTo(o2.name);
			if(c==0) {			// if name is same then compare based on eid
				c = o1.eid - o2.eid;
			}
		}
		return c;
			
	}
	
}
