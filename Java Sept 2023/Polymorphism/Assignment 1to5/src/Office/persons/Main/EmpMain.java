package Office.persons.Main;

import Office.persons.Emp;
import Office.persons.EmpType.Admin;
import Office.persons.EmpType.Programmer;
import Office.persons.EmpType.SalesPerson;

public class EmpMain 
{
	public static void main(String[] args) {
	Emp [] allemps = new Emp[3];
	
	allemps[0] = new SalesPerson("shubham",1,2,2000,101,100000,10000,5.5f);
	allemps[1] = new Programmer("Pratiksha",2,3,2001,102,50000,8,500);
	allemps[2] = new Admin("sana",3,7,2002,103,80000,7500);
	
	System.out.println("SalesPerson salary: "+allemps[0].calSal());
	System.out.println("Programmer salary: "+allemps[1].calSal());
	System.out.println("Admin salary: "+allemps[2].calSal());


	}
}
