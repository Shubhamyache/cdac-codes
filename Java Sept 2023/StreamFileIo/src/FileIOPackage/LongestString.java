package FileIOPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'Stop' to quit");
		
		String str;
		int strLength = 0;
		String maxString="";
		while(!((str = br.readLine()).equals("stop"))){
			if(strLength<str.length()) {
				strLength = str.length();
				maxString = str;
			}
		}
		System.out.println("Longest String: "+maxString);
		

	}

}
