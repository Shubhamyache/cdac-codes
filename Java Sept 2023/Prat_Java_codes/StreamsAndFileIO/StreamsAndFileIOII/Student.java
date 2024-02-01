package StreamsAndFileIO.StreamsAndFileIOII;

import java.io.Serializable;

import CustomerData.staff.Person;

public class Student extends Person implements Serializable
{
	Course c;
	String prn;
	transient int age;
	public Student(String name, int dd, int mm, int yy, String prn, int age, String coursename, int courseid, double fees) {
		super(name, dd, mm, yy);
		this.c =new Course(coursename, courseid,fees);
		this.prn = prn;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+c+"\nPRN= "+prn+"\nAge= "+age;
	}
	
	
	
	

}
