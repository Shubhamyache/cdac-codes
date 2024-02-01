package StreamsAndFileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File1 {

	public static void main(String[] args) 
	{
		BufferedReader br=null;
		try
		{
		br=  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'q' to quit");
		int n;
		int alphacnt=0, digitcnt=0;

		while((n=br.read())!='q')
		{
			//System.out.print((char)n);
			if((n>='A' && n<='Z')||(n>='a' && n<='z'))
			{
				alphacnt++;
			}
			if((n>='0' &&n<='9'))
			{
				digitcnt++;
			}
			
		}
		System.out.println("\nAlphacnt= "+alphacnt+"\nDigitcnt= "+digitcnt);
		//br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
			br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
