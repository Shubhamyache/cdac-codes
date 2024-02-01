package CharStack;

import java.util.Scanner;

public class Demo {

	public static boolean isBalance(String s)
	{
		boolean flag=true;
		cStack s1=new cStack(s.length());
		char ch1,ch2;
		// ---- scan string character by character
		for(int i=0;i<s.length();i++)
		{
			ch1=s.charAt(i);
			
			//----- if ch1 is any opening bracket Push it on stack
			if(ch1=='(' || ch1=='{'|| ch1=='<' || ch1=='[')
				s1.push(ch1);
			else if(ch1==')' || ch1=='}'|| ch1=='>' || ch1==']')
			{
				// pop element and compare both character 
				ch2=s1.pop();
				if((ch1==']'&& ch2!='[') ||(ch1==')'&& ch2!='(')||(ch1=='}'&& ch2!='{')||(ch1=='>'&& ch2!='<') )
				{
					flag=false;
					break;
				}
						
			}
			else
			{
				return false;
			}
			
		}
		
		return flag;
	}
	public static void main(String[] args) {
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter String ");
		str=sc.next();
		if(isBalance(str))
			System.out.println(" Balanced String ");
		else
			System.out.println(" Not ");
	}

}