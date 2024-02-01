package BOOKLINKLIST;

public class BNode {
	Book book;
	BNode next;
	public BNode()
	{
		next = null;
		// TODO Auto-generated constructor stub
	}
	public BNode(Book data) 
	{
		this.book = data;
		next = null;
	}
	@Override
	public String toString() 
	{
		return "BNode [book=" + book + "]";
	}
	

}
