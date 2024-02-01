package Book;

import java.util.Scanner;

import Book.TypeOfBook.Ebook;
import Book.TypeOfBook.PaperBook;

public class BookMain {

	public static void main(String[] args) {
		Book[] b=new Book[2];

		Scanner sc= new Scanner(System.in);
		for(int i=0;i<b.length;i++)
		{
			int ch;
			System.out.println("Enter choice\n1.Ebook\n2.Paper Book");
			ch=sc.nextInt();
			System.out.println("Enter book title");
			String title=sc.next();
			System.out.println("Enter book id");
			int id=sc.nextInt();
			System.out.println("Enter price ");
			int price=sc.nextInt();
			if(ch==1)
			{
				b[i]= new Ebook(id,title,price);
				
			}
			if(ch==2)
			{
				b[i]=new PaperBook(id, title,price);
			}
			

		}
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
