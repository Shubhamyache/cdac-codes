package StreamsAndFileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File4 {

	public static void main(String[] args) throws IOException
	{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String name,str;
		System.out.println("Enter file name");
		name= br.readLine();
		System.out.println("Enter stop to quit");
		File f= new File("C:\\Users\\Dell\\Desktop\\Java\\Eclipse Assignment\\MyProject\\src\\StreamsAndFileIO\\MyFiles\\"+name);
		//System.out.println(name);
		FileWriter os= new FileWriter(f);
		while(!((str=br.readLine()).equalsIgnoreCase("Stop")))
		{
			os.write(str);
		}
		os.close();
		System.out.println("file written");
		FileReader r= new FileReader(f);
		if(f.exists())
		{
			if(f.canRead())
			{
				if(f.length()>0)
				{ 
					int n;
					while((n=r.read())!= -1)
					System.out.print((char)n);
				}
			}
		}

		r.close();

	}

}
