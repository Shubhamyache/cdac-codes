package _02_Array;

import java.util.Scanner;

public class Ass1 {
public static void accept(int a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter "+ a.length+ " Elements ");
	for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();
}
public static void display(int a[])
{
	System.out.println(" ************* Array Is ***********");
	System.out.println();
	for(int i=0;i<a.length;i++)
		System.out.print("\t"+a[i]);
	System.out.println();
}
public static int findMax(int a[])
{
	int mx=0,second=0;
    for(int i=0;i<a.length;i++)
	{
	
		if(a[i]>mx)
		{
			second=mx;
			mx=a[i];
		}
	}
	return second;
}
	public static void main(String[] args) {
		int arr[],no;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Size For Array ");
		no=sc.nextInt();
		arr=new int[no];
		
		do
		{
			System.out.println(" 1. Accept Array ");
			System.out.println(" 2. Display Array ");
			System.out.println(" 3. Find Max ");
			System.out.println(" 0. Exit ");
			System.out.println(" Enter Your chocie ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				accept(arr);
				break;
			case 2:
				display(arr);
				break;
			case 3:
				System.out.println(" Max : "+findMax(arr));

				
			}
			
			
			 
			
		}while(ch!=0);
				
		
		
		
		
		
	}
}
