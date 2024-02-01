package StreamsAndFileIO.StreamsAndFileIOII;

import java.io.Serializable;

public class Course implements Serializable {
	String coursename;
	int courseid;
	double fees;
	public Course(String coursename, int courseid, double fees) {
		super();
		this.coursename = coursename;
		this.courseid = courseid;
		this.fees = fees;
	}



	@Override
	public String toString() {
		
		return "\ncoursename= "+coursename+"\ncouseid= "+courseid+"\nFees"+fees;
	}
	

}
