package FileIOPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileSize {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		OutputStream os = new FileOutputStream("C:\\Users\\HP\\Desktop\\Java Sept 2023\\"+name);
		File f = new File("C:\\Users\\HP\\Desktop\\Java Sept 2023\\"+name);
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println(f.listFiles());
					
			}
			if(f.isFile()) {
				if(f.length()>25) {
					BufferedReader br1 = new BufferedReader(new FileReader(f));
					FileInputStream fs = new FileInputStream(f);
				}
				else {
					String s;
					BufferedReader br2 = new BufferedReader(new FileReader(f));
					while((s = br2.readLine())!=null) {
						System.out.println();
						
						
					}
				
				
			}
			
		}
		
			
		}
		

	}

}
