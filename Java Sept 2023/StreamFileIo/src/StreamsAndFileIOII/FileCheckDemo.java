package StreamsAndFileIO.StreamsAndFileIOII;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Date;

public class FileCheckDemo {

	public static void main(String[] args)throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of file");
		String name= br.readLine();
		File f= new File("C:\\Users\\Dell\\Desktop\\Java\\Eclipse Assignment\\MyProject\\src\\StreamsAndFileIO\\MyFiles\\"+name);
		System.out.println("file exist= "+f.exists());
		System.out.println("File= "+f.isFile());
		System.out.println("dir= "+f.isDirectory());
		System.out.println("can read= "+f.canRead());
		Date d= new Date(f.lastModified());
		System.out.println("date= "+d);
		System.out.println("Size= "+f.length());
		if((f.length())>25)
		{
			int cont=0;
			String s;
			BufferedReader r= new BufferedReader(new FileReader(f));
			while((s=r.readLine())!= null)
					{
						System.out.println((++cont)+" "+s);
					}
		}
		else if(f.length()<25)
		{
			int cont=0;
			//BufferedReader r= new BufferedReader(new FileReader(f));
			FileInputStream fs= new FileInputStream(f);
			int s;
			
			while((s=fs.read())!= -1)
					{
						System.out.println((++cont)+" "+(char)s);
						
					}
			
		}
		br.close();
		
		
	}

}
