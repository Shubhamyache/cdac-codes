package StreamsAndFileIO.StreamsAndFileIOII;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import Office.Emp;

public class SerioalizationRead {

	public static void main(String[] args)throws Exception
	{
		Emp[]empty =new Emp[3];
		File f= new File("C:\\Users\\Dell\\Desktop\\Java\\Eclipse Assignment\\MyProject\\src\\StreamsAndFileIO\\MyFiles\\Employee.dat");
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
		for(int i=0;i<empty.length;i++)
		{
			Object o= ois.readObject();
			if(o instanceof Emp)
			{
				
				empty[i]=(Emp)o;
			}
		}
		
		ois.close();
		for (Emp e: empty)
		{
			System.out.println(e);
		}
	}

}
