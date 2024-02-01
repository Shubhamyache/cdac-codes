package CustomerData.staff;

import java.io.Serializable;

import CustomerData.utility.*;

public class Person implements Serializable
{
	
private String name;
private Date bdate;
public Person() {
	name="";
	bdate= new Date();
}
public Person(String name, int dd,int mm,int yy) {
	super();
	this.name = name;
	this.bdate = new Date(dd,mm,yy);
}
public void display()
{
	System.out.println("Name="+name);
	System.out.println("Birthdate: ");
	if(bdate!=null)
	{
		bdate.display();
	}
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "\nName= "+name+"\nBirthdate= "+bdate.toString();
}


}
