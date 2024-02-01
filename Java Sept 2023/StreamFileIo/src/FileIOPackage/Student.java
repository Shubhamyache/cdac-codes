package FileIOPackage;

import java.io.Serializable;

public class Student implements Serializable{
	int PRN;
	Course courseName;
	transient int age;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int prn,int cid, String cn, double fee,int age)
	{
		PRN = prn;
		courseName = new Course(cid,cn,fee);
		this.age = age;
		
	}
	@Override
	public String toString() {
		return "PRN Num: "+PRN+"Age: "+age+" "+"course: "+courseName.toString();
	}
	

}
