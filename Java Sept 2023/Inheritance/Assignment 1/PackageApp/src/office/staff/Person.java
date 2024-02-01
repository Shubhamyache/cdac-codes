package office.staff;

import office.utility.Date;

public class Person {
	String name;
	Date bdate;
	
	public Person() {
		name="NA";
		bdate = new Date(1,1,2000);	}

	public Person(String name, int dd,int mm, int yy) {
		super();
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void display() {
		System.out.println("Person Display..");
		System.out.println("Name: "+name);
		System.out.println("Birthday: ");
		bdate.display();
		
	}
	
	

}
