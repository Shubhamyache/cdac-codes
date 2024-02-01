package _03_Stack;

import java.util.Scanner;

public class BalancedParanthesis {
	public static boolean isBalanced(String s) {
		boolean flag = true;
		char ch1,ch2;
		
		Cstack c = new Cstack(s.length());
		
		for(int i=0;i<s.length();i++)
		{
			ch1 = s.charAt(i); 
				
				if(ch1=='{'||ch1=='('||ch1=='<'||ch1=='[') //push for open
				{
					c.push(ch1);
				}
				else if(ch1=='}'||ch1==')'||ch1=='>'||ch1==']') //pop for closed
				{
					char p = c.pop();
					if(ch1=='}'&& p!='{'||ch1==')'&& p != '('||ch1=='>'&&p!='<') //check if pair exit
					{
						flag = false;
						break;						
					}
					
				} 
				else 
				{
					System.out.println("Enter valid parenthesis!!");
					return false;									
				}
								
		}
		
		if(!c.isEmpty()) 
		{
			return false;
		}
		return flag;
		
	}
	public static void main(String[]args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter parenthesis to check");
		
		 str = sc.next();
		if(isBalanced(str)) {
			System.out.println("Paranthesis is Balanced :)");
		}
		else {
			System.out.println("Not Balanced! :(");
		}
			
	}

}