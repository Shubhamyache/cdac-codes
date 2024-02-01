package FileIOPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpObjRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Emp[] allEmps = new Emp[3];
		File f = new File("C:\\Users\\HP\\Desktop\\Java Sept 2023\\StreamFileIo\\src\\FileIOPackage\\emp.txt");
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		for(int i=0;i<allEmps.length;i++) {
			Object o = ois.readObject();
			if(o instanceof Emp) {
				allEmps[i] = (Emp)o;
			}
		}
		ois.close();
		for(Emp e: allEmps) {
			System.out.println(e);
		}

	}

}
