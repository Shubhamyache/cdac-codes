package LambdaInFun;

import java.util.Set;
import java.util.TreeSet;

public class LambdaDemo 
{
	public static void main(String[] args)
	{
		Set<Employee2> emp= new TreeSet<>((Employee2 e1,Employee2 e2)-> {
			if(e1.salary>e2.salary)
				return 1;
			else if(e1.salary<e2.salary)
				return -1;
			else if(e1.salary==e2.salary) 
				return (e1.name).compareTo(e2.name);
			return 0;	
		});
		
		Employee2 e1 = new Employee2(1,"shubham",10000);
		Employee2 e2 = new Employee2(2,"rohit",20000);
		Employee2 e3 = new Employee2(3,"pratiksha",30000);
		Employee2 e4 = new Employee2(4,"gayatri",40000);
		Employee2 e5 = new Employee2(5,"bhushan",50000);
		Employee2 e6 = new Employee2(6,"Ahushan",50000);

		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		for(Employee2 e:emp) {
			System.out.println(e);
		}

		
		
	}
}