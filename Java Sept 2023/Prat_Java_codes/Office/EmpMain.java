package Office;

import Interfaces.ITraveler;
import Office.EmpData.Admin;
import Office.EmpData.Programmer;
import Office.EmpData.SalesEmp;

public class EmpMain {

	public static void main(String[] args) {
		Emp []allemp=new Emp[3];
		allemp[0]= new SalesEmp("Shub", 1, 2, 2000, 101, 200000, 200, 4.5,4);
		allemp[1]= new Programmer("Pratiksha", 1, 1, 2001, 102, 30000, 4, 600,5);
		allemp[2]= new Admin("Dhana", 2, 3, 1998, 103, 400000, 3000);
		for(Emp e: allemp)
		{
			System.out.println(e);
			System.out.println("total Salary= "+e.calSalary());
			System.out.println("***********");
		}
		for(Emp e:allemp)
		{
			if(e instanceof ITraveler)
			{
				System.out.print(e.getEid()+" : ");
				if(e instanceof SalesEmp)
				{
					System.out.print(((SalesEmp)e).getDaysTravelled()+" : ");
				}
				if(e instanceof Programmer)
				{
					System.out.print(((Programmer)e).getDaysTravelled()+" : ");
				}
				
				System.out.print(((ITraveler)e).calTA());
				System.out.println();
				
			}
			
			
		}
		

	}

}
