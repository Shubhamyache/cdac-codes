package StreamsAndFileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class File2 {

	public static void main(String[] args)
	{
		BufferedReader br=null;
		try
		{
		br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Quit to exit");
		String str;
		String maxstr="";
		int maxlength=0;
		while(!(str=br.readLine()).equalsIgnoreCase("QUIT"))
		{
			if(str.length()>maxstr.length())
			{
				maxlength=str.length();
				maxstr=str;
			}
		}
		System.out.println("\nMax length= "+maxlength+"\nMax str= "+maxstr);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
			br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		

	}

}
