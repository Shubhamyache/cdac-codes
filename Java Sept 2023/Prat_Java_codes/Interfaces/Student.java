package Interfaces;

public class Student {
	private int rollno;
	private String name;
	private float merit;
	
	public Student() {
		super();
	}
	public Student(int rollno, String name, float merit) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.merit = merit;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public float getMerit() {
		return merit;
	}
	public String getgrade(double per)
	{
	if(per>80)
	 {
		return "A";
	 }
	if(per>=60)
	 {
		return "B";
	 }
	if(per>=40)
	 {
		return "C";
	 }
	else
		return "Fail";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nName= "+name+"  Roll no= "+rollno+"  Merit="+merit;
	}
	
}
