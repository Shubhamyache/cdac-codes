package StreamsAndFileIO.StreamsAndFileIOII;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class StudentDemoRead {

	public static void main(String[] args) throws Exception {
		Student[]allstd =new Student[3];
		File f= new File("C:\\Users\\Dell\\Desktop\\Java\\Eclipse Assignment\\MyProject\\src\\StreamsAndFileIO\\MyFiles\\Student.dat");
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
		for(int i=0;i<allstd.length;i++)
		{
			Object o= ois.readObject();
			if(o instanceof Student)
			{
				
				allstd[i]=(Student)o;
			}
		}
		
		ois.close();
		for (Student e: allstd)
		{
			System.out.println(e);
		}

	}

}
