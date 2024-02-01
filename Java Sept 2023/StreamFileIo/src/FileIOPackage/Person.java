package FileIOPackage;

import java.io.Serializable;

public class Person implements Serializable{
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

	@Override
	public String toString() {
		return "name=" + name + "bdate: "+bdate.toString();
	}
	
	
	
	

}
