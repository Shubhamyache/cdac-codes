package _02_Array;
import java.util.Scanner;
class Book
{
	int bno;
	String name;
	public Book()
	{

	}
	public Book(int bno,String nm)
	{
		this.bno=bno;
		this.name=nm;
	}
	public String toString()
	{
		return bno+"\t"+name;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Ass2 {

	public static void main(String[] args) {
		Book books[];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter size for Book Array ");
		int no=sc.nextInt();
		books=new Book[no];

		int bno,cnt=0;
		String name;
		int ch;
		do
		{
			System.out.println(" 1. Add Recod");
			System.out.println(" 2. Display All Records ");
			System.out.println(" 3. Modify");
			System.out.println(" 4. Delete Record");
			System.out.println(" Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Book No ");
				bno=sc.nextInt();
				System.out.println(" Enter Name ");
				name=sc.next();
				books[cnt++]=new Book(bno,name);
				break;
			case 2:
				for(int i=0;i<cnt;i++)
					System.out.println(books[i]);
				break;
			}
		}while(ch!=0);




	}



}
