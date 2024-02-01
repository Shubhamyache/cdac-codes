package ComparerPackage;

public class Student {
	private int rollNo;
	private String name;
	private float percentage;
	
	public Student() {}

	public Student(int r,String n,float p) {
		rollNo = r;
		name = n;
		percentage = p;
		// TODO Auto-generated constructor stub
	}
	
	public int getSid() {
		return rollNo;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "RollNo=" + rollNo + ", Name=" + name + ", Percentage=" + percentage;
	}

	public int getRollno() {
		// TODO Auto-generated method stub
		return rollNo;
	}
	

}
