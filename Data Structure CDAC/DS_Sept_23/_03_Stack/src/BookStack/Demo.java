package BookStack;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		cStack s1=new cStack(5);
		int ch;
		Book data;
		int bno;
		String bname;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\t1. Push");
			System.out.println("\t2. Pop");
			System.out.println("\t3. Peek");
			System.out.println("\t4. Display");
			System.out.println("\t0. Exit");
			System.out.println("\t1. Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Data about book to  Insert ");
				bno=sc.nextInt();
				bname=sc.next();
				data=new Book(bno,bname);
				s1.push(data);
				break;
			case 2:
				data=s1.pop();
				if(data==null)
					System.out.println("Stack Is empty ");
				else
					System.out.println("Deleted Ele Is "+data);
				break;
			case 4:
				s1.display();
					break;				
			}
		}
		while(ch!=0);
	}

}
