package FileIOPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpSave {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Emp [] allEmp = new Emp[3];
		
		allEmp[0]=new Emp("Shubham",101);
		allEmp[1]=new Emp("Pratiksha",102);
		allEmp[2]=new Emp("Shivani",103);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\HP\\Desktop\\Java Sept 2023\\StreamFileIo\\src\\FileIOPackage\\emp.txt"));
		for(Emp e:allEmp) {
			oos.writeObject(e);
		}
		oos.close();
	}
}
