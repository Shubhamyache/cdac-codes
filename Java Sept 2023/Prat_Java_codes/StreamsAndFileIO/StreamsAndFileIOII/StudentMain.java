package StreamsAndFileIO.StreamsAndFileIOII;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Office.Emp;

public class StudentMain {

	public static void main(String[] args)throws Exception {
		Student []allstd=new Student[3];
		allstd[0]=new Student("pratiksha", 1, 1, 2000, "101", 22, "PGDAC", 10, 110000);
		allstd[1]=new Student("Dhana", 2, 2, 2001, "102", 21, "PGDAC", 10, 110000);
		allstd[2]=new Student("Shubu", 3, 3, 2003, "103", 20, "PGDAC", 10, 110000);
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:\\Users\\Dell\\Desktop\\Java\\Eclipse Assignment\\MyProject\\src\\StreamsAndFileIO\\MyFiles\\Student.dat"));
		for(Student e:allstd)
		{
			oos.writeObject(e);
		}
		oos.close();
	}

}
