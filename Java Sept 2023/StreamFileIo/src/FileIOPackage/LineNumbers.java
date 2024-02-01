package FileIOPackage;

import java.io.*;

public class LineNumbers {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Users\\HP\\Desktop\\Java Sept 2023\\StreamFileIo\\src\\FileIOPackage\\shub.txt");
			int n, cnt = 0;
			String line="";
			while ((n = is.read()) != -1) {
				line+=(char)n;
				if ((char) n == '\n') {
					System.out.print(++cnt+" "+line);
					
					line="";
				}	
				
			}
			//System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}