package Hashing;

import java.util.Objects;

public class Student {
	int studId;
	String name;
	String city;
	float percentage;
	public Student(int studId, String name, String city, float percentage) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}

	@Override
	public int hashCode() {
		int hc=0;
		if(this.city.equalsIgnoreCase("Pune"))
			hc=1;
		else if(this.city.equalsIgnoreCase("Latur"))
			hc =2;
		else if(this.city.equalsIgnoreCase("Nashik"))
			hc=3;
		return hc;	
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) 
		{
			Student o = (Student)obj; //Object class obj is type casted to student.
			if(this.studId==o.studId && this.name == o.name) {
				return true;				
			}
			else 
				return false;                                                                                                                                                                     
		}
		return false;
	}
	
	
	
	

}
