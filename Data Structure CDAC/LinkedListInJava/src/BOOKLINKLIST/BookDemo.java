package BOOKLINKLIST;

public class BookDemo {

	public static void main(String[] args) {
		BookLinkList bookLinkList = new BookLinkList();		// TODO Auto-generated method stub

		Book b1 = new Book(1,"Harry Poter");
		Book b2 = new Book(2,"Bhagavat gita");
		Book b3 = new Book(3,"atomic habits");
		Book b4 = new Book(4,"The art of war");
		Book b5 = new Book(5,"First minute");
		
		bookLinkList.addNode(b1);
		bookLinkList.addNode(b2);
		bookLinkList.addNode(b3);
		bookLinkList.addNode(b4);
		bookLinkList.addNode(b5);
		
		bookLinkList.display();
	}

}
