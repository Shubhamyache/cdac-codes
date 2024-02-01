package TreeSet_Comparator;

import java.util.Set;
import java.util.TreeSet;

public class DemoComparatorEmp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<Employee1> emp= new TreeSet<>(new salaryComp());
		
		Employee1 e1 = new Employee1(1,"shubham",10000);
		Employee1 e2 = new Employee1(2,"shifa",20000);
		Employee1 e3 = new Employee1(3,"akshata",30000);
		Employee1 e4 = new Employee1(4,"eshal",5000);
		Employee1 e5 = new Employee1(5,"ajay",10000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		for(Employee1 e: emp) {
			System.out.println(e);
		}	
		

	}

}
