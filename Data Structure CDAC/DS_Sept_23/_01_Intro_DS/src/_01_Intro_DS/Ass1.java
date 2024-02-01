package _01_Intro_DS;

import java.util.Scanner;

public class Ass1 {
    public static boolean checkPrime(int no)
    {
    	if(no<=1)
    		return false;
    	boolean flag=true;
    	for(int i=2;i<=no/2;i++)
    	{
    		if(no%i==0)
    		{
    			flag=false;
    			break;
    		}
    	}
    	return flag;
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println(" Enter No ");
		no=sc.nextInt();
		if(checkPrime(no))
			System.out.println(" Prime ");
		else
			System.out.println(" Not Prime");
		
	}

}
