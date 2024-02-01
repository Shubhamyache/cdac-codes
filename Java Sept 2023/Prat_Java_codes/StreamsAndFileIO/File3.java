package StreamsAndFileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Interfaces.Student;

public class File3 {

	public static void main(String[] args) {
		BufferedReader br=null;
		try
		{
		br= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter Sid= ");
		 int sid=Integer.parseInt(br.readLine());
		 System.out.println("Enter name= ");
		 String name= br.readLine();
		 System.out.println("Enter percent= ");
		 float per=Float.parseFloat(br.readLine());
		 Student s= new Student(sid, name, per);
		 System.out.println("Grade= "+s.getgrade(per));
		 
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
			br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
