package FileIOPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentIO {

	public static void main(String[] args) throws IOException 
	{
		int rollNo;
		String name;
		int marks;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		Student[] s = new Student[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter roll number: ");
			rollNo = br.read();
			
			System.out.println("Enter name: ");
			name = br.readLine();
			
			System.out.println("Enter marks: ");
			marks = br.read();
			//s[i] = new Student(rollNo,name,marks);
			
		}
		
		for(int i=0;i<s.length;i++) 
		{
			System.out.println(s[i]);
		}
		
		
		// TODO Auto-generated method stub
		

	}

}
