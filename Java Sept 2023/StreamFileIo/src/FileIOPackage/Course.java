package FileIOPackage;

import java.io.Serializable;

public class Course implements Serializable{
	int courseId;
	String courseName;
	double fees;
	public Course(int courseId, String courseName, double fees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "courseId= " + courseId + ", courseName= " + courseName + ", fees= " + fees ;
	}
	
	
	

}
