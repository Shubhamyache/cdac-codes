package FileIOPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student[] allStudents = new Student[3];
		allStudents[0] = new Student(90,101,"Shuabhm",96000,23);
		allStudents[1]= new Student(91,102,"rohit",50000,24);
		allStudents[2] = new Student(92,103,"Pratiksha",95000,25);
		File f = new File("C:\\Users\\HP\\Desktop\\Java Sept 2023\\StreamFileIo\\src\\FileIOPackage\\student.txt");
		
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(f));
		for(Student e:allStudents)
		{
			oos.writeObject(e);
		}
		oos.close();
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str;
		while(( str = br.readLine())!= null) {
			System.out.println(str);
		}
		
//		for(Student e: allStudents) {
//			System.out.println(e);
//		}
	
		

	}

}
