package StreamsAndFileIO.StreamsAndFileIOII;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Office.Emp;
import Office.EmpData.Admin;
import Office.EmpData.Programmer;
import Office.EmpData.SalesEmp;

public class SerializationDemo {

	public static void main(String[] args) throws Exception
	{
		Emp []allemp=new Emp[3];
		allemp[0]= new SalesEmp("Shub", 1, 2, 2000, 101, 200000, 200, 4.5,4);
		allemp[1]= new Programmer("Pratiksha", 1, 1, 2001, 102, 30000, 4, 600,5);
		allemp[2]= new Admin("Dhana", 2, 3, 1998, 103, 400000, 3000);
		
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:\\Users\\Dell\\Desktop\\Java\\Eclipse Assignment\\MyProject\\src\\StreamsAndFileIO\\MyFiles\\Employee.dat"));
		for(Emp e:allemp)
		{
			oos.writeObject(e);
		}
		oos.close();
	}
	

}
