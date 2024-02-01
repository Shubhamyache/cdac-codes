package FileIOPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class rightAligned {

	public static void main(String[] args)throws Exception
	{
		BufferedReader br=null;
		File f=new File("C:\\Users\\HP\\Desktop\\Java Sept 2023\\StreamFileIo\\src\\FileIOPackage\\dataRight.txt"); 
		br= new BufferedReader(new FileReader(f));
		String str=null;
		String maxstr="";
		int maxlength=0;
		while((str=br.readLine())!= null)
		{
			if(str.length()>maxstr.length())
			{
				
				maxstr=str;
				maxlength= str.length();
				
			}
		}
		br.close();
		br= new BufferedReader(new FileReader(f));
		while((str=br.readLine())!=null)
		{
			int charlen=maxlength-str.length();
			for(int i=1;i<=charlen;i++)
			{
				
				System.out.print("-");
				
			}
			System.out.println(str);
		}
		
		
		

	}

}
