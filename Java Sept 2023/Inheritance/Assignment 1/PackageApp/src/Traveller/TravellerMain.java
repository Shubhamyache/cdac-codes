package Traveller;

import EmpType.Admin;
import EmpType.Programmer;
import EmpType.SalesPerson;
import office.utility.Emp;

public class TravellerMain {

	public static void main(String[] args) {
		
		Emp [] arrT = {new SalesPerson("shubham",1,2,2000,101,10000,1000,4.5f,7),new Programmer("Sana",2,5,2002,102,20000,18,500), new Admin("Ajay",12,3,2000,103,50000,6000)};
		for(Emp e: arrT) {
			if(e instanceof ITraveller) {
				System.out.println(((ITraveller)e).calculateTA());
			}
		}
		
		// TODO Auto-generated method stub

	}

}
