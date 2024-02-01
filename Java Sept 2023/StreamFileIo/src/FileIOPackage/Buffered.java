package FileIOPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {
	public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 'q' to quit");
	
	int n;
	try {
		while((n=br.read()) != 'q') {
			System.out.print((char)n);
		}
		
	} catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
