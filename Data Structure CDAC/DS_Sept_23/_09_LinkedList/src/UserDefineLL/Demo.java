package UserDefineLL;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		Emp data;
		int id;
		String name;
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			
			System.out.println("1. Add Beg");
			System.out.println("2. Add Mid");
			System.out.println("3. Add End");
			System.out.println("4. Delete Beg");
			System.out.println("5. Delete Mid");
			System.out.println("6. Delete End");
			System.out.println("7. Modify");
			System.out.println("8. print reverse");
			System.out.println("9. Search");
			System.out.println("10. Display");
			System.out.println("0. Exit");
			System.out.println("Enter Your Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 3:
				System.out.println(" Enter Emp Id ");
				id=sc.nextInt();
				System.out.println("Enter Name ");
				name=sc.next();
				data=new Emp(id,name);
				list1.addEnd(data);
				break;
			case 10:
				System.out.println(list1);
				break;
				
			}
			
		}while(ch!=0);
		
	}

}















