package UserDefineLL;

public class LinkedList {
	private Node head;
	public LinkedList()
	{
		head=null;
	}
	public Node getHead()
	{
		return head;
	}
	public String toString()
	{
		System.out.println();
		String str=" ";
		Node move=head;
		while(move!=null)
		{
			str=str+move.getData();
			move=move.getNext();
		}
		System.out.println();
		return str;
		
	}
	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.println(move.getData());
			move=move.getNext();
		}
	}
	public void addEnd(Emp data)
	{
		Node newnode=new Node(data);
		if(head==null)
			head=newnode;
		else
		{
			Node move=head;
			while(move.getNext()!=null)
				move=move.getNext();
			move.setNext(newnode);
		}
//		else
//		{
//			Node move=head;
//			while(move.next!=null)
//			{
//				move=move.next;
//			}
//			move.next=newnode;
//		}
		
	}
	

}















