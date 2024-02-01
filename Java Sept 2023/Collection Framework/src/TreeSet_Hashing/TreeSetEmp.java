package TreeSet_Hashing;

import java.util.TreeSet;
import java.util.*;

public class TreeSetEmp 
{
	public static void main(String[] args) 
	{
		
	
		Set<Employee> emp= new TreeSet<>();
		Employee e1 = new Employee(1,"Shubham",150000);
		Employee e2 = new Employee(2,"Rohit",60000);
		Employee e3 = new Employee(3,"shifa",80000);
		Employee e4 = new Employee(4,"kunal",40000);
		Employee e5 = new Employee(5,"shivani",88000);
		Employee e6 = new Employee(6,"akshata",88000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		for(Employee e : emp) 
			System.out.println(e);
		
		
	}
}
